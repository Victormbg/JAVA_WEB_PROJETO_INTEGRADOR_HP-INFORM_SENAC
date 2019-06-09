package br.com.INFORMATICA.controller;

import java.util.List;

import br.com.INFORMATICA.Produto;
import br.com.INFORMATICA.dao.produtoDAO;

public class ProdutoController {
	public List<Produto> listarProduto(){
		produtoDAO dao = new produtoDAO();
		return dao.listar();
	}
	
	public void incluirProduto(Produto produto) {
		produtoDAO dao = new produtoDAO();
		dao.incluir(produto);
	}
	
	public void excluirProduto(long id) {
	    produtoDAO dao = new produtoDAO();
	    dao.excluir(id);
	    }
	
	public Produto buscarProduto(long id) {
		produtoDAO dao = new produtoDAO();
		return dao.buscar(id);
	}
	
	public void alterarProduto(Produto p) {
	    produtoDAO dao = new produtoDAO();
	    dao.alterar(p);
	    }
}

