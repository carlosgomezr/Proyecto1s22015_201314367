/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
    public void InsertarRuta(String ruta,String estacion){
     if(verificar(ruta)==true){
         reemplazarInsertar(ruta,estacion);
     }
     else{
         alta(ruta);
         reemplazarInsertar(ruta,estacion);
     }
     
    } 
    public boolean verificar(String ruta){
    boolean flag=false;
    nodor actual;
    actual = primero;
        
        while(actual!=null){
                if(actual.ruta.compareTo(ruta)==0){
                   flag = true;
                }
                actual = actual.next;
        }
    return flag;
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
    
     
     public String imprimir()
    {
        String aux="";
        nodor actual;
        actual=primero;
       // System.out.println("IMPRIMIR LISTA DOBLE");
        while(actual!=null)
        {
         //   System.out.println(" id : "+actual.ruta);
         //   System.out.println("valor de actual.hora "+actual.estacion);
            actual.estacion.imprimir();
            aux = aux + " id: "+actual.ruta+"\n";
            aux = aux +actual.estacion.imprimir();
            actual=actual.next;
        }
           
        return aux;      
   }
     
     public void graphRuta(listar lista,String ruta,String nombre){
    int contador=0;        
    int contador1=1;
            listar aux = lista;
	    File f;
            
	    FileWriter escribir;
	    try{
	    f = new File(ruta);
	    escribir = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(escribir);
	    PrintWriter pw = new PrintWriter(bw);
            pw.write("digraph grafica { \n");
            pw.write("label= \" " +nombre+"\"");
            pw.write("node [shape=record];\n");
	    pw.write("subgraph g { \n "); 
            if(lista.primero!=null){
                
         
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            pw.write("nodefecha"+contador+"[label=\" id: "+aux.primero.ruta+" \"];\n");
                            pw.write("nodefecha"+contador1+"[label=\" id: "+aux.primero.next.ruta+" \"];\n");
                            pw.write("nodefecha"+contador+"->nodefecha"+contador1+";\n");
                            pw.write("nodefecha"+contador1+"->nodefecha"+contador+";\n");
                            pw.write(graphRutaEstacion(aux.primero.estacion,Integer.toString(contador),aux.primero.ruta));
                            pw.write(graphRutaEstacion(aux.primero.next.estacion,Integer.toString(contador1),aux.primero.next.ruta));
                            
                            aux.primero = aux.primero.next;
                            contador=contador+1;
                            contador1=contador1+1;
                        }
                    }
                    else{
                            pw.write("nodefecha"+contador+"[label=\" id: "+aux.primero.ruta+" \"];\n");
                            pw.write(graphRutaEstacion(aux.primero.estacion,Integer.toString(contador),aux.primero.ruta));
                        
                    }
                
            }
            else{
                    System.out.println("    lista vacia xd ");
            }
            pw.write("}\n");
	    pw.write("}\n");
	    pw.close();
	    bw.close();
	    }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }       
}

     
     public String graphRutaEstacion(listae lista,String cluster,String nombre){
            String auxiliar="";
            int conta= 0;
            int conta1 = 1;
            listae aux = lista;
	    File f;
            try{
	    auxiliar = auxiliar+"	subgraph cluster"+cluster+" { \n";
            auxiliar = auxiliar+"label= \" " +nombre+"\"";
            if(lista.primero!=null){
                
         
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            auxiliar=auxiliar+"nodehora"+cluster+"c"+conta+"[label=\" estacion: "+aux.primero.estacion+" \"];\n";
                            auxiliar=auxiliar+"nodehora"+cluster+"c"+conta1+"[label=\" estacion: "+aux.primero.next.estacion+" \"];\n";
                            auxiliar=auxiliar+"nodehora"+cluster+"c"+conta+"->nodehora"+cluster+"c"+conta1+";\n";
                            auxiliar=auxiliar+"nodehora"+cluster+"c"+conta1+"->nodehora"+cluster+"c"+conta+";\n";
                            aux.primero = aux.primero.next;
                            conta=conta+1;
                            conta1=conta+1;
                        }
                    }
                    else{
                          auxiliar=auxiliar+"nodehora"+cluster+"c"+conta+"[label=\" estacion: "+aux.primero.estacion+" \"];\n";
                    }
                
            }
            else{
                    System.out.println("    lista vacia xd ");
            }
            auxiliar=auxiliar+"}\n";
	    
	    }
	    catch(Exception e){System.out.println("Error: "+e.getMessage());
            
            }       
            return auxiliar;
}

     
}
