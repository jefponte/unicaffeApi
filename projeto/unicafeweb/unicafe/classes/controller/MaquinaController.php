<?php
class MaquinaController {
	private $tipoDeTela;
	public static function main() {
		
		$maquinaController = new MaquinaController ();
		$maquinaController->telaMaquinas ();
// 		switch ($tipoDeTela) {
			
// 			case Sessao::NIVEL_ADMIN:
// 				//Nesse caso podemos mostrar dados de usuparios. 
// 				//Mas nesse caso o Usu�rio n�o pode enviar comando de cadastro. 
				
// 				break;

// 			case Sessao::NIVEL_SUPER:
// 				//Nesse caso temos acesso a dados de usuario, como tamb�m podemos enviar comando para cadastrar. 
				
				
// 				break;
// 			default :
// 				//Usuario default. Esse n�o v� dados de usu�rios, al�m de n�o poder enviar comandos de cadastrar. 
				
// 				break;
// 		}
		
	}
	public function telaMaquinas() {
		$maquinaDAO = new MaquinaDAO ();
		$lista = $maquinaDAO->listaCompleta ();
		
		foreach ( $lista as $maquina ) {
			echo $maquina . '<br>';
		}
	}
}