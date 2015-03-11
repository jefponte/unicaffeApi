package br.edu.unilab.unicafe.desktop;

import java.io.File;
import java.util.ArrayList;

import br.edu.unilab.unicafe.registro.model.Perfil;
import br.edu.unilab.unicafe.registro.model.Registro;

public class Desktop {
	
	/**
	 * Nome da pasta que conter� o caminho da �rea de trabalho.
	 * Esse caminho pode ser local ou remoto.  
	 */
	private String caminho;
	
	
	public void verificaECria(){
	
		ArrayList<String> listaString = new ArrayList<>();
		listaString.add(caminho+"\\public\\Desktop");
		listaString.add(caminho+"\\public\\Documents");
		listaString.add(caminho+"\\public\\Music");
		listaString.add(caminho+"\\public\\Pictures");
		listaString.add(caminho+"\\public\\Videos");
		listaString.add(caminho+"\\"+nomeDeUsuario+"\\"+"Desktop");
		listaString.add(caminho+"\\"+nomeDeUsuario+"\\"+"Music");
		listaString.add(caminho+"\\"+nomeDeUsuario+"\\"+"Documents");
		listaString.add(caminho+"\\"+nomeDeUsuario+"\\"+"Pictures");
		listaString.add(caminho+"\\"+nomeDeUsuario+"\\"+"Videos");
		for(String pasta: listaString){
			File diretorio = new File(pasta); // ajfilho � uma pasta!  
			if (!diretorio.exists()) {  
			   diretorio.mkdirs(); //mkdir() cria somente um diret�rio, mkdirs() cria diret�rios e subdiret�rios.  
			} else {  
			   System.out.println("Diret�rio "+pasta+" j� existente");
			}  
		}
		
		
		
	
		
		
	}
	
	private String nomeDeUsuario;
	
	public Desktop(String caminho, String nomeDeUsuario) {
		
		this.nomeDeUsuario = nomeDeUsuario;
		
		this.caminho = caminho;
		perfilDesktop = new Perfil();
		ArrayList<Registro> listaPersonalizada  = new ArrayList<Registro>();
		perfilDesktop.setListaDeRegistros(listaPersonalizada);
		
		listaPersonalizada.add(new Registro("HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Explorer\\User Shell Folders", "Common Desktop", Registro.REG_SZ, caminho+"\\public\\Desktop", "%PUBLIC%\\Desktop","Muda a pasta da �rea de trabalho p�blica. "));
		listaPersonalizada.add(new Registro("HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Explorer\\User Shell Folders", "Common Documents", Registro.REG_SZ, caminho+"\\public\\Documents", "%PUBLIC%\\Documents","Muda a pasta da �rea de trabalho p�blica. "));
		listaPersonalizada.add(new Registro("HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Explorer\\User Shell Folders", "CommonMusic", Registro.REG_SZ, caminho+"\\public\\Music", "%PUBLIC%\\Music","Muda a pasta da �rea de trabalho p�blica. "));
		listaPersonalizada.add(new Registro("HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Explorer\\User Shell Folders", "CommonPictures", Registro.REG_SZ, caminho+"\\public\\Pictures", "%PUBLIC%\\Pictures","Muda a pasta da �rea de trabalho p�blica. "));
		listaPersonalizada.add(new Registro("HKLM\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Explorer\\User Shell Folders", "CommonVideo", Registro.REG_SZ, caminho+"\\public\\Videos", "%PUBLIC%\\Videos","Muda a pasta da �rea de trabalho p�blica. "));

		listaPersonalizada.add(new Registro("HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\User Shell Folders", "Desktop", Registro.REG_EXPAND_SZ, caminho+"\\"+nomeDeUsuario+"\\"+"Desktop", "%USERPROFILE%\\Desktop","Muda a pasta da �rea de trabalho do usu�rio corrente. "));
		listaPersonalizada.add(new Registro("HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\User Shell Folders", "My Music", Registro.REG_EXPAND_SZ, caminho+"\\"+nomeDeUsuario+"\\"+"Music", "%USERPROFILE%\\Music","Muda a pasta da �rea de trabalho do usu�rio corrente. "));
		listaPersonalizada.add(new Registro("HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\User Shell Folders", "Personal", Registro.REG_EXPAND_SZ, caminho+"\\"+nomeDeUsuario+"\\"+"Documents", "%USERPROFILE%\\Documents","Muda a pasta da �rea de trabalho do usu�rio corrente. "));
		listaPersonalizada.add(new Registro("HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\User Shell Folders", "My Pictures", Registro.REG_EXPAND_SZ, caminho+"\\"+nomeDeUsuario+"\\"+"Pictures", "%USERPROFILE%\\Pictures","Muda a pasta da �rea de trabalho do usu�rio corrente. "));
		listaPersonalizada.add(new Registro("HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\User Shell Folders", "My Video", Registro.REG_EXPAND_SZ, caminho+"\\"+nomeDeUsuario+"\\"+"Videos", "%USERPROFILE%\\Videos","Muda a pasta da �rea de trabalho do usu�rio corrente. "));
		
	}
	
	/**
	 * Antes temos que ver se existe a pasta que queremos. 
	 * Caso n�o exista iremos criar os arquivos. 
	 * Se existir n�s definimos o registro. 
	 */
	public void alterarRegistro(){
		verificaECria();
		for(Registro R : this.perfilDesktop.getListaDeRegistros()){
			System.out.println(R);
		}
		perfilDesktop.executar();
		
	}
	private Perfil perfilDesktop;
	public void desfazer(){
		for(Registro R : this.perfilDesktop.getListaDeRegistros()){
			System.out.println(R.toStringDesfazer());
		}
		perfilDesktop.desfazer();
		
	}

}
