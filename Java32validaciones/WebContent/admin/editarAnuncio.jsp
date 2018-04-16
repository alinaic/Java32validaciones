<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<form action="ServletGuardarCambioAnuncio" method="post">

		titulo: <input type="text" name="campoTitulo"
			value="${ anuncioAeditar.titulo }"><br /> precio: <input
			type="text" name="campoPrecio" value="${ anuncioAeditar.precio }"><br />
		descripcion: <br />
		<textarea rows="3" cols="20" name="campoDescripcion">${ anuncioAeditar.descripcion }</textarea>

		<input type="hidden" name="campoId" value="${ anuncioAeditar.id}" />
		} <br /> <input type="submit" value="GUARDAR CAMBIOS" />


	</form>




</body>
</html>