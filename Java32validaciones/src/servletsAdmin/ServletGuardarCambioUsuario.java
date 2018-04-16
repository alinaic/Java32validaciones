package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Anuncio;
import modelo.Usuario;
import daos.AnunciosDAO;
import daos.UsuarioDAO;
import daosImpl.AnunciosDAOImpl;
import daosImpl.UsuarioDAOImpl;


@WebServlet("/admin/ServletGuardarCambioUsuario")
public class ServletGuardarCambioUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("campoNombre");
		String pass = request.getParameter("campoPass");
		String poblacion = request.getParameter("campoPoblacion");
		String email = request.getParameter("campoEmail");
		String id = request.getParameter("campoId");
		
		Usuario usuario = new Usuario(nombre, pass, poblacion, email);
		usuario.setId(Integer.parseInt(id));
		
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.guardarCambiosUsuario(usuario);
		
		request.getRequestDispatcher("ServletListadoUsuarioAdmin").forward(request, response);
	}

}
