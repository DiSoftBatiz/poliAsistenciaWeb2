
package serviciosWebAlumno;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "alumno", targetNamespace = "http://servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Alumno {


    /**
     * 
     * @param idPer
     * @return
     *     returns java.util.List<serviciosWebAlumno.StringArray>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "horarioAlumno", targetNamespace = "http://servicios/", className = "serviciosWebAlumno.HorarioAlumno")
    @ResponseWrapper(localName = "horarioAlumnoResponse", targetNamespace = "http://servicios/", className = "serviciosWebAlumno.HorarioAlumnoResponse")
    @Action(input = "http://servicios/alumno/horarioAlumnoRequest", output = "http://servicios/alumno/horarioAlumnoResponse")
    public List<StringArray> horarioAlumno(
        @WebParam(name = "idPer", targetNamespace = "")
        String idPer);

    /**
     * 
     * @param idPer
     * @param mes
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "asistenciaInd", targetNamespace = "http://servicios/", className = "serviciosWebAlumno.AsistenciaInd")
    @ResponseWrapper(localName = "asistenciaIndResponse", targetNamespace = "http://servicios/", className = "serviciosWebAlumno.AsistenciaIndResponse")
    @Action(input = "http://servicios/alumno/asistenciaIndRequest", output = "http://servicios/alumno/asistenciaIndResponse")
    public List<Object> asistenciaInd(
        @WebParam(name = "idPer", targetNamespace = "")
        String idPer,
        @WebParam(name = "mes", targetNamespace = "")
        String mes);

    /**
     * 
     * @param tipoNotificacion
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerNotificaciones", targetNamespace = "http://servicios/", className = "serviciosWebAlumno.ObtenerNotificaciones")
    @ResponseWrapper(localName = "obtenerNotificacionesResponse", targetNamespace = "http://servicios/", className = "serviciosWebAlumno.ObtenerNotificacionesResponse")
    @Action(input = "http://servicios/alumno/obtenerNotificacionesRequest", output = "http://servicios/alumno/obtenerNotificacionesResponse")
    public String obtenerNotificaciones(
        @WebParam(name = "tipoNotificacion", targetNamespace = "")
        int tipoNotificacion);

    /**
     * 
     * @param diaSemana
     * @param boleta
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerHorarioDia", targetNamespace = "http://servicios/", className = "serviciosWebAlumno.ObtenerHorarioDia")
    @ResponseWrapper(localName = "obtenerHorarioDiaResponse", targetNamespace = "http://servicios/", className = "serviciosWebAlumno.ObtenerHorarioDiaResponse")
    @Action(input = "http://servicios/alumno/obtenerHorarioDiaRequest", output = "http://servicios/alumno/obtenerHorarioDiaResponse")
    public String obtenerHorarioDia(
        @WebParam(name = "boleta", targetNamespace = "")
        String boleta,
        @WebParam(name = "diaSemana", targetNamespace = "")
        int diaSemana);

}
