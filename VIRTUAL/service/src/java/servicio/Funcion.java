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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;

/**
 *
 * @author Carlos Gomez
 **/
public class Funcion {
String resumenChofer="";
public void generarListaDoble(listasdobles lista,String ruta){
            listasdobles aux = lista;
            nodo auxprimero = lista.primero;
            nodo auxultimo = lista.ultimo;
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
            pw.write("label= \"LISTA DOBLE  BUSES ;B\"");
            pw.write("node [shape=record];\n");
	    pw.write("subgraph g { \n "); 
            if(aux.primero!=null){
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
                            pw.write("node"+c2+"[label=\" id: "+aux.primero.id+" \"];\n");
                    }
                
            }
            else{
                    System.out.println("    lista vacia xd ");
            }
            pw.write("}\n");
	    pw.write("}\n");
	    pw.close();
	    bw.close();
            aux.primero = auxprimero;
            aux.ultimo = auxultimo;
	    }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }       
}

public void generarAsignacion(listasdobles lista,String ruta){
            listasdobles aux = lista;
	    File f;
            int c = 0;
            int c2 = 1;
	    nodo auxprimero = lista.primero;
            nodo auxultimo = lista.ultimo;
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
            if(aux.primero!=null){
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){ 
                            pw.write("node"+c+"[label=\" id: "+aux.primero.id+" ruta: "+aux.primero.nombre+" ChoferClave: "+aux.primero.ClaveChofer+" HoraIni: "+aux.primero.horarioIni+" HoraFin: "+aux.primero.horarioFin+" Fecha: "+aux.primero.fecha+"\"];\n");
                            pw.write("node"+c2+"[label=\" id: "+aux.primero.next.id+" ruta: "+aux.primero.next.nombre+" ChoferClave: "+aux.primero.next.ClaveChofer+" HoraIni: "+aux.primero.next.horarioIni+" HoraFin: "+aux.primero.next.horarioFin+" Fecha: "+aux.primero.next.fecha+" \"];\n");
                            pw.write("node"+c+"->node"+c2+";\n");
                            pw.write("node"+c2+"->node"+c+";\n");
                            aux.primero = aux.primero.next;
                            c=c+1;
                            c2=c2+1;
                        }
                    }
                    else{
                            pw.write("node"+c2+"[label=\" id: "+aux.primero.id+" ruta: "+aux.primero.nombre+" ChoferClave: "+aux.primero.ClaveChofer+" HoraIni: "+aux.primero.horarioIni+" HoraFin: "+aux.primero.horarioFin+" Fecha: "+aux.primero.fecha+" \"];\n");
                    }
                
            }
            else{
                    System.out.println("    lista vacia xd ");
            }
            pw.write("}\n");
	    pw.write("}\n");
	    pw.close();
	    bw.close();
	    aux.primero = auxprimero;
            aux.ultimo = auxultimo;
	    
            }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }       
}


public void generarListaDoble2(listasdobles lista,String ruta){
            listasdobles aux = lista;
	    File f;
            int contar = 0;
            int contar2= 1;
            nodo auxprimero = lista.primero;
            nodo auxultimo = lista.ultimo;
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
            if(aux.primero!=null){
                
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
                            pw.write("node"+contar2+"[label=\" id: "+aux.primero.id+" horario ini: "+aux.primero.horarioIni+" horario fin: "+aux.primero.horarioFin+" fecha: "+aux.primero.fecha+"\"];\n");
                        }
                
            }
            else{
                    System.out.println("    lista vacia xd ");
            }
            pw.write("}\n");
	    pw.write("}\n");
	    pw.close();
	    bw.close();
	    aux.primero = auxprimero;
            aux.ultimo = auxultimo;
	    
            }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }       
}


public String ResumenChoferxDia(AVLNodeChofer nuevo,int x){
    resumenChofer="";
    try{    
        if ( x<nuevo.id){
            if(nuevo.izquierdo!=null){
                ResumenChoferxDia(nuevo.izquierdo,x);
            }
        }
        if ( x>nuevo.id){
            if(nuevo.derecho!=null){
                ResumenChoferxDia(nuevo.derecho,x);
            }
        }        
        if( x==nuevo.id){
              System.out.print("si existe clave "+nuevo);
              nuevo.lista.imprimir();
              resumenChofer=resumenChofer+" "+nuevo.lista.imprimir;
        }
        else{
                System.out.println("clave no existe");
            }
    }catch(Exception ex){
    
    }
        return resumenChofer;
    }



