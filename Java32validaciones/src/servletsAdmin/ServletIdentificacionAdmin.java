package servletsAdmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.UsuarioDAO;
import daosImpl.UsuarioDAOImpl;

@WebServlet("/admin/ServletIdentificacionAdmin")
public class ServletIdentificacionAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("se ejecuta el servlet de indentificacion del admin");
		String email = request.getParameter("campoEmail");
		String pass = request.getParameter("campoPass");
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		if(usuarioDAO.identificarAdmin(email, pass)){
			request.getSession().setAttribute("admin", "ok");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			//falta indicar mensaje de email o pass incorrectos
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
		
	}//end service

}//end class
