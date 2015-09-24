package com.locadora.Locadora2015.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.locadora.Locadora2015.to.AutomovelTO;

public class AutomovelDAO {

	public boolean automovelInexistente = false;
	
	ModeloDAO modDao = new ModeloDAO();
	
	public void incluir(Connection conn, AutomovelTO automovel) throws SQLException {
	
		try{				
			
			String sqlSelect ="insert INTO automovel (agencia, ano,chassi, estado, km,placa, statusAut, modelo) values (?,?,?,?,?,?,?);";
			
			PreparedStatement stm  = conn.prepareStatement(sqlSelect);
		
			stm.setString(1, automovel.getAgencia());
			stm.setString(2, automovel.getAno());
			stm.setString(3, automovel.getChassi());			
			stm.setString(4, automovel.getEstado());
			stm.setDouble(5, automovel.getKm());
			stm.setString(6, automovel.getPlaca());
			stm.setString(7, automovel.getStatus());
	
						
			stm.executeUpdate();			
			stm.close();
			JOptionPane.showMessageDialog(null, "Cadastro realizado");	
		
		}	
		catch (Exception e){
			if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){  
				JOptionPane.showMessageDialog(null,"Autom�vel j� cadastrado");
			}else{ 
				JOptionPane.showMessageDialog(null,"N�o foi possivel cadastrar");
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
	public AutomovelTO carregar(Connection conn, String placa) {
		
		  AutomovelTO automovel = new AutomovelTO();
	      String sqlSelect = "SELECT * from automovel where placa= ? ;";
	      PreparedStatement stm = null;
	      ResultSet rs = null;
	      try
	      {
	         stm = conn.prepareStatement(sqlSelect);
	         stm.setString(1, placa);
	         rs = stm.executeQuery();
	       
	         if (rs.next())
	         {	
	        	
	        	
	        	automovel.setAgencia(rs.getString(1));
	        	automovel.setAno(rs.getString(2));
	        	automovel.setChassi(rs.getString(3));
	        	automovel.setEstado(rs.getString(4));
	        	automovel.setKm(rs.getDouble(5));
	        	automovel.setPlaca(rs.getString(6));
	        
	            
	         }else {
	            JOptionPane.showMessageDialog(null,"Autom�vel n�o existe!");
	            automovelInexistente = true;   
	         }
	         
	            
  }
  
  catch (Exception e)
  {
     e.printStackTrace();
     try
     {
        conn.rollback();
     }
     catch (SQLException e1)
     {
        System.out.print(e1.getStackTrace());
     }
  }
  finally
  {
     if (stm != null)
     {
        try
        {
           stm.close();
        }
        catch (SQLException e1)
        {
           System.out.print(e1.getStackTrace());
        }
     }
  }
	      	return automovel;
	}
	
	
	
	public void excluir(Connection conn,String placa) {
	      

        String sqlDelete = "DELETE FROM automovel WHERE placa = ?";
        PreparedStatement stm = null;
        try
        {
           stm = conn.prepareStatement(sqlDelete);
           stm.setString(1,placa);
           stm.execute();
           JOptionPane.showMessageDialog(null, "Exclus�o realizada");
        }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR");
           e.printStackTrace();
           try
           {
              conn.rollback();
           }
           catch (SQLException e1)
           {
              System.out.print(e1.getStackTrace());
              JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR");
           }
        }
        finally
        {
           if (stm != null)
           {
              try
              {
           	   
                 stm.close();
              }
              catch (SQLException e1)
              {
                 System.out.print(e1.getStackTrace());
              }
           }
        }
     
     

}

	
	public void alterar(Connection conn, AutomovelTO automovel) throws SQLException{
		  
	
		try
	      {
		  String sqlSelect = "UPDATE AUTOMOVEL SET  agencia=?, ano=?, chassi=?,estado=?,km=? where placa=?";
		  	


		  PreparedStatement  stm = conn.prepareStatement(sqlSelect);
		  	 
		     stm.setString(1, automovel.getAgencia());
	         stm.setString(2, automovel.getAno());
	         stm.setString(3, automovel.getChassi());
	         stm.setString(4, automovel.getEstado());
	         stm.setDouble(5, automovel.getKm());
	         stm.setString(6, automovel.getPlaca());	          
	
	  
	

	         if (stm.executeUpdate() > 0) { 
					JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
				} else { 
					
				} 
				
			}catch (Exception e){
				e.printStackTrace();
				try{
				conn.rollback();
				}
				catch (SQLException e1){
				System.out.print(e1.getStackTrace());
				}
			
			}	   
		}	

	
	
	
	public void incluir(Connection conn, String placa, String agencia, String ano, String chassi, String estado, double km, int modaut) throws SQLException {
		int s=1;
		try{				
			
			String sqlSelect ="insert INTO automovel  (placa,agencia,ano,chassi,estado,km, codmod, statusAut) values  (?,?,?,?,?,?,?,"
					+ "/);"; 
			PreparedStatement stm  = conn.prepareStatement(sqlSelect);
			

			
			stm.setString(1, placa);
			stm.setString(2, agencia);
			stm.setString(3, ano);			
			stm.setString(4, chassi);
			stm.setString(5, estado);
			stm.setDouble(6, km);
			stm.setInt(7, modaut); 
			stm.setInt(9, s);
			
			
						
			stm.executeUpdate();			
			stm.close();
			JOptionPane.showMessageDialog(null, "Cadastro realizado");			
		
		}	
		catch (Exception e){
			if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){  
				JOptionPane.showMessageDialog(null,"Autom�vel j� cadastrado");
			}else{ 
				JOptionPane.showMessageDialog(null,"N�o foi possivel cadastrar");
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

	
	
	
	
	
	
	public AutomovelTO aleatorio(Connection conn, int codmod) {
		
		  AutomovelTO automovel = new AutomovelTO();
	      String sqlSelect = "SELECT * from automovel where statusAut=1 and codmod=? limit 1;";
	      PreparedStatement stm = null;
	      ResultSet rs = null;
	      try
	      {
	         stm = conn.prepareStatement(sqlSelect);
	         stm.setInt(1, codmod);
	         rs = stm.executeQuery();
	         System.out.print(codmod);
	         if (rs.next())
	         {	
	        	
	        	
	        	automovel.setPlaca(rs.getString(1));
	        	System.out.print(automovel.getPlaca());
	        
	            
	         }
	         
	            
}

catch (Exception e)
{
   e.printStackTrace();
   try
   {
      conn.rollback();
   }
   catch (SQLException e1)
   {
      System.out.print(e1.getStackTrace());
   }
}
finally
{
   if (stm != null)
   {
      try
      {
         stm.close();
      }
      catch (SQLException e1)
      {
         System.out.print(e1.getStackTrace());
      }
   }
}
	      	return automovel;
	}
	
	
	
	
	
	
	
	
	
	
}
