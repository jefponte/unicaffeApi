<?php 


$sessao = new Sessao ();

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
ini_set('display_errors',1);
ini_set('display_startup_erros',1);
error_reporting(E_ALL);


?>
<!DOCTYPE html>
<html lang="pt-BR" xml:lang="pt-BR">
<head>
<meta charset="UTF-8">
<title>SICAE</title>
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<!-- meta tag para responsividade em Windows e Linux -->
	<link rel="stylesheet" href="http://spa.dsi.unilab.edu.br/spa/css/spa.css" />
	<link rel="stylesheet" href="css/style.css" />

</head>
<body>
<div class="pagina fundo-cinza1">
    <div id="barra-governo">
        <div class="resolucao">
           <div class="a-esquerda">
              <a href="http://brasil.gov.br/" target="_blank"><span id="bandeira"></span><span>BRASIL</span></a>
              <a href="http://acessoainformacao.unilab.edu.br/" target="_blank">Acesso à informação</a>
           </div>
           <div class="a-direita"><a href="#"><i class="icone-menu"></i></a></div>
           <ul>
              <li><a href="http://brasil.gov.br/barra#participe" target="_blank">Participe</a></li>
              <li><a href="http://www.servicos.gov.br/" target="_blank">Serviços</a></li>
              <li><a href="http://www.planalto.gov.br/legislacao" target="_blank">Legislação</a></li>
              <li><a href="http://brasil.gov.br/barra#orgaos-atuacao-canais" target="_blank">Canais</a></li>
           </ul>
        </div>
    </div>
<?php 

if($sessao->getNivelAcesso() != Sessao::NIVEL_SUPER){
	UsuarioController::main(Sessao::NIVEL_DESLOGADO);
	
}else{
	echo '<div class="doze colunas barra-menu">
    <div class="menu-horizontal resolucao">
        <ol class="a-esquerda">
            <li><a href="?pagina=inicio" class="item-ativo"><span class="icone-home3"></span> <span class="item-texto">Início</span></a></li>
            <li><a href="?pagina=catraca_cadastrar" class="item"><span class="icone-drawer"></span> <span class="item-texto">Catraca</span><span class="icone-expande"></span></a>
                <ul>
                    <li><a href="?pagina=catraca_cadastrar">Cadastrar</a></li>
                    <li><a href="?pagina=catraca_gerenciar">Gerenciar</a></li>

                </ul>
            </li>
            <li><a href="#" class="item"><span class="icone-stack"></span> <span class="item-texto">Guichê</span><span class="icone-expande"></span></a>
                <ul>
                        
                    <li><a href="?pagina=guiche_atribuir">Atribuir</a></li>
                    <li><a href="?pagina=guiche_gerenciar">Gerenciar</a></li>
                </ul>
            </li>
            <li><a href="#" class="item"><span class="icone-stats-bars"></span> <span class="item-texto">Cartão</span><span class="icone-expande"></span></a>
                <ul>
                    <li><a href="?m=relatorios&t=ocorrencias_geral">Perfis</a></li>
                    <li><a href="?m=relatorios&t=ocorrencias_itens">Isenções</a></li>
                    <li><a href="?m=relatorios&t=ocorrencias_subitens">Gerenciar Avulsos</a></li>
	            
                </ul>
            </li>
			<li><a href="?pagina=transacoes_receber" class="item"><span class="icone-stats-bars"></span> <span class="item-texto">Transações</span><span class="icone-expande"></span></a>
                <ul>
                    <li><a href="?m=relatorios&t=ocorrencias_geral">Receber</a></li>
                    <li><a href="?m=relatorios&t=ocorrencias_itens">Pagar</a></li>
	            
                </ul>
            </li>
				
			<li><a href="?pagina=relatorios_transacao" class="item"><span class="icone-stats-bars"></span> <span class="item-texto">Transações</span><span class="icone-expande"></span></a>
                <ul>
                    <li><a href="?pagina=relatorio_vendas">Vendas</a></li>
                    <li><a href="?pagina=relatorio_utilizacao">Utilização</a></li>
	            
                </ul>
            </li>
				
                        <li><a href="?m=ajuda&t=video_tutorial_3s" class="item"><span class="icone-question"></span> <span class="item-texto">Ajuda</span><span class="icone-expande"></span></a>
                <!--<ul>
                    <li><a href="?m=ajuda&t=video_tutorial_3s">Vídeo Tutorial</a></li>            
                </ul>-->
            </li>
        </ol>
        <ol class="a-direita" start="6">
            <li><a href="?sair=daqui" class="item"><span class="icone-exit"></span> <span class="item-texto">Sair</span></a></li>
        </ol>
    </div>
</div>
				
				
				
				
				  <div class="doze colunas margem-acima">
            	    <div class="conteudo resolucao">
                 	   <div class="doze colunas">
					<h2>	Teste</h2>
				
				
				
				
				</div></div></div></div>
				';
	
	
	
	
	
	
}


?>



</body>
</html>
