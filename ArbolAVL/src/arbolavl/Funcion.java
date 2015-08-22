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

/**
 *
 * @author Carlos Gomez
 **/
public class Funcion {

public String ToDot(AVLNode node)
{
    String stream="";
    
    if(node.izquierdo !=null)
        {
            stream=stream+"nodea"+node.dato.id+"[label=\" clave: "+node.dato.id+"\n \n NOMBRE: "+node.dato.nombre+" \n \n PASSWORD: "+node.dato.password+"\"];\n";
            stream=stream+"nodea"+node.izquierdo.dato.id+"[label=\" clave: "+node.izquierdo.dato.id+"\n \n NOMBRE: "+node.izquierdo.dato.nombre+" \n \n PASSWORD: "+node.izquierdo.dato.password+"\"];\n";
            stream=stream+"nodea"+node.dato.id+"->nodea"+node.izquierdo.dato.id+"[label=\"izq\"];\n";
            stream=stream+ToDot(node.izquierdo);
            //if(node->lista!=NULL){
            //conca+=graficarjuego(node->lista);
            //}              
        }
    if(node.derecho !=null)
        {
            stream=stream+"nodea"+node.dato.id+"[label=\" clave: "+node.dato.id+"\n \n NOMBRE: "+node.dato.nombre+" \n \n PASSWORD: "+node.dato.password+"\"];\n";
            stream=stream+"nodea"+node.derecho.dato.id+"[label=\" clave: "+node.derecho.dato.id+"\n \n NOMBRE: "+node.derecho.dato.nombre+" \n \n PASSWORD: "+node.derecho.dato.password+"\"];\n";
            stream=stream+"nodea"+node.dato.id+"->nodea"+node.derecho.dato.id+"[label=\"izq\"];\n";
            stream=stream+ToDot(node.derecho);
        }
    if(node!=null){
            stream=stream+"nodea"+node.dato.id+"[label=\" clave: "+node.dato.id+"\n \n NOMBRE: "+node.dato.nombre+" \n \n PASSWORD: "+node.dato.password+"\"];\n";
            //if(node->lista!=NULL){
                 //   conca+=graficarjuego(node->lista);
               // }
                //cod += graficarjuego(node->lista);
            }
            return stream;
        }

public void GraphAVL(AVLNode node,String nombre,String ruta){
	    File f;
	    FileWriter escribir;
	    String cod="";
            try{
	    System.out.println(ruta);
	    f = new File(ruta);
	    escribir = new FileWriter(f);
	    BufferedWriter bw = new BufferedWriter(escribir);
	    PrintWriter pw = new PrintWriter(bw);
            pw.write("digraph grafica { \n");
            pw.write("label= \" "+nombre+ "\"");
            pw.write("node [shape=record];\n");
            pw.write("subgraph g {\n");

                cod=cod+(ToDot(node));
            pw.write(cod);    
            pw.write("}\n");
            pw.write("}\n");
            
	    pw.close();
	    bw.close();
            }
	    catch(IOException e){System.out.println("Error: "+e.getMessage());
            
            }
            
       
}


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
            pw.write("label= \"LISTA DOBLE  PERSONAJES\"");
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

}
