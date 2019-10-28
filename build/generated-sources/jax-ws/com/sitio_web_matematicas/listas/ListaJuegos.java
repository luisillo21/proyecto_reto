
package com.sitio_web_matematicas.listas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listaJuegos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaJuegos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad_de_preguntas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "listaJuegos", propOrder = {
    "cantidadDePreguntas",
    "nombreJuego"
})
public class ListaJuegos {

    @XmlElement(name = "cantidad_de_preguntas")
    protected int cantidadDePreguntas;
    @XmlElement(name = "nombre_juego")
    protected String nombreJuego;

    /**
     * Obtiene el valor de la propiedad cantidadDePreguntas.
     * 
     */
    public int getCantidadDePreguntas() {
        return cantidadDePreguntas;
    }

    /**
     * Define el valor de la propiedad cantidadDePreguntas.
     * 
     */
    public void setCantidadDePreguntas(int value) {
        this.cantidadDePreguntas = value;
    }

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
