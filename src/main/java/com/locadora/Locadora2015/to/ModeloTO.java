package com.locadora.Locadora2015.to;

public class ModeloTO {
	private int codigo;
	private String descricao;
	private String fabricante;
	private String grupo;
	private String modelo;
	private double tarifaKmControlado;
	private double tarifaKmLivre;
	
	
	public ModeloTO(int codigo, String descricao, String fabricante,
			String grupo, String modelo, double tarifaKmControlado,
			double tarifaKmLivre) {
		
		setCodigo(codigo);
		setDescricao(descricao);
		setFabricante(fabricante);
		setGrupo(grupo);
		setModelo(modelo);
		setTarifaKmControlado(tarifaKmControlado);
		setTarifaKmLivre(tarifaKmLivre);
		
		
	}
	
	public ModeloTO(){
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getTarifaKmControlado() {
		return tarifaKmControlado;
	}

	public void setTarifaKmControlado(double tarifaKmControlado) {
		this.tarifaKmControlado = tarifaKmControlado;
	}

	public double getTarifaKmLivre() {
		return tarifaKmLivre;
	}

	public void setTarifaKmLivre(double tarifaKmLivre) {
		this.tarifaKmLivre = tarifaKmLivre;
	}
	
	
}
