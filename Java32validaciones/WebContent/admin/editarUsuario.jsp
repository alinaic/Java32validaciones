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
	<form action="ServletGuardarCambioUsuario" method="post">

		nombre: <input type="text" name="campoNombre" value="${ usuarioAeditar.nombre }"><br /> 
		pass: <input type="password" name="campoPass" value="${ usuarioAeditar.pass }"><br />
		poblacion:<input type="text" name="campoPoblacion" value="${ usuarioAeditar.poblacion }"><br /> 
		email: <input type="text" name="campoEmail" value="${ usuarioAeditar.email }"><br />


		<input type="hidden" name="campoId" value="${ usuarioAeditar.id}" /> <br />
		<input type="submit" value="GUARDAR CAMBIOS" />


	</form>




</body>
</html>