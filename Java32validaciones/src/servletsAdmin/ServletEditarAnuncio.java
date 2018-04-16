package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Anuncio;
import daos.AnunciosDAO;
import daosImpl.AnunciosDAOImpl;

@WebServlet("/admin/ServletEditarAnuncio")
public class ServletEditarAnuncio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		AnunciosDAO anunciosDAO = new AnunciosDAOImpl();
		Anuncio anuncioAeditar = anunciosDAO.obtenerAnunciosPorId(id);
		request.setAttribute("anuncioAeditar", anuncioAeditar);
		request.getRequestDispatcher("editarAnuncio.jsp").forward(request,
				response);
	}// END SERVICE

}// END CLASS
