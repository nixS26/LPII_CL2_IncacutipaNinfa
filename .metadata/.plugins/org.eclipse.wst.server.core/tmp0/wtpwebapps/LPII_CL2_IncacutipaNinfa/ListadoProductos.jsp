<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
  	<%@page import="model.TblProductocl2" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Productos</title>
</head>
<body bgcolor=#c5dec9>
	<h1 align="center" >Listado de Clientes</h1>
	<h2 align="center">
	<a href="RegistrarProductos.jsp" style="text-decoration:none">Registrar Producto</a></h2>

<table align="center" border="2">
<tr>
<td>Codigo</td>
<td>Nombre</td>
<td>PV</td>
<td>PC</td>
<td>Estado</td>
<td>Descripcion</td>

</tr>

<%

List<TblProductocl2> listadoproducto=(List<TblProductocl2>)request.getAttribute("ListadoProductos");

if(listadoproducto!=null){

	

for(TblProductocl2 lis:listadoproducto){

%>

<tr>

<td>

<%=lis.getIdproductocl2()%>

</td>


<td>
<%=lis.getNombrecl2()%>
</td>

<td>
<%=lis.getPrecioventacl2()%>
</td>

<td>
<%=lis.getPreciocompcl2()%>
</td>

<td>
<%=lis.getEstadocl2()%>
</td>

<td>
<%=lis.getDescripcl2()%>
</td>


</tr>
<%
   }//cerramos la condicion...
}  //cerramos el bucle
%>

</table>
</body>
</html>