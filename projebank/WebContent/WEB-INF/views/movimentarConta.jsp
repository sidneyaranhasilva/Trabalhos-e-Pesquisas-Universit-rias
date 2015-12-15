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

	<h1>Cadastro de conta</h1>
	<br />
	<form method="POST" action='<c:url value="/conta/efetivarMovimentacao"/>'>

		<fieldset>

			<legend>Dados da Conta</legend>
			
			



			<p>Identificador da conta: <b>${conta.id}</b></p>

			<p>Agência: <b>${conta.agencia}</b></p>

			<p>Conta: <b> ${conta.codConta} </b></p>


			<p><h2>saldo: <b>${conta.saldo}</b></h2></p>



			<input type="hidden" size="80" name="idconta" value="${conta.id}">


			<fieldset>

				<legend>Dados da Movimentação</legend>


				<select name="tipomovimentacao">
					<option value="saque">Saque</option>
					<option value="deposito">Depósito</option>
				</select> <br>
				<br>


				<p>
					Valor para movimentaçãos: <input type="text" size="80" name="valor" value="0" />
					<p>${valorVazio} </p>
				</p>


				<p>
					<input type="submit" value="Gravar">
				</p>


			</fieldset>
		</fieldset>


	</form>




	<a href="${pageContext.request.contextPath}">Voltar para a página
		principal</a>
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