public void ChoferxDia(AVLNodeChofer nuevo,int x,String ruta, String nombre){
    try{    
        if ( x<nuevo.id){
            if(nuevo.izquierdo!=null){
                ChoferxDia(nuevo.izquierdo,x,ruta,nombre);
            }
        }
        if ( x>nuevo.id){
            if(nuevo.derecho!=null){
                ChoferxDia(nuevo.derecho,x,ruta,nombre);
            }
        }        
        if( x==nuevo.id){
              System.out.print("si existe clave "+nuevo);
              generarFecha(nuevo.lista,ruta,nombre);
        }
        else{
                System.out.println("clave no existe");
            }
    }catch(Exception ex){
    
    }
   
    }
    

public void generarFecha(listad lista,String ruta,String nombre){
    int contador=0;        
    int contador1=1;
            listad aux = lista;
	    File f;
            nodod auxprimero = lista.primero;
            nodod auxultimo = lista.ultimo;
	    FileWriter escribir;
	    try{
	    f = new File(ruta);
	    escribir = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(escribir);
	    PrintWriter pw = new PrintWriter(bw);
            pw.write("digraph grafica { \n");
            pw.write("label= \" " +nombre+"\"");
            pw.write(" nodesep=.05;\n");
            pw.write(" rankdir=LR;\n");
            pw.write(" node [shape=record,width=.1,height=.1];");
	    pw.write("subgraph g { \n "); 
            if(aux.primero!=null){
                
         
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            pw.write("nodefecha"+contador+"[label=\" id: "+aux.primero.dia+" \"];\n");
                            pw.write("nodefecha"+contador1+"[label=\" id: "+aux.primero.next.dia+" \"];\n");
                            pw.write("nodefecha"+contador+"->nodefecha"+contador1+";\n");
                            pw.write("nodefecha"+contador1+"->nodefecha"+contador+";\n");
                            pw.write(generarListaDia(aux.primero.hora,Integer.toString(contador),aux.primero.dia));
                            pw.write(generarListaDia(aux.primero.next.hora,Integer.toString(contador1),aux.primero.next.dia));
                            
                            aux.primero = aux.primero.next;
                            contador=contador+1;
                            contador1=contador1+1;
                        }
                    }
                    else{
                            pw.write("nodefecha"+contador1+"[label=\" id: "+aux.primero.dia+" \"];\n");
                            pw.write(generarListaDia(aux.primero.hora,Integer.toString(contador1),aux.primero.dia));
                        
                    }
                
            }
            else{
                    System.out.println("    lista vacia xd ");
            }
            pw.write("}\n");
	    pw.write("}\n");
	    pw.close();
	    bw.close();
            aux.primero = auxprimero;
            aux.ultimo = auxultimo;    
	    }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }       
}

public String generarListaDia(listah lista,String cluster,String nombre){
            String auxiliar="";
            int conta= 0;
            int conta1 = 1;
            listah aux = lista;
	    File f;
            nodoh auxprimero = lista.primero;
            nodoh auxultimo = lista.ultimo;
            try{
	    auxiliar = auxiliar+"	subgraph cluster"+cluster+" { \n";
            auxiliar = auxiliar+"label= \" " +nombre+"\"";
            if(aux.primero!=null){
                
         
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            auxiliar=auxiliar+"nodehora"+cluster+"c"+conta+"[label=\" bus: "+aux.primero.bus+" ruta: "+aux.primero.ruta+" hora i: "+aux.primero.hora+" hora f: "+aux.primero.horaf+" \"];\n";
                            auxiliar=auxiliar+"nodehora"+cluster+"c"+conta1+"[label=\" bus: "+aux.primero.next.bus+" ruta: "+aux.primero.next.ruta+" hora i: "+aux.primero.next.hora+" hora f: "+aux.primero.next.horaf+" \"];\n";
                //          auxiliar=auxiliar+"nodehora"+cluster+"c"+conta+"->nodehora"+cluster+"c"+conta1+";\n";
                //          auxiliar=auxiliar+"nodehora"+cluster+"c"+conta1+"->nodehora"+cluster+"c"+conta+";\n";
                            aux.primero = aux.primero.next;
                            conta=conta+1;
                            conta1=conta+1;
                        }
                    }
                    else{
                          auxiliar=auxiliar+"nodehora"+cluster+"c"+conta1+"[label=\" bus: "+aux.primero.bus+" ruta: "+aux.primero.ruta+" hora i: "+aux.primero.hora+" hora f: "+aux.primero.horaf+" \"];\n";
                    }
                
            }
            else{
                    System.out.println("    lista vacia xd ");
            }
            auxiliar=auxiliar+"}\n";
	    aux.primero = auxprimero;
            aux.ultimo = auxultimo;
	    }
	    catch(Exception e){System.out.println("Error: "+e.getMessage());
            
            }       
            return auxiliar;
}


