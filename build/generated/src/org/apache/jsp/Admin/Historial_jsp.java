package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sitio_web_matematicas.listas.GenrHistorial;
import java.util.List;
import com.sitio_web_matematicas.modelo.Sistema_servicios;

public final class Historial_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 System.setProperty("java.awt.headless", "false");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <link href=\"Admin/css_admin/estilos_admin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HISTORIAL</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("\t\t<input type=\"checkbox\" id=\"btn-menu\">\n");
      out.write("\t\t<label for=\"btn-menu\">\n");
      out.write("\t\t\t<div class=\"icono\"><img src=\"icono-menu\"></div>\t\n");
      out.write("\t\t</label>\n");
      out.write("\t\t<nav class=\"menu\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"../Menu?accion=profesor\">Profesor</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"../Menu?accion=alumnos\">Alumno</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"../Menu?accion=juegos\">Juegos</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"../Menu?accion=actualizar\">Mi cuenta</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"../Menu?accion=historial\">Historial</a></li>\n");
      out.write("                                <li><a href=\"../Menu?accion=guiar\">Guia</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"../Menu?accion=cerrar\">Cerrar sesion</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("        \n");
      out.write("         <div class=\"ordenar\">\n");
      out.write("\n");
      out.write("             <table id=\"tablahistorial\">\n");
      out.write("\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>USUARIO</th> <th>ACCION</th>  <th>DESCRIPCION</th> <th>FECHA</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("            \n");
      out.write("                <tr>\n");
      out.write("                    <td></td> \n");
      out.write("                    <td></td> \n");
      out.write("                    <td></td> \n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"../Javascript/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"https://cdm.datatables.net/1.10.15/js/jquery.dataTables.min.js\" ></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            \n");
      out.write("            var tabla = $('#tablahistorial').DataTable({\n");
      out.write("               ajax:{\n");
      out.write("                   method: \"POST\",\n");
      out.write("                   url: \"listarhistorial\",\n");
      out.write("                  datasource: \"datos\"       \n");
      out.write("               },\n");
      out.write("               colmns{\n");
      out.write("                   {data: \"usuario\"},\n");
      out.write("                   {data: \"accion\"},\n");
      out.write("                   {data:\"descripcion\"},\n");
      out.write("                   {data:\"fecha\"}             \n");
      out.write("               }              \n");
      out.write("            }),      \n");
      out.write("        });\n");
      out.write("        </script>\n");
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
