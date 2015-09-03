/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolavl;

/**
 *
 * @author Carlos Gomez
 */
public class listaasignar {
 nodoasignar primero;
 nodoasignar ultimo;
    listaasignar()
    {
        primero=null;
        ultimo=null;
    }
    
      public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
      
      public listaasignar alta(String dat,String ruta,int clavechofer,String hora, String horaf,String fecha)
    {
        if((primero==null))
        {
            nodoasignar nuevo=new nodoasignar(dat,ruta,clavechofer,hora,horaf,fecha);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            nodoasignar nuevo=new nodoasignar(dat,ruta,clavechofer,hora,horaf,fecha);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }
      
        public boolean delete(String num)
    {
        nodoasignar anterior=null;
        nodoasignar actual=primero;
        
       
        while(actual!=ultimo)
        {
            if(actual.idbus.compareTo(num)==0)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    nodoasignar temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
       
        if(num.compareTo(ultimo.idbus)==0)
        {
             if(primero==ultimo){
                primero = ultimo = null;
            }
             else{
                ultimo=actual.ant;
             }
            return true;
        }
        return false;
    }
        
         public String imprimir(String idbus)
    {
        nodoasignar actual;
        String concatenar="";
        actual=primero;
        while(actual!=null)
        {
            if(actual.idbus.compareTo(idbus)==0){
            System.out.println("bus: "+actual.idbus+" ruta: "+actual.ruta+" hora ini: "+actual.horaini+" hora fin: "+actual.horafin+" fecha: "+actual.fecha);
            concatenar=concatenar+"bus: "+actual.idbus+" ruta: "+actual.ruta+" hora ini: "+actual.horaini+" hora fin: "+actual.horafin+" fecha: "+actual.fecha;
            actual=actual.next;
            }
        }
       
         return concatenar;  
                 
    }

}
