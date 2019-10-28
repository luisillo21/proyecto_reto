
package com.sitio_ludico.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agregar_pregunta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agregar_pregunta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre_juego" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pregunta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resouesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario_ing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agregar_pregunta", propOrder = {
    "nombreJuego",
    "pregunta",
    "resouesta",
    "usuarioIng"
})
public class AgregarPregunta {

    @XmlElement(name = "nombre_juego")
    protected String nombreJuego;
    protected String pregunta;
    protected String resouesta;
    @XmlElement(name = "usuario_ing")
    protected String usuarioIng;

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

    /**
     * Obtiene el valor de la propiedad pregunta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Define el valor de la propiedad pregunta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPregunta(String value) {
        this.pregunta = value;
    }

    /**
     * Obtiene el valor de la propiedad resouesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResouesta() {
        return resouesta;
    }

    /**
     * Define el valor de la propiedad resouesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResouesta(String value) {
        this.resouesta = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioIng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioIng() {
        return usuarioIng;
    }

    /**
     * Define el valor de la propiedad usuarioIng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioIng(String value) {
        this.usuarioIng = value;
    }

}
