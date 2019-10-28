<%-- 
    Document   : Gestion_alumno
    Created on : 23/09/2019, 21:57:48
    Author     : hp
--%>

<%@page import="com.sitio_web_matematicas.listas.ListaAlumnos"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession objsesion = request.getSession(false);
    String usuario = (String)objsesion.getAttribute("usuario");
    if(usuario.equals("")) {
            response.sendRedirect("../Login/Vista_login.jsp");
        }
%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Admin/css_admin/estilomenu.css" rel="stylesheet" type="text/css"/>
        <link href="Admin/css_admin/estilos_admin.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GESTION PROFESOR</title>
        
    </head>
    <body>
        <header>
		<input type="checkbox" id="btn-menu">
		<label for="btn-menu">
			<div class="icono"><img src="icono-menu"></div>	
		</label>
		<nav class="menu">
			<ul>
				<li><a href="Menu?accion=profesor">Profesor</a></li>
				<li><a href="Menu?accion=alumnos">Alumno</a></li>
				<li><a href="Menu?accion=juegos">Juegos</a></li>
				<li><a href="Menu?accion=actualizar">Mi cuenta</a></li>
				<li><a href="Menu?accion=historial">Historial</a></li>
                                <li><a href="Menu?accion=guiar">Guia</a></li>
				<li><a href="Menu?accion=cerrar">Cerrar sesion</a></li>
				</ul>
		</nav>
	</header>
        
        
            <header>
		<input type="checkbox" id="btn-menu">
		<label for="btn-menu">
			<div class="icono"><img src="icono-menu"></div>	
		</label>
		<nav class="menu">

        
        
         
         <div class="ordenar">
            
            <table>

                <thead>
                    
         
                    <tr>
                       <th>NOMBRE</th>
                       <th>APELLIDO</th>
                       <th>CEDULA</th>
                       <th>USUARIO</th>
                       <th>CURSO</th>
                       <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    Estudiante_servicios obj = new Estudiante_servicios();
                    List<ListaAlumnos> datos = obj.informacionAlumnos();
                    for (ListaAlumnos h : datos) {         
                %>
                <tr>
                    <td><%=h.getNombre()%></td> 
                    <td><%=h.getApellido()%></td> 
                    <td><%=h.getCedula()%></td> 
                    <td><%=h.getUsuario()%></td>
                    <td><%=h.getCurso()%></td>
                    <td><%=h.getNombreJuego()%></td>
                    <td><%=h.getTotal()%></td>
                    <td>
                        <a href="../Menu?accion=editarprofe&userp=<%=h.getUsuario()%>">EDITAR</a>
                    </td>
                </tr>

                <%}%>

            </table>
        </div>
    </body>
</html>