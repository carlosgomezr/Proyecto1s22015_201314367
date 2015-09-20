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
public class listabus {
    public nodobus primero;
    public nodobus ultimo;
    public boolean flag=false;
    public int tamaño=0;
    public String nombre="";
    public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
    
    public void alta(String bus,String ruta)
    {
        if((primero==null))
        {
            nodobus nuevo = new nodobus(bus,ruta);
            primero = nuevo;
            ultimo = nuevo;
        }
        else
        {
            nodobus nuevo = new nodobus(bus,ruta);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
       // return this;
    }
        
    public boolean delete(String num)
    {
        nodobus anterior=null;
        nodobus actual=primero;
        nodobus aux=primero;
       
        while(actual!=ultimo)
        {
            if(actual.bus.compareTo(num)==0)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    nodobus temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
        
        if(num.compareTo(ultimo.bus)==0)
        {
             if(primero==ultimo){
                primero = ultimo = null;
            }
             else{
                ultimo=actual.ant;
             }
            return true;
        }
        primero = aux;
        return false;
    }

        public nodobus posicion(int tam){
            nodobus aux=null;
            if( estavacio() )
            {
                    aux = null;
            }
            nodobus actual = primero;
            nodobus auxiliar = primero;
            for(int i=0;i<tam;i++){
                if(actual!=null){
                    aux = actual;
                    actual = actual.next;
                    //System.out.println("entre al if posicion "+i);
                }
            }
            primero=auxiliar;
            return aux;
    }

    public int tamaño(){
        tamaño =0;
        if( estavacio() )
	{
		tamaño=0;
	}
	nodobus actual = ultimo;
        nodobus aux=ultimo;
	while( actual != null)
	{
                tamaño = tamaño+1;
		actual = actual.ant;
	}
        ultimo = aux;
        return tamaño;
    }
        
    public String nombreposicion(int tam){
        nombre="";
        if( estavacio() )
	{
	
	}
	nodobus actual = primero;
        nodobus auxiliar = primero;
        for(int i=0;i<tam;i++){
            if(actual!=null){
                nombre=actual.bus;
                actual = actual.next;
                //System.out.println("entre al if posicion "+i);
            }
        }
        primero=auxiliar;
        return nombre;
    }

        
}
