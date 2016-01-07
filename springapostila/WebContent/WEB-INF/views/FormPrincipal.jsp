<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringApostila</title>
<title>Página principal - Liberar acesso</title>

<!-- <link rel="stylesheet" type="text/css"  href="estilo.css" /> -->


<style>
body {
	font-family: arial, helvetica, sans-serif;
	font-size: 12px;
}

titulo {
	display: block;
	background-color: #ddd;
	padding: 10px;
	font-size: 30px;
}

* {
	margin: 0;
	padding: 0;
}

body {
	font-family: arial, helvetica, sans-serif;
	font-size: 12px;
}

.menu {
	list-style: none;
	border: 1px solid #c0c0c0;
	float: left;
}

.menu li {
	position: relative;
	float: left;
	border-right: 1px solid #c0c0c0;
}

.menu li a {
	color: #333;
	text-decoration: none;
	padding: 5px 10px;
	display: block;
}

.menu li a:hover {
	background: #333;
	color: #fff;
	-moz-box-shadow: 0 3px 10px 0 #CCC;
	-webkit-box-shadow: 0 3px 10px 0 #ccc;
	text-shadow: 0px 0px 5px #fff;
}

.menu li  ul {
	position: absolute;
	top: 25px;
	left: 0;
	background-color: #fff;
	display: none;
}

.menu li:hover ul, .menu li.over ul {
	display: block;
}

.menu li ul li {
	border: 1px solid #c0c0c0;
	display: block;
	width: 150px;
}

.extend {
	width: 800px;
}

corpo {
	height: 800px;
	width: 100%;
}

iframe {
	height: 800px;
	width: 100%;
}
</style>
</head>
<body>

	<titulo>
	<h2>Brincando com Spring - menu</h2>


	</titulo>


	<nav>

	<ul class="menu">
		<li><a href="#">Administração</a>

			<ul>
				<li><a href="${pageContext.request.contextPath}/produto" target="quadro">Manter Produtos</a></li>
				<li><a href="${pageContext.request.contextPath}/listarProduto" target="quadro">Cadstro de Grupos</a></li>
				<li><a href="#">Cadastro de acessos</a></li>
				<li><a href="#">Trocar senha</a></li>

			</ul></li>


		<li><a href="#">Sobre</a></li>


		<li><a href="#">O que fazemos?</a>
			<ul>
				<li><a href="#">Web Design</a></li>
				<li><a href="#">SEO</a></li>
				<li><a href="#">Design</a></li>
			</ul></li>
		<li><a href="#">Sobre</a></li>
		<li><a href="${pageContext.request.contextPath}/sair">Sair</a></li>
		<li class="extend"></li>
	</ul>


	</nav>

	<div class="corpo">
		<iframe name="quadro"> </iframe>



	</div>



</body>
</html>