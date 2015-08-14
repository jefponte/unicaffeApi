<?php

class ComandoController{
	
	
	
	public static function main($nivelDeAcesso){
		
		switch ($nivelDeAcesso)
		{
			case Sessao::NIVEL_SUPER:
				$comandoController = new ComandoController();
				$comandoController->gerenciaComando();
				break;
			case Sessao::NIVEL_ADMIN:
				$comandoController = new ComandoController();
				$comandoController->gerenciaComandoADM();
				break;
			default:
				break;
		}
		
	}
	public function gerenciaComando(){
		if(isset($_GET['comando']) && isset($_GET['maquina'])){
			switch ($_GET['comando']){
				case 1:
					$unicafe = new UniCafe();
					echo '<p>'.$unicafe->dialoga('desliga('.$_GET['maquina'].')').'</p>';
		
					break;
				case 2:
					$unicafe = new UniCafe();
					echo '<p>'.$unicafe->dialoga('aula('.$_GET['maquina'].')').'</p>';
					break;
				case 3:
					$unicafe = new UniCafe();
					echo '<p>'.$unicafe->dialoga('visitante('.$_GET['maquina'].')').'</p>';
					break;
				case 4:
					$unicafe = new UniCafe();
					echo '<p>'.$unicafe->dialoga('bloqueia('.$_GET['maquina'].')').'</p>';
					break;
				case 5:
					if(isset($_GET['laboratorio'])){
						$unicafe = new UniCafe();
						echo '<p>'.$unicafe->dialoga('alocarMaquina('.$_GET['maquina'].','.$_GET['laboratorio'].')').'</p>';
					}
					break;
					
				default:
					echo '<p>Comando desconhecido</p>';
					break;
			}
		
		}
	}
	public function gerenciaComandoADM(){
		
		if(isset($_GET['comando']) && isset($_GET['maquina'])){
			$maquina = new Maquina();
			$maquina->setNome($_GET['maquina']);
			$maquinaDao = new MaquinaDAO();
			if(!$maquinaDao->procuraPorNome($maquina)){
				echo "Maquina nao existe";
				return;
			}
			$usuarioDao = new UsuarioDAO($maquinaDao->getConexao());
			$usuario = new Usuario();
			$sessao = new Sessao();
			$usuario->setId($sessao->getIdUsuario());
			if(!$usuarioDao->ehAdministrador($usuario, $maquina->getLaboratorio())){
				echo "Voce nao tem jurisdicao sobre este laboratorio";
				return;
			}
			
			
			
			switch ($_GET['comando']){
				case 1:
					$unicafe = new UniCafe();
					echo '<p>'.$unicafe->dialoga('desliga('.$_GET['maquina'].')').'</p>';
	
					break;
				case 2:
					$unicafe = new UniCafe();
					echo '<p>'.$unicafe->dialoga('aula('.$_GET['maquina'].')').'</p>';
					break;
				case 3:
					$unicafe = new UniCafe();
					echo '<p>'.$unicafe->dialoga('visitante('.$_GET['maquina'].')').'</p>';
					break;
				case 4:
					$unicafe = new UniCafe();
					echo '<p>'.$unicafe->dialoga('bloqueia('.$_GET['maquina'].')').'</p>';
					break;
				case 5:
					if(isset($_GET['laboratorio'])){
						$unicafe = new UniCafe();
						echo '<p>'.$unicafe->dialoga('alocarMaquina('.$_GET['maquina'].','.$_GET['laboratorio'].')').'</p>';
					}
					break;
						
				default:
					echo '<p>Comando desconhecido</p>';
					break;
			}
	
		}
	}
}