public void generarListaRuta(listae lista,String ruta,String nombre){
            listae aux = lista;
	    File f;
            int contador=0;
            int contador1=1;
	    nodoe auxprimero = lista.primero;
            nodoe auxultimo = lista.ultimo;
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
                            pw.write("node"+contador+"[label=\" id: "+aux.primero.estacion+" \"];\n");
                            pw.write("node"+contador1+"[label=\" id: "+aux.primero.next.estacion+" \"];\n");
                            pw.write("node"+contador+"->node"+contador1+";\n");
                            pw.write("node"+contador1+"->node"+contador+";\n");
                            aux.primero = aux.primero.next;
                            contador=contador+1;
                            contador1=contador1+1;
                        }
                    }
                    else{
                            pw.write("node"+contador+"[label=\" id: "+aux.primero.estacion+" \"];\n");
                    }
                
            }
            else{
                    System.out.println("    lista vacia xd ");
            }
            pw.write("}\n");
	    pw.write("}\n");
	    pw.close();
	    bw.close();
            aux.primero = auxprimero;
            aux.ultimo = auxultimo;
	    
	    }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }       
}


public String leer(){
    String cadena="";
	       try {
	            JFileChooser buscador = new JFileChooser();
	            buscador.showOpenDialog(buscador);
	            String contenido;
                    
	            String direc = buscador.getSelectedFile().getAbsolutePath();
	            FileReader doc =new FileReader(direc);
	            BufferedReader leer=new BufferedReader(doc);
	           
	            while((contenido=leer.readLine())!= null)
	            {
                        cadena = cadena+contenido;
	            }
	            doc.close();
	            leer.close();
	        
                } catch (IOException ex) {
	            System.out.println("Error: "+ex);
	        }
            return cadena;
}

public void generarImagen(String nombre,String ruta) {
    String rutaimagen = ruta;
    System.out.println("RUTA DE GENERAR " + rutaimagen);
        
        try {

//path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz
            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

//path del archivo creado con el codigo del graphviz que queremos
            String fileInputPath = rutaimagen;

//path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz
            String fileOutputPath = ruta+nombre+".png";

//tipo de imagen de salida, en este caso es jpg
            String tParam = "-Tpng";

            String tOParam = "-o";

//concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas
//recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

//Invocamos nuestra clase 
            Runtime rt = Runtime.getRuntime();

//Ahora ejecutamos como lo hacemos en consola
            rt.exec(cmd);

        } catch (IOException ex) {
            System.out.println("fallo");
        } finally {
        }
    }

