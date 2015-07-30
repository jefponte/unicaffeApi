<?php
class MaquinaController {
	const TELA_ADMINISTRADOR = 1;
	const TELA_SUPER = 2;
	
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
			
			case self::TELA_ADMINISTRADOR :
				$maquinaController->telaMaquinasAdmin ();
				break;
			case self::TELA_SUPER :
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
		$maquinaDAO = new MaquinaDAO ();
		$lista = $maquinaDAO->listaCompleta ();
		$lista = $maquinaDAO->ordenaPorNome($lista);
		
		if(isset($_GET['detalhe'])){
			foreach ( $lista as $maquina ) {
				echo '<a href="?detalhe='.$maquina->getNome().'">'.$maquina->getNome().'</a>';
				if($_GET['detalhe']== $maquina->getNome()){
					echo $maquina;
					if($maquina->getStatus() == Maquina::STATUS_OCUPADA){
						echo $maquina->getAcesso();
					}
				}
				echo '<br><br><hr>';
				
			}
			return;
		}
		
		foreach ( $lista as $maquina ) {
			echo '<a href="?detalhe='.$maquina->getNome().'">'.$maquina->getNome().'</a>';
			if(!$maquina->isCadastrada())
				echo 'Nao Cadastrada';
			echo '<br><br><hr>';
		
		}
		
		
	}
	
	/**
	 * Nessa � poss�vel cadastrar a m�quina ou atualizar.
	 */
	public function telaMaquinasSuper() {
		$maquinaDAO = new MaquinaDAO ();
		$lista = $maquinaDAO->listaCompleta ();
		$lista = $maquinaDAO->ordenaPorNome($lista);
		if(isset($_GET['cadastrar'])){
			
			echo "Vamos tentar: ";
			$unicafe= new UniCafe();
			echo $unicafe->dialoga('cadastraMaquina('.$_GET['cadastrar'].')');

 			
			
		}
		
		
		if(isset($_GET['detalhe'])){
			
			foreach ( $lista as $maquina ) {
				echo '<a href="?detalhe='.$maquina->getNome().'">'.$maquina->getNome().'</a>';
				if($_GET['detalhe']== $maquina->getNome()){
					echo $maquina;
					if(!$maquina->isCadastrada())
						echo '<br><a href="?cadastrar='.$maquina->getNome().'">Nao Cadastrada</a><br>';
					if($maquina->getStatus() == Maquina::STATUS_OCUPADA){
						echo $maquina->getAcesso();
						echo '<br>'.$maquina->getAcesso()->getUsuario();
						echo 'Laboratorio: '.$maquina->getLaboratorio()->getNome();
					}
				}
				echo '<br><br><hr>';
				
			}
			return;
		}
		
		
		foreach ( $lista as $maquina ) {
			echo '<a href="?detalhe='.$maquina->getNome().'">'.$maquina->getNome().'</a>';
			if(!$maquina->isCadastrada())
				echo '<br><a href="?cadastrar='.$maquina->getNome().'">Nao Cadastrada</a>';

			echo '<br><br><hr>';
		
		}
		
		
	}
	/**
	 * Em todos os casos o usu�rio ver� todas as m�quinas, o status de cada uma e
	 * tamb�m saber� se est� ou n�o cadastrada.
	 * Ver� dados de acesso e formul�rio para pesquisar por nome de m�quina.
	 */
	
	public function telaMaquinasAdmin() {
		$maquinaDAO = new MaquinaDAO ();
		$lista = $maquinaDAO->listaCompleta ();
		$lista = $maquinaDAO->ordenaPorNome($lista);
		
		if(isset($_GET['detalhe'])){
			foreach ( $lista as $maquina ) {
				echo '<a href="?detalhe='.$maquina->getNome().'">'.$maquina->getNome().'</a>';
				if($_GET['detalhe']== $maquina->getNome()){
					echo $maquina;
					if($maquina->getStatus() == Maquina::STATUS_OCUPADA){
						echo $maquina->getAcesso();
						echo '<br>'.$maquina->getAcesso()->getUsuario();
						
					}
				}
				echo '<br><br><hr>';
				
			}
			return;
		}
		
		foreach ( $lista as $maquina ) {
			echo '<a href="?detalhe='.$maquina->getNome().'">'.$maquina->getNome().'</a>';
			if(!$maquina->isCadastrada())
				echo 'Nao Cadastrada';
			echo '<br><br><hr>';
		
		}
		
		
	}
}