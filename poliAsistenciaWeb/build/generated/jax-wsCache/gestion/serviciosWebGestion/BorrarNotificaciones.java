
package serviciosWebGestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para borrarNotificaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="borrarNotificaciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idNotificacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borrarNotificaciones", propOrder = {
    "idNotificacion"
})
public class BorrarNotificaciones {

    protected int idNotificacion;

    /**
     * Obtiene el valor de la propiedad idNotificacion.
     * 
     */
    public int getIdNotificacion() {
        return idNotificacion;
    }

    /**
     * Define el valor de la propiedad idNotificacion.
     * 
     */
    public void setIdNotificacion(int value) {
        this.idNotificacion = value;
    }

}
