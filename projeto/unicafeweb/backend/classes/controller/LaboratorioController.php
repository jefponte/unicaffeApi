<?php


class LaboratorioController{

	const TELA_DEFAULT = 1;

	const SUPER_USUARIO = 2;
	
	
	public static function main($tipoDeTela) {
		$laboratorioController = new LaboratorioController();
		switch ($tipoDeTela) {
			
			case self::SUPER_USUARIO:
				
				break;
			
			default :

				/*
				 * Nessa tela vemos a lista de m�quinas sem laborat�rio. 
				 * Poderemos listar m�quinas de laborat�rio espec�fico. 
				 * 
				 *
				 * Neste caso o usu�rio n�o � super nem administrador, logo seu acesso n�o 
				 * mostra dados de usu�rio nem permite envio de comandos. 
				 * 
				 */
				$laboratorioController->telaDefault();
				break;
		}
	}
	public function telaDefault(){
		
		if(!isset($_GET['laboratorio'])){
			///MOstrarei todas as m�quinas sem laborat�rio. 
			
			$maquinaDao = new MaquinaDAO();
			$lista = $maquinaDao->ordenaPorNome($maquinaDao->listaCompleta());
			foreach($lista as $maquina){
				if(!$maquina->getLaboratorio()->getId()){
					echo $maquina;
					echo "<br>".$maquina->getLaboratorio()->getNome();
				}
			}
			
			return;	
		}
		
		$maquinaDao = new MaquinaDAO();
		$lista = $maquinaDao->ordenaPorNome($maquinaDao->listaCompleta());
		foreach($lista as $maquina){
			if($maquina->getLaboratorio()->getNome() == $_GET['laboratorio']){
				echo $maquina.'<br><hr>';

			}
		}
		
		
	}
	

}


?>
