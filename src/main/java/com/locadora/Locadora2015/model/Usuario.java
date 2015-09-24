package com.locadora.Locadora2015.model;

import java.sql.Connection;
import java.sql.SQLException;

import com.locadora.Locadora2015.dao.AcessoBD;
import com.locadora.Locadora2015.dao.UsuarioDAO;
import com.locadora.Locadora2015.to.UsuarioTO;

public class Usuario {
	
	public Connection conn = null;

	public Usuario () {
	
	}
	
	public void efetuarLogin(int idUsuario, String senha) {
		
	}
	public void incluir(UsuarioTO usuarioTO) throws SQLException {
			
			UsuarioDAO user = new UsuarioDAO();
			AcessoBD bd = new AcessoBD();
			conn = bd.obtemConexao();
			
			conn.setAutoCommit(false);
			
			user.incluir(conn, usuarioTO);
			conn.commit();
			 

		}
		
		public void alterar(UsuarioTO usuarioTO) throws SQLException {
			
			AcessoBD bd = new AcessoBD();
			UsuarioDAO user = new UsuarioDAO();
		
		
			conn = bd.obtemConexao();
			conn.setAutoCommit(false);
			
		
			user.alterar(conn, usuarioTO);
			conn.commit();
			
		}

		public UsuarioTO consultar(int idUsuario) throws SQLException {
			AcessoBD bd = new AcessoBD();
			UsuarioDAO user = new UsuarioDAO();
			
			conn = bd.obtemConexao();
			conn.setAutoCommit(false);
			
			conn.commit();
			
			return user.carregar(conn,idUsuario);
		}
		



		public void excluir(int idUsuario) throws SQLException {
			AcessoBD bd = new AcessoBD();
			UsuarioDAO user = new UsuarioDAO();
			
			conn =  bd.obtemConexao();
			conn.setAutoCommit(false);
			
			user.excluir(conn,idUsuario);
			conn.commit();
	      
		}

	
}
