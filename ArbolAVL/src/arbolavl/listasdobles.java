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
public class listasdobles {
    nodo primero;
    nodo ultimo;
    listasdobles()
    {
        primero=null;
        ultimo=null;
    }
    
      public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
 
    public listasdobles alta(Bus dat)
    {
        if((primero==null))
        {
            nodo nuevo=new nodo(dat);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            nodo nuevo=new nodo(dat);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }
    
     public boolean delete(String num)
    {
        nodo anterior=null;
        nodo actual=primero;
        
       
        while(actual!=ultimo)
        {
            if(actual.b.id.compareTo(num)==0)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    nodo temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
       
        if(num.compareTo(ultimo.b.id)==0)
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


}
