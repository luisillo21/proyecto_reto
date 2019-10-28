

<%@page import="com.sitio_web_matematicas.listas.GenrHistorial"%>
<%@page import="java.util.List"%>
<%@page import="com.sitio_web_matematicas.modelo.Sistema_servicios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% System.setProperty("java.awt.headless", "false");%>

<!DOCTYPE html>
<html>
    <head>

        <link href="Admin/css_admin/estilos_admin.css" rel="stylesheet" type="text/css"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HISTORIAL</title>
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
				<li><a href="../Menu?accion=alumnos">Alumno</a></li>
				<li><a href="../Menu?accion=juegos">Juegos</a></li>
				<li><a href="../Menu?accion=actualizar">Mi cuenta</a></li>
				<li><a href="../Menu?accion=historial">Historial</a></li>
                                <li><a href="../Menu?accion=guiar">Guia</a></li>
				<li><a href="../Menu?accion=cerrar">Cerrar sesion</a></li>
				</ul>
		</nav>
	</header>
        
         <div class="ordenar">

             <table id="tablahistorial" >

                <thead>
                    <tr>
                        <th>USUARIO</th> <th>ACCION</th>  <th>DESCRIPCION</th> <th>FECHA</th>
                    </tr>
                </thead>
            
                <tr>
                    <td></td> 
                    <td></td> 
                    <td></td> 
                    <td></td>
                </tr>

       

            </table>
        </div>
    </body>
    <script src="../Javascript/jquery-3.4.1.min.js" type="text/javascript"></script>
    <script src="https://cdm.datatables.net/1.10.15/js/jquery.dataTables.min.js" ></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
    <script>
        $(document).ready(function(){
            
            var tabla = $('#tablahistorial').DataTable({
               ajax: {
                   method: "POST",
                   url: "listarhistorial",
                  datasource: "datos"       
               },
               columns: [
                   {data: "usuario"},
                   {data: "accion"},
                   {data:"descripcion"},
                   {data:"fecha"}             
               ]              
            }),      
        });
        </script>
</html>
