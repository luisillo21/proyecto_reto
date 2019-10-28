

<%@page import="com.sitio_web_matematicas.listas.ListaPreguntas"%>
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
        <title>PREGUNTAS</title>
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
        <header>
		<input type="checkbox" id="btn-menu">
		<label for="btn-menu">
			<div class="icono"><img src="icono-menu"></div>	
		</label>
		<nav class="menu">
			<ul>
                            <li><a href="Menu?accion=agregapregunta" style="border: 2px #fff">AGREGAR UN NUEVA PREGUNTA</a></li>
				</ul>
		</nav>
	</header>
        
         <div class="ordenar">

            <table>

                <thead>
                    <tr>
                     <th>PREGUNTA</th>  <th>RESPUESTA</th> <th>ACCIONES</th>
                    </tr>
                </thead>
                <%  
                    String nombre_juego = (String) request.getAttribute("nomj");
                    Sistema_servicios obj = new Sistema_servicios();
                    List<ListaPreguntas> datos = obj.listadoPreguntas(nombre_juego);
                    for (ListaPreguntas h : datos) {         
                %>
                <tr>
                   
                    <td><%=h.getPregunta()%></a></td>
                    <td><%=h.getRespuesta()%></td>
                    <td><a href="Menu?accion=eliminar_pregunta&pe=<%=h.getPregunta()%>">Eliminar</a></td>
                </tr>
                <%}%>
            </table>
        </div>
    </body>
</html>
