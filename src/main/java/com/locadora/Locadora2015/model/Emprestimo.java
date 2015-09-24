package com.locadora.Locadora2015.model;

import java.sql.SQLException;
import java.sql.Connection;

import com.locadora.Locadora2015.dao.EmprestimoDAO;
import com.locadora.Locadora2015.dao.AcessoBD;


public class Emprestimo {
		
	public Connection conn = null;


	public Emprestimo(){
		
	}

	public void consultarEmprestimosDiarios() {

	}

	public void salvar(String dataHora,String previsao, double tipoTarifa,String cpfCli,double valor,String placaAut) throws SQLException {
				
			EmprestimoDAO obj = new EmprestimoDAO();	
			AcessoBD bd = new AcessoBD();
			conn = bd.obtemConexao();
			conn.setAutoCommit(false);
			
			obj.salvar(conn,dataHora,previsao, tipoTarifa,cpfCli,valor,placaAut);	
			
			conn.commit();
			
	

	}

	
}
