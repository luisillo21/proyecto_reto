

<%@page import="com.sitio_web_matematicas.listas.ListaProfesor"%>
<%@page import="com.sitio_web_matematicas.modelo.Profesor_servicios"%>

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
        <link href="Admin/css_admin/estilos_admin_1.css" rel="stylesheet" type="text/css"/>
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
                            <li><a href="Menu?accion=agregarprofe" style="border: 2px #fff">AGREGAR UN NUEVO PROFESOR</a></li>
				<li><a href="Menu?accion=agregaradmin" style="border: 2px #fff" >AGREGAR UN NUEVO ADMINISTRADOR</a></li>
				</ul>
		</nav>
	</header>
        
        
         
        <div class="ordenar">
            
            <table>

                <thead>
                    
         
                    <tr>
                       <th>NOMBRE</th>
                       <th>APELLIDO</th>
                       <th>CEDULA</th>
                       <th>USUARIO</th>
                       <th>CURSO</th>

                    </tr>
                </thead>
                <%
                    Profesor_servicios obj = new Profesor_servicios();
                    List<ListaProfesor> datos = obj.listaProfesores();
                    for (ListaProfesor h : datos) {         
                %>
                <tr>
                    <td><%=h.getNombre()%></td> 
                    <td><%=h.getApellido()%></td> 
                    <td><%=h.getCedula()%></td> 
                    <td><%=h.getUsuario()%></td>
                    <td><%=h.getCurso()%></td>
                  
                </tr>

                <%}%>

            </table>
        </div>
    </body>
</html>
