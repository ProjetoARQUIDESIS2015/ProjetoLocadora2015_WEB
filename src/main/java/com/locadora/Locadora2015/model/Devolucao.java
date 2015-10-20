package com.locadora.Locadora2015.model;

import java.sql.Connection;
import java.sql.SQLException;

import com.locadora.Locadora2015.dao.DevolucaoDAO;
import com.locadora.Locadora2015.to.DevolucaoTO;
import com.locadora.Locadora2015.dao.AcessoBD;


public class Devolucao {
	
	public Connection conn = null;
	
	public Devolucao(){
		
	}
	
	public void consultarDevolucoesDiarias() {

	}

	public void salvar(DevolucaoTO devolucaoTO) throws SQLException {
				
			DevolucaoDAO obj = new DevolucaoDAO();	
			AcessoBD bd = new AcessoBD();
			conn = bd.obtemConexao();
			
			conn.setAutoCommit(false);
			
			obj.salvar(conn, devolucaoTO);	
			
			conn.commit();
			
	

	}
	
}
