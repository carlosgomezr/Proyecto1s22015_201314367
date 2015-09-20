
package servicio;

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
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebService", targetNamespace = "http://servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "operation", targetNamespace = "http://servicio/", className = "servicio.Operation")
    @ResponseWrapper(localName = "operationResponse", targetNamespace = "http://servicio/", className = "servicio.OperationResponse")
    @Action(input = "http://servicio/NewWebService/operationRequest", output = "http://servicio/NewWebService/operationResponse")
    public int operation();

    /**
     * 
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarRuta", targetNamespace = "http://servicio/", className = "servicio.EliminarRuta")
    @ResponseWrapper(localName = "eliminarRutaResponse", targetNamespace = "http://servicio/", className = "servicio.EliminarRutaResponse")
    @Action(input = "http://servicio/NewWebService/eliminarRutaRequest", output = "http://servicio/NewWebService/eliminarRutaResponse")
    public String eliminarRuta(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarBus", targetNamespace = "http://servicio/", className = "servicio.InsertarBus")
    @ResponseWrapper(localName = "insertarBusResponse", targetNamespace = "http://servicio/", className = "servicio.InsertarBusResponse")
    @Action(input = "http://servicio/NewWebService/insertarBusRequest", output = "http://servicio/NewWebService/insertarBusResponse")
    public String insertarBus(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param parameter
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarAdmin", targetNamespace = "http://servicio/", className = "servicio.AgregarAdmin")
    @ResponseWrapper(localName = "agregarAdminResponse", targetNamespace = "http://servicio/", className = "servicio.AgregarAdminResponse")
    @Action(input = "http://servicio/NewWebService/agregarAdminRequest", output = "http://servicio/NewWebService/agregarAdminResponse")
    public String agregarAdmin(
        @WebParam(name = "parameter", targetNamespace = "")
        String parameter);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "graphAdmin", targetNamespace = "http://servicio/", className = "servicio.GraphAdmin")
    @ResponseWrapper(localName = "graphAdminResponse", targetNamespace = "http://servicio/", className = "servicio.GraphAdminResponse")
    @Action(input = "http://servicio/NewWebService/graphAdminRequest", output = "http://servicio/NewWebService/graphAdminResponse")
    public String graphAdmin();

    /**
     * 
     * @param password
     * @param correo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarAdmin", targetNamespace = "http://servicio/", className = "servicio.InsertarAdmin")
    @ResponseWrapper(localName = "insertarAdminResponse", targetNamespace = "http://servicio/", className = "servicio.InsertarAdminResponse")
    @Action(input = "http://servicio/NewWebService/insertarAdminRequest", output = "http://servicio/NewWebService/insertarAdminResponse")
    public String insertarAdmin(
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param path
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cargarCSV", targetNamespace = "http://servicio/", className = "servicio.CargarCSV")
    @ResponseWrapper(localName = "cargarCSVResponse", targetNamespace = "http://servicio/", className = "servicio.CargarCSVResponse")
    @Action(input = "http://servicio/NewWebService/cargarCSVRequest", output = "http://servicio/NewWebService/cargarCSVResponse")
    public String cargarCSV(
        @WebParam(name = "path", targetNamespace = "")
        String path);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarChofer", targetNamespace = "http://servicio/", className = "servicio.EliminarChofer")
    @ResponseWrapper(localName = "eliminarChoferResponse", targetNamespace = "http://servicio/", className = "servicio.EliminarChoferResponse")
    @Action(input = "http://servicio/NewWebService/eliminarChoferRequest", output = "http://servicio/NewWebService/eliminarChoferResponse")
    public String eliminarChofer(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param password
     * @param correo
     * @param nuevocorreo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarAdmin", targetNamespace = "http://servicio/", className = "servicio.ModificarAdmin")
    @ResponseWrapper(localName = "modificarAdminResponse", targetNamespace = "http://servicio/", className = "servicio.ModificarAdminResponse")
    @Action(input = "http://servicio/NewWebService/modificarAdminRequest", output = "http://servicio/NewWebService/modificarAdminResponse")
    public String modificarAdmin(
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "nuevocorreo", targetNamespace = "")
        String nuevocorreo);

    /**
     * 
     * @param password
     * @param apellido
     * @param id
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarChofer", targetNamespace = "http://servicio/", className = "servicio.InsertarChofer")
    @ResponseWrapper(localName = "insertarChoferResponse", targetNamespace = "http://servicio/", className = "servicio.InsertarChoferResponse")
    @Action(input = "http://servicio/NewWebService/insertarChoferRequest", output = "http://servicio/NewWebService/insertarChoferResponse")
    public String insertarChofer(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param nuevoid
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarBus", targetNamespace = "http://servicio/", className = "servicio.ModificarBus")
    @ResponseWrapper(localName = "modificarBusResponse", targetNamespace = "http://servicio/", className = "servicio.ModificarBusResponse")
    @Action(input = "http://servicio/NewWebService/modificarBusRequest", output = "http://servicio/NewWebService/modificarBusResponse")
    public String modificarBus(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "nuevoid", targetNamespace = "")
        String nuevoid);

    /**
     * 
     * @param password
     * @param apellido
     * @param nuevaclave
     * @param id
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarChofer", targetNamespace = "http://servicio/", className = "servicio.ModificarChofer")
    @ResponseWrapper(localName = "modificarChoferResponse", targetNamespace = "http://servicio/", className = "servicio.ModificarChoferResponse")
    @Action(input = "http://servicio/NewWebService/modificarChoferRequest", output = "http://servicio/NewWebService/modificarChoferResponse")
    public String modificarChofer(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "nuevaclave", targetNamespace = "")
        String nuevaclave);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "graphBus", targetNamespace = "http://servicio/", className = "servicio.GraphBus")
    @ResponseWrapper(localName = "graphBusResponse", targetNamespace = "http://servicio/", className = "servicio.GraphBusResponse")
    @Action(input = "http://servicio/NewWebService/graphBusRequest", output = "http://servicio/NewWebService/graphBusResponse")
    public String graphBus();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod(operationName = "DarUser")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DarUser", targetNamespace = "http://servicio/", className = "servicio.DarUser")
    @ResponseWrapper(localName = "DarUserResponse", targetNamespace = "http://servicio/", className = "servicio.DarUserResponse")
    @Action(input = "http://servicio/NewWebService/DarUserRequest", output = "http://servicio/NewWebService/DarUserResponse")
    public int darUser();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "darAdmin", targetNamespace = "http://servicio/", className = "servicio.DarAdmin")
    @ResponseWrapper(localName = "darAdminResponse", targetNamespace = "http://servicio/", className = "servicio.DarAdminResponse")
    @Action(input = "http://servicio/NewWebService/darAdminRequest", output = "http://servicio/NewWebService/darAdminResponse")
    public String darAdmin();

    /**
     * 
     * @param password
     * @param tipo
     * @param usuario
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://servicio/", className = "servicio.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://servicio/", className = "servicio.LoginResponse")
    @Action(input = "http://servicio/NewWebService/LoginRequest", output = "http://servicio/NewWebService/LoginResponse")
    public String login(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "tipo", targetNamespace = "")
        String tipo);

    /**
     * 
     * @param posicion
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nombreEstacion", targetNamespace = "http://servicio/", className = "servicio.NombreEstacion")
    @ResponseWrapper(localName = "nombreEstacionResponse", targetNamespace = "http://servicio/", className = "servicio.NombreEstacionResponse")
    @Action(input = "http://servicio/NewWebService/nombreEstacionRequest", output = "http://servicio/NewWebService/nombreEstacionResponse")
    public String nombreEstacion(
        @WebParam(name = "posicion", targetNamespace = "")
        String posicion);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "imprimirAdmin", targetNamespace = "http://servicio/", className = "servicio.ImprimirAdmin")
    @ResponseWrapper(localName = "imprimirAdminResponse", targetNamespace = "http://servicio/", className = "servicio.ImprimirAdminResponse")
    @Action(input = "http://servicio/NewWebService/imprimirAdminRequest", output = "http://servicio/NewWebService/imprimirAdminResponse")
    public String imprimirAdmin();

    /**
     * 
     * @param correo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarAdmin", targetNamespace = "http://servicio/", className = "servicio.EliminarAdmin")
    @ResponseWrapper(localName = "eliminarAdminResponse", targetNamespace = "http://servicio/", className = "servicio.EliminarAdminResponse")
    @Action(input = "http://servicio/NewWebService/eliminarAdminRequest", output = "http://servicio/NewWebService/eliminarAdminResponse")
    public String eliminarAdmin(
        @WebParam(name = "correo", targetNamespace = "")
        String correo);

    /**
     * 
     * @param estacion
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarRuta", targetNamespace = "http://servicio/", className = "servicio.InsertarRuta")
    @ResponseWrapper(localName = "insertarRutaResponse", targetNamespace = "http://servicio/", className = "servicio.InsertarRutaResponse")
    @Action(input = "http://servicio/NewWebService/insertarRutaRequest", output = "http://servicio/NewWebService/insertarRutaResponse")
    public String insertarRuta(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "estacion", targetNamespace = "")
        String estacion);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "grahpBusxChofer", targetNamespace = "http://servicio/", className = "servicio.GrahpBusxChofer")
    @ResponseWrapper(localName = "grahpBusxChoferResponse", targetNamespace = "http://servicio/", className = "servicio.GrahpBusxChoferResponse")
    @Action(input = "http://servicio/NewWebService/grahpBusxChoferRequest", output = "http://servicio/NewWebService/grahpBusxChoferResponse")
    public String grahpBusxChofer(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param parametro
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mostrarAdmin", targetNamespace = "http://servicio/", className = "servicio.MostrarAdmin")
    @ResponseWrapper(localName = "mostrarAdminResponse", targetNamespace = "http://servicio/", className = "servicio.MostrarAdminResponse")
    @Action(input = "http://servicio/NewWebService/mostrarAdminRequest", output = "http://servicio/NewWebService/mostrarAdminResponse")
    public String mostrarAdmin(
        @WebParam(name = "parametro", targetNamespace = "")
        String parametro);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "graphChofer", targetNamespace = "http://servicio/", className = "servicio.GraphChofer")
    @ResponseWrapper(localName = "graphChoferResponse", targetNamespace = "http://servicio/", className = "servicio.GraphChoferResponse")
    @Action(input = "http://servicio/NewWebService/graphChoferRequest", output = "http://servicio/NewWebService/graphChoferResponse")
    public String graphChofer();

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarBus", targetNamespace = "http://servicio/", className = "servicio.EliminarBus")
    @ResponseWrapper(localName = "eliminarBusResponse", targetNamespace = "http://servicio/", className = "servicio.EliminarBusResponse")
    @Action(input = "http://servicio/NewWebService/eliminarBusRequest", output = "http://servicio/NewWebService/eliminarBusResponse")
    public String eliminarBus(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param parameter
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "graphAsignacion", targetNamespace = "http://servicio/", className = "servicio.GraphAsignacion")
    @ResponseWrapper(localName = "graphAsignacionResponse", targetNamespace = "http://servicio/", className = "servicio.GraphAsignacionResponse")
    @Action(input = "http://servicio/NewWebService/graphAsignacionRequest", output = "http://servicio/NewWebService/graphAsignacionResponse")
    public String graphAsignacion(
        @WebParam(name = "parameter", targetNamespace = "")
        String parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "graphRuta", targetNamespace = "http://servicio/", className = "servicio.GraphRuta")
    @ResponseWrapper(localName = "graphRutaResponse", targetNamespace = "http://servicio/", className = "servicio.GraphRutaResponse")
    @Action(input = "http://servicio/NewWebService/graphRutaRequest", output = "http://servicio/NewWebService/graphRutaResponse")
    public String graphRuta(
        @WebParam(name = "parameter", targetNamespace = "")
        String parameter);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rutaPrimero", targetNamespace = "http://servicio/", className = "servicio.RutaPrimero")
    @ResponseWrapper(localName = "rutaPrimeroResponse", targetNamespace = "http://servicio/", className = "servicio.RutaPrimeroResponse")
    @Action(input = "http://servicio/NewWebService/rutaPrimeroRequest", output = "http://servicio/NewWebService/rutaPrimeroResponse")
    public String rutaPrimero();

    /**
     * 
     * @param estacion
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "tama\u00f1oEstacion", targetNamespace = "http://servicio/", className = "servicio.Tama\u00f1oEstacion")
    @ResponseWrapper(localName = "tama\u00f1oEstacionResponse", targetNamespace = "http://servicio/", className = "servicio.Tama\u00f1oEstacionResponse")
    @Action(input = "http://servicio/NewWebService/tama\u00f1oEstacionRequest", output = "http://servicio/NewWebService/tama\u00f1oEstacionResponse")
    public int tamañoEstacion(
        @WebParam(name = "estacion", targetNamespace = "")
        String estacion);

    /**
     * 
     * @param posicion
     * @param estacion
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nombreBus", targetNamespace = "http://servicio/", className = "servicio.NombreBus")
    @ResponseWrapper(localName = "nombreBusResponse", targetNamespace = "http://servicio/", className = "servicio.NombreBusResponse")
    @Action(input = "http://servicio/NewWebService/nombreBusRequest", output = "http://servicio/NewWebService/nombreBusResponse")
    public String nombreBus(
        @WebParam(name = "estacion", targetNamespace = "")
        String estacion,
        @WebParam(name = "posicion", targetNamespace = "")
        String posicion);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "graphEstacionClave", targetNamespace = "http://servicio/", className = "servicio.GraphEstacionClave")
    @ResponseWrapper(localName = "graphEstacionClaveResponse", targetNamespace = "http://servicio/", className = "servicio.GraphEstacionClaveResponse")
    @Action(input = "http://servicio/NewWebService/graphEstacionClaveRequest", output = "http://servicio/NewWebService/graphEstacionClaveResponse")
    public String graphEstacionClave();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "graphEstacionGeneral", targetNamespace = "http://servicio/", className = "servicio.GraphEstacionGeneral")
    @ResponseWrapper(localName = "graphEstacionGeneralResponse", targetNamespace = "http://servicio/", className = "servicio.GraphEstacionGeneralResponse")
    @Action(input = "http://servicio/NewWebService/graphEstacionGeneralRequest", output = "http://servicio/NewWebService/graphEstacionGeneralResponse")
    public String graphEstacionGeneral();

    /**
     * 
     * @param idbus
     * @param idchofer
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "graphHorarioxBusxChofer", targetNamespace = "http://servicio/", className = "servicio.GraphHorarioxBusxChofer")
    @ResponseWrapper(localName = "graphHorarioxBusxChoferResponse", targetNamespace = "http://servicio/", className = "servicio.GraphHorarioxBusxChoferResponse")
    @Action(input = "http://servicio/NewWebService/graphHorarioxBusxChoferRequest", output = "http://servicio/NewWebService/graphHorarioxBusxChoferResponse")
    public String graphHorarioxBusxChofer(
        @WebParam(name = "idbus", targetNamespace = "")
        String idbus,
        @WebParam(name = "idchofer", targetNamespace = "")
        String idchofer);

    /**
     * 
     * @param idchofer
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "graphHorarioChofer", targetNamespace = "http://servicio/", className = "servicio.GraphHorarioChofer")
    @ResponseWrapper(localName = "graphHorarioChoferResponse", targetNamespace = "http://servicio/", className = "servicio.GraphHorarioChoferResponse")
    @Action(input = "http://servicio/NewWebService/graphHorarioChoferRequest", output = "http://servicio/NewWebService/graphHorarioChoferResponse")
    public String graphHorarioChofer(
        @WebParam(name = "idchofer", targetNamespace = "")
        String idchofer);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarEstacionClave", targetNamespace = "http://servicio/", className = "servicio.EliminarEstacionClave")
    @ResponseWrapper(localName = "eliminarEstacionClaveResponse", targetNamespace = "http://servicio/", className = "servicio.EliminarEstacionClaveResponse")
    @Action(input = "http://servicio/NewWebService/eliminarEstacionClaveRequest", output = "http://servicio/NewWebService/eliminarEstacionClaveResponse")
    public String eliminarEstacionClave(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param idchofer
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mostrarHorarioChofer", targetNamespace = "http://servicio/", className = "servicio.MostrarHorarioChofer")
    @ResponseWrapper(localName = "mostrarHorarioChoferResponse", targetNamespace = "http://servicio/", className = "servicio.MostrarHorarioChoferResponse")
    @Action(input = "http://servicio/NewWebService/mostrarHorarioChoferRequest", output = "http://servicio/NewWebService/mostrarHorarioChoferResponse")
    public String mostrarHorarioChofer(
        @WebParam(name = "idchofer", targetNamespace = "")
        String idchofer);

    /**
     * 
     * @param password
     * @param id
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarEstacionClave", targetNamespace = "http://servicio/", className = "servicio.InsertarEstacionClave")
    @ResponseWrapper(localName = "insertarEstacionClaveResponse", targetNamespace = "http://servicio/", className = "servicio.InsertarEstacionClaveResponse")
    @Action(input = "http://servicio/NewWebService/insertarEstacionClaveRequest", output = "http://servicio/NewWebService/insertarEstacionClaveResponse")
    public String insertarEstacionClave(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param idbus
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resumenBusEspecifico", targetNamespace = "http://servicio/", className = "servicio.ResumenBusEspecifico")
    @ResponseWrapper(localName = "resumenBusEspecificoResponse", targetNamespace = "http://servicio/", className = "servicio.ResumenBusEspecificoResponse")
    @Action(input = "http://servicio/NewWebService/resumenBusEspecificoRequest", output = "http://servicio/NewWebService/resumenBusEspecificoResponse")
    public String resumenBusEspecifico(
        @WebParam(name = "idbus", targetNamespace = "")
        String idbus);

    /**
     * 
     * @param fecha
     * @param horafin
     * @param ruta
     * @param horaini
     * @param id
     * @param claveChofer
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarAsignacion", targetNamespace = "http://servicio/", className = "servicio.InsertarAsignacion")
    @ResponseWrapper(localName = "insertarAsignacionResponse", targetNamespace = "http://servicio/", className = "servicio.InsertarAsignacionResponse")
    @Action(input = "http://servicio/NewWebService/insertarAsignacionRequest", output = "http://servicio/NewWebService/insertarAsignacionResponse")
    public String insertarAsignacion(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "ruta", targetNamespace = "")
        String ruta,
        @WebParam(name = "claveChofer", targetNamespace = "")
        String claveChofer,
        @WebParam(name = "horaini", targetNamespace = "")
        String horaini,
        @WebParam(name = "horafin", targetNamespace = "")
        String horafin,
        @WebParam(name = "fecha", targetNamespace = "")
        String fecha);

    /**
     * 
     * @param password
     * @param id
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarEstacionGeneral", targetNamespace = "http://servicio/", className = "servicio.InsertarEstacionGeneral")
    @ResponseWrapper(localName = "insertarEstacionGeneralResponse", targetNamespace = "http://servicio/", className = "servicio.InsertarEstacionGeneralResponse")
    @Action(input = "http://servicio/NewWebService/insertarEstacionGeneralRequest", output = "http://servicio/NewWebService/insertarEstacionGeneralResponse")
    public String insertarEstacionGeneral(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param idchofer
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resumenChoferEspecifico", targetNamespace = "http://servicio/", className = "servicio.ResumenChoferEspecifico")
    @ResponseWrapper(localName = "resumenChoferEspecificoResponse", targetNamespace = "http://servicio/", className = "servicio.ResumenChoferEspecificoResponse")
    @Action(input = "http://servicio/NewWebService/resumenChoferEspecificoRequest", output = "http://servicio/NewWebService/resumenChoferEspecificoResponse")
    public String resumenChoferEspecifico(
        @WebParam(name = "idchofer", targetNamespace = "")
        String idchofer);

    /**
     * 
     * @param password
     * @param nuevaclave
     * @param id
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarEstacionGeneral", targetNamespace = "http://servicio/", className = "servicio.ModificarEstacionGeneral")
    @ResponseWrapper(localName = "modificarEstacionGeneralResponse", targetNamespace = "http://servicio/", className = "servicio.ModificarEstacionGeneralResponse")
    @Action(input = "http://servicio/NewWebService/modificarEstacionGeneralRequest", output = "http://servicio/NewWebService/modificarEstacionGeneralResponse")
    public String modificarEstacionGeneral(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "nuevaclave", targetNamespace = "")
        String nuevaclave);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarEstacionGeneral", targetNamespace = "http://servicio/", className = "servicio.EliminarEstacionGeneral")
    @ResponseWrapper(localName = "eliminarEstacionGeneralResponse", targetNamespace = "http://servicio/", className = "servicio.EliminarEstacionGeneralResponse")
    @Action(input = "http://servicio/NewWebService/eliminarEstacionGeneralRequest", output = "http://servicio/NewWebService/eliminarEstacionGeneralResponse")
    public String eliminarEstacionGeneral(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param password
     * @param nuevaclave
     * @param id
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarEstacionClave", targetNamespace = "http://servicio/", className = "servicio.ModificarEstacionClave")
    @ResponseWrapper(localName = "modificarEstacionClaveResponse", targetNamespace = "http://servicio/", className = "servicio.ModificarEstacionClaveResponse")
    @Action(input = "http://servicio/NewWebService/modificarEstacionClaveRequest", output = "http://servicio/NewWebService/modificarEstacionClaveResponse")
    public String modificarEstacionClave(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "nuevaclave", targetNamespace = "")
        String nuevaclave);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://servicio/", className = "servicio.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://servicio/", className = "servicio.HelloResponse")
    @Action(input = "http://servicio/NewWebService/helloRequest", output = "http://servicio/NewWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
