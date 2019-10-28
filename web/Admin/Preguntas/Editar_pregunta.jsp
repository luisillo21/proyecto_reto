<%-- 
    Document   : Editar_pregunta
    Created on : 24/09/2019, 5:07:14
    Author     : hp
--%>


<%@page import="com.sitio_ludico.servicios.ListaPreguntas"%>
<%@page import="com.sitio_web_matematicas.modelo.Sistema_servicios"%>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="Admin/css_admin/estilomenu.css" rel="stylesheet" type="text/css"/>
        <link href="Admin/css_admin/estilos_admin.css" rel="stylesheet" type="text/css"/>
        <script src="Admin/Javascript/Validar_campos.js" type="text/javascript"></script>
        <link href="Admin/css_admin/estilos_1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       <header>
		<input type="checkbox" id="btn-menu">
		<label for="btn-menu">
			<div class="icono"><img src="icono-menu"></div>	
		</label>
		<nav class="menu">
			<ul>
				<li><a href="../Menu?accion=profesor">Profesor</a></li>
				<li><a href="Menu?accion=juegos">Juegos</a></li>
				<li><a href="Menu?accion=actualizar">Mi cuenta</a></li>
				<li><a href="Menu?accion=historial">Historial</a></li>
                                <li><a href="Menu?accion=guiar">Guia</a></li>
				<li><a href="Menu?accion=cerrar">Cerrar sesion</a></li>
				</ul>
		</nav>
	</header>
        
        <div id="contenedor1">
            
            <form id="form_inicio" action="../../Agregar_pregunta" method="post">
            <div id="form-titulo"><center><label id="Titulo">Actualizar mi informacion</label></center></div>    
                <br><br>
                <%
                   Sistema_servicios obj = new Sistema_servicios();
                   String n = (String)request.getAttribute("nomp");
                   ListaPreguntas datos = obj.traerPregunta(n);
                %>
                <label>Pregunta </label>
                <input type="text" name="txtpregunta" readonly="" id="pregunta" value="<%=datos.getPregunta()%>" />
                <label>Respuesta </label>
                <input type="text" name="txtrespuesta" id="respuesta" value="<%=datos.getRespuesta()%>"/>
                <hr>
                <label>Estado(true/false)</label>
                <input type="boolean" readonly="" name="txtestado" id="estado" value="<%=datos.isActivo()%>"/>
                <hr>
                <input type="button" name="txtguadar" value="guardar cambios" id="btn-editarpregunta"/>
            </form>

        </div>
    </body>
</html>
    </body>
</html>
