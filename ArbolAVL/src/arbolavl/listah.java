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
public class listah {
    nodoh primero;
    nodoh ultimo;
    listah()
    {
        primero=null;
        ultimo=null;
    }
    
      public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
      
      public listah alta(String dat)
    {
        if((primero==null))
        {
            nodoh nuevo=new nodoh(dat);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            nodoh nuevo=new nodoh(dat);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }

          public boolean delete(String num)
    {
        nodoh anterior=null;
        nodoh actual=primero;
        
       
        while(actual!=ultimo)
        {
            if(actual.hora.compareTo(num)==0)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    nodoh temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
       
        if(num.compareTo(ultimo.hora)==0)
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
            nodoh actual = ultimo;
            while( actual != null)
        	{
                t = t+1;
		actual = actual.ant;
            }
            return t;
        }
    public void imprimir()
    {
        nodoh actual;
        actual=primero;
        while(actual!=null)
        {
            System.out.println(" hora : "+actual.hora);
            
            actual=actual.next;
        }
       
           
                 
    }
    
}
