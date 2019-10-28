package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Vista_005fadministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
 System.setProperty("java.awt.headless", "false");
      out.write('\n');
      out.write('\n');

    HttpSession objsesion = request.getSession(false);
    String usuario = (String)objsesion.getAttribute("usuario");
    if(usuario.equals("")) {
            response.sendRedirect("../Login/Vista_login.jsp");
        }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <link href=\"css_admin/estilomenu.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css_admin/estilos_admin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bienvenido ");
      out.print(usuario);
      out.write("</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"imagen\"><img id=\"preguntaimagen\" src=\"imagenes_admin/pregunta-nubes.png\" alt=\"\"/></div>\n");
      out.write("        <header>\n");
      out.write("\t\t<input type=\"checkbox\" id=\"btn-menu\">\n");
      out.write("\t\t<label for=\"btn-menu\">\n");
      out.write("\t\t\t<div class=\"icono\"><img src=\"icono-menu\"></div>\t\n");
      out.write("\t\t</label>\n");
      out.write("\t\t<nav class=\"menu\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"../Menu?accion=profesor\">Profesor</a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li><a href=\"../Menu?accion=juegos\">Juegos</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"../Menu?accion=actualizar\">Mi cuenta</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"../Menu?accion=historial\">Historial</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"../Menu?accion=guiar\">Guia</a></li>\n");
      out.write("                                <li><a href=\"../Menu?accion=cerrar\">Cerrar sesion</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("\t<article>\n");
      out.write("\t\t<h1><label id=\"portada\">GUIA DE USUARIO</label></h1>\n");
      out.write("\t\t<hr width=\"500%\" size=\"5 px\" align=\"left\">\n");
      out.write("\t\t<h2 style=\"right: 30%\"><p> Mantenimiento profesor:</p></h2>\n");
      out.write("\t\t<h3><p> En la opcion Profesor\" podras agregar,eliminar o actualizar informacion de un profesor.</p></h3>\n");
      out.write("\n");
      out.write("\t\t<h2><p>mantenimiento alumno:</p></h2>\n");
      out.write("\t\t<h3><p>En la opcion \"Estudiante\" podras agregar,eliminar o actualizar informacion de un profesor.</p></h3>\n");
      out.write("\n");
      out.write("\t\t<h2><p >Mantenimiento Juegos:</p></h2>\n");
      out.write("\n");
      out.write("\t\t<h3><p>En la opcion \"Juegos\" podras agregar o eliminar nuevas preguntas a los juegos.\n");
      out.write("\t\t\t<br>Se debe tener precaucion al agregar una nueva pregunta,\n");
      out.write("\t\t\t<br>ya que al agregar mal una  respuesta podrian haber error al calicifar un resultado<br>\n");
      out.write("\t\t\t\tal calificar los resultados de un estudiante</p></h3>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<h2><p>Actualizar informacion</p></h2>\n");
      out.write("\t\t<h3><p>En la opcion \"Mi cuenta\" podras editar tu informacion.</p></h3>\n");
      out.write("\t\t\n");
      out.write("\t\t<h2><p>Historial</p></h2>\n");
      out.write("\t\t<h3><p>En la opcion \"Historial\" podras ver un registro de movimientos en el sistema</p></h3>\n");
      out.write("                \n");
      out.write("                <h2><p>Cerrar sesion</p></h2>\n");
      out.write("\t\t<h3><p> Click en \"Cerrar sesion\" para salir del sistema de forma seguraa</p></h3>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t\t</article>\n");
      out.write("\t</header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
