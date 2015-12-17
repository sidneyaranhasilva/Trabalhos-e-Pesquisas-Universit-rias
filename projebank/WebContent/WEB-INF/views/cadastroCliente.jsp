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
<!-- teste com o GIT -->
	<h1>Cadastro Cliente</h1>  
	<br />
	<form method="post" action='<c:url value="/inicio/salvar"/>'>

       <input type="hidden" size="80" name="id" value="">

		<p>
			Nome: <input type="text" size="80" name="nome"
				value="">
		</p>

		<p>
			E-mail: <input type="text" size="80" name="email"
				value="">
		</p>

		<p>
			Telefone: <input type="text" size="80" name="telefone"
				value=""   onkeypress="mascara(this, '## ####-####')" maxlength="12">
		</p>

		<p>
			<input type="submit" value="Gravar">
	
			<input type="reset" value="Limpar">
		</p>





	</form>



	<fieldset>
		<legend>Lista de Clietes cadastrados</legend>
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
							href="${pageContext.request.contextPath}/inicio/alterar/?id=${cliente.id}">Alterar</a>
							&nbsp;&nbsp;&nbsp; <a onclick="return confirma()"
							href="${pageContext.request.contextPath}/inicio/deletar/?id=${cliente.id}">Delete</a></td>




					</tr>

				</c:forEach>
				</c:if>





			</table>
	</fieldset>




	<script type="text/javascript">
		function confirma() {
			var retorno = confirm("Deseja mesmo deletar?");
			if (retorno)
				return true;

			return false;
		}
		
		function mascara(t, mask){
			 var i = t.value.length;
			 var saida = mask.substring(1,0);
			 var texto = mask.substring(i)
			 if (texto.substring(0,1) != saida){
			 t.value += texto.substring(0,1);
			 }
		}
	</script>

</body>
</html>