package com.locadora.Locadora2015.to;

public class DevolucaoTO {
	private double acrescimo;
	private int agenciaDevolu��o;
	private String dataDevolucao;
	private double kmDevolucao;

	public DevolucaoTO(double acrescimo, int agenciaDevolu��o,
			String dataDevolucao, double kmDevolucao) {
		
		setAcrescimo(acrescimo);
		setAgenciaDevolu��o(agenciaDevolu��o);
		setDataDevolucao(dataDevolucao);
		setKmDevolucao(kmDevolucao);
	}
	
	public DevolucaoTO(){
		
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}

	public int getAgenciaDevolu��o() {
		return agenciaDevolu��o;
	}

	public void setAgenciaDevolu��o(int agenciaDevolu��o) {
		this.agenciaDevolu��o = agenciaDevolu��o;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public double getKmDevolucao() {
		return kmDevolucao;
	}

	public void setKmDevolucao(double kmDevolucao) {
		this.kmDevolucao = kmDevolucao;
	}
	
	
}
