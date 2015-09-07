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
public class listahora {
    nodohora primero;
    nodohora ultimo;
    listahora()
    {
        primero=null;
        ultimo=null;
    }
    
      public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
      
      public listahora alta(String dat)
    {
        if((primero==null))
        {
            nodohora nuevo=new nodohora(dat);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            nodohora nuevo=new nodohora(dat);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }

        public int tamaño(){
            int t=0;
            if( estavacio() )
            {
		t=0;
            }
            nodohora actual = ultimo;
            while( actual != null)
        	{
                t = t+1;
		actual = actual.ant;
            }
            return t;
        }
    public void imprimir()
    {
        nodohora actual;
        actual=primero;
        while(actual!=null)
        {
            System.out.println("hora: "+actual.hora);
            
            actual=actual.next;
        }
       
           
                 
    }
    
}
