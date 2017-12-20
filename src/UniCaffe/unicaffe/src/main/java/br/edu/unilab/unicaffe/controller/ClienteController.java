package br.edu.unilab.unicaffe.controller;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import br.edu.unilab.unicaffe.bloqueio.model.PerfilBloqueio;
import br.edu.unilab.unicaffe.dao.UsuarioDAO;
import br.edu.unilab.unicaffe.desktop.Desktop;
import br.edu.unilab.unicaffe.ligador.Ligador;
import br.edu.unilab.unicaffe.model.Cliente;
import br.edu.unilab.unicaffe.model.Maquina;
import br.edu.unilab.unicaffe.registro.model.Perfil;
import br.edu.unilab.unicaffe.view.FrameAviso;
import br.edu.unilab.unicaffe.view.FrameMensagem;
import br.edu.unilab.unicaffe.view.FrameSplash;
import br.edu.unilab.unicaffe.view.FrameTelaAcesso;
import br.edu.unilab.unicaffe.view.FrameTelaBloqueio;

/**
 * Control
 * 
 * @author jefponte
 *
 */
public class ClienteController {

	/**
	 * View
	 * 
	 */
	public SystemTray tray;
	public TrayIcon trayIcon;
	private FrameTelaAcesso frameTelaAcesso;
	private FrameSplash frameSplash;
	private FrameTelaBloqueio frameTelaBloqueio;
	private FrameAviso frameAviso;
	private Thread escInfinito;
	private boolean bloqueado;
	private boolean bloqueandoAplicacoes;
	private Semaphore semaforo;

	public Semaphore getSemaforo() {
		return this.semaforo;
	}

	/**
	 * Model
	 */
	private Cliente cliente;

	public ClienteController() {
		this.semaforo = new Semaphore(1);
		this.cliente = new Cliente();
		this.getCliente().getMaquina().preencheComMaquinaLocal();

		this.setFrameTelaAcesso(new FrameTelaAcesso());
		this.setFrameSplash(new FrameSplash());
		this.setFrameAviso(new FrameAviso());
		this.setFrameTelaBloqueio(new FrameTelaBloqueio());
		this.getFrameTelaBloqueio().getLabelNomePC().setText(this.getCliente().getMaquina().getNome());
	}

	public void iniciaCliente() {
		iniciaSplash();
		tentaConexoes();
	}

