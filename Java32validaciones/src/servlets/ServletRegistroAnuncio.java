package servlets;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.AnunciosDAO;
import daosImpl.AnunciosDAOImpl;
import modelo.Anuncio;

@WebServlet("/ServletRegistroAnuncio")
public class ServletRegistroAnuncio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		//protegemos este servlet por si se intenta acceder a Èl dirrectamenre
		//sin estar identificado
		if(request.getSession().getAttribute("identificado") ==null){
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
			
		}
		
		System.out.println("se ejecuta el post del ServletRegistroAnuncio");
		// recoger lo que ha introducido el usuario en el formulario:

		// campoTitulo es el name del input del que quiero coger la informacion
		String titulo = request.getParameter("campoTitulo");
		String precio = request.getParameter("campoPrecio");
		String telefono = request.getParameter("telefono");
		String email = request.getParameter("email");
		String descripcion = request.getParameter("campoDescripcion");
		// parte de validacion de datos
		String expresionRegularTitulo = "[a-zA-Z·ÈÌÛ˙Ò¡…Õ”⁄—\\s]{3,20}";
		Pattern patter = Pattern.compile(expresionRegularTitulo);
		Matcher matcher = patter.matcher(titulo);
		if(matcher.matches()){
			System.out.println("titulo ok");
		
		}else{
			System.out.println("titulo no valido");
			request.setAttribute("mensaje", "titulo no valido");
			request.getRequestDispatcher("registrarAnuncio.jsp").forward(request, response);
			return;
			
		}//end else
		//lo mismo con el resto de campos a continuacion....
		// fin parte de validacion de datos

		Anuncio nuevoAnuncio = new Anuncio(titulo, Double.parseDouble(precio),
				 telefono, email, descripcion);
		// ahora le damos el nuevo anuncio a un dao para que lo registre
		System.out.println("vamos a registrar: " + nuevoAnuncio.toString());

		AnunciosDAO anunciosDAO = new AnunciosDAOImpl();
		anunciosDAO.registrarAnuncio(nuevoAnuncio);
		// desde un servlet no deberÌa mostrarle nada al usuario, para eso
		// tenemos las jsp que son las encargadas de realizar la "vista"
		// de la aplicacion
		
		//asi digo al server que siga la ejecucion en la siguiente jsp
		request.getRequestDispatcher("registroAnuncioOK.jsp").forward(request, response);

	}// end doPost

}// end clas

