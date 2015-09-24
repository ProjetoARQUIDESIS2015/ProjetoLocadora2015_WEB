package com.locadora.Locadora2015.model;

import java.sql.Connection;
import java.sql.SQLException;

import com.locadora.Locadora2015.dao.DevolucaoDAO;
import com.locadora.Locadora2015.dao.AcessoBD;


public class Devolucao {
	
	public Connection conn = null;

	
	public void consultarDevolucoesDiarias() {

	}

	public void salvar(String dataDevolucao,double acrescimo, int agenciaDevolução,double kmDevolucao) throws SQLException {
				
			Devolucao obj = new Devolucao();	
			AcessoBD bd = new AcessoBD();
			conn = bd.obtemConexao();
			conn.setAutoCommit(false);
			
			obj.salvar(conn,dataDevolucao,acrescimo, agenciaDevolução, kmDevolucao);	
			
			conn.commit();
			
	

	}
	
}
