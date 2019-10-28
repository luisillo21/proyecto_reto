/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sitio_web_matematicas.controlador;

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

/**
 *
 * @author hp
 */
public class Logeo extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try {
            processRequest(request, response);
            Sistema_servicios validar = new Sistema_servicios();
            String usuario = request.getParameter("txtusuario");
            String contra = request.getParameter("txtcontra");
            
            
            if(validar.loginSistema(usuario, contra).equals("administrador")){
                HttpSession   objsesion = request.getSession(true);
                objsesion.setAttribute("usuario", usuario);
                
            response.sendRedirect("Admin/Vista_administrador.jsp");
            }else if(validar.loginSistema(usuario, contra).equals("profesor")){
                HttpSession   objsesion = request.getSession(true);
                objsesion.setAttribute("usuario", usuario);
                response.sendRedirect("Profesor/Vista_profesor.jsp");
            }
            else if(validar.loginSistema(usuario, contra).equals("alumno")){
                HttpSession   objsesion = request.getSession(true);
                objsesion.setAttribute("usuario", usuario);
                response.sendRedirect("Estudiante/Vista_estudiante.jsp");
            }
            else{
                response.sendRedirect("Login/Vista_login.jsp");
            }
        } catch (Exception ex) {
            Logger.getLogger(Logeo.class.getName()).log(Level.SEVERE, null, ex);
        }
                }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
