package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Vista_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 System.setProperty("java.awt.headless", "false");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"../Javascript/Validar_campos.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/estiloslogin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/galeria.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"form-presentacion\"><center><label id=\"portada\">Bienvenidos a Juegos Matematicos.com</label></center></div>\n");
      out.write("        <div class=\"slider\">\n");
      out.write("            <ul>\n");
      out.write("                <li><img src=\"imagenes_login/sumas-restas.png\"></li>\n");
      out.write("                <li><img src=\"imagenes_login/imagengaleria2.png\"></li>\n");
      out.write("                <li><img src=\"imagenes_login/imagengaleria3.png\"></li>\n");
      out.write("                <li><img src=\"imagenes_login/imagengaleria4.jpg\"></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"contenedor1\">\n");
      out.write("            <div id=\"form-titulo\"><center><label id=\"Titulo\">Acceder al sistema</label></center></div>\n");
      out.write("            <form id=\"form_inicio\" action=\"../logeo\" method=\"Post\">\n");
      out.write("                <img src=\"imagenes_login/iconmonstr-user-20-64.png\" alt=\"\"/>\n");
      out.write("                <input type=\"text\" name=\"txtusuario\"  id=\"user\" placeholder=\"ingrese su usuario\"/>\n");
      out.write("                <hr>\n");
      out.write("                <br>\n");
      out.write("                <img src=\"imagenes_login/iconmonstr-password-10-64.png\" alt=\"\"/>\n");
      out.write("                <input type=\"password\" name=\"txtcontra\" id=\"pass\" placeholder=\"ingrese su contraseña\"/>\n");
      out.write("                <hr>\n");
      out.write("                <input type=\"button\" value=\"Entrar\"  id=\"btniniciar\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
