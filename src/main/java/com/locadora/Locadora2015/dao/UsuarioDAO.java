package com.locadora.Locadora2015.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;

import com.locadora.Locadora2015.to.UsuarioTO;

public class UsuarioDAO {

	public boolean usuarioInexistente = false;
	


		public UsuarioDAO() {
		}

		public void alterar(Connection conn, UsuarioTO usuario) throws SQLException{
			  
		
			try
		      {
			  String sqlSelect = "UPDATE USUARIO SET  Nome=?, Senha=?, Permissao=? WHERE idUsu�rio=?";	   
			  	
		      
		      	//
		      	// Inclusao dos dados na tabela Usuario
		      	//
			 
			  PreparedStatement  stm = conn.prepareStatement(sqlSelect);
			  	 
			     stm.setString(1, usuario.getNomeUsuario());
		         stm.setString(2, usuario.getSenha());
		         stm.setLong(3, usuario.getPermissao());
		         stm.setInt(4, usuario.getIdUsuario());
		         
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



	public UsuarioTO carregar(Connection conn, int idUsuario) {
			
		  UsuarioTO usuario = new UsuarioTO();
	      String sqlSelect = "SELECT * from Usuario where idUsu�rio= ? ;";
	      PreparedStatement stm = null;
	      ResultSet rs = null;
	      try
	      {
	         stm = conn.prepareStatement(sqlSelect);
	         stm.setInt(1, idUsuario);
	         rs = stm.executeQuery();
	       
	         if (rs.next())
	         {	
	        	usuario.setNomeUsuario(rs.getString(1));
	     		usuario.setSenha(rs.getString(2));
	     		usuario.setPermissao(rs.getString(3).charAt(0));
	     		
	         }else {
	            usuarioInexistente = true;   
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
	      	return usuario;
	}

	
	
	
	
	public void excluir(Connection conn,int idUsuario) {
			String sqlDelete = "DELETE FROM usuario WHERE idUsu�rio = ?";
	         PreparedStatement stm = null;
			try{         
	            stm = conn.prepareStatement(sqlDelete);
	            stm.setInt(1, idUsuario);
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
	
	
	
	
	
	public void incluir(Connection conn, UsuarioTO usuario) throws SQLException {
		
		try{				
			
			String sqlSelect ="insert INTO usuario  (idUsuario, Nome, Senha, Permissao) values  (?,?,?,?);"; 
			PreparedStatement stm  = conn.prepareStatement(sqlSelect);
			

			
			stm.setInt(1, usuario.getIdUsuario());
			stm.setString(2, usuario.getNomeUsuario());
			stm.setString(3, usuario.getSenha());			
			stm.setLong(4, usuario.getPermissao());
						
			stm.executeUpdate();			
			stm.close();
			JOptionPane.showMessageDialog(null, "Cadastro realizado");			
		
		}	
		catch (Exception e){
			if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){  
				JOptionPane.showMessageDialog(null,"Cliente j� cadastrado");
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
	
}
