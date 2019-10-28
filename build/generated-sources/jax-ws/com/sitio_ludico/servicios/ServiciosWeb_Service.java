
package com.sitio_ludico.servicios;

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
@WebServiceClient(name = "Servicios_web", targetNamespace = "http://Servicios/", wsdlLocation = "http://localhost:8080/Servicios_sistema_ludico/Servicios_web?wsdl")
public class ServiciosWeb_Service
    extends Service
{

    private final static URL SERVICIOSWEB_WSDL_LOCATION;
    private final static WebServiceException SERVICIOSWEB_EXCEPTION;
    private final static QName SERVICIOSWEB_QNAME = new QName("http://Servicios/", "Servicios_web");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Servicios_sistema_ludico/Servicios_web?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOSWEB_WSDL_LOCATION = url;
        SERVICIOSWEB_EXCEPTION = e;
    }

    public ServiciosWeb_Service() {
        super(__getWsdlLocation(), SERVICIOSWEB_QNAME);
    }

    public ServiciosWeb_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOSWEB_QNAME, features);
    }

    public ServiciosWeb_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOSWEB_QNAME);
    }

    public ServiciosWeb_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOSWEB_QNAME, features);
    }

    public ServiciosWeb_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiciosWeb_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiciosWeb
     */
    @WebEndpoint(name = "Servicios_webPort")
    public ServiciosWeb getServiciosWebPort() {
        return super.getPort(new QName("http://Servicios/", "Servicios_webPort"), ServiciosWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiciosWeb
     */
    @WebEndpoint(name = "Servicios_webPort")
    public ServiciosWeb getServiciosWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicios/", "Servicios_webPort"), ServiciosWeb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOSWEB_EXCEPTION!= null) {
            throw SERVICIOSWEB_EXCEPTION;
        }
        return SERVICIOSWEB_WSDL_LOCATION;
    }

}