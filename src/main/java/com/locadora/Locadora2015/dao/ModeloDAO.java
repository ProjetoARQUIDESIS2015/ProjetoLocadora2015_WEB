package com.locadora.Locadora2015.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.locadora.Locadora2015.to.ModeloTO;

public class ModeloDAO {

	
	public boolean modeloInexistente = false;
	
	
	public void alterar(Connection conn, ModeloTO modelo) throws SQLException{
		  

	
		try
	      {
		  String sqlSelect = "UPDATE MODELO SET  descricao=?, fabricante=?, grupo=?,modelo=?,tarifaControlado=?, tarifaLivre=? where codigo=?";
    	
		  PreparedStatement  stm = conn.prepareStatement(sqlSelect);
		  	 
		     stm.setString(1, modelo.getDescricao());
	         stm.setString(2, modelo.getFabricante());
	         stm.setString(3, modelo.getGrupo());
	         stm.setString(4, modelo.getModelo());
	   
	     

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

	
	
	
	public void incluir(Connection conn, ModeloTO modelo) throws SQLException {
	
		try{				
			
			String sqlSelect ="INSERT INTO modelo (codigo,descricao,fabricante,grupo,modelo,tarifaControlado,tarifaLivre) values (?,?,?, ?, ?, ?,?);";
			
			PreparedStatement stm  = conn.prepareStatement(sqlSelect);
		
			stm.setInt(1, modelo.getCodigo());
			stm.setString(2, modelo.getDescricao());
			stm.setString(3, modelo.getFabricante());			
			stm.setString(4, modelo.getGrupo());
			stm.setString(5, modelo.getModelo());
			stm.setDouble(6, modelo.getTarifaKmControlado());
			stm.setDouble(7, modelo.getTarifaKmLivre());
	
						
			stm.executeUpdate();			
			stm.close();
			JOptionPane.showMessageDialog(null, "Cadastro realizado");	
		
		}	
		catch (Exception e){
			if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){  
				JOptionPane.showMessageDialog(null,"Modelo j� cadastrado");
			}else{ 
				JOptionPane.showMessageDialog(null,"N�o foi possivel cadastrar o cliente");
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
	
	public ModeloTO carregar(Connection conn, int codigo) {
		
		  ModeloTO modelo = new ModeloTO();
	      String sqlSelect = "SELECT * from modelo where codigo= ? ;";
	      
	      PreparedStatement stm = null;
	      ResultSet rs = null;
	      try
	      {
	         stm = conn.prepareStatement(sqlSelect);
	         stm.setInt(1, codigo);
	         rs = stm.executeQuery();
	       
	         if (rs.next())
	         {	
	        	
	        	modelo.setCodigo(rs.getInt(1));
	        	modelo.setDescricao(rs.getString(2));
	        	modelo.setFabricante(rs.getString(3));
	        	modelo.setGrupo(rs.getString(4));
	        	modelo.setModelo(rs.getString(5));
	        	modelo.setTarifaKmControlado(rs.getDouble(6));
	        	modelo.setTarifaKmLivre(rs.getDouble(7));
	     
	            
	         }else {
	            //JOptionPane.showMessageDialog(null,"Modelo n�o existe!");
	            modeloInexistente = true;   
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
	      
	      	return modelo;
	}

	public void excluir(Connection conn,int codigo) {
	      

	         String sqlDelete = "DELETE FROM modelo WHERE codigo = ?";
	         PreparedStatement stm = null;
	         try
	         {
	            stm = conn.prepareStatement(sqlDelete);
	            stm.setInt(1,codigo);
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
	
	
	
	public void alterar(Connection conn, int codigo, String descricao, String fabricante, String grupo, String modelo, double tarifaKmLivre, double tarifaKmControlado) throws SQLException{

		
		try
	      {
		  String sqlSelect = "UPDATE MODELO SET  descricao=?, fabricante=?, grupo=?,modelo=?,tarifaControlado=?, tarifaLivre=? where codigo=?";
		  	


		  PreparedStatement  stm = conn.prepareStatement(sqlSelect);
		  	 
		     stm.setString(1, descricao);
	         stm.setString(2, fabricante);
	         stm.setString(3, grupo);
	         stm.setString(4, modelo);
	         stm.setDouble(5, tarifaKmControlado);
	         stm.setDouble(6, tarifaKmLivre);	          
	         stm.setInt(7, codigo);
	  
	

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

	
	public ArrayList<String> carregarPorNome(Connection conn) {
		
		  ArrayList<String> list = new ArrayList<String>();
	      String sqlSelect = "SELECT modelo, codigo from modelo ;";
	      PreparedStatement stm = null;
	      ResultSet rs = null;
	      try
	      {
	         stm = conn.prepareStatement(sqlSelect);
	        
	         rs = stm.executeQuery();
	       
	         while (rs.next())
	         {	
	        	
	        	/*mod= new Modelo();
	        	mod.setCodigo(rs.getInt(1));
	        	mod.setDescricao(rs.getString(2));
	        	mod.setFabricante(rs.getString(3));
	        	mod.setGrupo(rs.getString(4));
	        	mod.setModelo(rs.getString(5));
	        	mod.setTarifaKmControlado(rs.getDouble(6));
	        	mod.setTarifaKmLivre(rs.getDouble(7));
	     */
	            list.add(rs.getString(1));	
	         
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
	      	return list;
	}
	
	public ArrayList<String> carregarPorCategoria(Connection conn, String cat) 
	{
		System.out.println("DAO" + cat);
		ArrayList<String> list = new ArrayList<String>();
	    String sqlSelect = "SELECT modelo from modelo where grupo = ? ;";
	    PreparedStatement stm = null;
	      
	    ResultSet rs = null;
	    try
	    {
	    	stm = conn.prepareStatement(sqlSelect);
	        stm.setString(1, cat);
	        rs = stm.executeQuery();
	        
	        while (rs.next())
	         {	
	        	
	        	/*mod= new Modelo();
	        	mod.setCodigo(rs.getInt(1));
	        	mod.setDescricao(rs.getString(2));
	        	mod.setFabricante(rs.getString(3));
	        	mod.setGrupo(rs.getString(4));
	        	mod.setModelo(rs.getString(5));
	        	mod.setTarifaKmControlado(rs.getDouble(6));
	        	mod.setTarifaKmLivre(rs.getDouble(7));
	     */
	            list.add(rs.getString(1));	
	            
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
}			//	System.out.println("a lista � " + list);
	      	return list;
	}
	
	
	public int carregarCod(Connection conn, String modelo) {
		int cod=0;
		  ModeloTO m = new ModeloTO();
	      String sqlSelect = "SELECT codigo from modelo where modelo= ? ;";
	      PreparedStatement stm = null;
	      ResultSet rs = null;
	      try
	      {
	         stm = conn.prepareStatement(sqlSelect);
	         stm.setString(1, modelo);
	         rs = stm.executeQuery();
	       
	         if (rs.next())
	         {		        
	        	m.setCodigo(rs.getInt(1)); 	
   	         }
	         
	         cod = rs.getInt(1);
		         
	            
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
		return cod;
	      	
	}

	
	
	
	public int disponibilidade(Connection conn, int t) {
		
		
		 System.out.println("auto dao" + t);
		 
	      String sqlSelect = "SELECT count(*) from automovel where statusAut=1 and codmod=?;";
	      PreparedStatement stm = null;
	      ResultSet rs = null;
	      int cod=0;
	      try
	      {
	         stm = conn.prepareStatement(sqlSelect);
	         stm.setInt(1, t);
	         rs = stm.executeQuery();
	      
	         
	       
	         while (rs.next())
	         {		        
	        	  cod = rs.getInt(1);
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
  }   System.out.println("Resultado" + cod);
		return cod;
	      	
	}
	
	

	
	
}
