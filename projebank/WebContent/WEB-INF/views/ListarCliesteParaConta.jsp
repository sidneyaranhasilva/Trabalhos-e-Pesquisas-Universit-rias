<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro Cliente</title>
</head>
<body>

	<h1>Clieste para Cadastro de Nova Conta</h1>
	<br />
	<form method="Get" action="${pageContext.request.contextPath}/conta/clienteNome/" />

      

		<p>
			Pesquisar Clientes: <input type="text" size="15" name="nome"
				value="">
				<br />
				(Digite o nome do Cliente)
		</p>

		

		<p>
			<input type="submit" value="Buscar">
	
			
		</p>





	</form>



	<fieldset>
		<legend>Clientes Para Criar Conta</legend>
		<c:if test="${not empty clientes}">
			<table width="" cellpadding="" cellspacing="" border="">
				<tr style="background-color: teal; color: white;">

					<th>nome</th>

					<th>Email</th>

					<th>Telefone</th>

					<th>Ações</th>
				</tr>

				<c:forEach items="${clientes}" var="cliente">


					<tr>
						<td>${cliente.nome}</td>
						<td>${cliente.email}</td>
						<td>${cliente.telefone}</td>



						<td style="padding-left: 20px"><a
							href="${pageContext.request.contextPath}/conta/clientecontas/?id=${cliente.id}">Ver Contas</a>
							&nbsp;&nbsp;&nbsp; <a 
							href="${pageContext.request.contextPath}/conta/criarConta/?id=${cliente.id}">Criar Nova Conta</a></td>




					</tr>

				</c:forEach>
				</c:if>





			</table>
	</fieldset>


<a href="${pageContext.request.contextPath}">Voltar para a página principal</a></td>


	

</body>
</html>