package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TblProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				TblProductocl2 cliente = new TblProductocl2();
				TblProductoImp crud = new TblProductoImp();
				List<TblProductocl2> listadoproducto =crud.ListarProducto();
				//ASIGNAMOS EL LISTADO DE CLIENTES RECUPERADOS DE LA BD
				request.setAttribute("ListadoProductos", listadoproducto);
				
				//response.getWriter().append("Controlador Cliente ").append(request.getContextPath());
				//REDIRECCIONAMOS
				request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//RECUPERAMOS LOS DATOS DEL FORMULARIO
				String nombre = request.getParameter("nombrecl2");
				double precioVen = Double.parseDouble(request.getParameter("precioventacl2"));
				double precioCom =Double.parseDouble(request.getParameter("preciocompcl2"));
				String estado = request.getParameter("estadocl2");
				String descripcion = request.getParameter("descripcl2");
			
				
				
				//INSTANCIAMOS LAS RESPECTIVAS CLASES
				TblProductocl2 prod = new TblProductocl2();
				TblProductoImp crud = new TblProductoImp();
				//ASIGNAMOS LOS VALORES
				prod.setNombrecl2(nombre);
				prod.setPrecioventacl2(precioVen);;
				prod.setPreciocompcl2(precioCom);
				prod.setEstadocl2(estado);;
				prod.setDescripcl2(descripcion);
				
				
				//INVOCAMOS EL METEODO A REGISTRAR
				crud.RegistrarProducto(prod);
				//actualizar el listdao
				List<TblProductocl2> listadoproducto=crud.ListarProducto();
			
				//ASIGNAMOS EL LISTADO DE CLIENTES RECUPERADOS DE LA BD
				request.setAttribute("ListadoProductos", listadoproducto);
				//REDIRECCIONAMOS A LISTADO
				request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
				
	}

}
