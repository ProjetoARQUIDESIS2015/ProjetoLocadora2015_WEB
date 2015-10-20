package com.locadora.Locadora2015.to;

public class UsuarioTO {
	private String nomeUsuario;
	private char permissao;
	private String senha;
	private int idUsuario;

	public UsuarioTO(String nomeUsuario, String senha, char permissao, int idUsuario) {
		setNomeUsuario(nomeUsuario);
		setSenha(senha);
		setPermissao(permissao);
		setIdUsuario(idUsuario);
	}
	
	public UsuarioTO(){
		setNomeUsuario(null);
		setSenha(null);
		setPermissao('0');
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public char getPermissao() {
		return permissao;
	}

	public void setPermissao(char permissao) {
		this.permissao = permissao;
	}

	public String getSenha() {
		return senha;
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
