<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>H&P - INFORMATICA</title>
<link rel="shortcut icon" href="favicon.ico" />
<link rel="stylesheet" type="text/css" href="css/estiloPadrao.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="jquery-3.3.1.js"></script>
</head>
<style>
table{
	float:left;
	margin-left:500px;
	width:800px;
	height:200px;
	background-color:200px;
	color:white;
}
td{
	text-align:center;
}
 table a{
 	text-decoration-line: none;
 	color:limegreen;
 	font-size:20px;
 }
 
  .incluir-btn{
 	width:800px;
 	margin-left:500px;
	
 }


</style>
<body>


<div class="banner">
<div class="banner-esq">
<img src="img/test-logo3.png">
</div>
<div class="banner-dir">
<img src="img/H&P-Informatica2.png">
</div>
</div>

<nav class="menu">
<ul>
<li><a href="index.html">HOME</a></li>
<li><a href="index.html">COMPUTADORES</a></li>
<li><a href="index.html">PERIFERICOS</a></li>
<li><a href="index.html">CONTATO</a></li>
<li><a href="index.html">CADASTRO</a></li>
</ul>
</nav>

<div class="conteudo">

<h1>Produtos</h1>

	<jsp:useBean id="cont2" 
				class="br.com.INFORMATICA.controller.ProdutoController">
<table border="3">	
		<tr> 
			<td>Nome</td>
			<td>Descri��o</td>
			<td>Pre�o</td>
			<td>A��es</td>
		</tr>	
<c:forEach items="${cont2.listarProduto()}"
			   var="_pro">
	   <tr>
			<td> ${_pro.nomeProduto } </td>
			<td> ${_pro.descricaoProduto }</td>
			<td> ${_pro.valorProduto }</td>
			<td><a href="cadastroProduto?id=${_pro.id}&acao=buscar">Alterar</a> /
		    <a href="cadastroProduto?id=${_pro.id }&acao=excluir">Excluir</a>
		    </td>
		</tr>
</c:forEach>			
</table>
			
</jsp:useBean>
	<div class="incluir-btn">
		<a href="cadastroProduto?acao=inicioInclusao">Incluir Produto</a>	
	</div>
	
</div>

<footer>
<div class="rod-esq">
<ul>
<li>Endere�o: Rua Carlos Gomes, 1321 </li>
<li>9� Andar - Centro - Limeira (SP) </li>
<li>CEP: 13480-010</li>
<li>Central SAC: (19) 2114-4444</li>
<li>E-mail: atendimento@HePInformatica.com.br </li>
<li>Recep��o de Fax: (19) 2114-4412 </li>
</ul>
</div>
<div class="rod-dir">
<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3675.2892885190968!2d-43.205232485034415!3d-22.902698285013845!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x997f10b14fa77f%3A0x8bc5601c700db8d1!2sR.+Carlos+Gomes+-+Santo+Cristo%2C+Rio+de+Janeiro+-+RJ!5e0!3m2!1spt-BR!2sbr!4v1529105510325" width="300" height="250" frameborder="0" style="border:0" allowfullscreen></iframe>
</div>
</footer>
</body>
</html>


