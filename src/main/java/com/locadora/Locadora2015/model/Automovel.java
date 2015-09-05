package com.locadora.Locadora2015.model;

import java.sql.SQLException;
import java.util.ArrayList;
import com.locadora.Locadora2015.dao.AutomovelDAO;
import com.locadora.Locadora2015.dao.AcessoBD;

public class Automovel extends Modelo {
	private String agencia;
	private String ano;

	private String chassi;


	private String estado;

	private double km;

	private String placa;

	private String status;
	


	public Automovel() {

	}


	public Automovel(String agencia, String ano, String chassi, 
		String estado, double km, String placa, String status) {
		setAgencia(agencia);
		setAno(ano);
		setChassi(chassi);
	
		setEstado(estado);
		setKm(km);
		setPlaca(placa);
		setStatus(status);
	}



	
	public void incluir(String placa, String agencia, String ano, String chassi, 
			String estado, double km, String modelo) throws SQLException {
			//int p;
			AutomovelDAO automovel = new AutomovelDAO();
			AcessoBD bd = new AcessoBD();
			conn = bd.obtemConexao();
			Modelo mod = new Modelo();
		//	p= mod.getC(modelo);
		
			
			
			conn.setAutoCommit(false);
			
			automovel.incluir(conn,placa, agencia, ano, chassi,estado,km,mod.getC(modelo));
			conn.commit();
			 

		}
		

	public Automovel consultar(String placa) throws SQLException {
		AcessoBD bd = new AcessoBD();
		AutomovelDAO automovel = new AutomovelDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		conn.commit();
		
		return automovel.carregar(conn,placa);
	}

	
	public void excluir(String placa) throws SQLException {
		AcessoBD bd = new AcessoBD();
		AutomovelDAO automovel = new AutomovelDAO();
		conn =  bd.obtemConexao();
		conn.setAutoCommit(false);
		automovel.excluir(conn,placa);
		conn.commit();
      
	}
	
	public void alterar(String agencia, String ano, String chassi, 
			String estado, double km, String placa) throws SQLException {
		
		AcessoBD bd = new AcessoBD();
		AutomovelDAO autDAO = new AutomovelDAO();
	
	
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
	
		autDAO.alterar(conn,agencia,ano,chassi,estado,km,placa);
		conn.commit();
		
	}

	public String getAgencia() {
		return agencia;
	}

	public String getAno() {
		return ano;
	}

	public String getChassi() {
		return chassi;
	}



	public String getEstado() {
		return estado;
	}

	public double getKm() {
		return km;
	}

	public String getPlaca() {
		return placa;
	}

	public void incluir() {

	}
	public String isStatus() {
		return status;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	


	
	public ArrayList<String> consultaNome() throws SQLException {
		Modelo mod = new Modelo();		
		return mod.consultaNome();
		
	}
	
	 
	public Modelo consultarMod(String modelo) throws SQLException {
		AcessoBD bd = new AcessoBD();
		Modelo objMod = new Modelo();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		conn.commit();
		
		
		int p = objMod.getC(modelo);

		return objMod.consultar(p);
		
	}

	public Automovel aleatorio(String modelo) throws SQLException {
		AcessoBD bd = new AcessoBD();
		Modelo objMod = new Modelo();
		AutomovelDAO objAut = new AutomovelDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		
		conn.commit();
		
		System.out.println(modelo);
		int p = objMod.getC(modelo);
		System.out.println(p);

		return objAut.aleatorio(conn,p);
		
	}


	
}
