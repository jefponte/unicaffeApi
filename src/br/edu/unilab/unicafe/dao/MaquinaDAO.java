package br.edu.unilab.unicafe.dao;

import java.util.ArrayList;

import br.edu.unilab.unicafe.model.Maquina;
import br.edu.unilab.unicafe.model.Usuario;

public class MaquinaDAO extends DAO{
	
	public MaquinaDAO(){
		super();
	}
	public MaquinaDAO(int tipoDeConexao){
		super(tipoDeConexao);
		
	}
	/**
	 * Apaga todo o registro de acesso.
	 */
	public void limpa(){
		
	}
	/**
	 * Retorna toda a lista de acssos. 
	 * @return
	 */
	public ArrayList<Maquina> retornaLista(){
		ArrayList<Maquina> lista = new ArrayList<Maquina>();
		return lista;
		
	}
	/**
	 * Retorna todos os acessos de um usu�rio. 
	 * @param usuario
	 * @return
	 */
	public ArrayList<Maquina> retornaLista(Usuario usuario){
		
		ArrayList<Maquina> lista = new ArrayList<Maquina>();
		return lista;
		
	}
	
	/**
	 * Retorna True se a m�quina existir. Verifica a partir do atributo nome da m�quina. 
	 * 
	 * @param maquina
	 * @return
	 */
	public boolean existe(Maquina maquina){
		
		return true;
		
	}
	/**
	 * Retorna true se a m�quina for cadastrada com sucesso. 
	 * @param maquina
	 * @return
	 */
	public boolean cadastrar(Maquina maquina){
		
		
		return true;
		
	}
	
	

}
