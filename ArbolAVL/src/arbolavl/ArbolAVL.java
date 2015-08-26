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
import com.csvreader.CsvReader;

public class ArbolAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AVLTree arbolAVL = new AVLTree();
        
        arbolAVL.insert(1," 1 "," 1");
     //   arbolAVL.insert(2," 2 "," 2");
     //   arbolAVL.insert(3," 3 "," 3");
     //   arbolAVL.insert(4," 4 "," 4");
     //   arbolAVL.insert(5," 5 "," 5");
     //   arbolAVL.insert(6," 6 "," 6");
     //   arbolAVL.insert(7," 7 "," 7");
     //   arbolAVL.insert(8," 8 "," 8");
        arbolAVL.imprimir();
        System.out.println("\n");
   //     arbolAVL.eliminar(arbolAVL.root,5);
        arbolAVL.modificar(arbolAVL.root,1," 7 xd"," 7 :3");
        arbolAVL.imprimir(arbolAVL.root);
        arbolAVL.insert(8," 8 xxx"," 8zzz");
        System.out.println("\n");
        Funcion f = new Funcion();
        arbolAVL.GraphAVL(arbolAVL.root,"ArbolAVLEstacionesClave", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graph.txt");
        f.generarImagen("ArbolAVLEstacionesClave", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graph.txt");  
       
        listasdobles doble = new listasdobles();
        Bus b1 = new Bus("adulto","",6,"","","");
        Bus b2 = new Bus("agil","",3,"","","");
        Bus b3 = new Bus("aereo","",4,"","","");
        Bus b4 = new Bus("ahi","",1,"","","");
        Bus b5 = new Bus("acordion","",5,"","","");
        Bus b6 = new Bus("abeja","",2,"","","");
        doble.alta(b1);
        doble.alta(b2);
        doble.alta(b3);
        doble.alta(b4);
        doble.alta(b5);
        doble.alta(b6);
        System.out.println("Tamaño de la lista: "+doble.tamaño()+" elemento b2: "+doble.posicion(2).b.id);
        //doble.ordenamiento(doble);
        f.generarListaDoble(doble,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphdoble.txt");
        f.generarImagen("ListaDoble","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphdoble.txt");
        
       // String aux = f.leer();
       // System.out.println(aux);
      // listasdobles auxcsv = new listasdobles();
      // Funcion gh = new Funcion();
      // gh.leerCSV(auxcsv);
      // auxcsv.ordenamiento(auxcsv);
      // gh.generarListaDoble(auxcsv,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphdoble.txt");
      // gh.generarImagen("LISTA CSV", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphdoble.txt");
    }
    
}
