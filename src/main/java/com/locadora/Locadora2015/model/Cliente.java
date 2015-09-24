package com.locadora.Locadora2015.model;

import java.sql.Connection;
import java.sql.SQLException;

import com.locadora.Locadora2015.dao.AcessoBD;
import com.locadora.Locadora2015.dao.ClienteDAO;
import com.locadora.Locadora2015.to.ClienteTO;

public class Cliente {

	
	public Connection conn = null;
	
	
	public Cliente() {
	
		
	}
	
	public void incluir(ClienteTO clienteTO) throws SQLException {
		
		ClienteDAO cliente = new ClienteDAO();
		AcessoBD bd = new AcessoBD();
		conn = bd.obtemConexao();
		
		conn.setAutoCommit(false);
		
		cliente.incluir(conn, clienteTO);
		conn.commit();
		 

	}
	
	public void alterar(ClienteTO clienteTO) throws SQLException {
		
		AcessoBD bd = new AcessoBD();
		ClienteDAO cliDAO = new ClienteDAO();
	
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		cliDAO.alterar(conn, clienteTO);
		conn.commit();
		
	}

	public ClienteTO consultar(String cpf) throws SQLException {
		AcessoBD bd = new AcessoBD();
		ClienteDAO cliente = new ClienteDAO();
		
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		conn.commit();
		
		return cliente.carregar(conn, cpf);
	}
	



	public void excluir(String cpf) throws SQLException {
		AcessoBD bd = new AcessoBD();
		ClienteDAO cliente = new ClienteDAO();
		
		conn =  bd.obtemConexao();
		conn.setAutoCommit(false);
		
		cliente.excluir(conn,cpf);
		conn.commit();
      
	}
	

}
