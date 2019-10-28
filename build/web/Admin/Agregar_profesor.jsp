<%@page import="com.sitio_web_matematicas.modelo.Profesor_servicios"%>

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
				<li><a href="Menu?accion=profesor">Profesor</a></li>
			
				<li><a href="Menu?accion=juegos">Juegos</a></li>
				<li><a href="Menu?accion=actualizar">Mi cuenta</a></li>
				<li><a href="Menu?accion=historial">Historial</a></li>
                                <li><a href="Menu?accion=guiar">Guia</a></li>
				<li><a href="Menu?accion=cerrar">Cerrar sesion</a></li>
				</ul>
		</nav>
	</header>
        
        <div id="contenedor1">
            
            <form id="form_inicio" action="profesor_agregar" method="post">
            <div id="form-titulo"><center><label id="Titulo">FORMULARIO DE REGISTRO</label></center></div>    
                <br><br>
             
                <label>NOMBRE: </label>
                <input type="text" name="txtnombre" id="nombre"/>
                
                <label>APELLIDO: </label>
                <input type="text" name="txtapellido" id="apellido"/>
                <hr>
                <label>CEDULA:</label>
                <input type="text" name="txtcedula" id="cedula"/>
                <hr>
                <br>
                <label>USUARIO:</label>
                <input type="text" name="txtusuario" id="usuario" />
                <hr>
                <br>
                <label style="align-content: center">CONTRASEÑA:</label>
                <input type="password" name="txtcontra" id="contra" />
                <hr>
                <input type="button" name="accion" value="guardar" id="btn-actualizar"/>
            </form>

        </div>
    </body>
</html>
