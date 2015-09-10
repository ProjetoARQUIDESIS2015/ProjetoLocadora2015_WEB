package com.locadora.Locadora2015.model;

import java.sql.Connection;
import java.sql.SQLException;

import com.locadora.Locadora2015.dao.AcessoBD;
import com.locadora.Locadora2015.dao.UsuarioDAO;

public class Usuario {
	private String nomeUsuario;
	private char permissao;
	private String senha;
	private int idUsuario;
	public Connection conn = null;

	public Usuario(String nomeUsuario, String senha, char permissao) {
		setNomeUsuario(nomeUsuario);
		setSenha(senha);
		setPermissao(permissao);
	}
	public Usuario (String nomeUsuario, String senha){
		setNomeUsuario(nomeUsuario);
		setSenha(senha);
		setPermissao('0');
	}
	public Usuario (){
		setNomeUsuario(null);
		setSenha(null);
		setPermissao('0');
	}

	public void efetuarLogin(int idUsuario, String senha) {
		
	}
	public void incluir(int idUsuario, String nomeUsuario, String senha, char permissao) throws SQLException {
			
			UsuarioDAO user = new UsuarioDAO();
			AcessoBD bd = new AcessoBD();
			conn = bd.obtemConexao();
			
			conn.setAutoCommit(false);
			
			user.incluir(conn, idUsuario, nomeUsuario, senha, permissao);
			conn.commit();
			 

		}
		
		public void alterar(int idUsuario, String nomeUsuario, String senha, char permissao) throws SQLException {
			
			AcessoBD bd = new AcessoBD();
			UsuarioDAO user = new UsuarioDAO();
		
		
			conn = bd.obtemConexao();
			conn.setAutoCommit(false);
			
		
			user.alterar(conn, idUsuario, nomeUsuario, senha, permissao);
			conn.commit();
			
		}

		public Usuario consultar(int idUsuario) throws SQLException {
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

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public char getPermissao() {
		return permissao;
	}

	public String getSenha() {
		return senha;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public void setPermissao(char permissao) {
		this.permissao = permissao;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
}
