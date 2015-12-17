<%@page import="br.com.springapostila.modelo.ProdutoDAO"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css" media="all">
@import url("css/maven-base.css");

@import url("css/maven-theme.css");

@import url("css/site.css");

@import url("/css/screen.css");
</style>
</head>
<body>


	<fieldset>
		<legend>Produto a ser cadastrado</legend>

		<div>


			<display:table name="${ListaProdutos}" class="its" pagesize="5"
				export="true" requestURI="listarProduto">
				<display:column property="id" title="id" sortable="true" />
				<display:column property="nome" title="nome" sortable="true" />
				<display:column property="quatidade" title="quatidade" />

			</display:table>



		</div>

		<br />

		<form action="produto" method="get">
			<input type="submit" value="+ Novo Produto" />
		</form>

	</fieldset>

</body>
</html>