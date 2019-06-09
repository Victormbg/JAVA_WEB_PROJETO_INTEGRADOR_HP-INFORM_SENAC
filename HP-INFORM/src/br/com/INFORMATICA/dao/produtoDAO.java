package br.com.INFORMATICA.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.INFORMATICA.Produto;

public class produtoDAO extends conexao {

	public List<Produto> listar() {
		List<Produto> lista = new ArrayList<Produto>();
		try {
			String sql = "select * from produtos "
					+ "order by nomeProduto";
			
			PreparedStatement ps = getConexao().
					prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			Produto p;
			while (rs.next()) {
				p = new Produto();
				p.setId(rs.getInt("id"));
				p.setNomeProduto(rs.getString("nomeProduto"));
				p.setDescricaoProduto(rs.getString("descricaoProduto"));
				p.setValorProduto(rs.getString("valorProduto"));
				lista.add(p);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public void incluir(Produto produto) {
		 try{
		String sql = "insert into produtos (nomeProduto,descricaoProduto,valorProduto) "
                 + "values (?,?,?)";
		 PreparedStatement ps = getConexao().prepareStatement(sql);
		 ps.setString(1, produto.getNomeProduto());
         ps.setString(2, produto.getDescricaoProduto());
         ps.setString(3, produto.getValorProduto());
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
            String sql = "delete from produtos where id = ?";
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
	public Produto buscar(long id) {
        Produto p = new Produto();
        
        try {
            String sql = "SELECT * FROM produtos al"
                         + " where al.id = ?";
            PreparedStatement ps = getConexao()
                    .prepareStatement(sql);
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
            	p.setId(rs.getInt("id"));
				p.setNomeProduto(rs.getString("nomeProduto"));
				p.setDescricaoProduto(rs.getString("descricaoProduto"));
				p.setValorProduto(rs.getString("valorProduto"));
			}
       
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
        
        return p;
    }
	 public void alterar(Produto p) {

	        try {
	            String sql = "update produtos set "
	                    + " nomeProduto = ?, "
	                    + " descricaoProduto = ? "
	                    + " valorProduto = ? "
	                    + " where id = ?";

	            PreparedStatement ps = getConexao()
	                    .prepareStatement(sql);
	            ps.setString(1, p.getNomeProduto());
	            ps.setString(2, p.getDescricaoProduto());
	            ps.setString(3, p.getValorProduto());
	            ps.setLong(4, p.getId());
	            ps.execute();
	            ps.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            fecharConexao();
	        }
	 }
}
