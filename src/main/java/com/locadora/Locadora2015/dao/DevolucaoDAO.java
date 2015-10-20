package com.locadora.Locadora2015.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.locadora.Locadora2015.to.DevolucaoTO;

public class DevolucaoDAO {
	
	
	public void salvar(Connection conn, String dataDevolucao,double acrescimo, int agenciaDevolução,double kmDevolucao) throws SQLException {
	try{				
			
			String sqlSelect ="INSERT INTO devolucao (dataDevolucao, acrescimo, agenciaDevolucao, kmDevolucao) values (?,?,?, ?, );";
			
			PreparedStatement stm  = conn.prepareStatement(sqlSelect);
		
			
			stm.setString(1, dataDevolucao);
			stm.setDouble(2, acrescimo);		
			stm.setInt(3, agenciaDevolução);
			stm.setDouble(4, kmDevolucao);

						
			stm.executeUpdate();			
			stm.close();
				
		
		}	
		
		catch (Exception e){
			if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){  
				JOptionPane.showMessageDialog(null,"erro");
			}else{ 
				JOptionPane.showMessageDialog(null,"erro");
			}
			e.printStackTrace();
			try{
			conn.rollback();
			}
			catch (SQLException e1){
			System.out.print(e1.getStackTrace());
			}
		
		}
		
	
	}

	public void salvar(Connection conn, DevolucaoTO devolucaoTO) {
	
		
	}
}
