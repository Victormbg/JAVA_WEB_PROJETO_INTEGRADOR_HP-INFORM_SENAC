package br.com.INFORMATICA.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.INFORMATICA.Produto;
import br.com.INFORMATICA.controller.ProdutoController;
@WebServlet("/cadastroProduto")
public class cadastroProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public cadastroProduto() {
        super();
        // TODO Auto-generated constructor stub
    }

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
			Produto produto = new Produto();
			request.setAttribute("produto",produto);
			request.setAttribute("acao", "incluir");
			
			RequestDispatcher rd = request
					.getRequestDispatcher("CadastrarProduto.jsp");
			rd.forward(request, response);
		}
		
		if(acao.equalsIgnoreCase("incluir")) {
			
			String nomeProduto = request.getParameter("txtNomeProduto");
			String descricaoProduto = request.getParameter("txtDescricaoProduto");
			String valorProduto = request.getParameter("txtValorProduto");

			
			Produto produto = new Produto();
			produto.setNomeProduto(nomeProduto);
			produto.setDescricaoProduto(descricaoProduto);
			produto.setValorProduto(valorProduto);
			
			
			ProdutoController controller = new ProdutoController();
			controller.incluirProduto(produto);
		
			RequestDispatcher rd = request.getRequestDispatcher("administrador.jsp");
			rd.forward(request, response);
		}
		
		if (acao.equalsIgnoreCase("excluir")) {
			int id = Integer.parseInt(request.getParameter("id"));
			
			ProdutoController controller = new ProdutoController();
			controller.excluirProduto(id);
			
			RequestDispatcher rd = request.getRequestDispatcher("administrador.jsp");
			rd.forward(request, response);
		}
		if(acao.equalsIgnoreCase("buscar")) {
			int id = Integer.parseInt(request.getParameter("id"));
			
			ProdutoController controller = new ProdutoController();
			Produto produto = controller.buscarProduto(id);
			
			request.setAttribute("produto",produto);
			request.setAttribute("acao", "alterar");
			
			RequestDispatcher rd = request
					.getRequestDispatcher("CadastrarProduto.jsp");
			rd.forward(request, response);
			
		}
		if(acao.equalsIgnoreCase("alterar")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String nomeProduto = request.getParameter("txtNomeProduto");
			String valorProduto = request.getParameter("txtValorProduto");
			String descricaoProduto = request.getParameter("txtDescricaoProduto");
			
			Produto produto = new Produto();
			produto.setId(id);

			produto.setNomeProduto(nomeProduto);
			produto.setDescricaoProduto(descricaoProduto);
			produto.setValorProduto(valorProduto);
			
			ProdutoController controller = new ProdutoController();
			controller.alterarProduto(produto);
			
			RequestDispatcher rd = request.getRequestDispatcher("administrador.jsp");
			rd.forward(request, response);
		}

	}

}