public void leerCSV(listasdobles lista,listasdobles asignar,AVLTreeChofer arbol, listaestacion estaciones,listar rutas,String path){
  
        try {
        //JFileChooser buscador = new JFileChooser();
	//buscador.showOpenDialog(buscador);
        //String direc = buscador.getSelectedFile().getAbsolutePath();
         
        CsvReader usuarios_import = new CsvReader(path);
       // usuarios_import.readHeaders();
         
        while (usuarios_import.readRecord())
        {
            String id = usuarios_import.get(0);
            String ruta = usuarios_import.get(1);
            String ClaveChofer = usuarios_import.get(2);
            String HorarioIni = usuarios_import.get(3);
            String HorarioFin = usuarios_import.get(4);
            String fecha = usuarios_import.get(5);
            int aux = Integer.parseInt(ClaveChofer);
            asignar.alta(id,ruta,aux,HorarioIni,HorarioFin,fecha);
            estaciones.buscaInserta(rutas.PrimeraEstacion(ruta), id,ruta);
            if(lista.existe(id)==true){
                //System.out.println("Existe "+id); 
                //lista.ordenamiento(lista);
            }else{
                //System.out.println("No existe "+id);
                lista.alta(id,ruta,aux,HorarioIni,HorarioFin,fecha);
                //lista.ordenamiento(lista);
            }
            if(arbol.existe(arbol.root, aux)==true){
                System.out.println("AVL Existe "+aux);
                arbol.buscarInsertarHora(arbol.root, aux, fecha, id, ruta, HorarioIni, HorarioFin);
            }else{
                System.out.println("AVL No Existe "+aux);
                arbol.insert(aux, "Chofer","chofer", "chofer");
                arbol.buscarInsertarHora(arbol.root, aux, fecha, id, ruta, HorarioIni, HorarioFin);
            }
            
        }
         
        usuarios_import.close();
      
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public void graphEstaciones(listaestacion lista,String ruta,String nombre){
    int contador=0;        
    int contador1=1;
            listaestacion aux = lista;
	    File f;
            nodoestacion auxprimero = lista.primero;
            nodoestacion auxultimo = lista.ultimo;
	    FileWriter escribir;
	    try{
	    f = new File(ruta);
	    escribir = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(escribir);
	    PrintWriter pw = new PrintWriter(bw);
            pw.write("digraph grafica { \n");
            pw.write("label= \" " +nombre+"\"");
            pw.write(" nodesep=.05;\n");
            pw.write(" rankdir=LR;\n");
            pw.write(" node [shape=record,width=.1,height=.1];");
	    pw.write("subgraph g { \n "); 
            if(aux.primero!=null){
                
         
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            pw.write("nodefecha"+contador+"[label=\" id: "+aux.primero.estacion+" \"];\n");
                            pw.write("nodefecha"+contador1+"[label=\" id: "+aux.primero.next.estacion+" \"];\n");
                            pw.write("nodefecha"+contador+"->nodefecha"+contador1+";\n");
                            pw.write("nodefecha"+contador1+"->nodefecha"+contador+";\n");
                            pw.write(graphBusyRuta(aux.primero.lista,Integer.toString(contador),aux.primero.estacion));
                            pw.write(graphBusyRuta(aux.primero.next.lista,Integer.toString(contador1),aux.primero.next.estacion));
                            
                            aux.primero = aux.primero.next;
                            contador=contador+1;
                            contador1=contador1+1;
                        }
                    }
                    else{
                            pw.write("nodefecha"+contador1+"[label=\" id: "+aux.primero.estacion+" \"];\n");
                            pw.write(graphBusyRuta(aux.primero.next.lista,Integer.toString(contador1),aux.primero.next.estacion));
                           
                    }
                
            }
            else{
                    System.out.println("    lista vacia xd ");
            }
            pw.write("}\n");
	    pw.write("}\n");
	    pw.close();
	    bw.close();
            aux.primero = auxprimero;
            aux.ultimo = auxultimo;    
	    }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }       
}


public String graphBusyRuta(listabus lista,String cluster,String nombre){
            String auxiliar="";
            int conta= 0;
            int conta1 = 1;
            listabus aux = lista;
	    File f;
            nodobus auxprimero = lista.primero;
            nodobus auxultimo = lista.ultimo;
            try{
	    auxiliar = auxiliar+"	subgraph cluster"+cluster+" { \n";
            auxiliar = auxiliar+"label= \" " +nombre+"\"";
            if(aux.primero!=null){
                
         
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            auxiliar=auxiliar+"nodehora"+cluster+"c"+conta+"[label=\" bus: "+aux.primero.bus+" ruta: "+aux.primero.ruta+" \"];\n";
                            auxiliar=auxiliar+"nodehora"+cluster+"c"+conta1+"[label=\" bus: "+aux.primero.next.bus+" ruta: "+aux.primero.next.ruta+" \"];\n";
                //          auxiliar=auxiliar+"nodehora"+cluster+"c"+conta+"->nodehora"+cluster+"c"+conta1+";\n";
                //          auxiliar=auxiliar+"nodehora"+cluster+"c"+conta1+"->nodehora"+cluster+"c"+conta+";\n";
                            aux.primero = aux.primero.next;
                            conta=conta+1;
                            conta1=conta+1;
                        }
                    }
                    else{
                          auxiliar=auxiliar+"nodehora"+cluster+"c"+conta1+"[label=\" bus: "+aux.primero.bus+" ruta: "+aux.primero.ruta+" \"];\n";
                    }
                
            }
            else{
                    System.out.println("    lista vacia xd ");
            }
            auxiliar=auxiliar+"}\n";
	    aux.primero = auxprimero;
            aux.ultimo = auxultimo;
	    }
	    catch(Exception e){System.out.println("Error: "+e.getMessage());
            
            }       
            return auxiliar;
}

}
