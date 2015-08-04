<?php
function __autoload($classe) {
	if (file_exists ( 'classes/dao/' . $classe . '.php' ))
		include_once 'classes/dao/' . $classe . '.php';
	if (file_exists ( 'classes/model/' . $classe . '.php' ))
		include_once 'classes/model/' . $classe . '.php';
	if (file_exists ( 'classes/controller/' . $classe . '.php' ))
		include_once 'classes/controller/' . $classe . '.php';
	if (file_exists ( 'classes/util/' . $classe . '.php' ))
		include_once 'classes/util/' . $classe . '.php';
	if (file_exists ( 'classes/view/' . $classe . '.php' ))
		include_once 'classes/view/' . $classe . '.php';
}
if (isset ( $_GET ["sair"] )) {
	$sessao->mataSessao ();
	header ( "Location: index.php" );
}

require_once('header.php');
include 'classes/view/paginas/lab_visualizacao.php';

?>
            

        </div><!-- Pagina -->
    </body>
</html>