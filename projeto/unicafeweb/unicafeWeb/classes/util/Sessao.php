<?php

/**
 * Essa classe serve para iniciar uma sess�o usando cookie e session. 
 * Serve para facilitar a utiliza��o dessas ferramentas. 
 * @author jefponte
 *
 */
class Sessao{
	
	
	public function __construct(){
		if (!isset($_SESSION)) session_start();
	}
	public function criaSessao($id, $nivel, $login){
            
		//setcookie(md5('USUARIO_NIVEL'), $nivel);
		//setcookie(md5('USUARIO_ID'), $id);
		//setcookie(md5('USUARIO_LOGIN'), $login);
		$_SESSION['USUARIO_NIVEL'] = $nivel;
		$_SESSION['USUARIO_ID'] = $id;
		$_SESSION['USUARIO_LOGIN'] = $login;
		
	}
	public function mataSessao(){
                
		@session_destroy();
		//unset($_COOKIE[md5('USUARIO_NIVEL')]);
		//unset($_COOKIE[md5('USUARIO_ID')]);
		//unset($_COOKIE[md5('USUARIO_LOGIN')]);
	}
	public function getNivelAcesso(){
		if(isset($_SESSION['USUARIO_NIVEL']) /*&& isset($_COOKIE[md5('USUARIO_NIVEL')])*/)
//			
//                    if($_SESSION['USUARIO_NIVEL'] == $_COOKIE[md5('USUARIO_NIVEL')])
				return $_SESSION['USUARIO_NIVEL'];
//			else 
//			{
//				
//				return self::NIVEL_DESLOGADO;
//			}
		else
		{
			
			return self::NIVEL_DESLOGADO;
		}
			
	}
	
	public function getIdUsuario(){
		if(isset($_SESSION['USUARIO_ID']) /*&& isset($_COOKIE[md5('USUARIO_ID')])*/)
//			if($_SESSION['USUARIO_ID'] /*== $_COOKIE[md5('USUARIO_ID')]*/)
				return $_SESSION['USUARIO_ID'];
//			else{
				
//				return self::NIVEL_DESLOGADO;
//			}
			else{
				
				return self::NIVEL_DESLOGADO;
			}
	}
	public function getLoginUsuario(){
		if(isset($_SESSION['USUARIO_LOGIN']) /*&& isset($_COOKIE[md5('USUARIO_LOGIN')])*/)
//			if($_SESSION['USUARIO_LOGIN']/* == $_COOKIE[md5('USUARIO_LOGIN')]*/)
				return $_SESSION['USUARIO_LOGIN'];
//			else
//			{
//				return self::NIVEL_DESLOGADO;
//			}
		else
			{
				return self::NIVEL_DESLOGADO;
			}
	}
	const NIVEL_DESLOGADO = 0;
	const NIVEL_COMUM = 1;
	const NIVEL_ADMIN= 1;
	
	const NIVEL_SUPER = 3;
	/**
	 * 
	 * @var 
	 * 
	 * Aqui � complicado. 
	 * Nenhum terceirizado tem login no sistema, mas 
	 * a biblioteca � tocada por terceirizados. 
	 * 
	 * S�o tercerizados que ir�o trabalhar com o sistema, gerenciando.
	 * E a�, como resolve isso?
	 * Iremos criar um artif�cio emergencial para que o sistema
	 * n�o fique sem gerenciamento. 
	 * Um usu�rio com senha fixa que ter� acesso �s m�quinas da biblioteca. 
	 *  
	 */
	const NIVEL_USUARIO_ESPECIAL = 10;
	
}
