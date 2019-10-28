/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sitio_web_matematicas.controlador;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.sitio_web_matematicas.listas.Exception_Exception;
import com.sitio_web_matematicas.listas.GenrHistorial;
import com.sitio_web_matematicas.modelo.Sistema_servicios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class listarhistorial extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        try {
            processRequest(request, response);
            Sistema_servicios obj = new Sistema_servicios();
            List<GenrHistorial> datos = obj.historial();
            com.google.gson.JsonObject gson = new JsonObject();
            JsonArray array = new JsonArray();
            for(GenrHistorial h : datos) {
                JsonObject iten = new JsonObject();
                iten.addProperty("usuario", h.getUsuario());
                iten.addProperty("accion", h.getAccion());
                iten.addProperty("descripcion", h.getDescripcion());
                iten.addProperty("fecha", h.getFecha());
                array.add(iten);
            }
            gson.add("datos", array);
        } catch (Exception_Exception ex) {
            Logger.getLogger(listarhistorial.class.getName()).log(Level.SEVERE, null, ex);
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
