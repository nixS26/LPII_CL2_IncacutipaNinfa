package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TblLogueoImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorLogueo
 */
public class ControladorLogueo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorLogueo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/Logueo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreUsuario = request.getParameter("usuariocl2");
	    String contraseña = request.getParameter("passwordcl2");

	    TblUsuariocl2 cliente = new TblUsuariocl2();
	    cliente.setUsuariocl2(nombreUsuario);;
	    cliente.setPasswordcl2(contraseña);;

	    TblLogueoImp logueoDao = new TblLogueoImp();
	    TblUsuariocl2 usuarioEncontrado = logueoDao.BuscarUsuario(cliente);

	    if (usuarioEncontrado != null) {
	        response.sendRedirect("index.jsp");
	        System.out.println("CREDENCIALES CORRECTAS");
	    } else {
	        System.out.println("Contraseña incorrecta");
	        response.sendRedirect("Error.jsp");
	    }
	
	}

}
