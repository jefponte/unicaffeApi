package br.edu.unilab.unicafe.model;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Maquina {
	private String nome;
	private String ip;
	private String enderecoMac;
	private int status;

	public void preencheComMaquinaLocal() {
		InetAddress ia = null;
		try {
			ia = InetAddress.getLocalHost();
			this.ip = ia.getHostAddress().toString();
			this.nome = ia.getHostName().toString();

			NetworkInterface ni = NetworkInterface.getByInetAddress(ia);
			byte[] mac = ni.getHardwareAddress();
			String macAddress = "";
			for (int i = 0; i < mac.length; i++) {
				macAddress += (String.format("%02X-", mac[i]));
			}
			this.enderecoMac = macAddress.substring(0, macAddress.length() - 1);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getEnderecoMac() {
		return enderecoMac;
	}

	public void setEnderecoMac(String enderecoMac) {
		this.enderecoMac = enderecoMac;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {

		return "Nome: " + this.nome + " | ip: " + this.ip + " | MAC: "
				+ this.enderecoMac + " | Status: " + this.status;

	}

}
