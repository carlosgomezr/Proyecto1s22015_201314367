/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Carlos Gomez
 */

@WebService(serviceName = "NewWebService")
public class NewWebService {
public static AVLTree eclave = new AVLTree();
public static AVLTree egeneral = new AVLTree();
public static AVLTreeAdmin admin = new AVLTreeAdmin();
public static AVLTreeChofer chofer = new AVLTreeChofer();
public static listar rutas = new listar();
public static listasdobles buses = new listasdobles();
public static listasdobles asignacion = new listasdobles();
int contadoradmin=0;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarAdmin")
    public String insertarAdmin(@WebParam(name = "correo") String correo, @WebParam(name = "password") String password) {
        if((correo!=null)&(password!=null)){
        admin.insert(correo, password, contadoradmin);
        contadoradmin=contadoradmin+1;
        }
        return correo+" "+password+" "+contadoradmin+"ingresado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarAdmin")
    public String eliminarAdmin(@WebParam(name = "correo") final String correo) {
        admin.eliminar(admin.root, correo);
        return correo;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "modificarAdmin")
    public String modificarAdmin(@WebParam(name = "correo") String correo, @WebParam(name = "password") String password, @WebParam(name = "nuevocorreo") String nuevocorreo) {
    if(admin.existe(correo)==true){
        admin.modificarEliminar(admin.root, correo, password, contadoradmin, nuevocorreo);
        contadoradmin=contadoradmin+1;
    }
    return null;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "imprimirAdmin")
    public String imprimirAdmin() {
        String imprimir=admin.imprimir(admin.root);
        return "ADMIN: "+imprimir;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphAdmin")
    public String graphAdmin() {
        Funcion f = new Funcion();
        admin.GraphAVL(admin.root,"AVL ADMIN","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        f.generarImagen("graph","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarAdmin")
    public String mostrarAdmin(@WebParam(name = "parametro") final String parametro) {
        String imprimir=admin.imprimir();
        return "ADMIN: "+imprimir+" ! ";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarAdmin")
    public String agregarAdmin(@WebParam(name = "parameter") String parameter) {
        admin.insert("correo1", "password1", 1);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarEstacionClave")
    public String insertarEstacionClave(@WebParam(name = "id") String id, @WebParam(name = "nombre") String nombre, @WebParam(name = "password") String password) {
        if((nombre!=null)&(password!=null)&(id!=null)){
        int auxid = Integer.parseInt(id);
        eclave.insert(auxid, nombre, password);
        }
        return id+" "+nombre+" "+password+"ingresado";

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarEstacionClave")
    public String eliminarEstacionClave(@WebParam(name = "id") String id) {
        int auxid=Integer.parseInt(id);
        eclave.eliminar(eclave.root,auxid);
    return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modificarEstacionClave")
    public String modificarEstacionClave(@WebParam(name = "id") String id, @WebParam(name = "nombre") String nombre, @WebParam(name = "password") String password, @WebParam(name = "nuevaclave") String nuevaclave) {
        int auxid=Integer.parseInt(id);
        int auxclave=Integer.parseInt(nuevaclave);
        if(eclave.existe(auxid)==true){
            eclave.modificarEliminar(eclave.root, auxid, nombre, password, auxclave);
        }
    return null;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphEstacionClave")
    public String graphEstacionClave() {
        Funcion f = new Funcion();
        eclave.GraphAVL(eclave.root,"AVL ESTACION CLAVE","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        f.generarImagen("graph","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
   
    return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarEstacionGeneral")
    public String insertarEstacionGeneral(@WebParam(name = "id") String id, @WebParam(name = "nombre") String nombre, @WebParam(name = "password") String password) {
        if((nombre!=null)&(password!=null)&(id!=null)){
        int auxid = Integer.parseInt(id);
        egeneral.insert(auxid, nombre, password);
        }
        return id+" "+nombre+" "+password+"ingresado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarEstacionGeneral")
    public String eliminarEstacionGeneral(@WebParam(name = "id") String id) {
        int auxid=Integer.parseInt(id);
        egeneral.eliminar(egeneral.root,auxid);
    return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modificarEstacionGeneral")
    public String modificarEstacionGeneral(@WebParam(name = "id") String id, @WebParam(name = "nombre") String nombre, @WebParam(name = "password") String password, @WebParam(name = "nuevaclave") String nuevaclave) {
    int auxid=Integer.parseInt(id);
    int auxclave=Integer.parseInt(nuevaclave);
    if(egeneral.existe(auxid)==true){
        egeneral.modificarEliminar(egeneral.root, auxid, nombre, password, auxclave);
    }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphEstacionGeneral")
    public String graphEstacionGeneral() {
        Funcion f = new Funcion();
        egeneral.GraphAVL(egeneral.root,"AVL ESTACION GENERAL","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        f.generarImagen("graph","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarChofer")
    public String insertarChofer(@WebParam(name = "id") String id, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "password") String password) {
    if((nombre!=null)&(password!=null)&(id!=null)&(apellido!=null)){
        int auxid = Integer.parseInt(id);
        chofer.insert(auxid, nombre, apellido, password);
        }
        return id+" "+nombre+" "+apellido+" "+password+"ingresado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarChofer")
    public String eliminarChofer(@WebParam(name = "id") String id) {
        int auxid=Integer.parseInt(id);
        chofer.eliminar(chofer.root, auxid);
    return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modificarChofer")
    public String modificarChofer(@WebParam(name = "id") String id, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "password") String password, @WebParam(name = "nuevaclave") String nuevaclave) {
    int auxid=Integer.parseInt(id);
    int auxclave=Integer.parseInt(nuevaclave);
        if(chofer.existe(auxid)==true){
            chofer.modificarEliminar(chofer.root, auxid, nombre, apellido, password, auxclave);
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphChofer")
    public String graphChofer() {
    Funcion f = new Funcion();
    chofer.GraphAVL(chofer.root,"AVL CHOFER","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
    f.generarImagen("graph","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarRuta")
    public String insertarRuta(@WebParam(name = "nombre") String nombre, @WebParam(name = "estacion") String estacion) {
    rutas.InsertarRuta(nombre, estacion);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarRuta")
    public String eliminarRuta(@WebParam(name = "nombre") String nombre) {
    rutas.delete(nombre);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarBus")
    public String insertarBus(@WebParam(name = "id") String id) {
    Bus dato = new Bus(id,"",0,"","","");
        buses.alta(dato);
        buses.ordenamiento(buses);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarBus")
    public String eliminarBus(@WebParam(name = "id") String id) {
    buses.delete(id);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modificarBus")
    public String modificarBus(@WebParam(name = "id") String id, @WebParam(name = "nuevoid") String nuevoid) {
    buses.delete(id);
    Bus dato = new Bus(nuevoid,"",0,"","","");
        buses.alta(dato);
        buses.ordenamiento(buses);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphBus")
    public String graphBus() {
    Funcion f = new Funcion();
    buses.ordenamiento(buses);
    f.generarListaDoble(buses,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
    f.generarImagen("graph","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        return null;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarAsignacion")
    public String insertarAsignacion(@WebParam(name = "id") String id, @WebParam(name = "ruta") String ruta, @WebParam(name = "claveChofer") String claveChofer, @WebParam(name = "horaini") String horaini, @WebParam(name = "horafin") String horafin, @WebParam(name = "fecha") String fecha) {
        int auxclave = Integer.parseInt(claveChofer);
        Bus ob = new Bus(id,ruta,auxclave,horaini,horafin,fecha);
        asignacion.alta(ob);
        if(buses.existe(id)==true){
                System.out.println("Existe "+id); 
                //lista.ordenamiento(lista);
            }else{
                System.out.println("No existe "+id);
                Bus dat = new Bus(id,"",0,"","","");
                buses.alta(dat);
                //lista.ordenamiento(lista);
            }
        buses.ordenamiento(buses);
        if(chofer.existe(chofer.root,auxclave)==true){
             //   System.out.println("AVL Existe "+auxclave);
                chofer.buscarInsertarHora(chofer.root, auxclave, fecha, id, ruta,horaini,horafin);
            }else{
             //   System.out.println("AVL No Existe "+auxclave);
                chofer.insert(auxclave, "Chofer","chofer", "chofer");
                chofer.buscarInsertarHora(chofer.root, auxclave, fecha, id, ruta,horaini,horafin);
            }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "grahpBusxChofer")
    public String grahpBusxChofer(@WebParam(name = "id") String id) {
    int auxid=Integer.parseInt(id);
        if(chofer.existe(chofer.root, auxid)==true){
            asignacion.reporteChoferxBus(auxid);
        }        
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphHorarioxBusxChofer")
    public String graphHorarioxBusxChofer(@WebParam(name = "idbus") String idbus, @WebParam(name = "idchofer") String idchofer) {
    int auxchofer = Integer.parseInt(idchofer);
        if(chofer.existe(chofer.root, auxchofer)){
            asignacion.reporteHoraxChofer(auxchofer, idbus);
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "resumenBusEspecifico")
    public String resumenBusEspecifico(@WebParam(name = "idbus") String idbus) {
    
        return buses.Busespecifico(idbus);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "resumenChoferEspecifico")
    public String resumenChoferEspecifico(@WebParam(name = "idchofer") String idchofer) {
    int auxid = Integer.parseInt(idchofer);
    Funcion f = new Funcion();
    f.ChoferxDia(chofer.root,auxid,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt","Chofer "+idchofer);
    f.generarImagen("graph", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public String Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password, @WebParam(name = "tipo") String tipo) {
    String pagina="index.jsp";
    if((usuario.compareTo("admin")==0)&(password.compareTo("admin")==0)&(tipo.compareTo("Administrador")==0)){
        pagina="menu.jsp";
    }
    else if(tipo.compareTo("Administrador")==0){
        if(admin.log(usuario, password)==true){
            pagina="menu.jsp";
        }
        if(admin.log(usuario, password)==false){
            pagina="index.jsp";
        }
        
    }
    if(tipo.compareTo("EstacionClave")==0){
        int auxiliar=Integer.parseInt(usuario);
        if(eclave.log(auxiliar, password)==true){ 
            pagina="menueclave.jsp";
        }
        if(eclave.log(auxiliar, password)==false){
            pagina="index.jsp";
        }
    }
    if(tipo.compareTo("EstacionGeneral")==0){
        int auxiliar=Integer.parseInt(usuario);
        if(egeneral.log(auxiliar, password)==true){
            pagina="menuegeneral.jsp";
        }
        if(egeneral.log(auxiliar, password)==false){
            pagina="index.jsp";
        }
    }
    if(tipo.compareTo("Chofer")==0){
        int auxiliar=Integer.parseInt(usuario);
        if(chofer.log(auxiliar, password)==true){
            pagina="menuchofer.jsp";
        }
        if(chofer.log(auxiliar, password)==false){
            pagina="index.jsp";
        }
    }
    return pagina;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphAsignacion")
    public String graphAsignacion(@WebParam(name = "parameter") String parameter) {
        Funcion f = new Funcion();
        f.generarAsignacion(asignacion,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        f.generarImagen("graph","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cargarCSV")
    public String cargarCSV(@WebParam(name = "path") String path) {
    Funcion f = new Funcion();
    f.leerCSV(buses, asignacion, chofer,path);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphRuta")
    public String graphRuta(@WebParam(name = "parameter") String parameter) {
        rutas.graphRuta(rutas,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt", "RUTAS");
        Funcion f = new Funcion();
        f.generarImagen("graph","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graph.txt");
        return null;
    }
    
}
