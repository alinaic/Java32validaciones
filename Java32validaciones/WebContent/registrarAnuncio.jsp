<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${ sessionScope.identificado == null }">

<jsp:forward page="login.jsp"></jsp:forward>
</c:if>

<div style="color:red">${mensaje} </div>

	<a href="index.jsp">volver a inicio</a>
	<br /> Introduce los datos de tu anuncio:
	<br />
	<form action="ServletRegistroAnuncio" method="post">
<!-- 
onsubmit="return validarFormularioRegistroAnuncioCliente()"
 -->
		titulo: <input type="text" name="campoTitulo" /><br /> 
		precio: <input type="text" name="campoPrecio" /><br /> 
		telefono: <input type="text" name="campoTelefono" /><br /> 
		email: <input type="text" name="campoEmail" /><br /> 
		descripcion: <br /><textarea rows="3" cols="20" name="campoDescripcion"></textarea>
		<br /> <input type="submit" value="ACEPTAR" /><br />
		<br />
	</form>

<script type="text/javascript" src="js/validacionRegistrarAnuncioCliente.js"></script>
</body>
</html>