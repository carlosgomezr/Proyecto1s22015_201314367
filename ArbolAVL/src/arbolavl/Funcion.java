
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolavl;

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
public void generarListaDoble(listasdobles lista,String ruta){
            listasdobles aux = lista;
	    File f;
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
                            pw.write("node"+aux.primero.b.id+"[label=\" id: "+aux.primero.b.id+" ruta: "+aux.primero.b.nombre +" chofer: "+aux.primero.b.ClaveChofer+" horaIni "+aux.primero.b.horarioIni+" horaFin "+aux.primero.b.horarioFin+" fecha "+aux.primero.b.fecha+" \"];\n");
                            pw.write("node"+aux.primero.next.b.id+"[label=\" id: "+aux.primero.next.b.id+" ruta: "+aux.primero.next.b.nombre+" chofer: "+aux.primero.next.b.ClaveChofer+" horaIni "+aux.primero.next.b.horarioIni+" horaFin "+aux.primero.next.b.horarioFin+" fecha "+aux.primero.next.b.fecha+" \"];\n");
                            pw.write("node"+aux.primero.b.id+"->node"+aux.primero.next.b.id+";\n");
                            pw.write("node"+aux.primero.next.b.id+"->node"+aux.primero.b.id+";\n");
                            aux.primero = aux.primero.next;
                        }
                    }
                    else{
                            pw.write("node"+aux.primero.b.id+"[label=\" id: "+aux.primero.b.id+" ruta: "+aux.primero.b.nombre +" chofer: "+aux.primero.b.ClaveChofer+" horaIni "+aux.primero.b.horarioIni+" horaFin "+aux.primero.b.horarioFin+" fecha "+aux.primero.b.fecha+" \"];\n");
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


public void generarFecha(listad lista,String ruta,String nombre){
            listad aux = lista;
	    File f;
            int contador=0;
            int contador1=1;
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
                            pw.write("node"+contador+"[label=\" id: "+aux.primero.dia+" \"];\n");
                            pw.write("node"+contador1+"[label=\" id: "+aux.primero.next.dia+" \"];\n");
                            pw.write("node"+contador+"->node"+contador1+";\n");
                            pw.write("node"+contador1+"->node"+contador+";\n");
                            pw.write(generarListaDia(aux.primero.hora,Integer.toString(contador),aux.primero.dia));
                            
                            aux.primero = aux.primero.next;
                            contador=contador+1;
                            contador1=contador1+1;
                        }
                    }
                    else{
                            pw.write("node"+contador+"[label=\" id: "+aux.primero.dia+" \"];\n");
                            //pw.write(generarListaDia(aux.primero.hora,Integer.toString(contador),aux.primero.dia));
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

public String generarListaDia(listah lista,String cluster,String nombre){
            String auxiliar="";
            listah aux = lista;
	    File f;
            int contador=0;
            int contador1=1;
	    try{
	    auxiliar = auxiliar+"	subgraph cluster"+cluster+" { \n";
            auxiliar = auxiliar+"label= \" " +nombre+"\"";
            if(lista.primero!=null){
                
         
                    if(aux.primero.next!=null){
                        while(aux.primero.next!=null){
                            auxiliar=auxiliar+"nodeh"+contador+nombre+"[label=\" bus: "+aux.primero.bus+" ruta: "+aux.primero.ruta+" hora i: "+aux.primero.hora+" hora f: "+aux.primero.horaf+" \"];\n";
                            auxiliar=auxiliar+"nodeh"+contador1+nombre+"[label=\" bus: "+aux.primero.next.bus+" ruta: "+aux.primero.next.ruta+" hora i: "+aux.primero.next.hora+" hora f: "+aux.primero.next.horaf+" \"];\n";
                            auxiliar=auxiliar+"nodeh"+contador+nombre+"->nodeh"+contador1+nombre+";\n";
                            auxiliar=auxiliar+"nodeh"+contador1+nombre+"->nodeh"+contador+nombre+";\n";
                            aux.primero = aux.primero.next;
                            contador=contador+1;
                            contador1=contador1+1;
                        }
                    }
                    else{
                          auxiliar=auxiliar+"nodeh"+contador+nombre+"[label=\" bus: "+aux.primero.bus+" ruta: "+aux.primero.ruta+" hora i: "+aux.primero.hora+" hora f: "+aux.primero.horaf+" \"];\n";
                            
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


public void generarListaRuta(listae lista,String ruta,String nombre){
            listae aux = lista;
	    File f;
            int contador=0;
            int contador1=1;
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

public void leerCSV(listasdobles l){
  
        try {
        JFileChooser buscador = new JFileChooser();
	buscador.showOpenDialog(buscador);
        String direc = buscador.getSelectedFile().getAbsolutePath();
         
        CsvReader usuarios_import = new CsvReader(direc);
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
            Bus nuevo = new Bus(id,ruta,aux,HorarioIni,HorarioFin,fecha);
            l.alta(nuevo);
        }
         
        usuarios_import.close();
      
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
