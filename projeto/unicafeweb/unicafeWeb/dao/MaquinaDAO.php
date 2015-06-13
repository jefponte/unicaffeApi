<?php


class MaquinaDAO extends DAO{
	

	
	
	public function retornaListaDoJSON(){

		//$ponteiro = fopen ("C:\unicafe\web\json\saida.json","r");
		//$ponteiro = utf8_encode($ponteiro);
		
		

		$unicafe = new UniCafe();
		$strJson = $unicafe->dialoga("getMaquinas()");
		$unicafe->close();

		$jsons = explode('|', $strJson);
		$maquinas = array();
		
		foreach($jsons as $json){
			
			$json = $json;
			
			//echo $json.'<br><br>';
			$objeto = json_decode($json, true);
			$maquina = new Maquina();
			$maquina->setId($objeto['id']);
			$maquina->setNome($objeto['nome']);
			$maquina->setIp($objeto['ip']);
			$maquina->setEnderecoMac($objeto['enderecoMac']);
			//$maquina->setStatus($objeto['status']);
			$maquina->getAcesso()->setId($objeto['acesso']['id']);
			$maquina->getAcesso()->setTempoUsado($objeto['acesso']['tempoUsado']);
			$maquina->getAcesso()->setHoraInicial($objeto['acesso']['horaInicial']);
			$maquina->getAcesso()->getUsuario()->setId($objeto['acesso']['usuario']['id']);
			$maquina->getAcesso()->getUsuario()->setLogin($objeto['acesso']['usuario']['login']);
			$maquina->getAcesso()->setTempoDisponibilizado($objeto['acesso']['tempoDisponibilizado']);
			$maquina->getAcesso()->setStatus($objeto['acesso']['status']);
			$maquina->getAcesso()->getUsuario()->setNivelAcesso($objeto['acesso']['usuario']['nivelAcesso']);
			$maquina->setNome(strtoupper($maquina->getNome()));
			
			$maquinas[] = $maquina;
		}
		
	
		$quantidade = count($maquinas);
		$houveTroca = true;
		
		for($i = count($maquinas) - 1; $i >= 1; $i--){
			for($j=0; $j < $i ; $j++) {
				
				if(strcmp($maquinas[$j]->getNome(), $maquinas[$j+1]->getNome()) > 0) {
					$maquinaAux = clone $maquinas[$j];
					$maquinas[$j] = clone $maquinas[$j+1];
					$maquinas[$j+1] = clone $maquinaAux;
					
				}
			}
			
			
		}
		
		
		return $maquinas;
		
	}

	
	
}

?>