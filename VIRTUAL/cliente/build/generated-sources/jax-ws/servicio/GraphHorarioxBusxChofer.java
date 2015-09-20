
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para graphHorarioxBusxChofer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="graphHorarioxBusxChofer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idbus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idchofer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graphHorarioxBusxChofer", propOrder = {
    "idbus",
    "idchofer"
})
public class GraphHorarioxBusxChofer {

    protected String idbus;
    protected String idchofer;

    /**
     * Obtiene el valor de la propiedad idbus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdbus() {
        return idbus;
    }

    /**
     * Define el valor de la propiedad idbus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdbus(String value) {
        this.idbus = value;
    }

    /**
     * Obtiene el valor de la propiedad idchofer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdchofer() {
        return idchofer;
    }

    /**
     * Define el valor de la propiedad idchofer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdchofer(String value) {
        this.idchofer = value;
    }

}
