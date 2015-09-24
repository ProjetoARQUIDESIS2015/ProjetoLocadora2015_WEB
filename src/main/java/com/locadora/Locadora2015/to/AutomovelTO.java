package com.locadora.Locadora2015.to;

public class AutomovelTO {
	private String agencia;
	private String ano;
	private String chassi;
	private String estado;
	private double km;
	private String placa;
	private String status;

	
	public AutomovelTO() {

	}


	public AutomovelTO(String agencia, String ano, String chassi, 
		String estado, double km, String placa, String status){
		
		setAgencia(agencia);
		setAno(ano);
		setChassi(chassi);
		setEstado(estado);
		setKm(km);
		setPlaca(placa);
		setStatus(status);
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getChassi() {
		return chassi;
	}


	public void setChassi(String chassi) {
		this.chassi = chassi;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public double getKm() {
		return km;
	}


	public void setKm(double km) {
		this.km = km;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
