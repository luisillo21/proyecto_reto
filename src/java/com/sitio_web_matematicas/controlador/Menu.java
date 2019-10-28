
package com.sitio_web_matematicas.controlador;

import com.sitio_web_matematicas.listas.Exception_Exception;
import com.sitio_web_matematicas.modelo.Sistema_servicios;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class Menu extends HttpServlet {
    //----------------------------------------------------
    //----------------------------------------------------
    String aggadmin ="Admin/Agregar_admin.jsp";
    String profesor = "Admin/Gestion_profesor.jsp";
    String Add_profesor="Admin/Agregar_profesor.jsp";
    String salir ="Login/Vista_login.jsp";
    String historia="Admin/Historial.jsp";
    String actualizar  ="Admin/Actualizar.jsp";
    String guia = "Admin/Vista_administrador.jsp";
    String juegos ="Admin/Lista_juegos.jsp";
    String acceso = "";
    String Editar_profesor = "Admin/Actualizar_profesores.jsp";
    String alumno ="Admin/Gestion_alumno.jsp";
    //----------------------------------------------------
    //----------------------------------------------------
    String preguntas ="Admin/Preguntas/Preguntas.jsp";
    String resta ="Admin/Preguntas/Preguntas_resta.jsp";
    String problemas="Admin/Preguntas/Problemas_basicos.jsp";
    String editar_p ="Admin/Preguntas/Editar_pregunta.jsp";
    
    //----------------------------------------------------
    //----------------------------------------------------
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    //----------------------------------------------------   
    //----------------------------------------------------
        String accion = request.getParameter("accion");
        String var = request.getParameter("p");
         //----------------------------------------------------
         //----------------------------------------------------
        if(accion.equals("cerrar")){
            HttpSession  objsesion = request.getSession(false);
            String usuario = (String)objsesion.getAttribute("usuario");
            objsesion.setAttribute("usuario","");
            acceso = salir;
            
        }else if(accion.equals("historial")){
            HttpSession  objsesion = request.getSession(false);
            String usuario = (String)objsesion.getAttribute("usuario");
            acceso =historia;
        
        }else if(accion.equals("actualizar")){
            acceso=actualizar;
        
        }else if(accion.equals("guiar")){
            acceso = guia;
        }else if(accion.equals("juegos")){
              acceso = juegos;
        }
        else if(accion.equals("profesor")){
            acceso = profesor;
        }
        else if(accion.equals("agregarprofe")){
           acceso = Add_profesor;
        }
        else if(accion.equals("agregaradmin")){
            acceso = aggadmin;
    //----------------------------------------------------
    //----------------------------------------------------
            
        }else if(accion.equals("listapreguntas")){
                request.setAttribute("nomj", request.getParameter("nomjuego"));
                acceso = preguntas;     
        }
        
        
           else if(accion.equals("eliminar_pregunta")){
            try {
                HttpSession  objsesion = request.getSession(false);
                Sistema_servicios obj = new Sistema_servicios();
                obj.eliminarPregunta(request.getParameter("pe"), (String)objsesion.getAttribute("usuario"));
                acceso = juegos;
            } //
            catch (com.sitio_ludico.servicios.Exception_Exception ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
           else if(accion.equals("editar_pregunta")){
               request.setAttribute("nomp", request.getParameter("p"));
               acceso = editar_p;         

        }        
    //----------------------------------------------------
    //----------------------------------------------------
        else if(accion.equals("editarprofe")){
            request.setAttribute("user_profesor",request.getParameter("id"));
            acceso=Editar_profesor;
            
        }else if(accion.equals("alumnos")){
            acceso = alumno;
        }
        
        RequestDispatcher distpacher = request.getRequestDispatcher(acceso);
        distpacher.forward(request, response);
               
        
        
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
          
            Sistema_servicios obj = new Sistema_servicios();
            String nombre = request.getParameter("txtnombre");
            String apellido = request.getParameter("txtapellido");
            String cedula = request.getParameter("txtcedula");
            String usuario = request.getParameter("txtusuario");
            String contra = request.getParameter("txtcontra");
            String mensaje = obj.actualizarDatos(nombre, apellido, cedula, usuario, contra);
                RequestDispatcher distpacher = request.getRequestDispatcher(actualizar);
                distpacher.forward(request, response);
            
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
