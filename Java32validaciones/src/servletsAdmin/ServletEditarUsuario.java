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

@WebServlet("/admin/ServletEditarUsuario")
public class ServletEditarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		Usuario usuarioAeditar = usuarioDAO.obtenerUsuarioPorId(id);
		request.setAttribute("usuarioAeditar", usuarioAeditar);
		request.getRequestDispatcher("editarUsuario.jsp").forward(request,
				response);
	}// END SERVICE

}// END CLASS
