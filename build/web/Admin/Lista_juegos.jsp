

<%@page import="com.sitio_web_matematicas.listas.ListaJuegos"%>
<%@page import="java.util.List"%>
<%@page import="com.sitio_web_matematicas.modelo.Sistema_servicios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% System.setProperty("java.awt.headless", "false");%>
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
        <title>JUEGOS</title>
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
				
				<li><a href="Menu?accion=juegos">Juegos</a></li>
				<li><a href="Menu?accion=actualizar">Mi cuenta</a></li>
				<li><a href="Menu?accion=historial">Historial</a></li>
                                <li><a href="Menu?accion=guiar">Guia</a></li>
				<li><a href="Menu?accion=cerrar">Cerrar sesion</a></li>
				</ul>
		</nav>
	</header>
        
         <div class="ordenar">

            <table>

                <thead>
                    <tr>
                        <th>NOMBRE JUEGO</th> <th>CANTIDAD PREGUNTAS</th>  <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    Sistema_servicios obj = new Sistema_servicios();
                    List<ListaJuegos> datos = obj.listarJuegos();
                    for (ListaJuegos h : datos) {         
                %>
                <tr>
                    <td><%=h.getNombreJuego()%></td> 
                    <td><%=h.getCantidadDePreguntas()%></td>
                    <td>
                        <a href="Menu?accion=listapreguntas&nomjuego=<%=h.getNombreJuego()%>">ver preguntas</a>
                    </td> 
                   
                
                </tr>

                <%}%>

            </table>
        </div>
    </body>
</html>
