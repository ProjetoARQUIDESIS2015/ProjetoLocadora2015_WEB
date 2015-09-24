package com.locadora.Locadora2015.model;

import java.sql.SQLException;
import java.util.ArrayList;
import com.locadora.Locadora2015.dao.AutomovelDAO;
import com.locadora.Locadora2015.dao.ClienteDAO;
import com.locadora.Locadora2015.to.AutomovelTO;
import com.locadora.Locadora2015.to.ClienteTO;
import com.mysql.jdbc.Connection;
import com.locadora.Locadora2015.dao.AcessoBD;

public class Automovel extends Modelo {
	
	public Connection conn = null;


	public Automovel() {

	}


	
	public void incluir(AutomovelTO automovelTO) throws SQLException {
			//int p;
			AutomovelDAO automovel = new AutomovelDAO();
			AcessoBD bd = new AcessoBD();
			conn = bd.obtemConexao();
			
			Modelo mod = new Modelo();
			conn.setAutoCommit(false);
			
			automovel.incluir(conn, automovelTO);
			conn.commit();
			 

		}
		

	public Automovel consultar(String placa) throws SQLException {
		AcessoBD bd = new AcessoBD();
		AutomovelDAO automovel = new AutomovelDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		conn.commit();
		
		return automovel.carregar(conn, placa);
	}
	

	
	public void excluir(String placa) throws SQLException {
		AcessoBD bd = new AcessoBD();
		AutomovelDAO automovel = new AutomovelDAO();
		
		conn =  bd.obtemConexao();
		conn.setAutoCommit(false);
		
		automovel.excluir(conn, placa);
		conn.commit();
      
	}
	
	public void alterar(AutomovelTO automovelTO) throws SQLException {
		
		AcessoBD bd = new AcessoBD();
		AutomovelDAO autDAO = new AutomovelDAO();
		
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		autDAO.alterar(conn, automovelTO);
		conn.commit();
		
	}

	

	
	public ArrayList<String> consultaNome() throws SQLException {
		Modelo mod = new Modelo();		
		return mod.consultaNome();
		
	}
	
	public Modelo consultarMod(String modelo) throws SQLException {
		AcessoBD bd = new AcessoBD();
		Modelo objMod = new Modelo();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);	
		conn.commit();
		
		
		int p = objMod.getC(modelo);

		return objMod.consultar(p);
		
	}

	public Automovel aleatorio(String modelo) throws SQLException {
		AcessoBD bd = new AcessoBD();
		Modelo objMod = new Modelo();
		AutomovelDAO objAut = new AutomovelDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		conn.commit();
		
		System.out.println(modelo);
		int p = objMod.getC(modelo);
		System.out.println(p);

		return objAut.aleatorio(conn,p);
		
	}


	
}
