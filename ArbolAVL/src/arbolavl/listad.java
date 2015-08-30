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
public class listad {
    nodod primero;
    nodod ultimo;
    listad()
    {
        primero=null;
        ultimo=null;
    }
    
      public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
      
      public listad alta(String dat)
    {
        if((primero==null))
        {
            nodod nuevo=new nodod(dat);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            nodod nuevo=new nodod(dat);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
        return this;
    }

        public boolean delete(String num)
    {
        nodod anterior=null;
        nodod actual=primero;
        
       
        while(actual!=ultimo)
        {
            if(actual.dia.compareTo(num)==0)
            {
                if(anterior==null)
                {
                    primero=actual.next;
                    primero.ant=null;
                }
                else{
                    anterior.next=actual.next;
                    nodod temporal;
                    temporal=actual.next;
                    temporal.ant=anterior;
                }
                return true;
            }
            anterior=actual;
            actual=actual.next;
        }
       
        if(num.compareTo(ultimo.dia)==0)
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
	nodod actual = ultimo;
	while( actual != null)
	{
                t = t+1;
		actual = actual.ant;
	}
        return t;
    }
    
     public void reemplazarInsertar(String dia,String hora){
        nodod actual;
        actual = primero;
        
        while(actual!=null){
                if(actual.dia.compareTo(dia)==0){
                    actual.hora.alta(hora);
                }
                actual = actual.next;
        }
    }
      
     
        
    public void imprimir()
    {
        nodod actual;
        actual=primero;
        System.out.println("IMPRIMIR LISTA DOBLE");
        while(actual!=null)
        {
            System.out.println(" id : "+actual.dia);
            System.out.println("valor de actual.hora "+actual.hora);
            actual.hora.imprimir();
            
            actual=actual.next;
        }
           
       
   }
     
}
