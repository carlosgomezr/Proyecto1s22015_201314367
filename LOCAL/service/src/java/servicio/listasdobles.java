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
public class listasdobles {
    public nodo primero;
    public nodo ultimo;
    public boolean flag=false;
    public String Busespecifico="";
    public boolean estavacio()
    {
        if(primero==null) return true;
        else return false;
    }
 
    public void alta(String id, String nombre, int clavechofer, String horarioIni, String horarioFin, String fecha)
    {
        if((primero==null))
        {
            nodo nuevo = new nodo(id,nombre,clavechofer,horarioIni,horarioFin,fecha);
            primero = nuevo;
            ultimo = nuevo;
        }
        else
        {
            nodo nuevo = new nodo(id,nombre,clavechofer,horarioIni,horarioFin,fecha);
            ultimo.next=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
       // return this;
    }

    public listasdobles baja(String id, String nombre, int clavechofer, String horarioIni, String horarioFin, String fecha)
    {
        if((ultimo==null))
        {
            nodo nuevo=new nodo(id,nombre,clavechofer,horarioIni,horarioFin,fecha);
            primero=nuevo;
            ultimo=nuevo;
        }
        else
        {
            //nodo nuevo=new nodo(dat);
            //ultimo.next=nuevo;
            //nuevo.ant=ultimo;
            //ultimo=nuevo;
            
            nodo nuevo=new nodo(id,nombre,clavechofer,horarioIni,horarioFin,fecha);
            primero.ant=nuevo;
            nuevo.next = primero;
            primero = nuevo;
        }
        return this;
    }
    
    
     public boolean delete(String num)
    {
        nodo anterior=null;
        nodo actual=primero;
        nodo aux=primero;
       
        while(actual!=ultimo)
        {
            if(actual.id.compareTo(num)==0)
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
        
        if(num.compareTo(ultimo.id)==0)
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
	nodo actual = ultimo;
        nodo aux=ultimo;
	while( actual != null)
	{
                t = t+1;
		actual = actual.ant;
	}
        ultimo = aux;
        return t;
    }
        
    public nodo posicion(int tam){
        nodo aux=null;
        if( estavacio() )
	{
		aux = null;
	}
	nodo actual = primero;
        nodo auxiliar = primero;
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
    
    public void reemplazar(String id,String nombre){
        nodo actual;
        actual = primero;
        nodo aux=primero;
        while(actual!=null){
                if(actual.id.compareTo(id)==0){
                    actual.nombre = nombre;
                }
                actual = actual.next;
        }
        primero = aux;
    }
    
    public boolean existe(String id){
        flag=false;
        nodo actual;
        nodo aux = primero;
        actual = primero;
        
        while(actual!=null){
                if(actual.id.compareTo(id)==0){
                    flag=true;
                }
                actual = actual.next;
        }
        primero=aux;
        return flag;
    }

    
    
     public void Modificar(listasdobles lista,nodo aj,nodo ajm){
        
        nodo actual=new nodo("","",0,"","","");
        //actual = ultimo;
        //nodo aux = ultimo;
        //while( actual != null)
	//{
            //System.out.println("j :"+aj.ClaveChofer+" j+1 "+ajm.ClaveChofer);
            //if(actual.b.ClaveChofer==aj.ClaveChofer){
          //  if(actual.id.compareTo(aj.id)==0){
        
                actual.id = aj.id;
                actual.nombre = aj.nombre;
                actual.ClaveChofer = aj.ClaveChofer;
                actual.horarioIni = aj.horarioIni;
                actual.horarioFin = aj.horarioFin;
                actual.fecha = aj.fecha;
                aj.id = ajm.id;
                aj.nombre = ajm.nombre;
                aj.ClaveChofer = ajm.ClaveChofer;
                aj.horarioIni = ajm.horarioIni;
                aj.horarioFin = ajm.horarioFin;
                aj.fecha = ajm.fecha;
                ajm.id = actual.id;
                ajm.nombre = actual.nombre;
                ajm.ClaveChofer = actual.ClaveChofer;
                ajm.horarioIni = actual.horarioIni;
                ajm.horarioFin = actual.horarioFin;
                ajm.fecha = actual.fecha;
            //}
          //  actual = actual.ant;
	//}
        //ultimo = aux;
    }
   
     public void ordenamiento(listasdobles lista){
     int tam = 0;
     nodo temp = new nodo("","",0,"","","");
     nodo aj = new nodo("","",0,"","","");
     nodo ajm = new nodo("","",0,"","","");
     tam = lista.tamaño()+1;
     System.out.println("Tamaño ");
         for(int i=1;i<=tam;i++){
             for(int j=1;j<=tam;j++){
                //if(lista.posicion(j).b.ClaveChofer>lista.posicion(j+1).b.ClaveChofer){ 
                if(lista.posicion(j).id.compareTo(lista.posicion(i).id)>0){
                     System.out.println("entro a >");
                     temp.id = lista.posicion(j).id;
                     temp.nombre = lista.posicion(j).nombre;
                     temp.ClaveChofer = lista.posicion(j).ClaveChofer;
                     temp.horarioIni = lista.posicion(j).horarioIni;
                     temp.horarioFin = lista.posicion(j).horarioFin;
                     temp.fecha = lista.posicion(j).fecha;
                     aj=lista.posicion(j);
                     ajm=lista.posicion(j+1);
                     aj.id = ajm.id;
                     aj.nombre = ajm.nombre;
                     aj.ClaveChofer = ajm.ClaveChofer;
                     aj.horarioIni = ajm.horarioIni;
                     aj.horarioFin = ajm.horarioFin;
                     aj.fecha = ajm.fecha;
                     ajm.id = temp.id;
                     ajm.nombre = temp.nombre;
                     ajm.ClaveChofer = temp.ClaveChofer;
                     ajm.horarioIni = temp.horarioIni;
                     ajm.horarioFin = temp.horarioFin;
                     ajm.fecha = temp.fecha;

                    // lista.Modificar(lista, lista.posicion(j),lista.posicion(j+1));
                    // lista.Modificar(lista, lista.posicion(j+1), temp);
                }
             }
         }
     }

      public String imprimir()
    {
        String con="";
        nodo actual;
        nodo aux=primero;
        actual=primero;
        while(actual!=null)
        {
            System.out.println("BUS: "+actual.id);
            con=con+" Bus: "+actual.id;
            actual=actual.next;
        }
       primero=aux;
           
        return con;
    }
      
        public void imprimir2()
    {
        nodo actual;
        nodo aux=primero;
        actual=primero;
        while(actual!=null)
        {
            System.out.println("Horario ini: "+actual.horarioIni+" Horario fin: "+actual.horarioFin+"\n");
            
            actual=actual.next;
        }
       primero = aux;
           
                 
    }
     public void insertarBusEspecifico(String clave,listasdobles bus)
    {
        nodo actual;
        actual=primero;
        nodo aux=primero;
        while(actual!=null)
        {
            if(actual.id.compareTo(clave)==0){
                bus.alta(actual.id, actual.nombre, actual.ClaveChofer, actual.horarioIni, actual.horarioFin,actual.fecha);
            }
            actual=actual.next;
        }          
        primero=aux;
    }
        
        
       public void Busespecifico(String bus)
    {
        listasdobles aux = new listasdobles();
        insertarBusEspecifico(bus, aux);
        Funcion f = new Funcion();
        f.generarAsignacion(aux,"\\\\CARLOS_GOMEZ\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphResumenBusEspecifico.txt");
        f.generarImagen("graphResumenBusEspecifico","\\\\CARLOS_GOMEZ\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphResumenBusEspecifico.txt");
    }
     
    public String BusespecificoString(String bus)
    {
        Busespecifico="";
        nodo actual;
        nodo aux=primero;
        actual=primero;
        while(actual!=null)
        {
            if(actual.id.compareTo(bus)==0){
                Busespecifico = "\n"+Busespecifico + " ruta: "+actual.nombre+" Horario Inicio: "+actual.horarioIni+" Horario Fin: "+actual.horarioFin+" Fecha: "+actual.fecha+" \n";
            }
            
            actual=actual.next;
        }
        primero=aux;
           return Busespecifico;
        
    }
   
           
    public void busxChofer(int clave,listasdobles Chofer)
    {
        nodo actual;
        actual=primero;
        nodo aux=primero;
        while(actual!=null)
        {
            if(actual.ClaveChofer==clave){
                if(verificar(actual.id,Chofer)==true){
                   System.out.println("si existe "+actual.id);
                }
                else{
                Chofer.alta(actual.id,actual.nombre,actual.ClaveChofer,actual.horarioIni,actual.horarioFin,actual.fecha);
                }
            }
            actual=actual.next;
        }          
        primero=aux;
    }
    
    public void horarioxChoferxbus(int clavechofer, String id,listasdobles horario){
        nodo actual;
        actual=primero;
        nodo aux=primero;
         while(actual!=null)
            {
            if((actual.ClaveChofer==clavechofer) && (actual.id.compareTo(id)==0)){
                horario.alta(actual.id,actual.nombre,actual.ClaveChofer,actual.horarioIni,actual.horarioFin,actual.fecha);
                }
            actual=actual.next;
            }
        primero=aux;    
        }          
   
    public boolean verificar(String id,listasdobles lista){
        boolean flag=false;
        nodo actual;
        actual = lista.primero;
        nodo aux= primero;
        while(actual!=null){
                if(actual.id.compareTo(id)==0){
                    flag=true;
                }
                actual = actual.next;
        }
        primero = aux;
        return flag;
    }
     
     
    
    
    public void reporteChoferxBus(int chofer){
        listasdobles aux = new listasdobles();
        busxChofer(chofer, aux);
        System.out.println("BUSXCHOFER----------"+chofer);
        aux.imprimir();
        Funcion f = new Funcion();
        f.generarListaDoble(aux,"\\\\CARLOS_GOMEZ\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphChoferxBus.txt");
        f.generarImagen("graphBusxChofer","\\\\CARLOS_GOMEZ\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphChoferxBus.txt");
    }
    
    public void reporteHoraxChofer(int chofer,String id){
        listasdobles aux = new listasdobles();
        horarioxChoferxbus(chofer,id,aux);
        System.out.println("HORARIO-------- chofer "+chofer+" bus "+id);
        aux.imprimir2();
        Funcion f = new Funcion();
        f.generarListaDoble2(aux,"\\\\CARLOS_GOMEZ\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphHoraxChofer.txt");
        f.generarImagen("graphHoraxChofer","\\\\CARLOS_GOMEZ\\Users\\estua_000\\Documents\\NetBeansProjects\\cliente\\web\\graphHoraxChofer.txt");
    }
    
    public void generarListaDoble(listasdobles lista,String ruta){
            listasdobles aux = lista;
	    File f;
            int c = 0;
            int c2 = 1;
	   
            FileWriter escribir;
	    try{
	    f = new File(ruta);
	    escribir = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(escribir);
	    PrintWriter pw = new PrintWriter(bw);
            pw.write("digraph grafica { \n");
            pw.write("label= \"LISTA DOBLE  BUSES\"");
            pw.write("node [shape=record];\n");
	    pw.write("subgraph g { \n "); 
            if(lista.primero!=null){
                
         
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            pw.write("node"+c+"[label=\" id: "+aux.primero.id+"\"];\n");
                            pw.write("node"+c2+"[label=\" id: "+aux.primero.next.id+" \"];\n");
                            pw.write("node"+c+"->node"+c2+";\n");
                            pw.write("node"+c2+"->node"+c+";\n");
                            aux.primero = aux.primero.next;
                            c=c+1;
                            c2=c2+1;
                        }
                    }
                    else{
                            pw.write("node"+c+"[label=\" id: "+aux.primero.id+" \"];\n");
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

public void generarAsignacion(String ruta){
            nodo aux = primero;
	    File f;
            int c = 0;
            int c2 = 1;
	   
            FileWriter escribir;
	    try{
	    f = new File(ruta);
	    escribir = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(escribir);
	    PrintWriter pw = new PrintWriter(bw);
            pw.write("digraph grafica { \n");
            pw.write("label= \"LISTA DOBLE  ASIGNACION\"");
            pw.write("node [shape=record];\n");
	    pw.write("subgraph g { \n "); 
            if(aux!=null){
                    if(aux.next!=null){
                        while(aux!=null){ 
                            pw.write("node"+c+"[label=\" id: "+aux.id+" ruta: "+aux.nombre+" ChoferClave: "+aux.ClaveChofer+" HoraIni: "+aux.horarioIni+" HoraFin: "+aux.horarioFin+" Fecha: "+aux.fecha+"\"];\n");
                            pw.write("node"+c2+"[label=\" id: "+aux.next.id+" ruta: "+aux.next.nombre+" ChoferClave: "+aux.next.ClaveChofer+" HoraIni: "+aux.next.horarioIni+" HoraFin: "+aux.next.horarioFin+" Fecha: "+aux.next.fecha+" \"];\n");
                            pw.write("node"+c+"->node"+c2+";\n");
                            pw.write("node"+c2+"->node"+c+";\n");
                            aux = aux.next;
                            c=c+1;
                            c2=c2+1;
                        }
                    }
                    else{
                            pw.write("node"+c+"[label=\" id: "+aux.id+" ruta: "+aux.nombre+" ChoferClave: "+aux.ClaveChofer+" HoraIni: "+aux.horarioIni+" HoraFin: "+aux.horarioFin+" Fecha: "+aux.fecha+" \"];\n");
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


public void generarListaDoble2(listasdobles lista,String ruta){
            listasdobles aux = lista;
	    File f;
            int contar = 0;
            int contar2= 1;
            FileWriter escribir;
	    try{
	    f = new File(ruta);
	    escribir = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(escribir);
	    PrintWriter pw = new PrintWriter(bw);
            pw.write("digraph grafica { \n");
            pw.write("label= \"LISTA DOBLE  BUSES\"");
            pw.write("node [shape=record];\n");
	    pw.write("subgraph g { \n "); 
            if(lista.primero!=null){
                
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            pw.write("node"+contar+"[label=\" id: "+aux.primero.id+" horario ini: "+aux.primero.horarioIni+" horario fin: "+aux.primero.horarioFin+" fecha: "+aux.primero.fecha+"\"];\n");
                            pw.write("node"+contar2+"[label=\" id: "+aux.primero.next.id+" horario ini: "+aux.primero.next.horarioIni+" horario fin: "+aux.primero.next.horarioFin+" fecha: "+aux.primero.next.fecha+" \"];\n");
                            pw.write("node"+contar+"->node"+contar2+";\n");
                            pw.write("node"+contar2+"->node"+contar+";\n");
                            aux.primero = aux.primero.next;
                            contar = contar+1;
                            contar2 = contar2+1;
                        }
                    }
                    else{
                            pw.write("node"+contar+"[label=\" id: "+aux.primero.id+" horario ini: "+aux.primero.horarioIni+" horario fin: "+aux.primero.horarioFin+" fecha: "+aux.primero.fecha+"\"];\n");
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

    
}
