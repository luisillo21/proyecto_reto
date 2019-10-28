                                                                                                                                                                                              
import com.sitio_ludico.servicios.Exception_Exception;
import com.sitio_web_matematicas.listas.Alumno;




/**
 *
 * @author hp
 */
public class Estudiante_servicios {

    public Estudiante_servicios() {
    }

    public String registroUsuarioAlumno(java.lang.String nombre, java.lang.String apellido, java.lang.String cedula, java.lang.String usuario, java.lang.String pass, int curso, java.lang.String usuarioIng) throws Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.registroUsuarioAlumno(nombre, apellido, cedula, usuario, pass, curso, usuarioIng);
    }

    public String actualizarAlumno(java.lang.String nombre, java.lang.String apellido, java.lang.String cedula, int curso, java.lang.String usuario, java.lang.String contrasenia) throws Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.actualizarAlumno(nombre, apellido, cedula, curso, usuario, contrasenia);
    }

    public java.util.List<com.sitio_ludico.servicios.ResultadosAlumnos> listarAlumnos(java.lang.String usuario) throws Exception_Exception {
        com.sitio_ludico.servicios.ServiciosWeb_Service service = new com.sitio_ludico.servicios.ServiciosWeb_Service();
        com.sitio_ludico.servicios.ServiciosWeb port = service.getServiciosWebPort();
        return port.listarAlumnos(usuario);
    }

    public java.util.List<com.sitio_web_matematicas.listas.ListaAlumnos> informacionAlumnos() throws com.sitio_web_matematicas.listas.Exception_Exception {
        com.sitio_web_matematicas.listas.ListasSistema_Service service = new com.sitio_web_matematicas.listas.ListasSistema_Service();
        com.sitio_web_matematicas.listas.ListasSistema port = service.getListasSistemaPort();
        return port.informacionAlumnos();
    }

    public Alumno infoAlumno(java.lang.String usuario) throws com.sitio_web_matematicas.listas.Exception_Exception {
        com.sitio_web_matematicas.listas.ListasSistema_Service service = new com.sitio_web_matematicas.listas.ListasSistema_Service();
        com.sitio_web_matematicas.listas.ListasSistema port = service.getListasSistemaPort();
        return port.infoAlumno(usuario);
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
