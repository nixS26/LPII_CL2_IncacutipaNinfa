/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.1
 * Generated at: 2024-06-21 17:55:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.TblProductocl2;

public final class ListadoProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1718930562258L));
    _jspx_dependants.put("jar:file:/C:/Users/N/OneDrive/Escritorio/LP%20II/CL2Incacutipa/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/LPII_CL2_IncacutipaNinfa/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("jar:file:/C:/Users/N/OneDrive/Escritorio/LP%20II/CL2Incacutipa/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/LPII_CL2_IncacutipaNinfa/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153403082000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("  \t\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Listado de Productos</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=#c5dec9>\r\n");
      out.write("\t<h1 align=\"center\" >Listado de Clientes</h1>\r\n");
      out.write("\t<h2 align=\"center\">\r\n");
      out.write("\t<a href=\"RegistrarProductos.jsp\" style=\"text-decoration:none\">Registrar Producto</a></h2>\r\n");
      out.write("\r\n");
      out.write("<table align=\"center\" border=\"2\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Codigo</td>\r\n");
      out.write("<td>Nombre</td>\r\n");
      out.write("<td>PV</td>\r\n");
      out.write("<td>PC</td>\r\n");
      out.write("<td>Estado</td>\r\n");
      out.write("<td>Descripcion</td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");


List<TblProductocl2> listadoproducto=(List<TblProductocl2>)request.getAttribute("ListadoProductos");

if(listadoproducto!=null){

	

for(TblProductocl2 lis:listadoproducto){


      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.write("\r\n");
      out.print(lis.getIdproductocl2());
      out.write("\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.print(lis.getNombrecl2());
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.print(lis.getPrecioventacl2());
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.print(lis.getPreciocompcl2());
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.print(lis.getEstadocl2());
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.print(lis.getDescripcl2());
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");

   }//cerramos la condicion...
}  //cerramos el bucle

      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
