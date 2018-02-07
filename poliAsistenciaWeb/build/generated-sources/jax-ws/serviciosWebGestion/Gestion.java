
package serviciosWebGestion;

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
@WebService(name = "gestion", targetNamespace = "http://servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Gestion {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "alumnos", targetNamespace = "http://servicios/", className = "serviciosWebGestion.Alumnos")
    @ResponseWrapper(localName = "alumnosResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.AlumnosResponse")
    @Action(input = "http://servicios/gestion/alumnosRequest", output = "http://servicios/gestion/alumnosResponse")
    public String alumnos();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "grupos", targetNamespace = "http://servicios/", className = "serviciosWebGestion.Grupos")
    @ResponseWrapper(localName = "gruposResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.GruposResponse")
    @Action(input = "http://servicios/gestion/gruposRequest", output = "http://servicios/gestion/gruposResponse")
    public String grupos();

    /**
     * 
     * @param descripcion
     * @param titulo
     * @param urlImg
     * @param tipoNotificacion
     * @param url
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "guardarNotificaciones", targetNamespace = "http://servicios/", className = "serviciosWebGestion.GuardarNotificaciones")
    @ResponseWrapper(localName = "guardarNotificacionesResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.GuardarNotificacionesResponse")
    @Action(input = "http://servicios/gestion/guardarNotificacionesRequest", output = "http://servicios/gestion/guardarNotificacionesResponse")
    public boolean guardarNotificaciones(
        @WebParam(name = "tipoNotificacion", targetNamespace = "")
        int tipoNotificacion,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion,
        @WebParam(name = "url", targetNamespace = "")
        String url,
        @WebParam(name = "urlImg", targetNamespace = "")
        String urlImg);

    /**
     * 
     * @param mes
     * @param turno
     * @param dia
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "asistenciaTurnoPorDia", targetNamespace = "http://servicios/", className = "serviciosWebGestion.AsistenciaTurnoPorDia")
    @ResponseWrapper(localName = "asistenciaTurnoPorDiaResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.AsistenciaTurnoPorDiaResponse")
    @Action(input = "http://servicios/gestion/asistenciaTurnoPorDiaRequest", output = "http://servicios/gestion/asistenciaTurnoPorDiaResponse")
    public List<Object> asistenciaTurnoPorDia(
        @WebParam(name = "turno", targetNamespace = "")
        int turno,
        @WebParam(name = "mes", targetNamespace = "")
        int mes,
        @WebParam(name = "dia", targetNamespace = "")
        int dia);

    /**
     * 
     * @param turno
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "asistenciaTurnoPorDiaMas", targetNamespace = "http://servicios/", className = "serviciosWebGestion.AsistenciaTurnoPorDiaMas")
    @ResponseWrapper(localName = "asistenciaTurnoPorDiaMasResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.AsistenciaTurnoPorDiaMasResponse")
    @Action(input = "http://servicios/gestion/asistenciaTurnoPorDiaMasRequest", output = "http://servicios/gestion/asistenciaTurnoPorDiaMasResponse")
    public List<Object> asistenciaTurnoPorDiaMas(
        @WebParam(name = "turno", targetNamespace = "")
        String turno);

    /**
     * 
     * @param grupo
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "datosGrupoEspecifico", targetNamespace = "http://servicios/", className = "serviciosWebGestion.DatosGrupoEspecifico")
    @ResponseWrapper(localName = "datosGrupoEspecificoResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.DatosGrupoEspecificoResponse")
    @Action(input = "http://servicios/gestion/datosGrupoEspecificoRequest", output = "http://servicios/gestion/datosGrupoEspecificoResponse")
    public List<Object> datosGrupoEspecifico(
        @WebParam(name = "grupo", targetNamespace = "")
        String grupo);

    /**
     * 
     * @param grupo
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "asistenciaGrupoDia", targetNamespace = "http://servicios/", className = "serviciosWebGestion.AsistenciaGrupoDia")
    @ResponseWrapper(localName = "asistenciaGrupoDiaResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.AsistenciaGrupoDiaResponse")
    @Action(input = "http://servicios/gestion/asistenciaGrupoDiaRequest", output = "http://servicios/gestion/asistenciaGrupoDiaResponse")
    public List<Object> asistenciaGrupoDia(
        @WebParam(name = "grupo", targetNamespace = "")
        String grupo);

    /**
     * 
     * @param mes
     * @param turno
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "asistenciaTurnoMes", targetNamespace = "http://servicios/", className = "serviciosWebGestion.AsistenciaTurnoMes")
    @ResponseWrapper(localName = "asistenciaTurnoMesResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.AsistenciaTurnoMesResponse")
    @Action(input = "http://servicios/gestion/asistenciaTurnoMesRequest", output = "http://servicios/gestion/asistenciaTurnoMesResponse")
    public List<Object> asistenciaTurnoMes(
        @WebParam(name = "mes", targetNamespace = "")
        int mes,
        @WebParam(name = "turno", targetNamespace = "")
        int turno);

    /**
     * 
     * @param grupo
     * @param mes
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "asistenciaGrupoMes", targetNamespace = "http://servicios/", className = "serviciosWebGestion.AsistenciaGrupoMes")
    @ResponseWrapper(localName = "asistenciaGrupoMesResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.AsistenciaGrupoMesResponse")
    @Action(input = "http://servicios/gestion/asistenciaGrupoMesRequest", output = "http://servicios/gestion/asistenciaGrupoMesResponse")
    public List<Object> asistenciaGrupoMes(
        @WebParam(name = "mes", targetNamespace = "")
        int mes,
        @WebParam(name = "grupo", targetNamespace = "")
        String grupo);

    /**
     * 
     * @param tipoNotificacion
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerNotificaciones", targetNamespace = "http://servicios/", className = "serviciosWebGestion.ObtenerNotificaciones")
    @ResponseWrapper(localName = "obtenerNotificacionesResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.ObtenerNotificacionesResponse")
    @Action(input = "http://servicios/gestion/obtenerNotificacionesRequest", output = "http://servicios/gestion/obtenerNotificacionesResponse")
    public String obtenerNotificaciones(
        @WebParam(name = "tipoNotificacion", targetNamespace = "")
        int tipoNotificacion);

    /**
     * 
     * @param idNotificacion
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "borrarNotificaciones", targetNamespace = "http://servicios/", className = "serviciosWebGestion.BorrarNotificaciones")
    @ResponseWrapper(localName = "borrarNotificacionesResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.BorrarNotificacionesResponse")
    @Action(input = "http://servicios/gestion/borrarNotificacionesRequest", output = "http://servicios/gestion/borrarNotificacionesResponse")
    public boolean borrarNotificaciones(
        @WebParam(name = "idNotificacion", targetNamespace = "")
        int idNotificacion);

    /**
     * 
     * @param id
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerNotificacionEspecifica", targetNamespace = "http://servicios/", className = "serviciosWebGestion.ObtenerNotificacionEspecifica")
    @ResponseWrapper(localName = "obtenerNotificacionEspecificaResponse", targetNamespace = "http://servicios/", className = "serviciosWebGestion.ObtenerNotificacionEspecificaResponse")
    @Action(input = "http://servicios/gestion/obtenerNotificacionEspecificaRequest", output = "http://servicios/gestion/obtenerNotificacionEspecificaResponse")
    public List<Object> obtenerNotificacionEspecifica(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
