<% System.setProperty("java.awt.headless", "false");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../Javascript/Validar_campos.js" type="text/javascript"></script>
        <link href="css/estiloslogin.css" rel="stylesheet" type="text/css"/>
        <link href="css/galeria.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="form-presentacion"><center><label id="portada">Bienvenidos a Juegos Matematicos.com</label></center></div>
        <div class="slider">
            <ul>
                <li><img src="imagenes_login/sumas-restas.png"></li>
                <li><img src="imagenes_login/imagengaleria2.png"></li>
                <li><img src="imagenes_login/imagengaleria3.png"></li>
                <li><img src="imagenes_login/imagengaleria4.jpg"></li>
            </ul>
        </div>
        <div id="contenedor1">
            <div id="form-titulo"><center><label id="Titulo">Acceder al sistema</label></center></div>
            <form id="form_inicio" action="../logeo" method="Post">
                <img src="imagenes_login/iconmonstr-user-20-64.png" alt=""/>
                <input type="text" name="txtusuario"  id="user" placeholder="ingrese su usuario"/>
                <hr>
                <br>
                <img src="imagenes_login/iconmonstr-password-10-64.png" alt=""/>
                <input type="password" name="txtcontra" id="pass" placeholder="ingrese su contraseña"/>
                <hr>
                <input type="button" value="Entrar"  id="btniniciar"/>
            </form>
        </div>
    </body>
</html>
