package com.locadora.Locadora2015.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;

import com.locadora.Locadora2015.to.ClienteTO;

public class ClienteDAO {

	public boolean clienteInexistente = false;
	


		public ClienteDAO() {
		}

		public void alterar(Connection conn, ClienteTO cliente) throws SQLException{
			  
		
			try
		      {
			  String sqlSelect = "UPDATE CLIENTE SET  Bairro=?,CEP=?, Cidade=?, CNH=?, Complemento=?,CPF=?, DataNasc=?,Email=?,Logradouro=?, Nome=?, Numero=?,PrimeiraCnh=?,RG=?, Sexo=?,Telefone=?,Celular=?, UF=?, UfCnh=?, ValidadeCnh=? WHERE cpf=?";	   
			  	
		      
		      	//
		      	// Inclusao dos dados na tabela CLIENTE
		      	//
    
			  PreparedStatement  stm = conn.prepareStatement(sqlSelect);
			  	 
			     stm.setString(1, cliente.getBairro());
		         stm.setString(2, cliente.getCep());
		         stm.setString(3, cliente.getCidade());
		         stm.setString(4, cliente.getCnh());
		         stm.setString(5, cliente.getComplemento());	          
		         stm.setString(6, cliente.getCpf());
		         stm.setString(7, cliente.getDataNascimento());
		         stm.setString(8, cliente.getEmail());
		         stm.setString(9, cliente.getLogradouro());
		         stm.setString(10, cliente.getNome());
		         stm.setString(11, cliente.getNum());
		         stm.setString(12, cliente.getPrimeiraCNH());
		         stm.setString(13, cliente.getRg());
		         stm.setString(14, cliente.getSexo());
		         stm.setString(15, cliente.getTelefone());
		         stm.setString(16, cliente.getCelular());
		         stm.setString(17, cliente.getUf());
		         stm.setString(18, cliente.getUfCNH());
		         stm.setString(19, cliente.getValidadeCNH());
		         stm.setString(20, cliente.getCpf());

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



	public ClienteTO carregar(Connection conn, String cpf) {
			
		ClienteTO cliente = new ClienteTO();
	      String sqlSelect = "SELECT * from Cliente where CPF= ? ;";
	      PreparedStatement stm = null;
	      ResultSet rs = null;
	      try
	      {
	         stm = conn.prepareStatement(sqlSelect);
	         stm.setString(1, cpf);
	         rs = stm.executeQuery();
	       
	         if (rs.next())
	         {	
	        	 
	        	 
	        	 

	        	 
	     		cliente.setBairro(rs.getString(1));
	     		cliente.setCep(rs.getString(2));
	     		cliente.setCidade(rs.getString(3));
	     		cliente.setCnh(rs.getString(4));
	     		cliente.setComplemento(rs.getString(5));
	     		cliente.setCpf(rs.getString(6));
	     		cliente.setDataNascimento(rs.getString(7));
	     		cliente.setEmail(rs.getString(8));
	     		cliente.setLogradouro(rs.getString(9));
	     		cliente.setNome(rs.getString(10));
	     		cliente.setNum(rs.getString(11));
	     		cliente.setPrimeiraCNH(rs.getString(12));
	     		cliente.setRg(rs.getString(13));
	     		cliente.setSexo(rs.getString(14));
	     		cliente.setTelefone(rs.getString(15));
	     		cliente.setCelular(rs.getString(16));
	     		cliente.setUf(rs.getString(17));
	     		cliente.setUfCNH(rs.getString(18));
	     		cliente.setValidadeCNH(rs.getString(19));
	            
	         }else {
	            JOptionPane.showMessageDialog(null,"Cliente não existe!");
	            clienteInexistente = true;   
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
	      	return cliente;
	}

	
	
	
	
	public void excluir(Connection conn,String cpf) {
			String sqlDelete = "DELETE FROM cliente WHERE CPF = ?";
	         PreparedStatement stm = null;
			try{         
	            stm = conn.prepareStatement(sqlDelete);
	            stm.setString(1,cpf);
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
	
	
	
	
	
	public void incluir(Connection conn, ClienteTO cliente) throws SQLException {
		
		try{				
			
			String sqlSelect ="insert INTO cliente  (CPF,Bairro,CEP, Cidade, CNH, Complemento, DataNasc, Email,Logradouro, Nome, Numero,PrimeiraCnh,RG, Sexo, Telefone,Celular,UF, UfCnh, ValidadeCnh) values  (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);"; 
			PreparedStatement stm  = conn.prepareStatement(sqlSelect);
			

			
			stm.setString(1, cliente.getCpf());
			stm.setString(2, cliente.getBairro());
			stm.setString(3, cliente.getCep());			
			stm.setString(4, cliente.getCidade());
			stm.setString(5, cliente.getCnh());
			stm.setString(6, cliente.getComplemento());
			stm.setString(7, cliente.getDataNascimento());
			stm.setString(8, cliente.getEmail());
			stm.setString(9, cliente.getLogradouro());
			stm.setString(10, cliente.getNome());
			stm.setString(11, cliente.getNum());		
			stm.setString(12, cliente.getPrimeiraCNH());
			stm.setString(13, cliente.getRg());
			stm.setString(14, cliente.getSexo());
			stm.setString(15, cliente.getTelefone());
			stm.setString(16, cliente.getCelular());		
			stm.setString(17, cliente.getUf());
			stm.setString(18, cliente.getUfCNH());
			stm.setString(19, cliente.getValidadeCNH());		
						
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
