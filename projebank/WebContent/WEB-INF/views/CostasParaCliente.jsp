<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro Cliente</title>
</head>
<body>

	<h1>Cadastro de conta</h1>
	<br />
	<form method="POST" action='<c:url value="/conta/efetivarConta"/>'>

		<fieldset>

			<legend>Contas para o Cliente</legend>

			<fieldset>

				<legend>Dados do Cliente</legend>
				<p>
					Identificador do Cliente: <input type="text" size="15"
						name="identificador" value="${cliente.id}" disabled="disabled">
				</p>
				<p>
					Nome: <input type="text" size="80" name="nome para a tela"
						value="${cliente.nome}" disabled="disabled">
				</p>

				<input type="hidden" size="80" name="id" value="${cliente.id}">
				<input type="hidden" size="80" name="nome" value="${cliente.nome}">
				<input type="hidden" size="80" name="email" value="${cliente.email}">

				<input type="hidden" size="80" name="telefone"
					value="${cliente.telefone}">
			</fieldset>
			<br />


			<fieldset>
				<legend>Lista de Clietes cadastrados</legend>
				
				<c:if test="${empty cliente.conta}">
					<h1>Não tem conta para este cliente</h1>
				</c:if>
				
				<c:if test="${not empty cliente.conta}">
					<table width="" cellpadding="" cellspacing="" border="">
						<tr style="background-color: teal; color: white;">

							<th>Id da conta</th>

							<th>Agencia</th>

							<th>Número da conta</th>

							<th>Saldo</th>

							<th>Ações</th>
						</tr>

						<c:forEach items="${cliente.conta}" var="conta">


							<tr>
								<td>${conta.id}</td>
								<td>${conta.agencia}</td>
								<td>${conta.codConta}</td>
								<td> <fmt:formatNumber type="currency" value="${conta.saldo}" />   </td>



								<td style="padding-left: 20px"><a
									href="${pageContext.request.contextPath}/conta/movimentar/?id=${conta.id}">Movimentar</a>
							</tr>

						</c:forEach>
						</c:if>


					</table>
			</fieldset>



		</fieldset>


	</form>




	
	</td>


	<script type="text/javascript">
		function confirma() {
			var retorno = confirm("Deseja mesmo deletar?");
			if (retorno)
				return true;

			return false;
		}

		function mascara(t, mask) {
			var i = t.value.length;
			var saida = mask.substring(1, 0);
			var texto = mask.substring(i)
			if (texto.substring(0, 1) != saida) {
				t.value += texto.substring(0, 1);
			}
		}
	</script>

</body>
</html>