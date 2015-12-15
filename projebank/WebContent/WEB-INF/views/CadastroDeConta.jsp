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
	<form method="POST" action='<c:url value="/conta/efetivarConta"/>'>

		<fieldset>

			<legend>Dados da Conta</legend>

			<fieldset>

				<legend>Dados do Cliente</legend>
				<p>
					Identificador do Cliente: <input type="text" size="15" name="identificador"
						value="${cliente.id}" disabled="disabled">
				</p>
				<p>
					Nome: <input type="text" size="80" name="nome para a tela"
						value="${cliente.nome}" disabled="disabled">
				</p>
				
				<input type="hidden" size="80" name="id"
						value="${cliente.id}">
						<input type="hidden" size="80" name="nome"
						value="${cliente.nome}">
				<input type="hidden" size="80" name="email"
						value="${cliente.email}">
						
						<input type="hidden" size="80" name="telefone"
						value="${cliente.telefone}">
			</fieldset>
			<br />


			<p>
				Agência: <input type="text" size="80" name="agencia" value="">
			</p>

			<p>
				Conta: <input type="text" size="80" name="codConta"
					value="">
			</p>

			<p>
				Saldo: <input type="text" size="80" name="saldo"
					value="">
			</p>


			<p>
				<input type="submit" value="Gravar"> 
			</p>


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