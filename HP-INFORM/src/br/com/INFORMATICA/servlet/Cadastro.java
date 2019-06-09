package br.com.INFORMATICA.servlet;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;


import br.com.INFORMATICA.dao.conexao;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		
		
		
		
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
	    
	    conexao db = new conexao();
	    Connection con = (Connection) db.getConexao();
	    try {
	    java.sql.Statement stmt =  con.createStatement();
	    stmt.executeUpdate("insert into cliente (nome,senha,email,endereco,cpf,cep,rg,dataNascimento,sexo,telefone,celular)values('"+nome+"','"+senha+"','"+email+"','"+endereco+"','"+cpf+"','"+cep+"','"+rg+"','"+dataNascimento+"','"+sexo+"','"+telefone+"','"+celular+"')");
	    System.out.println("data inserted sucessfully");
	    } catch (SQLException ex) {
	   
	    ex.printStackTrace();
	    }
		
		
		
		
		
		
		
		
		
		
		
	}

}