	public void tentarLogar() {
		// Saida de emergência
		if (getFrameTelaBloqueio().getTextFieldLogin().getText().equals("emergencia")
				&& getFrameTelaBloqueio().getPasswordFieldSenha().getText().equals("cafe@eh@vida")) {

			desBloqueandoServicos();

			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {

					try {
						getFrameTelaBloqueio().setVisible(false);
						System.out.println("Fechando Explorer. ");
						Runtime.getRuntime().exec(" taskkill /f /im explorer.exe");
						Runtime.getRuntime()
								.exec(" attrib " + System.getProperty("user.home") + "\\Links\\RecentPlaces.lnk -h");// Retorna
																														// Locais
																														// em
																														// Favoritos
						Thread.sleep(TEMPO_RESTART);
						System.out.println("Abrindo Explorer. ");
						Runtime.getRuntime().exec("explorer.exe");

						System.exit(0);

					} catch (InterruptedException | IOException e) {
						e.printStackTrace();
					}

				}
			});
			t.start();
			return;

		}
		if (getFrameTelaBloqueio().getTextFieldLogin().getText().equals("aula@124A")
				&& getFrameTelaBloqueio().getPasswordFieldSenha().getText().equals("aula@124A")) {
			desbloqueia(18000, "aula");
			return;
		}

		String senha = UsuarioDAO.getMD5(getFrameTelaBloqueio().getPasswordFieldSenha().getText());

		new PrintStream(cliente.getSaida())
				.println("autentica(" + getFrameTelaBloqueio().getTextFieldLogin().getText() + "," + senha + ")");

		getFrameTelaBloqueio().resetCampos();

	}

	public void iniciaSplash() {
		Thread iniciandoSplash = new Thread(new Runnable() {

			@Override
			public void run() {

				getFrameTelaBloqueio().setVisible(false);
				getFrameTelaBloqueio().setStatusConexao(false);
				getFrameSplash().setVisible(true);
				getFrameAviso().setVisible(false);
				getFrameTelaAcesso().getBtnFinalizar().addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						bloqueia();
					}
				});

				getFrameTelaBloqueio().getPasswordFieldSenha().addKeyListener(new KeyAdapter() {
					public void keyPressed(java.awt.event.KeyEvent e) {
						if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
							tentarLogar();
						}
					}

				});

				getFrameTelaBloqueio().getBtnEntrar().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tentarLogar();
					}
				});

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				getFrameSplash().setVisible(false);
				bloqueia();

			}
		});
		iniciandoSplash.start();
	}

	public void bloqueia() {

		getCliente().getMaquina().getAcesso().getUsuario().setLogin("livre");
		getCliente().getMaquina().getAcesso().pararDeContar();
		String caminho = "c:\\arquivos";
		Desktop d = new Desktop(caminho, "jefponte");
		d.desfazer();
		if (getCliente().getSaida() != null) {
			new PrintStream(getCliente().getSaida()).println("setStatus(" + Maquina.STATUS_DISPONIVEL + ")");
		}

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				getFrameTelaBloqueio().setVisible(true);
				getFrameTelaBloqueio().resetCampos();

			}
		});

		iniciaEscInfinito();
		bloqueiaServicos();
		bloqueandoAplicacoes();
		restartNoExplorer();
	}

	/**
	 * Este método serve pra bloquear alguns serviços do windows. Ele mexe no
	 * Registro. Esse método não produz efeito se o programa não for executado
	 * como administrador.
	 */
	public void bloqueiaServicos() {
		Thread bloqueandoServicos = new Thread(new Runnable() {

			@Override
			public void run() {
				Perfil perfilBloqueio = new Perfil();
				perfilBloqueio.setListaDeRegistros(Perfil.listaParaBloqueio());
				perfilBloqueio.executar();

				Perfil perfilTemporarioExecucao = new Perfil();
				perfilTemporarioExecucao.setListaDeRegistros(Perfil.perfilTemporarioExecucao());
				perfilTemporarioExecucao.executar();

				Perfil perfilTemporarioDesativado = new Perfil();
				perfilTemporarioDesativado.setListaDeRegistros(Perfil.perfilTemporarioDesativado());
				perfilTemporarioDesativado.deletar();

			}
		});
		bloqueandoServicos.start();

	}

	public void bloqueandoAplicacoes() {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					setBloqueandoAplicacoes(false);
					Thread.sleep(3000);
					setBloqueandoAplicacoes(true);
					// Não vamos permitir que esse laço rode duas vezes
					// simultaneamente.

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				PerfilBloqueio pb = new PerfilBloqueio();
				pb.buscaAceitos();

				while (isBloqueandoAplicacoes()) {

					pb.buscaAtivos();
					pb.comparaEMata();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
	}

	public void desBloqueandoServicos() {
		Thread desBloqueandoServicos = new Thread(new Runnable() {

			@Override
			public void run() {
				Perfil perfilBloqueio = new Perfil();
				perfilBloqueio.setListaDeRegistros(Perfil.listaParaBloqueio());
				perfilBloqueio.desfazer();

				Perfil perfilTemporario = new Perfil();
				perfilTemporario.setListaDeRegistros(Perfil.perfilTemporarioExecucao());
				perfilTemporario.deletar();

				Perfil perfilTemporarioDesativado = new Perfil();
				perfilTemporarioDesativado.setListaDeRegistros(Perfil.perfilTemporarioDesativado());
				perfilTemporarioDesativado.executar();

			}
		});
		desBloqueandoServicos.start();

	}

	public void iniciaEscInfinito() {

		this.escInfinito = new Thread(new Runnable() {
			@Override
			public void run() {
				setBloqueado(false);

				try {
					Thread.sleep(300);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				setBloqueado(true);

				while (isBloqueado()) {
					// Robot robo;
					try {
						Thread.sleep(250);
						// robo = new Robot();
						// robo.keyPress(KeyEvent.VK_ESCAPE);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		});

		escInfinito.start();

	}

	public static String servidorPrimario = "200.129.19.40";
	public static String servidorSecundario = "200.128.19.10";
	public static int portaServidorPrimario = 27289;
	public static int portaServidorSecundario = 27289;

	public void tentaConexoes() {

		File arquivo = new File("config.ini");
		if (arquivo.exists()) {
			Properties config = new Properties();
			FileInputStream file;
			try {
				file = new FileInputStream(arquivo);
				config.load(file);
				servidorPrimario = config.getProperty("host_servidor_primario");
				servidorSecundario = config.getProperty("host_servidor_secundario");
				portaServidorPrimario = Integer.parseInt(config.getProperty("porta_servidor_primario"));
				portaServidorSecundario = Integer.parseInt(config.getProperty("porta_servidor_secundario"));

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		Thread tentandoConexoes = new Thread(new Runnable() {

			@Override
			public void run() {

				int j = 0;
				for (int i = 0; true; i++) {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					try {
						try {
							j++;
							if (j > 10) {
								j = 0;
							}
							Socket socket;
							if (j <= 5)
								socket = new Socket(servidorPrimario, portaServidorPrimario);
							else
								socket = new Socket(servidorSecundario, portaServidorSecundario);
							getCliente().setConexao(socket);
							getCliente().setEntrada(socket.getInputStream());
							getCliente().setSaida(socket.getOutputStream());
							getFrameTelaBloqueio().setStatusConexao(true);
							processaCliente();
							break;
						} catch (UnknownHostException e) {
							getFrameTelaBloqueio().getLabelStatus().setText("Servidor não encontrado. Tentativa: " + i);								
							if (j <= 5)
								System.out.println("Erro na tentativa de conectar no: " + servidorPrimario);
							else
								System.out.println("Erro na tentativa de conectar no: " + servidorSecundario);
						} catch (IOException e) {
							getFrameTelaBloqueio().getLabelStatus().setText("Erro no Servidor. Tentativa: " + i);				
							//reconfigura a rede na quarta tentativa
							if (i==2) {
								getFrameTelaBloqueio().getLabelStatus().setText("Reconfigurando a rede...");
								try {
									Runtime.getRuntime().exec("ipconfig /release");
									Thread.sleep(3000);									
									Runtime.getRuntime().exec("ipconfig /renew");
									Thread.sleep(3000);
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							
							
						}
						Thread.sleep(100);
					} catch (InterruptedException e) {
						getFrameTelaBloqueio().getLabelStatus().setText("Thread Não dormiu. Tentativa: " + i);
					}

				}
			}
		});
		tentandoConexoes.start();
	}

	public void processaCliente() {
		Thread processando = new Thread(new Runnable() {

			@Override
			public void run() {

				getCliente().getMaquina().setStatus(Maquina.STATUS_DISPONIVEL);
				PrintStream printStream = new PrintStream(getCliente().getSaida());
				BufferedReader buffereReader = new BufferedReader(new InputStreamReader(getCliente().getEntrada()));

				printStream.println("setStatus(" + getCliente().getMaquina().getStatus() + ")");
				printStream.println("setNome(" + getCliente().getMaquina().getNome() + ")");
				printStream.println("setVersao(1.0)");
				printStream.println("setMac(" + getCliente().getMaquina().getEnderecoMac() + ")");

				while (getCliente().getConexao().isConnected()) {

					String mensagem;
					try {
						mensagem = buffereReader.readLine();
						// System.out.println(mensagem);
						processaMensagem(mensagem);
					} catch (IOException e) {
						e.printStackTrace();
						bloqueia();
						getFrameTelaBloqueio().setStatusConexao(false);
						break;

					} catch (NullPointerException ne) {
						ne.printStackTrace();
						bloqueia();
						getFrameTelaBloqueio().setStatusConexao(false);
						break;

					}
				}
				getFrameTelaBloqueio().setStatusConexao(false);
				bloqueia();
				tentaConexoes();
				return;

			}
		});
		processando.start();
	}

	/**
	 * 
	 * Mensagem enviada pelo servidor.
	 * 
	 * @param mensagem
	 */
	public synchronized void processaMensagem(String mensagem) {
		if(mensagem == null)
			return;
		
		if (mensagem.indexOf('(') == -1 || mensagem.indexOf(')') == -1) {
			return;
		}

		String comando = mensagem.substring(0, mensagem.indexOf('('));
		final String parametros = mensagem.substring(mensagem.indexOf('(') + 1, mensagem.indexOf(')'));
		if (comando.equals("bloqueia")) {
			bloqueia();
			return;
		} else if (comando.equals("desbloqueia")) {
			String login = parametros.substring(0, parametros.indexOf(','));
			String tempo = parametros.substring(parametros.indexOf(',') + 2);
			int time = Integer.parseInt(tempo);
			desbloqueia(time, login);
			return;
		} else if (comando.equals("desativar")) {
			desBloqueandoServicos();

			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {

					try {
						getFrameTelaBloqueio().setVisible(false);
						// System.out.println("Fechando Explorer. ");
						Runtime.getRuntime().exec(" taskkill /f /im explorer.exe");
						Thread.sleep(TEMPO_RESTART);
						// System.out.println("Abrindo Explorer. ");
						Runtime.getRuntime().exec("explorer.exe");
						System.exit(0);

					} catch (InterruptedException | IOException e) {
						e.printStackTrace();
					}

				}
			});
			t.start();
			return;
		} else if (comando.equals("bonus")) {
			// System.out.println("To ganhando bonus");
			int bonus = 600;
			try {
				getSemaforo().acquire();

				// Região crítica.
				// System.out.println("Entrei na zona critica, ganhando tempo");
				getCliente().getMaquina().getAcesso().setTempoDisponibilizado(
						getCliente().getMaquina().getAcesso().getTempoDisponibilizado() + bonus);

			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforo.release();
				// System.out.println("Saindo da zona critica, ganhando tempo");
			}
			return;
		} else if (comando.equals("exec")) {
			try {
				Runtime.getRuntime().exec(parametros);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}

		else if (comando.equals("desligar")) {

			bloqueia();
			try {
				Runtime.getRuntime().exec(" shutdown /s -t 00");
				getFrameTelaBloqueio().setVisible(true);
				System.exit(0);
				return;
			} catch (IOException e) {
				e.printStackTrace();
			}

			return;

		} else if (comando.equals("sirene")) {
		
			Ligador.ligador(parametros);
			System.out.println("Sirene("+parametros+")");
			
			return;

		} else if (comando.equals("limparDados")) {
			String caminho = System.getProperty("user.home") + "\\localunicafe";

			apagarDados(new File(caminho));
			return;

		} else if (comando.equals("printc")) {

			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {
					getFrameTelaBloqueio().getLabelMensagem().setText("" + parametros);
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					getFrameTelaBloqueio().getLabelMensagem().setText("");
				}
			});
			t.start();
			return;
		}else if(comando.equals("printa")){
			
			FrameMensagem frameMensagem = new FrameMensagem();
			frameMensagem.setMensagem(parametros);
			frameMensagem.setVisible(true);
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			frameMensagem.setVisible(false);
			
			return;
		} 
		
		else if (comando.equals("venha")) {
			servidorPrimario = parametros;

			try {
				getCliente().getConexao().close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.tentaConexoes();
			return;
		} else if (comando.equals("atualizar")) {

			desBloqueandoServicos();

			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {

					try {
						getFrameTelaBloqueio().setVisible(false);
						Runtime.getRuntime().exec(" taskkill /f /im explorer.exe");
						Thread.sleep(TEMPO_RESTART);
						Runtime.getRuntime().exec("explorer.exe");
						System.exit(0);

					} catch (InterruptedException | IOException e) {
						e.printStackTrace();
					}

				}
			});
			t.start();
			try {
				Runtime.getRuntime().exec(" java -jar \"C:\\Program Files (x86)\\UniCafe\\unicafe-update.jar\"");

			} catch (IOException e) {
				e.printStackTrace();

			}
			System.exit(0);
			return;
		} else {

			return;
		}

	}

	public void restartNoExplorer() {
		Thread restartando = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					Runtime.getRuntime()
							.exec(" attrib " + System.getProperty("user.home") + "\\Links\\RecentPlaces.lnk +h");// Oculta
																													// Locais
																													// em
																													// Favoritos
					Runtime.getRuntime().exec(" taskkill /f /im firefox.exe");
					Runtime.getRuntime().exec(" taskkill /f /im iexplore.exe");
					Runtime.getRuntime().exec(" taskkill /f /im chrome.exe");
					Runtime.getRuntime().exec(" taskkill /f /im explorer.exe");
					Thread.sleep(TEMPO_RESTART);
					Runtime.getRuntime().exec("explorer.exe");
				} catch (IOException | InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		restartando.start();

	}

	public void desbloqueia(final int segundos, final String login) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				getFrameTelaAcesso().getLabelLogin().setText(login);
				getFrameTelaAcesso().getLabelTempo().setText("calculando");
				;
				getFrameAviso().setVisible(false);
				getFrameTelaBloqueio().setVisible(false);
				setBloqueado(false);
				getFrameTelaAcesso().setVisible(true);

			}
		});
		restartNoExplorer();

		if (getCliente().getSaida() != null)
			new PrintStream(getCliente().getSaida()).println("setStatus(" + Maquina.STATUS_OCUPADA + ")");

		String caminho = System.getProperty("user.home") + "\\localunicafe";
		Desktop d = new Desktop(caminho, login);
		d.alterarRegistro();
		getCliente().getMaquina().getAcesso().getUsuario().setLogin(login);
		getCliente().getMaquina().getAcesso().setTempoDisponibilizado(segundos);
		getCliente().getMaquina().getAcesso().setTempoUsado(0);
		setBloqueado(false);

		Thread sessao = new Thread(new Runnable() {
			@Override
			public void run() {

				while (true) {
					boolean saiDolaco = false;
					try {

						// Região crítica.
						getSemaforo().acquire();
						if (!(getCliente().getMaquina().getAcesso().getTempoUsado() <= getCliente().getMaquina()
								.getAcesso().getTempoDisponibilizado() && (!isBloqueado())))
							saiDolaco = true;
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						semaforo.release();
					}
					if (saiDolaco == true)
						break;
					try {
						Thread.sleep(1000);
						int tempo = 600;
						try {
							// Região crítica.
							getSemaforo().acquire();
							tempo = (getCliente().getMaquina().getAcesso().getTempoDisponibilizado()
									- getCliente().getMaquina().getAcesso().getTempoUsado());
						} catch (InterruptedException e) {
							e.printStackTrace();
						} finally {
							semaforo.release();
						}

						if (tempo == 300 ) {
							
							if (getCliente().getSaida() != null) {
								new PrintStream(getCliente().getSaida()).println("meDaBonus()");
							}
						}
						if (tempo == 120 || tempo == 20) {
							getFrameAviso().setVisible(true);
							getFrameTelaAcesso().setVisible(true);
							getFrameTelaAcesso().setState(JFrame.NORMAL);
							getFrameAviso().setState(JFrame.NORMAL);
							if (getCliente().getSaida() != null) {
								new PrintStream(getCliente().getSaida()).println("meDaBonus()");
							}
						}
						int hora = 0;
						int minuto = 0;
						while (tempo >= 60) {
							tempo -= 60;
							minuto++;
						}
						while (minuto >= 60) {
							minuto -= 60;
							hora++;
						}
						getFrameTelaAcesso().getLabelTempo().setText(String.format("%02d", hora) + ":"
								+ String.format("%02d", minuto) + ":" + String.format("%02d", tempo));
						getCliente().getMaquina().getAcesso()
								.setTempoUsado(getCliente().getMaquina().getAcesso().getTempoUsado() + 1);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				getFrameAviso().setVisible(false);
				bloqueia();

			}
		});
		sessao.start();

	}

	protected static Image createImage(String path, String description) {
		URL imageURL = ClienteController.class.getResource(path);
		if (imageURL == null) {
			System.err.println("Caminho não encontrado: " + path);
			return null;
		} else {
			return (new ImageIcon(imageURL, description)).getImage();
		}
	}

	public FrameTelaAcesso getFrameTelaAcesso() {
		return frameTelaAcesso;
	}

	public void setFrameTelaAcesso(FrameTelaAcesso frameTelaAcesso) {
		this.frameTelaAcesso = frameTelaAcesso;
	}

	public FrameSplash getFrameSplash() {
		return frameSplash;
	}

	public void setFrameSplash(FrameSplash frameSplash) {
		this.frameSplash = frameSplash;
	}

	public FrameAviso getFrameAviso() {
		return frameAviso;
	}

	public void setFrameAviso(FrameAviso frameAviso) {
		this.frameAviso = frameAviso;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public FrameTelaBloqueio getFrameTelaBloqueio() {
		return frameTelaBloqueio;
	}

	public void setFrameTelaBloqueio(FrameTelaBloqueio frameTelaBloqueio) {
		this.frameTelaBloqueio = frameTelaBloqueio;
	}

	public Thread getEscInfinito() {
		return escInfinito;
	}

	public void setEscInfinito(Thread escInfinito) {
		this.escInfinito = escInfinito;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public boolean isBloqueandoAplicacoes() {
		return bloqueandoAplicacoes;
	}

	public void setBloqueandoAplicacoes(boolean bloqueandoAplicacoes) {
		this.bloqueandoAplicacoes = bloqueandoAplicacoes;
	}

	public static final int TEMPO_RESTART = 2000;

	public void apagarDados(File arquivo) {
		String login = getCliente().getMaquina().getAcesso().getUsuario().getLogin();

		if (arquivo.isDirectory()) {

			File[] listaDeArquivos = arquivo.listFiles();
			for (File outroArquivo : listaDeArquivos) {
				if (!((outroArquivo.getName().toLowerCase().trim().equals(login.toLowerCase().trim()))
						|| outroArquivo.getName().toLowerCase().trim().equals("public"))) {
					apagarDados(outroArquivo);
				}

			}
		}

		arquivo.delete();
	}

}
