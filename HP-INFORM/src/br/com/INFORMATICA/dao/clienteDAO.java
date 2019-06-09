package br.com.INFORMATICA.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;


import br.com.INFORMATICA.Clientes;

public class clienteDAO extends conexao {
	
	public void incluir(Clientes cliente) {
		 try{
		String sql = "insert into clientes (nome,senha,email,endereco,cpf,cep,rg,dataNascimento,sexo,telefone,celular) "
                 + "values (?,?,?,?,?,?,?,?,?,?,?)";
		 PreparedStatement ps = getConexao().prepareStatement(sql);
		 
		 ps.setString(1, cliente.getNome());
         ps.setString(2, cliente.getSenha());
         ps.setString(3, cliente.getEmail());
         ps.setString(4, cliente.getEndereco());
         ps.setString(5, cliente.getCpf());
         ps.setString(6, cliente.getCep());
         ps.setString(7, cliente.getRg());
         ps.setString(8, cliente.getDataNascimento());
         ps.setString(9, cliente.getSexo());
         ps.setString(10, cliente.getTelefone());
         ps.setString(11, cliente.getCelular());
         
         ps.execute();
         ps.close();
	}catch(SQLException ex) {
        ex.printStackTrace();
    } finally {
        fecharConexao();
    }
	}
	
	
	
	
	
	public void excluir(long id) {
        try{
            String sql = "delete from cliente where idCadastro = ?";
            PreparedStatement ps = getConexao().prepareStatement(sql);
            ps.setLong(1, id);
            ps.execute();
            ps.close(); 
           }catch(SQLException e){
                e.printStackTrace();
          }finally{
                fecharConexao();
          }
	}

	
	
	
	 public void alterar(Clientes c) {

	        try {
	            String sql = "update cliente set "
	                    + " nome = ?, "
	                    + " senha = ? "
	                    + " email = ? "
	                    + " endereco = ? "
	                    + " cpf = ? "
	                    + " cep = ? "
	                    + " rg = ? "
	                    + " dataNascimento = ? "
	                    + " sexo = ? "
	                    + " telefone = ? "
	                    + " celular = ? "
	                    + " where idCadastro = ?";

	            PreparedStatement ps = getConexao().prepareStatement(sql);
	            
	            ps.setLong(1, c.getIdCadastro());
	            ps.setString(2, c.getNome());
	            ps.setString(3, c.getSenha());
	            ps.setString(4, c.getEmail());
	            ps.setString(5, c.getEndereco());
	            ps.setString(6, c.getCpf());
	            ps.setString(7, c.getCep());
	            ps.setString(8, c.getRg());
	            ps.setString(9, c.getDataNascimento());
	            ps.setString(10, c.getSexo());
	            ps.setString(11, c.getTelefone());
	            ps.setString(12, c.getCelular());
	            
	            
	            ps.execute();
	            ps.close();
	        
	        
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            fecharConexao();
	        }
	 }
}
