<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
Bienvenido a mi portal de anuncios&nbsp;<br />
<c:if test="${ sessionScope.identificado == null }">
	<spam style="color:grey;">
	 DEBES IDENTIDIFICARTE PARA REGISTRAR TU ANUNCIO<spam/>
	<a href="login.jsp">Identificarme</a>
	&nbsp;&nbsp;&nbsp;
	<a href="registrarUsuario.jsp">Registrarme</a>
	<br />
	&nbsp;&nbsp;
</c:if>
<c:if test="${ sessionScope.identificado != null }">
	<a href="registrarAnuncio.jsp">Registrar mi anuncio</a>
	&nbsp;&nbsp;&nbsp;
	<a href="ServletLogOut">cerrar sesion</a><b/>
	&nbsp;&nbsp;&nbsp;

</c:if>





