<html>
<head>
<meta charset="utf-8">
<title>H&P - INFORMATICA</title>
<link rel="shortcut icon" href="favicon.ico" />
<link rel="stylesheet" type="text/css" href="css/estilo2.css"/>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="jquery-3.3.1.js"></script>
</head>
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
<li><a href="computador.html">COMPUTADORES</a></li>
<li><a href="perifericos.html">PERIFERICOS</a></li>
<li><a href="contato.html">CONTATO</a></li>
<li><a href="cadastro.html">CADASTRO</a></li>
</ul>
</nav>

<div class="conteudo">

<div class="login">
<form id="login" action="" >
<div class="loginh1">
<h1>LOGIN</h1>
</div>
<label>Nome:</label>
<input type="text" name="nome" class="campo_nome">
<br>
<label>Senha:</label>
<input type="password" name="senha" class="campo_email">
<div class="loginbtn">
<input type="submit" value="Logar">
</div>
</form>
</div>

<div class="cadastro">

<form id="cadastro" name="formI" method="post" action="cadastroCliente">

<input type="hidden" name="acao" 
 value="${requestScope['acao'] }"/>
<input type="hidden" name="id"
 value="${requestScope ['cliente'].getIdCadastro() }"/>

<div class="cadastro1">
<h1>CADASTRO</h1>
</div>

<label>E-mail:</label>
<input type="email" name="email" value="${requestScope['cliente'].getNome()}">
<br>
<label>Crie sua senha</label>
<input type="password" name="${requestScope['cliente'].getSenha()}" >
</br>
<label>CPF ou CNPJ(Apenas Numeros)</label>
<input type="text" name="cpf" value="${requestScope['cliente'].getCpf()}">
</br>
<label>CEP</label>
<input type="text" name="cep" value="${requestScope['cliente'].getCep()}">
</br>
<label>Endereco</label>
<input type="text" name="endereco" value="${requestScope['cliente'].getEndereco()}">
</br>
<label>RG</label>
<input type="text" name="rg" value="${requestScope['cliente'].getRg()}">
</br>
<label>Data de nascimento</label>
<input type="text" name="dataNascimento" value="${requestScope['cliente'].getDataNascimento()}">
</br>
<label>Sexo</label>
<input type="text" name="sexo" value="${requestScope['cliente'].getSexo()}">
</br>
<label>Telefone</label>
<input type="text" name="telefone" value="${requestScope['cliente'].getTelefone()}">
</br>
<label>Celular</label>
<input type="text" name="celular" value="${requestScope['cliente'].getCelular()}">
</br>
<div class="cadBtn">
<input type="Submit" value="Cadastrar"/>
</div>
</form>
</div>
</div>



<footer>
<div class="rod-esq">
<ul>
<li>Endereço: Rua Carlos Gomes, 1321 </li>
<li>9º Andar - Centro - Limeira (SP) </li>
<li>CEP: 13480-010</li>
<li>Central SAC: (19) 2114-4444</li>
<li>E-mail: atendimento@HePInformatica.com.br </li>
<li>Recepção de Fax: (19) 2114-4412 </li>
</ul>
</div>
<div class="rod-dir">
<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3675.2892885190968!2d-43.205232485034415!3d-22.902698285013845!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x997f10b14fa77f%3A0x8bc5601c700db8d1!2sR.+Carlos+Gomes+-+Santo+Cristo%2C+Rio+de+Janeiro+-+RJ!5e0!3m2!1spt-BR!2sbr!4v1529105510325" width="300" height="250" frameborder="0" style="border:0" allowfullscreen></iframe>
</div>
</footer>

</body>
</html>

