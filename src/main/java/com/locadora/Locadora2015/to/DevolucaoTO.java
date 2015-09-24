package com.locadora.Locadora2015.to;

public class DevolucaoTO {
	private double acrescimo;
	private int agenciaDevolução;
	private String dataDevolucao;
	private double kmDevolucao;

	public DevolucaoTO(double acrescimo, int agenciaDevolução,
			String dataDevolucao, double kmDevolucao) {
		
		setAcrescimo(acrescimo);
		setAgenciaDevolução(agenciaDevolução);
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

	public int getAgenciaDevolução() {
		return agenciaDevolução;
	}

	public void setAgenciaDevolução(int agenciaDevolução) {
		this.agenciaDevolução = agenciaDevolução;
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
