package com.locadora.Locadora2015.to;

public class AgenciaTO {

	private String cidade;
	private int codigo;
	private String estado;
	private String nome;

	public AgenciaTO(String cidade, int codigo, String estado, String nome) {
		setCidade(cidade);
		setCodigo(codigo);
		setEstado(estado);
		setNome(nome);
	}
	
	public AgenciaTO(){
		
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
