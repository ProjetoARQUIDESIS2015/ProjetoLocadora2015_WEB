package com.locadora.Locadora2015.to;

public class EmprestimoTO {

	private int agenciaEmprestimo;
	private int agPrevDevolucao;
	private boolean cadeiraDeBebe;
	private String dataHoraEmprestimo;
	private String dataHoraPrevDevolucao;
	private boolean gps;
	private double kmEmprestimo;
	private boolean motorista;
	private int numero;
	private double tipoTarifa;
	 
	

	public EmprestimoTO(int agenciaEmprestimo, int agPrevDevolucao,
			boolean cadeiraDeBebe, String dataHoraEmprestimo,
			String dataHoraPrevDevolucao, boolean gps, double kmEmprestimo,
			boolean motorista, int numero, double tipoTarifa) {
		
		setAgenciaEmprestimo(agenciaEmprestimo);
		setAgPrevDevolucao(agPrevDevolucao);
		setCadeiraDeBebe(cadeiraDeBebe);
		setDataHoraEmprestimo(dataHoraEmprestimo);
		setDataHoraPrevDevolucao(dataHoraPrevDevolucao);
		setGps(gps);
		setKmEmprestimo(kmEmprestimo);
		setMotorista(motorista);
		setNumero(numero);
		setTipoTarifa(tipoTarifa);
	}

	public EmprestimoTO(){
		
	}

	public int getAgenciaEmprestimo() {
		return agenciaEmprestimo;
	}



	public void setAgenciaEmprestimo(int agenciaEmprestimo) {
		this.agenciaEmprestimo = agenciaEmprestimo;
	}



	public int getAgPrevDevolucao() {
		return agPrevDevolucao;
	}



	public void setAgPrevDevolucao(int agPrevDevolucao) {
		this.agPrevDevolucao = agPrevDevolucao;
	}



	public boolean isCadeiraDeBebe() {
		return cadeiraDeBebe;
	}



	public void setCadeiraDeBebe(boolean cadeiraDeBebe) {
		this.cadeiraDeBebe = cadeiraDeBebe;
	}



	public String getDataHoraEmprestimo() {
		return dataHoraEmprestimo;
	}



	public void setDataHoraEmprestimo(String dataHoraEmprestimo) {
		this.dataHoraEmprestimo = dataHoraEmprestimo;
	}



	public String getDataHoraPrevDevolucao() {
		return dataHoraPrevDevolucao;
	}



	public void setDataHoraPrevDevolucao(String dataHoraPrevDevolucao) {
		this.dataHoraPrevDevolucao = dataHoraPrevDevolucao;
	}



	public boolean isGps() {
		return gps;
	}



	public void setGps(boolean gps) {
		this.gps = gps;
	}



	public double getKmEmprestimo() {
		return kmEmprestimo;
	}



	public void setKmEmprestimo(double kmEmprestimo) {
		this.kmEmprestimo = kmEmprestimo;
	}



	public boolean isMotorista() {
		return motorista;
	}



	public void setMotorista(boolean motorista) {
		this.motorista = motorista;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public double getTipoTarifa() {
		return tipoTarifa;
	}



	public void setTipoTarifa(double tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}
	
	
}
