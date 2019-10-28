
package com.sitio_web_matematicas.listas;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Listas_sistema", targetNamespace = "http://Servicios/", wsdlLocation = "http://localhost:8080/Servicios_sistema_ludico/Listas_sistema?wsdl")
public class ListasSistema_Service
    extends Service
{

    private final static URL LISTASSISTEMA_WSDL_LOCATION;
    private final static WebServiceException LISTASSISTEMA_EXCEPTION;
    private final static QName LISTASSISTEMA_QNAME = new QName("http://Servicios/", "Listas_sistema");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Servicios_sistema_ludico/Listas_sistema?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LISTASSISTEMA_WSDL_LOCATION = url;
        LISTASSISTEMA_EXCEPTION = e;
    }

    public ListasSistema_Service() {
        super(__getWsdlLocation(), LISTASSISTEMA_QNAME);
    }

    public ListasSistema_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LISTASSISTEMA_QNAME, features);
    }

    public ListasSistema_Service(URL wsdlLocation) {
        super(wsdlLocation, LISTASSISTEMA_QNAME);
    }

    public ListasSistema_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LISTASSISTEMA_QNAME, features);
    }

    public ListasSistema_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ListasSistema_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ListasSistema
     */
    @WebEndpoint(name = "Listas_sistemaPort")
    public ListasSistema getListasSistemaPort() {
        return super.getPort(new QName("http://Servicios/", "Listas_sistemaPort"), ListasSistema.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ListasSistema
     */
    @WebEndpoint(name = "Listas_sistemaPort")
    public ListasSistema getListasSistemaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicios/", "Listas_sistemaPort"), ListasSistema.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LISTASSISTEMA_EXCEPTION!= null) {
            throw LISTASSISTEMA_EXCEPTION;
        }
        return LISTASSISTEMA_WSDL_LOCATION;
    }

}