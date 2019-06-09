package br.com.INFORMATICA.controller;

import br.com.INFORMATICA.Clientes;
import br.com.INFORMATICA.dao.clienteDAO;

public class ClienteController {
	
	public void incluirCliente(Clientes clientes) {
		clienteDAO dao = new clienteDAO();
		dao.incluir(clientes);
	}
	
	public void excluirCliente(long id) {
	    clienteDAO dao = new clienteDAO();
	    dao.excluir(id);
	    }
	
	public void alterarCliente(Clientes c) {
	    clienteDAO dao = new clienteDAO();
	    dao.alterar(c);
	    }
}

