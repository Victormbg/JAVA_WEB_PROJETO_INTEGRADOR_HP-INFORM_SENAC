package br.com.INFORMATICA.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.INFORMATICA.Clientes;
import br.com.INFORMATICA.controller.ClienteController;
@WebServlet("/cadastroCliente")
public class cadastroCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processar(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processar(request, response);
	}
	private void processar(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		if(acao.equalsIgnoreCase("inicioInclusao")) {
			Clientes cliente = new Clientes();
			request.setAttribute("produto",cliente);
			request.setAttribute("acao", "incluir");
			
			RequestDispatcher rd = request
					.getRequestDispatcher("cadastro.jsp");
			rd.forward(request, response);
		}
		
		if(acao.equalsIgnoreCase("incluir")) {
			
			String nome = request.getParameter("nome");
		    String senha = request.getParameter("senha");
		    String email = request.getParameter("email");
		    String endereco = request.getParameter("endereco");
		    String cpf = request.getParameter("cpf");
		    String cep = request.getParameter("cep");
		    String rg = request.getParameter("rg");
		    String dataNascimento = request.getParameter("dataNascimento");
		    String telefone = request.getParameter("telefone");
		    String celular = request.getParameter("celular");
		    String sexo = request.getParameter("sexo");
			
			Clientes cliente = new Clientes();
			
			cliente.setNome(nome);
			cliente.setSenha(senha);
			cliente.setEmail(email);
			cliente.setEndereco(endereco);
			cliente.setCpf(cpf);
			cliente.setCep(cep);
			cliente.setRg(rg);
			cliente.setDataNascimento(dataNascimento);
			cliente.setTelefone(telefone);
			cliente.setCelular(celular);
			cliente.setSexo(sexo);
			
			
			ClienteController controller = new ClienteController();
			controller.incluirCliente(cliente);
		
			RequestDispatcher rd = request.getRequestDispatcher("cliente.html");
			rd.forward(request, response);
		}
		
		if (acao.equalsIgnoreCase("excluir")) {
			int id = Integer.parseInt(request.getParameter("idCadastro"));
			
			ClienteController controller = new ClienteController();
			controller.excluirCliente(id);
			
			RequestDispatcher rd = request.getRequestDispatcher("cliente.html");
			rd.forward(request, response);
		}
		
		if(acao.equalsIgnoreCase("alterar")) {
			
			int idCadastro = Integer.parseInt(request.getParameter("idCadastro"));
			String nome = request.getParameter("nome");
		    String senha = request.getParameter("senha");
		    String email = request.getParameter("email");
		    String endereco = request.getParameter("endereco");
		    String cpf = request.getParameter("cpf");
		    String cep = request.getParameter("cep");
		    String rg = request.getParameter("rg");
		    String dataNascimento = request.getParameter("dataNascimento");
		    String telefone = request.getParameter("telefone");
		    String celular = request.getParameter("celular");
		    String sexo = request.getParameter("sexo");
			
			Clientes cliente = new Clientes();
			
			cliente.setIdCadastro(idCadastro);
			cliente.setNome(nome);
			cliente.setSenha(senha);
			cliente.setEmail(email);
			cliente.setEndereco(endereco);
			cliente.setCpf(cpf);
			cliente.setCep(cep);
			cliente.setRg(rg);
			cliente.setDataNascimento(dataNascimento);
			cliente.setTelefone(telefone);
			cliente.setCelular(celular);
			cliente.setSexo(sexo);
						
			ClienteController controller = new ClienteController();
			controller.alterarCliente(cliente);
			
			RequestDispatcher rd = request.getRequestDispatcher("cliente.html");
			rd.forward(request, response);
		}

	}

}
