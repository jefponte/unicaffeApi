<?php
class MaquinaController {

	public static function mainDetalhar($tipoDeTela){
		
		switch ($tipoDeTela){
			case Sessao::NIVEL_SUPER:
				break;
			default:
					break;
			}
	}
	
	public static function main($tipoDeTela) {
		$maquinaController = new MaquinaController ();
		
		/*
		 * Em todos os casos o usu�rio ver� todas as m�quinas, o status de cada uma e
		 * tamb�m saber� se est� ou n�o cadastrada.
		 * Ver� dados de acesso e formul�rio para pesquisar por nome de m�quina.
		 */
		
		/*
		 * Se o usu�rio for administrador.
		 * ter� dados de usu�rio que est� logado.
		 * Poder� passar comandos para m�quina de seu laborat�rio.
		 *
		 * Obs: o comando desativar n�o estar� dispon�vel para usu�rio administrador.
		 */
		
		/*
		 * Se for usu�rio super
		 * Al�m de poder ver dados de usu�rio poder� enviar comando de cadastro
		 * Poder� tamb�m enviar comandos quaisquer para qualquer m�quina.
		 */
		
		switch ($tipoDeTela) {
			
			case Sessao::NIVEL_ADMIN:
				$maquinaController->telaMaquinasAdmin ();
				break;
			case Sessao::NIVEL_SUPER:
				$maquinaController->telaMaquinasSuper ();
				break;
				
			default : 
				$maquinaController->telaMaquinas ();
				break;
		}
	}
	/**
	 * Essa tela � vis�vel por qualquer tipo de usu�rio.
	 */
	public function telaMaquinas() {
		
		$maquinaView = new MaquinaView();
		
		$maquinaDao = new MaquinaDAO();
		$lista = $maquinaDao->listaCompleta();
		foreach ($lista as $elemento){
			if(isset($_GET['laboratorio'])){
				if(strtolower ($elemento->getLaboratorio()->getNome()) == strtolower ($_GET['laboratorio'])){
					$elemento->getAcesso()->getUsuario()->setNome("");
					$maquinaView->mostraMaquina($elemento, false);
					continue;
				}
					
			}
			$elemento->getAcesso()->getUsuario()->setNome("");
			$maquinaView->mostraMaquina($elemento, false);
		}
		
		
		
	}
	
	/**
	 * Nessa � poss�vel cadastrar a m�quina ou atualizar.
	 */
	public function telaMaquinasSuper() {
		
		$maquinaView = new MaquinaView();
		
		$maquinaDao = new MaquinaDAO();
		$lista = $maquinaDao->listaCompleta();
		foreach ($lista as $elemento){
			if(isset($_GET['laboratorio'])){
				if(!strcmp(strtolower ( $_GET['laboratorio'] ),strtolower ( $elemento->getLaboratorio()->getNome())))
					$maquinaView->mostraMaquina($elemento);
					
			}
			else 
				$maquinaView->mostraMaquina($elemento);
			
		}
		
		
	}
	/**
	 * Em todos os casos o usu�rio ver� todas as m�quinas, o status de cada uma e
	 * tamb�m saber� se est� ou n�o cadastrada.
	 * Ver� dados de acesso e formul�rio para pesquisar por nome de m�quina.
	 */
	
	public function telaMaquinasAdmin() {
		
		
		
	}
}