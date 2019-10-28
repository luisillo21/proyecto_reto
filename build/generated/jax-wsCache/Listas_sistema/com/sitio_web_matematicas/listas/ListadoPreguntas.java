
package com.sitio_web_matematicas.listas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Listado_preguntas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Listado_preguntas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre_juego" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Listado_preguntas", propOrder = {
    "nombreJuego"
})
public class ListadoPreguntas {

    @XmlElement(name = "nombre_juego")
    protected String nombreJuego;

    /**
     * Obtiene el valor de la propiedad nombreJuego.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreJuego() {
        return nombreJuego;
    }

    /**
     * Define el valor de la propiedad nombreJuego.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreJuego(String value) {
        this.nombreJuego = value;
    }

}
