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
public listasdobles asignacion = new listasdobles();
int contadoradmin=0;
int contadoregeneral=5;
int user=0;

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
        admin.existemod(admin.root, correo, password, contadoradmin, nuevocorreo);
        contadoradmin = contadoradmin+1;
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
        admin.GraphAVL(admin.root,"AVL ADMIN","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphadmin.txt");
        f.generarImagen("graphadmin","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphadmin.txt");
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
        eclave.existemod(eclave.root, auxid, nombre, password, auxclave);
    return null;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphEstacionClave")
    public String graphEstacionClave() {
        Funcion f = new Funcion();
        eclave.GraphAVL(eclave.root,"AVL ESTACION CLAVE","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphEC.txt");
        f.generarImagen("graphEC","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphEC.txt");
   
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
        contadoregeneral=contadoregeneral+1;
        return id+" "+nombre+" "+password+"ingresado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarEstacionGeneral")
    public String eliminarEstacionGeneral(@WebParam(name = "id") String id) {
        int auxid=Integer.parseInt(id);
        egeneral.eliminar(egeneral.root,auxid);
        contadoregeneral=contadoregeneral-1;
    return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modificarEstacionGeneral")
    public String modificarEstacionGeneral(@WebParam(name = "id") String id, @WebParam(name = "nombre") String nombre, @WebParam(name = "password") String password, @WebParam(name = "nuevaclave") String nuevaclave) {
    int auxid=Integer.parseInt(id);
    int auxclave=Integer.parseInt(nuevaclave);
    egeneral.existemod(egeneral.root, auxid, nombre, password, auxclave);
    return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphEstacionGeneral")
    public String graphEstacionGeneral() {
        Funcion f = new Funcion();
        egeneral.GraphAVL(egeneral.root,"AVL ESTACION GENERAL","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphEG.txt");
        f.generarImagen("graphEG","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphEG.txt");
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
        chofer.existemod(chofer.root, auxid, nombre, apellido, password, auxclave);
    return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphChofer")
    public String graphChofer() {
    Funcion f = new Funcion();
    chofer.GraphAVL(chofer.root,"AVL CHOFER","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphChofer.txt");
    f.generarImagen("graphChofer","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphChofer.txt");
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarRuta")
    public String insertarRuta(@WebParam(name = "nombre") String nombre, @WebParam(name = "estacion") String estacion) {
    if((nombre!=null) & (estacion!=null)){
        rutas.InsertarRuta(nombre, estacion);
    }
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
if((id!=null)){
                    buses.alta(id, id, contadoradmin, id, id, id);
}
//            if(buses.existe(id)==true){
                //System.out.println("Existe "+id); 
                //lista.ordenamiento(lista);
//            }else{
                //System.out.println("No existe "+id);
               // buses.alta(id,"",0,"","","");
               
//lista.ordenamiento(lista);
//            } 

//  buses.alta(dato);
      //buses.ordenamiento(buses);
        return " primero "+buses.primero+buses.primero.id + " p.sig "+buses.primero.next+" p.ant "+buses.primero.ant+" ultimo "+buses.ultimo.id+" "+buses.ultimo;
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
        buses.existe(id);
        if(buses.flag==true){
            buses.delete(id);
            buses.alta(nuevoid,"",0,"","","");
        
        }//buses.ordenamiento(buses);
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphBus")
    public String graphBus() {
    Funcion f = new Funcion();
    buses.ordenamiento(buses);
    f.generarListaDoble(buses,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphBus.txt");
    f.generarImagen("graphBus","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphBus.txt");
    return null;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarAsignacion")
    public String insertarAsignacion(@WebParam(name = "id") String id, @WebParam(name = "ruta") String ruta, @WebParam(name = "claveChofer") String claveChofer, @WebParam(name = "horaini") String horaini, @WebParam(name = "horafin") String horafin, @WebParam(name = "fecha") String fecha) {
        int auxclave = Integer.parseInt(claveChofer);
        asignacion.alta(id,ruta,auxclave,horaini,horafin,fecha);
        if((id!=null) & (ruta!=null) & (claveChofer!=null) &(horaini!=null) &(horafin!=null) & (fecha!=null)){
        buses.existe(id);
        if(buses.flag==true){
                System.out.println("Existe "+id); 
                //lista.ordenamiento(lista);
            }else{
                System.out.println("No existe "+id);
                buses.alta(id,ruta,auxclave,horaini,horafin,fecha);
                //lista.ordenamiento(lista);
            }
        chofer.existe(chofer.root,auxclave);
        if(chofer.flag==true){
             //   System.out.println("AVL Existe "+auxclave);
                chofer.buscarInsertarHora(chofer.root, auxclave, fecha, id, ruta,horaini,horafin);
            }else{
             //   System.out.println("AVL No Existe "+auxclave);
                chofer.insert(auxclave, "Chofer","chofer", "chofer");
                chofer.buscarInsertarHora(chofer.root, auxclave, fecha, id, ruta,horaini,horafin);
            }
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "grahpBusxChofer")
    public String grahpBusxChofer(@WebParam(name = "id") String id) {
    int auxid=Integer.parseInt(id);
    chofer.existe(auxid);
        if(chofer.flag==true){
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
    chofer.existe(auxchofer);
        if(chofer.flag==true){
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
    f.ChoferxDia(chofer.root,auxid,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphChoferEspecifico.txt","Chofer "+idchofer);
    f.generarImagen("graph", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphChoferEspecifico.txt");
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
        admin.log(admin.root, usuario, password);
        if(admin.flag==true){
            pagina="menu.jsp";
        }
        if(admin.flag==false){
            pagina="index.jsp";
        }
        
    }
    if(tipo.compareTo("EstacionClave")==0){
        int auxiliar=Integer.parseInt(usuario);
        eclave.log(eclave.root, auxiliar, password);
        if(eclave.flag==true){
            user=auxiliar;
            pagina="menueclave.jsp";
        }
        if(eclave.flag==false){
            pagina="index.jsp";
        }
    }
    if(tipo.compareTo("EstacionGeneral")==0){
        int auxiliar=Integer.parseInt(usuario);
        egeneral.log(egeneral.root, auxiliar, password);
        if(egeneral.flag==true){
            user=auxiliar;
            pagina="menuegeneral.jsp";
        }
        if(egeneral.flag==false){
            pagina="index.jsp";
        }
    }
    if(tipo.compareTo("Chofer")==0){
        int auxiliar=Integer.parseInt(usuario);
        chofer.log(chofer.root, auxiliar, password);
        if(chofer.flag==true){
            user=auxiliar;
            pagina="menuchofer.jsp";
        }
        if(chofer.flag==false){
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
        f.generarAsignacion(asignacion,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphAsignacion.txt");
        f.generarImagen("graphAsignacion","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphAsignacion.txt");
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
        rutas.graphRuta(rutas,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphRuta.txt", "RUTAS");
        Funcion f = new Funcion();
        f.generarImagen("graphRuta","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphRuta.txt");
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public int operation() {
         return contadoregeneral;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DarUser")
    public int DarUser() {
        return user;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graphHorarioChofer")
    public String graphHorarioChofer(@WebParam(name = "idchofer") String idchofer) {
        Funcion f=new Funcion();
        int aux = Integer.parseInt(idchofer);
        f.ChoferxDia(chofer.root,aux,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphHorario.txt","Horario chofer");
        f.generarImagen("graphHorario", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphHorario.txt");
        
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrarHorarioChofer")
    public String mostrarHorarioChofer(@WebParam(name = "idchofer") String idchofer) {
        Funcion f=new Funcion();
        int aux = Integer.parseInt(idchofer);
        f.ResumenChoferxDia(chofer.root,aux);
        return null;
    }
    
}
