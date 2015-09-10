package com.locadora.Locadora2015.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;

import com.locadora.Locadora2015.model.Usuario;

public class UsuarioDAO {

	public boolean usuarioInexistente = false;
	


		public UsuarioDAO() {
		}

		public void alterar(Connection conn, int idUsuario, String nomeUsuario, String senha, char permissao) throws SQLException{
			  
		
			try
		      {
			  String sqlSelect = "UPDATE USUARIO SET  Nome=?, Senha=?, Permissao=? WHERE idUsuário=?";	   
			  	
		      
		      	//
		      	// Inclusao dos dados na tabela Usuario
		      	//
			 
			  PreparedStatement  stm = conn.prepareStatement(sqlSelect);
			  	 
			     stm.setString(1, nomeUsuario);
		         stm.setString(2, senha);
		         stm.setString(3, Character.toString(permissao));
		         stm.setInt(4, idUsuario);
		         
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



	public Usuario carregar(Connection conn, int idUsuario) {
			
		  Usuario usuario = new Usuario();
	      String sqlSelect = "SELECT * from Usuario where idUsuário= ? ;";
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
			String sqlDelete = "DELETE FROM usuario WHERE idUsuário = ?";
	         PreparedStatement stm = null;
			try{         
	            stm = conn.prepareStatement(sqlDelete);
	            stm.setInt(1, idUsuario);
	            stm.execute();
	            JOptionPane.showMessageDialog(null, "Exclusão realizada");
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
	
	
	
	
	
	public void incluir(Connection conn, int idUsuario, String nomeUsuario, String senha, char permissao) throws SQLException {
		
		try{				
			
			String sqlSelect ="insert INTO usuario  (idUsuario, Nome, Senha, Permissao) values  (?,?,?,?);"; 
			PreparedStatement stm  = conn.prepareStatement(sqlSelect);
			

			
			stm.setInt(1, idUsuario);
			stm.setString(2, nomeUsuario);
			stm.setString(3, senha);			
			stm.setString(4, Character.toString(permissao));
						
			stm.executeUpdate();			
			stm.close();
			JOptionPane.showMessageDialog(null, "Cadastro realizado");			
		
		}	
		catch (Exception e){
			if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){  
				JOptionPane.showMessageDialog(null,"Cliente já cadastrado");
			}else{ 
				JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar o cliente");
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
