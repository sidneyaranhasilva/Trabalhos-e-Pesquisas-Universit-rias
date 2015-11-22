
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>   
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.its {
	list-style: none;
	border-style: solid;
	border-bottom: solid;

}
</style>
</head>
<body>


	<fieldset>
		<legend>Produto a ser cadastrado</legend>

		<div>
			
				<display:table name="${ListaProdutos}" class="its" pagesize="5" export="true" >
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