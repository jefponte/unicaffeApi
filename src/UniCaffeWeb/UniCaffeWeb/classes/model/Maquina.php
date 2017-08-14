<?php
class Maquina {
	private $id;
	private $nome;
	private $enderecoMac;
	/**
	 * Esse atributo n�o existe como campo no banco de dados, s� no UniCaffeServer.
	 * 
	 * @var integer
	 */
	private $status;
	private $acesso;
	private $laboratorio;
	private $cadastrada;
	public function setCadastrada($cadastrada) {
		$this->cadastrada = $cadastrada;
	}
	public function isCadastrada() {
		return $this->cadastrada;
	}
	public function __construct() {
		$this->laboratorio = new Laboratorio ();
		$this->acesso = new Acesso ();
	}
	public function setId($id) {
		$this->id = $id;
	}
	public function getId() {
		return $this->id;
	}
	public function setNome($nome) {
		$this->nome = $nome;
	}
	public function getNome() {
		return $this->nome;
	}
	public function setEnderecoMac($enderecoMac) {
		$this->enderecoMac = $enderecoMac;
	}
	public function getEnderecoMac() {
		return $this->enderecoMac;
	}
	public function setStatus($status) {
		$this->status = $status;
	}
	public function getStatus() {
		return $this->status;
	}
	public function setAcesso(Acesso $acesso) {
		$this->acesso = $acesso;
	}
	public function getAcesso() {
		return $this->acesso;
	}
	public function setLaboratorio(Laboratorio $laboratorio) {
		$this->laboratorio = $laboratorio;
	}
	public function getLaboratorio() {
		return $this->laboratorio;
	}
	public function __toString() {
		$strMaquina = $this->nome . ' MAC: ' . $this->enderecoMac;
		
		if ($this->isCadastrada ()) {
			$strMaquina .= ' Cadatrada';
		} else {
			$strMaquina .= ' Nao cadastrada';
		}
		
		if ($this->getStatus () == self::STATUS_DESCONECTADA)
			$strMaquina .= ' Desconectada';
		if ($this->getStatus () == self::STATUS_DISPONIVEL)
			$strMaquina .= ' Disponivel ';
		if ($this->getStatus () == self::STATUS_OCUPADA) {
			$strMaquina .= ' Ocupada ';
		}
		if ($this->getLaboratorio ()->getNome () != null)
			$strMaquina .= 'Laboratorio: ' . $this->getLaboratorio ()->getNome ();
		
		return $strMaquina;
	}
	
	/**
	 * Esta m�quina est� sendo atualizada
	 * 
	 * @var integer
	 */
	const STATUS_UPDATE = 4;
	const STATUS_DISPONIVEL = 0;
	const STATUS_OCUPADA = 1;
	const STATUS_DESCONECTADA = 2;
}