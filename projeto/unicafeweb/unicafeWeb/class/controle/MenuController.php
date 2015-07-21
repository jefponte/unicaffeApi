<?php

/**
 * Essa classe serve tanto para mostrar o menu, como para capturar o menu que foi selecionado. 
 * @author jefponte
 *
 */
class MenuController{
	
	
	public static function main()
	{
		
		$menuView = new MenuView();
		$menuView->mostraMenu();
		
		if (isset ( $_GET ["cadastroLab"] ))
			include './visao/cadastroLab.php';
		else if (isset ( $_GET ["listarlab"] )) {
			include './visao/listagemLab.php';
		} else if (isset ( $_GET ["cadastromaq"] )) {
			include './visao/cadastroLabMaq.php';
		} else if (isset ( $_GET ["listarmaq"] )) {
			include './visao/listagemMaquina.php';
		} else if (isset ( $_GET ["acessosmaq"] )) {
			include './visao/acessos.php';
		} else if (isset ( $_GET ["historico"] )) {
			include './visao/historicoMaq.php';
		} else if (isset ( $_GET ["comandos"] )) {
			include './visao/comandos.php';
		} else if (isset ( $_GET ["comando"] )) {
			print $_GET ["maquina"];
			include './visao/comandos.php';
		} else if (isset ( $_GET ["comando1"] )) {
			include './visao/comandos.php';
		} else if (isset ( $_GET ["editar"] )) {
			include './visao/listagemLab.php';
		} else if (isset ( $_GET ["editarmaq"] )) {
			include './visao/listagemMaquina.php';
		} else if (isset ( $_GET ["editarmaqlab"] )) {
			include './visao/editarLabMaq.php';
		} else if (isset ( $_GET ["vermaquina"] )) {
			include './visao/listagemLab.php';
		}
		else
		{
			$homeView = new HomeView ();
			$homeView->conteudoPaginaInicial ();
			$homeView->mostraRodape();
		}
		
	}
	
	public function capturaMenu(){
		
	}
	
}


?>