<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Novo produto</title>
</head>
<body>
	<fieldset>
		<legend>Produto a ser cadastrado</legend>


		<c:if test="${not empty mensagem}">
		 <h3 style='color:blue'>${mensagem}</h3>
		</c:if>




		<form action="salvarProduto" method="POST">
			<label>Nome do produto<br /> <input type="text" size="50"
				name="nome" />
			</label><br /> <br /> <label>quatidade:<BR> <input type="text"
				size="30" name="quatidade" maxlength="30">
			</label><BR> <BR> <input type="submit" value="Cadastrar produto">



		</form>

		<form action="listarProduto" method="get">
			<input type="submit" value="Listar Produtos" class="butao"/>
		</form>


	</fieldset>

</body>
</html>