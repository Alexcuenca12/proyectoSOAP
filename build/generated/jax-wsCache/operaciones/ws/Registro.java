
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RepContra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registro", propOrder = {
    "usuario",
    "contra",
    "repContra",
    "saldo"
})
public class Registro {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Contra")
    protected String contra;
    @XmlElement(name = "RepContra")
    protected String repContra;
    @XmlElement(name = "Saldo")
    protected double saldo;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContra() {
        return contra;
    }

    /**
     * Define el valor de la propiedad contra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContra(String value) {
        this.contra = value;
    }

    /**
     * Obtiene el valor de la propiedad repContra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepContra() {
        return repContra;
    }

    /**
     * Define el valor de la propiedad repContra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepContra(String value) {
        this.repContra = value;
    }

    /**
     * Obtiene el valor de la propiedad saldo.
     * 
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Define el valor de la propiedad saldo.
     * 
     */
    public void setSaldo(double value) {
        this.saldo = value;
    }

}
