/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

/**
 *
 * @author Carlos Gomez
 */
public class listaestacion {
    public nodoestacion primero;
    public nodoestacion ultimo;
    public boolean flag=false;
    public String nombreestacion="";
    public int tamaño=0;
    public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
    
public void alta(String estacion)
    {
        if((primero==null))
        {
            nodoestacion nuevo = new nodoestacion(estacion);
            primero = nuevo;
            ultimo = nuevo;
        }
        else
        {
            nodoestacion nuevo = new nodoestacion(estacion);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        
       // return this;
    }

 public boolean existe(String id){
        boolean flag=false;
        nodoestacion actual;
        nodoestacion aux = primero;
        actual = primero;
        
        while(actual!=null){
                if(actual.estacion.compareTo(id)==0){
                    flag=true;
                }
                actual = actual.next;
        }
        primero=aux;
        return flag;
    }

 public void buscaInserta(String estacion,String bus,String ruta){
     if(existe(estacion)==true){
         insertarBus(estacion,bus,ruta);
     }
     else{
         alta(estacion);
         insertarBus(estacion,bus,ruta);
     }
 
 }
 
 public void insertarBus(String estacion,String bus,String ruta){
        nodoestacion actual;
        nodoestacion aux = primero;
        actual = primero;
        
        while(actual!=null){
                if(actual.estacion.compareTo(estacion)==0){
                    actual.lista.alta(bus,ruta);
                }
                actual = actual.next;
        }
        primero=aux;
 }
 
 public void EliminarInsertarBus(String estacion,String nuevaestacion,String bus,String ruta){
        nodoestacion actual;
        nodoestacion aux = primero;
        actual = primero;
        
        while(actual!=null){
                if(actual.estacion.compareTo(estacion)==0){
                    actual.lista.delete(bus);
                }
                actual = actual.next;
        }
        primero=aux;
        insertarBus(nuevaestacion,bus,ruta);
        
 }
 
public String nombreposicion(int tam){
        nombreestacion="";
        if( estavacio() )
	{
	
	}
	nodoestacion actual = primero;
        nodoestacion auxiliar = primero;
        for(int i=0;i<tam;i++){
            if(actual!=null){
                nombreestacion=actual.estacion;
                actual = actual.next;
                //System.out.println("entre al if posicion "+i);
            }
        }
        primero=auxiliar;
        return nombreestacion;
    }

public int tamaño(String nombre){
        tamaño=0;
        if( estavacio() )
	{
		tamaño=0;
	}
	nodoestacion actual = ultimo;
        nodoestacion aux=ultimo;
	while( actual != null)
	{
                if(actual.estacion.compareTo(nombre)==0){
                    actual.lista.tamaño();
                    tamaño=actual.lista.tamaño;
                }
		actual = actual.ant;
	}
        ultimo = aux;
        return tamaño;
    }

public String nombreposicionbus(int tam,int tambus){
        nombreestacion="";
        String auxtam=Integer.toString(tam);
        if( estavacio() )
	{
	
	}
	nodoestacion actual = primero;
        nodoestacion auxiliar = primero;
        while(actual!=null){
            if(actual.estacion.compareTo(auxtam)==0){
                
                nombreestacion=actual.lista.nombreposicion(tambus);
                //nombreestacion=auxtam+"xDencontre";
                
                //System.out.println("entre al if posicion "+i);
            }
            actual = actual.next;
            
        }
        primero=auxiliar;
        return nombreestacion;
    }

 
}
