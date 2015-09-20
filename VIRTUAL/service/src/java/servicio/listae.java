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
public class listae {
    nodoe primero;
    nodoe ultimo;
    listae()
    {
        primero=null;
        ultimo=null;
    }
    
      public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
      
      public listae alta(String dat)
    {
        if((primero==null))
        {
            nodoe nuevo=new nodoe(dat);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            nodoe nuevo=new nodoe(dat);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }

          public boolean delete(String num)
    {
        nodoe anterior=null;
        nodoe actual=primero;
        nodoe aux = primero;
       
        while(actual!=ultimo)
        {
            if(actual.estacion.compareTo(num)==0)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    nodoe temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
       
        if(num.compareTo(ultimo.estacion)==0)
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

        public int tamaño(){
            int t=0;
            if( estavacio() )
            {
		t=0;
            }
            nodoe actual = ultimo;
            nodoe aux = ultimo;
            while( actual != null)
        	{
                t = t+1;
		actual = actual.ant;
            }
            ultimo = aux;
            return t;
        }
        
        
      public String imprimir()
    {
        String aux="";
        nodoe actual;
        nodoe auxiliar=primero;
        actual=primero;
        while(actual!=null)
        {
       //   System.out.println(" estacion : "+actual.estacion);
            aux= aux+"      estacion:"+actual.estacion+"\n";
            actual=actual.next;
        }
        primero = auxiliar;
           
        return aux;  
    }
      
    public String BuscarEstacion(String estacion){
    String estacionsiguiente="";
    nodoe actual;
    actual = primero;
    nodoe aux = primero;    
        while(actual!=null){
                if(actual.estacion.compareTo(estacion)==0){
                    if(actual.next!=null){
                        estacionsiguiente=actual.next.estacion;
                    }
                }
                actual = actual.next;
        }
    primero = aux;
    return estacionsiguiente;
    }
      
}
