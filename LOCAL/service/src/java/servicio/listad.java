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
public class listad {
    nodod primero;
    nodod ultimo;
    String imprimir="";
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
        nodod aux=primero;
       
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
        primero = aux;
        return false;
    }

    public int tamaño(){
        int t=0;
        nodod aux = ultimo;
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
        ultimo = aux;
        return t;
    }
    
    public boolean existe(String dia){
    boolean flag=false;
    nodod actual;
    nodod aux = primero;
    actual = primero;
        
        while(actual!=null){
                if(actual.dia.compareTo(dia)==0){
                    flag = true;
                }
                actual = actual.next;
        }
        primero = aux;
        return flag;
    }
    
     public void reemplazarInsertar(String dia,String bus,String ruta,String hora,String horaf){
         if(existe(dia)==true){
            InsertarHora(dia,bus,ruta,hora,horaf);
         }
         else{
            alta(dia);
            InsertarHora(dia,bus,ruta,hora,horaf);
         }
     }
     
     public void InsertarHora(String dia,String bus,String ruta,String hora,String horaf){
        nodod actual;
        actual = primero;
        nodod aux = primero;
        while(actual!=null){
                if(actual.dia.compareTo(dia)==0){
                    actual.hora.alta(bus,ruta, hora, horaf);
                }
                actual = actual.next;
        }
        primero=aux;
    }
     
     public void reemplazarEliminar(String dia,String hora){
        nodod actual;
        actual = primero;
        nodod aux = primero;
        while(actual!=null){
                if(actual.dia.compareTo(dia)==0){
                    actual.hora.delete(hora);
                }
                actual = actual.next;
        }
        primero = aux;
    }
      
     public nodod Dia(String dia){
        nodod actual;
        nodod retornar=new nodod("");
        actual = primero;
        nodod aux = primero;
        while(actual!=null){
                if(actual.dia.compareTo(dia)==0){
                    retornar = actual;
                }
                actual = actual.next;
        }
        primero = aux;
        return retornar;
    }
     
        
    public String imprimir()
    {
        nodod actual;
        nodod aux= primero;
        imprimir="";
        actual=primero;
        //System.out.println("IMPRIMIR LISTA DOBLE");
        while(actual!=null)
        {
           // System.out.println(" id : "+actual.dia);
           // System.out.println("valor de actual.hora "+actual.hora);
            
            actual.hora.imprimir();
            imprimir = imprimir + " fecha: "+actual.dia+"       - "+actual.hora.imprimir();
            actual=actual.next; 
        }
        primero=aux;
     return imprimir;  
   }
     
}
