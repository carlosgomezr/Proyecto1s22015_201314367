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
public class listar {
    nodor primero;
    nodor ultimo;
    listar()
    {
        primero=null;
        ultimo=null;
    }
    
      public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
      
      public listar alta(String dat)
    {
        if((primero==null))
        {
            nodor nuevo=new nodor(dat);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            nodor nuevo=new nodor(dat);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }
      
      
          public boolean delete(String num)
    {
        nodor anterior=null;
        nodor actual=primero;
        
       
        while(actual!=ultimo)
        {
            if(actual.ruta.compareTo(num)==0)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    nodor temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
       
        if(num.compareTo(ultimo.ruta)==0)
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

        public int tamaño(){
        int t=0;
        if( estavacio() )
	{
		t=0;
	}
	nodor actual = ultimo;
	while( actual != null)
	{
                t = t+1;
		actual = actual.ant;
	}
        return t;
    }
    
     public void reemplazarInsertar(String ruta,String estacion){
        nodor actual;
        actual = primero;
        
        while(actual!=null){
                if(actual.ruta.compareTo(ruta)==0){
                    actual.estacion.alta(estacion);
                }
                actual = actual.next;
        }
    }
    
    public void reemplazarEliminar(String ruta,String estacion){
        nodor actual;
        actual = primero;
        
        while(actual!=null){
                if(actual.ruta.compareTo(ruta)==0){
                    actual.estacion.delete(estacion);
                }
                actual = actual.next;
        }
    }
      
     public nodor Ruta(String ruta){
        nodor actual;
        nodor retornar=new nodor("");
        actual = primero;
        
        while(actual!=null){
                if(actual.ruta.compareTo(ruta)==0){
                    retornar = actual;
                }
                actual = actual.next;
        }
        return retornar;
    }
    
    public void imprimir()
    {
        nodor actual;
        actual=primero;
        System.out.println("IMPRIMIR LISTA DOBLE");
        while(actual!=null)
        {
            System.out.println(" id : "+actual.ruta);
            System.out.println("valor de actual.hora "+actual.estacion);
            actual.estacion.imprimir();
            
            actual=actual.next;
        }
           
       
   }
    
}
