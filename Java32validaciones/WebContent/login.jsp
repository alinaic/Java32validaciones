<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Introduce tus datos para identificarte:
	<br/>

	<div style="color: red">&nbsp;${mensaje}</div>
	<form action="ServletIdentificacionUsuario" method="post">
		email: <input type="text" name="campoEmail" /><br> pass: <input
			type="password" name="campoPass"><br> <input
			type="submit" value="ENTRAR" />
	</form>
</body>
</html>