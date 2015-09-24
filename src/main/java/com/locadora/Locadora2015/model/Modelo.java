package com.locadora.Locadora2015.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import com.locadora.Locadora2015.dao.AcessoBD;
import com.locadora.Locadora2015.dao.ModeloDAO;
import com.locadora.Locadora2015.to.ModeloTO;


public class Modelo {
	
	public Connection conn = null;

	public Modelo() {
		
	}
	

	public void alterar(ModeloTO modeloTO) throws SQLException {
		
		AcessoBD bd = new AcessoBD();
		ModeloDAO modDAO = new ModeloDAO();
	
	
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
	
		modDAO.alterar(conn,codigo, descricao, fabricante, grupo, modelo, tarifaKmControlado, tarifaKmLivre);
		conn.commit();
		
	}
	
	
	public ModeloTO consultar(int codigo) throws SQLException {
		AcessoBD bd = new AcessoBD();
		ModeloDAO modelo = new ModeloDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		
		return modelo.carregar(conn,codigo);
		
	}
	
	public int getC(String modelo) throws SQLException {
		AcessoBD bd = new AcessoBD();
		ModeloDAO mo = new ModeloDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
	
		
		return mo.carregarCod(conn,modelo);
		
	}
	
	
	public ArrayList<String> consultaNome() throws SQLException {
		AcessoBD bd = new AcessoBD();
		ModeloDAO mod = new ModeloDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
	
		
		return mod.carregarPorNome(conn);
		
	}

	public void incluir(ModeloTO modeloTO) throws SQLException {
			
		ModeloDAO objmod = new ModeloDAO();	
		AcessoBD bd = new AcessoBD();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		objmod.incluir(conn,codigo,descricao,fabricante,grupo,modelo,tarifaKmControlado,tarifaKmLivre);	
		
		conn.commit();
		
		
	}

	public void excluir(int codigo) throws SQLException {
		AcessoBD bd = new AcessoBD();
		ModeloDAO modelo = new ModeloDAO();
		conn =  bd.obtemConexao();
		conn.setAutoCommit(false);
		modelo.excluir(conn,codigo);
		conn.commit();
      
	}

	
	public int disponibilidade(String automovel) throws SQLException {
		AcessoBD bd = new AcessoBD();
		ModeloDAO m = new ModeloDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
			int t = 0;
			t=  m.carregarCod(conn,automovel);
			System.out.println("Negócio::::::::: select" + automovel);
			return m.disponibilidade(conn,t);
		
	}
	
	

}
