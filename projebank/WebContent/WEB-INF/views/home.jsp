<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>



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
	<h2>Projeto Banco</h2>


	</titulo>
	
	
	<nav>

	<ul class="menu">
		<li><a href="#">Administração</a>

			<ul>
				<li><a href="inicio/novo" target="quadro">cliente</a></li>
				<li><a href="conta/ListarClietes" target="quadro">contas</a></li>
				
				

			</ul></li>



		<li><a href="sair">Sair</a></li>
		<li class="extend"></li>
	</ul>


	</nav>
	
	
  
		<iframe name="quadro"> </iframe>




   
   
</body>
</html>