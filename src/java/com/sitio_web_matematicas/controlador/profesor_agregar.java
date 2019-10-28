/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sitio_web_matematicas.controlador;

import com.sitio_ludico.servicios.Exception_Exception;
import com.sitio_web_matematicas.modelo.Profesor_servicios;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hp
 */
public class profesor_agregar extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession  objsesion = request.getSession(false);
            String usuario = (String)objsesion.getAttribute("usuario");
            Profesor_servicios obj = new Profesor_servicios();
            String nombre = request.getParameter("txtnombre");
            String apellido = request.getParameter("txtapellido");
            String cedula = request.getParameter("txtcedula");
            String user = request.getParameter("txtusuario");
            String contra = request.getParameter("txtcontra");
            String mensaje = obj.registroUsuarioProfesor(nombre, apellido, cedula, user, contra,usuario);
            response.sendRedirect("Admin/Gestion_profesor.jsp");
        } catch (Exception_Exception | IOException ex) {
            Logger.getLogger(profesor_agregar.class.getName()).log(Level.SEVERE, null, ex);
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
