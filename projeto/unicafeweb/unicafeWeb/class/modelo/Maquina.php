<?php
class Maquina {
	private $id;
	private $nome;
	private $ip;
	private $enderecoMac;
	private $acesso;
	private $laboratorio;
	public function setLaboratorio(Laboratorio $laboratorio) {
		$this->laboratorio = $laboratorio;
	}
	public function getLaboratorio() {
		return $this->laboratorio;
	}
	public function setId($id) {
		$this->id = $id;
	}
	public function getId() {
		return $this->id;
	}
	public function setIp($ip) {
		$this->ip = $ip;
	}
	public function getIp() {
		return $this->ip;
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
}

?>