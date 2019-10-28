package com.sitio_web_matematicas.modelo;

import com.sitio_ludico.servicios.Exception_Exception;
import com.sitio_ludico.servicios.ListaPreguntas;



public class Sistema_servicios {

    public Sistema_servicios() {
    }

    public String actualizarDatos(java.lang.String nombre, java.lang.String apellido, java.lang.String cedula, java.lang.String usuario, java.lang.String pass) throws Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.actualizarDatos(nombre, apellido, cedula, usuario, pass);
    }

    public String calcularResultado(java.lang.String usuario, java.lang.String nombreJuego) throws Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.calcularResultado(usuario, nombreJuego);
    }

    public String loginSistema(java.lang.String usuario, java.lang.String pass) throws Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.loginSistema(usuario, pass);
    }

    public String guardarNotas(java.lang.String nombreUsuario, java.lang.String nombreJuego, java.lang.String pregunta, java.lang.String respuesta) throws Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.guardarNotas(nombreUsuario, nombreJuego, pregunta, respuesta);
    }

    public String agregarPregunta(java.lang.String nombreJuego, java.lang.String pregunta, java.lang.String resouesta, java.lang.String usuarioIng) throws Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.agregarPregunta(nombreJuego, pregunta, resouesta, usuarioIng);
    }

    public java.util.List<com.sitio_web_matematicas.listas.GenrHistorial> historial() throws com.sitio_web_matematicas.listas.Exception_Exception {
        com.sitio_web_matematicas.listas.ListasSistema_Service service = new com.sitio_web_matematicas.listas.ListasSistema_Service();
        com.sitio_web_matematicas.listas.ListasSistema port = service.getListasSistemaPort();
        return port.historial();
    }

    public java.util.List<com.sitio_web_matematicas.listas.ListaJuegos> listarJuegos() throws com.sitio_web_matematicas.listas.Exception_Exception {
        com.sitio_web_matematicas.listas.ListasSistema_Service service = new com.sitio_web_matematicas.listas.ListasSistema_Service();
        com.sitio_web_matematicas.listas.ListasSistema port = service.getListasSistemaPort();
        return port.listarJuegos();
    }

    public java.util.List<com.sitio_web_matematicas.listas.ListaPreguntas> listadoPreguntas(java.lang.String nombreJuego) throws com.sitio_web_matematicas.listas.Exception_Exception {
        com.sitio_web_matematicas.listas.ListasSistema_Service service = new com.sitio_web_matematicas.listas.ListasSistema_Service();
        com.sitio_web_matematicas.listas.ListasSistema port = service.getListasSistemaPort();
        return port.listadoPreguntas(nombreJuego);
    }

    public String actualizar(java.lang.String pregunta, java.lang.String respuesta, boolean estado) throws Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.actualizar(pregunta, respuesta, estado);
    }

    public ListaPreguntas traerPregunta(java.lang.String pregunta) throws Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.traerPregunta(pregunta);
    }

    public String eliminarPregunta(java.lang.String pregunta, java.lang.String usuarioIng) throws Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.eliminarPregunta(pregunta, usuarioIng);
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
}
