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
		$laboratorioView = new LaboratorioView();
		
		$maquinaDao = new MaquinaDAO();
		$lista = $maquinaDao->listaCompleta();
		foreach ($lista as $elemento){
			
			$laboratorioView->mostraMaquina($elemento);
		}
		
		
	}
	

}


?>
