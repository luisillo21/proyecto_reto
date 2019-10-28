/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sitio_web_matematicas.modelo;

import com.sitio_web_matematicas.listas.Exception_Exception;
import com.sitio_web_matematicas.listas.Profesor;

/**
 *
 * @author hp
 */
public class Profesor_servicios {

    public java.util.List<com.sitio_web_matematicas.listas.ListaProfesor> listaProfesores() throws Exception_Exception {
        com.sitio_web_matematicas.listas.ListasSistema_Service service = new com.sitio_web_matematicas.listas.ListasSistema_Service();
        com.sitio_web_matematicas.listas.ListasSistema port = service.getListasSistemaPort();
        return port.listaProfesores();
    }

    public Profesor profesorInfo(java.lang.String usuario) throws Exception_Exception {
        com.sitio_web_matematicas.listas.ListasSistema_Service service = new com.sitio_web_matematicas.listas.ListasSistema_Service();
        com.sitio_web_matematicas.listas.ListasSistema port = service.getListasSistemaPort();
        return port.profesorInfo(usuario);
    }

    public String eliminarAlumno(java.lang.String cedula, java.lang.String usuarioIng) throws com.sitio_ludico.servicios.Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.eliminarAlumno(cedula, usuarioIng);
    }

    public String registroUsuarioProfesor(java.lang.String nombre, java.lang.String apellido, java.lang.String cedula, java.lang.String usuario, java.lang.String pass, java.lang.String usuarioIng) throws com.sitio_ludico.servicios.Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.registroUsuarioProfesor(nombre, apellido, cedula, usuario, pass, usuarioIng);
    }

    public String registroUsuarioAdministrador(java.lang.String nombre, java.lang.String apellido, java.lang.String cedula, java.lang.String usuario, java.lang.String pass, java.lang.String usuarioIng) throws com.sitio_ludico.servicios.Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.registroUsuarioAdministrador(nombre, apellido, cedula, usuario, pass, usuarioIng);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
