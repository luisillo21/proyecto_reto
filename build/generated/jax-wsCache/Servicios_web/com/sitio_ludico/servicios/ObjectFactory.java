
package com.sitio_ludico.servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sitio_ludico.servicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Actualizar_QNAME = new QName("http://Servicios/", "Actualizar");
    private final static QName _ActualizarResponse_QNAME = new QName("http://Servicios/", "ActualizarResponse");
    private final static QName _ActualizarDatos_QNAME = new QName("http://Servicios/", "Actualizar_datos");
    private final static QName _ActualizarDatosResponse_QNAME = new QName("http://Servicios/", "Actualizar_datosResponse");
    private final static QName _AgregarPregunta_QNAME = new QName("http://Servicios/", "Agregar_pregunta");
    private final static QName _AgregarPreguntaResponse_QNAME = new QName("http://Servicios/", "Agregar_preguntaResponse");
    private final static QName _CalcularResultado_QNAME = new QName("http://Servicios/", "Calcular_resultado");
    private final static QName _CalcularResultadoResponse_QNAME = new QName("http://Servicios/", "Calcular_resultadoResponse");
    private final static QName _EliminarAlumno_QNAME = new QName("http://Servicios/", "Eliminar_alumno");
    private final static QName _EliminarAlumnoResponse_QNAME = new QName("http://Servicios/", "Eliminar_alumnoResponse");
    private final static QName _Exception_QNAME = new QName("http://Servicios/", "Exception");
    private final static QName _LoginSistema_QNAME = new QName("http://Servicios/", "Login_Sistema");
    private final static QName _LoginSistemaResponse_QNAME = new QName("http://Servicios/", "Login_SistemaResponse");
    private final static QName _RegistroUsuarioAdministrador_QNAME = new QName("http://Servicios/", "Registro_usuario_administrador");
    private final static QName _RegistroUsuarioAdministradorResponse_QNAME = new QName("http://Servicios/", "Registro_usuario_administradorResponse");
    private final static QName _RegistroUsuarioAlumno_QNAME = new QName("http://Servicios/", "Registro_usuario_alumno");
    private final static QName _RegistroUsuarioAlumnoResponse_QNAME = new QName("http://Servicios/", "Registro_usuario_alumnoResponse");
    private final static QName _RegistroUsuarioProfesor_QNAME = new QName("http://Servicios/", "Registro_usuario_profesor");
    private final static QName _RegistroUsuarioProfesorResponse_QNAME = new QName("http://Servicios/", "Registro_usuario_profesorResponse");
    private final static QName _ActualizarAlumno_QNAME = new QName("http://Servicios/", "actualizar_alumno");
    private final static QName _ActualizarAlumnoResponse_QNAME = new QName("http://Servicios/", "actualizar_alumnoResponse");
    private final static QName _EliminarPregunta_QNAME = new QName("http://Servicios/", "eliminar_pregunta");
    private final static QName _EliminarPreguntaResponse_QNAME = new QName("http://Servicios/", "eliminar_preguntaResponse");
    private final static QName _GuardarNotas_QNAME = new QName("http://Servicios/", "guardar_notas");
    private final static QName _GuardarNotasResponse_QNAME = new QName("http://Servicios/", "guardar_notasResponse");
    private final static QName _Hello_QNAME = new QName("http://Servicios/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://Servicios/", "helloResponse");
    private final static QName _ListarAlumnos_QNAME = new QName("http://Servicios/", "listar_alumnos");
    private final static QName _ListarAlumnosResponse_QNAME = new QName("http://Servicios/", "listar_alumnosResponse");
    private final static QName _TraerPregunta_QNAME = new QName("http://Servicios/", "traer_pregunta");
    private final static QName _TraerPreguntaResponse_QNAME = new QName("http://Servicios/", "traer_preguntaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sitio_ludico.servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link ActualizarDatos }
     * 
     */
    public ActualizarDatos createActualizarDatos() {
        return new ActualizarDatos();
    }

    /**
     * Create an instance of {@link ActualizarDatosResponse }
     * 
     */
    public ActualizarDatosResponse createActualizarDatosResponse() {
        return new ActualizarDatosResponse();
    }

    /**
     * Create an instance of {@link AgregarPregunta }
     * 
     */
    public AgregarPregunta createAgregarPregunta() {
        return new AgregarPregunta();
    }

    /**
     * Create an instance of {@link AgregarPreguntaResponse }
     * 
     */
    public AgregarPreguntaResponse createAgregarPreguntaResponse() {
        return new AgregarPreguntaResponse();
    }

    /**
     * Create an instance of {@link CalcularResultado }
     * 
     */
    public CalcularResultado createCalcularResultado() {
        return new CalcularResultado();
    }

    /**
     * Create an instance of {@link CalcularResultadoResponse }
     * 
     */
    public CalcularResultadoResponse createCalcularResultadoResponse() {
        return new CalcularResultadoResponse();
    }

    /**
     * Create an instance of {@link EliminarAlumno }
     * 
     */
    public EliminarAlumno createEliminarAlumno() {
        return new EliminarAlumno();
    }

    /**
     * Create an instance of {@link EliminarAlumnoResponse }
     * 
     */
    public EliminarAlumnoResponse createEliminarAlumnoResponse() {
        return new EliminarAlumnoResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link LoginSistema }
     * 
     */
    public LoginSistema createLoginSistema() {
        return new LoginSistema();
    }

    /**
     * Create an instance of {@link LoginSistemaResponse }
     * 
     */
    public LoginSistemaResponse createLoginSistemaResponse() {
        return new LoginSistemaResponse();
    }

    /**
     * Create an instance of {@link RegistroUsuarioAdministrador }
     * 
     */
    public RegistroUsuarioAdministrador createRegistroUsuarioAdministrador() {
        return new RegistroUsuarioAdministrador();
    }

    /**
     * Create an instance of {@link RegistroUsuarioAdministradorResponse }
     * 
     */
    public RegistroUsuarioAdministradorResponse createRegistroUsuarioAdministradorResponse() {
        return new RegistroUsuarioAdministradorResponse();
    }

    /**
     * Create an instance of {@link RegistroUsuarioAlumno }
     * 
     */
    public RegistroUsuarioAlumno createRegistroUsuarioAlumno() {
        return new RegistroUsuarioAlumno();
    }

    /**
     * Create an instance of {@link RegistroUsuarioAlumnoResponse }
     * 
     */
    public RegistroUsuarioAlumnoResponse createRegistroUsuarioAlumnoResponse() {
        return new RegistroUsuarioAlumnoResponse();
    }

    /**
     * Create an instance of {@link RegistroUsuarioProfesor }
     * 
     */
    public RegistroUsuarioProfesor createRegistroUsuarioProfesor() {
        return new RegistroUsuarioProfesor();
    }

    /**
     * Create an instance of {@link RegistroUsuarioProfesorResponse }
     * 
     */
    public RegistroUsuarioProfesorResponse createRegistroUsuarioProfesorResponse() {
        return new RegistroUsuarioProfesorResponse();
    }

    /**
     * Create an instance of {@link ActualizarAlumno }
     * 
     */
    public ActualizarAlumno createActualizarAlumno() {
        return new ActualizarAlumno();
    }

    /**
     * Create an instance of {@link ActualizarAlumnoResponse }
     * 
     */
    public ActualizarAlumnoResponse createActualizarAlumnoResponse() {
        return new ActualizarAlumnoResponse();
    }

    /**
     * Create an instance of {@link EliminarPregunta }
     * 
     */
    public EliminarPregunta createEliminarPregunta() {
        return new EliminarPregunta();
    }

    /**
     * Create an instance of {@link EliminarPreguntaResponse }
     * 
     */
    public EliminarPreguntaResponse createEliminarPreguntaResponse() {
        return new EliminarPreguntaResponse();
    }

    /**
     * Create an instance of {@link GuardarNotas }
     * 
     */
    public GuardarNotas createGuardarNotas() {
        return new GuardarNotas();
    }

    /**
     * Create an instance of {@link GuardarNotasResponse }
     * 
     */
    public GuardarNotasResponse createGuardarNotasResponse() {
        return new GuardarNotasResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ListarAlumnos }
     * 
     */
    public ListarAlumnos createListarAlumnos() {
        return new ListarAlumnos();
    }

    /**
     * Create an instance of {@link ListarAlumnosResponse }
     * 
     */
    public ListarAlumnosResponse createListarAlumnosResponse() {
        return new ListarAlumnosResponse();
    }

    /**
     * Create an instance of {@link TraerPregunta }
     * 
     */
    public TraerPregunta createTraerPregunta() {
        return new TraerPregunta();
    }

    /**
     * Create an instance of {@link TraerPreguntaResponse }
     * 
     */
    public TraerPreguntaResponse createTraerPreguntaResponse() {
        return new TraerPreguntaResponse();
    }

    /**
     * Create an instance of {@link ResultadosAlumnos }
     * 
     */
    public ResultadosAlumnos createResultadosAlumnos() {
        return new ResultadosAlumnos();
    }

    /**
     * Create an instance of {@link ListaPreguntas }
     * 
     */
    public ListaPreguntas createListaPreguntas() {
        return new ListaPreguntas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Actualizar")
    public JAXBElement<Actualizar> createActualizar(Actualizar value) {
        return new JAXBElement<Actualizar>(_Actualizar_QNAME, Actualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "ActualizarResponse")
    public JAXBElement<ActualizarResponse> createActualizarResponse(ActualizarResponse value) {
        return new JAXBElement<ActualizarResponse>(_ActualizarResponse_QNAME, ActualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarDatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Actualizar_datos")
    public JAXBElement<ActualizarDatos> createActualizarDatos(ActualizarDatos value) {
        return new JAXBElement<ActualizarDatos>(_ActualizarDatos_QNAME, ActualizarDatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarDatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Actualizar_datosResponse")
    public JAXBElement<ActualizarDatosResponse> createActualizarDatosResponse(ActualizarDatosResponse value) {
        return new JAXBElement<ActualizarDatosResponse>(_ActualizarDatosResponse_QNAME, ActualizarDatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarPregunta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Agregar_pregunta")
    public JAXBElement<AgregarPregunta> createAgregarPregunta(AgregarPregunta value) {
        return new JAXBElement<AgregarPregunta>(_AgregarPregunta_QNAME, AgregarPregunta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarPreguntaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Agregar_preguntaResponse")
    public JAXBElement<AgregarPreguntaResponse> createAgregarPreguntaResponse(AgregarPreguntaResponse value) {
        return new JAXBElement<AgregarPreguntaResponse>(_AgregarPreguntaResponse_QNAME, AgregarPreguntaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Calcular_resultado")
    public JAXBElement<CalcularResultado> createCalcularResultado(CalcularResultado value) {
        return new JAXBElement<CalcularResultado>(_CalcularResultado_QNAME, CalcularResultado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularResultadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Calcular_resultadoResponse")
    public JAXBElement<CalcularResultadoResponse> createCalcularResultadoResponse(CalcularResultadoResponse value) {
        return new JAXBElement<CalcularResultadoResponse>(_CalcularResultadoResponse_QNAME, CalcularResultadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_alumno")
    public JAXBElement<EliminarAlumno> createEliminarAlumno(EliminarAlumno value) {
        return new JAXBElement<EliminarAlumno>(_EliminarAlumno_QNAME, EliminarAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_alumnoResponse")
    public JAXBElement<EliminarAlumnoResponse> createEliminarAlumnoResponse(EliminarAlumnoResponse value) {
        return new JAXBElement<EliminarAlumnoResponse>(_EliminarAlumnoResponse_QNAME, EliminarAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Login_Sistema")
    public JAXBElement<LoginSistema> createLoginSistema(LoginSistema value) {
        return new JAXBElement<LoginSistema>(_LoginSistema_QNAME, LoginSistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginSistemaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Login_SistemaResponse")
    public JAXBElement<LoginSistemaResponse> createLoginSistemaResponse(LoginSistemaResponse value) {
        return new JAXBElement<LoginSistemaResponse>(_LoginSistemaResponse_QNAME, LoginSistemaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroUsuarioAdministrador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Registro_usuario_administrador")
    public JAXBElement<RegistroUsuarioAdministrador> createRegistroUsuarioAdministrador(RegistroUsuarioAdministrador value) {
        return new JAXBElement<RegistroUsuarioAdministrador>(_RegistroUsuarioAdministrador_QNAME, RegistroUsuarioAdministrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroUsuarioAdministradorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Registro_usuario_administradorResponse")
    public JAXBElement<RegistroUsuarioAdministradorResponse> createRegistroUsuarioAdministradorResponse(RegistroUsuarioAdministradorResponse value) {
        return new JAXBElement<RegistroUsuarioAdministradorResponse>(_RegistroUsuarioAdministradorResponse_QNAME, RegistroUsuarioAdministradorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroUsuarioAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Registro_usuario_alumno")
    public JAXBElement<RegistroUsuarioAlumno> createRegistroUsuarioAlumno(RegistroUsuarioAlumno value) {
        return new JAXBElement<RegistroUsuarioAlumno>(_RegistroUsuarioAlumno_QNAME, RegistroUsuarioAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroUsuarioAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Registro_usuario_alumnoResponse")
    public JAXBElement<RegistroUsuarioAlumnoResponse> createRegistroUsuarioAlumnoResponse(RegistroUsuarioAlumnoResponse value) {
        return new JAXBElement<RegistroUsuarioAlumnoResponse>(_RegistroUsuarioAlumnoResponse_QNAME, RegistroUsuarioAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroUsuarioProfesor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Registro_usuario_profesor")
    public JAXBElement<RegistroUsuarioProfesor> createRegistroUsuarioProfesor(RegistroUsuarioProfesor value) {
        return new JAXBElement<RegistroUsuarioProfesor>(_RegistroUsuarioProfesor_QNAME, RegistroUsuarioProfesor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroUsuarioProfesorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Registro_usuario_profesorResponse")
    public JAXBElement<RegistroUsuarioProfesorResponse> createRegistroUsuarioProfesorResponse(RegistroUsuarioProfesorResponse value) {
        return new JAXBElement<RegistroUsuarioProfesorResponse>(_RegistroUsuarioProfesorResponse_QNAME, RegistroUsuarioProfesorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "actualizar_alumno")
    public JAXBElement<ActualizarAlumno> createActualizarAlumno(ActualizarAlumno value) {
        return new JAXBElement<ActualizarAlumno>(_ActualizarAlumno_QNAME, ActualizarAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "actualizar_alumnoResponse")
    public JAXBElement<ActualizarAlumnoResponse> createActualizarAlumnoResponse(ActualizarAlumnoResponse value) {
        return new JAXBElement<ActualizarAlumnoResponse>(_ActualizarAlumnoResponse_QNAME, ActualizarAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPregunta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "eliminar_pregunta")
    public JAXBElement<EliminarPregunta> createEliminarPregunta(EliminarPregunta value) {
        return new JAXBElement<EliminarPregunta>(_EliminarPregunta_QNAME, EliminarPregunta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPreguntaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "eliminar_preguntaResponse")
    public JAXBElement<EliminarPreguntaResponse> createEliminarPreguntaResponse(EliminarPreguntaResponse value) {
        return new JAXBElement<EliminarPreguntaResponse>(_EliminarPreguntaResponse_QNAME, EliminarPreguntaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarNotas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "guardar_notas")
    public JAXBElement<GuardarNotas> createGuardarNotas(GuardarNotas value) {
        return new JAXBElement<GuardarNotas>(_GuardarNotas_QNAME, GuardarNotas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarNotasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "guardar_notasResponse")
    public JAXBElement<GuardarNotasResponse> createGuardarNotasResponse(GuardarNotasResponse value) {
        return new JAXBElement<GuardarNotasResponse>(_GuardarNotasResponse_QNAME, GuardarNotasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlumnos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "listar_alumnos")
    public JAXBElement<ListarAlumnos> createListarAlumnos(ListarAlumnos value) {
        return new JAXBElement<ListarAlumnos>(_ListarAlumnos_QNAME, ListarAlumnos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlumnosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "listar_alumnosResponse")
    public JAXBElement<ListarAlumnosResponse> createListarAlumnosResponse(ListarAlumnosResponse value) {
        return new JAXBElement<ListarAlumnosResponse>(_ListarAlumnosResponse_QNAME, ListarAlumnosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerPregunta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "traer_pregunta")
    public JAXBElement<TraerPregunta> createTraerPregunta(TraerPregunta value) {
        return new JAXBElement<TraerPregunta>(_TraerPregunta_QNAME, TraerPregunta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerPreguntaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "traer_preguntaResponse")
    public JAXBElement<TraerPreguntaResponse> createTraerPreguntaResponse(TraerPreguntaResponse value) {
        return new JAXBElement<TraerPreguntaResponse>(_TraerPreguntaResponse_QNAME, TraerPreguntaResponse.class, null, value);
    }

}
