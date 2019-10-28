
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
        
        <link href="css_admin/estilomenu.css" rel="stylesheet" type="text/css"/>
        <link href="css_admin/estilos_admin.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido <%=usuario%></title>
    </head>
    <body>
        <div class="imagen"><img id="preguntaimagen" src="imagenes_admin/pregunta-nubes.png" alt=""/></div>
        <header>
		<input type="checkbox" id="btn-menu">
		<label for="btn-menu">
			<div class="icono"><img src="icono-menu"></div>	
		</label>
		<nav class="menu">
			<ul>
				<li><a href="../Menu?accion=profesor">Profesor</a></li>
				
				<li><a href="../Menu?accion=juegos">Juegos</a></li>
				<li><a href="../Menu?accion=actualizar">Mi cuenta</a></li>
				<li><a href="../Menu?accion=historial">Historial</a></li>
				<li><a href="../Menu?accion=guiar">Guia</a></li>
                                <li><a href="../Menu?accion=cerrar">Cerrar sesion</a></li>
				</ul>
		</nav>
	</header>
	<article>
		<h1><label id="portada">GUIA DE USUARIO</label></h1>
		<hr width="500%" size="5 px" align="left">
		<h2 style="right: 30%"><p> Mantenimiento profesor:</p></h2>
		<h3><p> En la opcion Profesor" podras agregar,eliminar o actualizar informacion de un profesor.</p></h3>

		<h2><p>mantenimiento alumno:</p></h2>
		<h3><p>En la opcion "Estudiante" podras agregar,eliminar o actualizar informacion de un profesor.</p></h3>

		<h2><p >Mantenimiento Juegos:</p></h2>

		<h3><p>En la opcion "Juegos" podras agregar o eliminar nuevas preguntas a los juegos.
			<br>Se debe tener precaucion al agregar una nueva pregunta,
			<br>ya que al agregar mal una  respuesta podrian haber error al calicifar un resultado<br>
				al calificar los resultados de un estudiante</p></h3>
		
		
		<h2><p>Actualizar informacion</p></h2>
		<h3><p>En la opcion "Mi cuenta" podras editar tu informacion.</p></h3>
		
		<h2><p>Historial</p></h2>
		<h3><p>En la opcion "Historial" podras ver un registro de movimientos en el sistema</p></h3>
                
                <h2><p>Cerrar sesion</p></h2>
		<h3><p> Click en "Cerrar sesion" para salir del sistema de forma seguraa</p></h3>
		

			</article>
	</header>
    </body>
</html>
