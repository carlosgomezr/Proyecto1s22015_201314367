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
        EstacionClave e1 = new EstacionClave(1,"nombre","apellido");
        EstacionClave e2 = new EstacionClave(2,"nombre","apellido");
        EstacionClave e3 = new EstacionClave(3,"nombre","apellido");
        EstacionClave e4 = new EstacionClave(4,"nombre","apellido");
        EstacionClave e5 = new EstacionClave(5,"nombre","apellido");
        EstacionClave e6 = new EstacionClave(6,"nombre","apellido");
        EstacionClave e7 = new EstacionClave(7,"nombre","apellido");
        EstacionClave e8 = new EstacionClave(8,"nombre","apellido");
        arbolAVL.insert(e1);
        arbolAVL.insert(e2);
        arbolAVL.insert(e3);
        arbolAVL.insert(e4);
        arbolAVL.insert(e5);
        arbolAVL.insert(e6);
        arbolAVL.insert(e7);
        arbolAVL.insert(e8);
        arbolAVL.imprimir(arbolAVL.root);
        System.out.println("\n");
        Funcion f = new Funcion();
        f.GraphAVL(arbolAVL.root, "ArbolAVLEstacionesClave", "C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graph.txt");
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
        doble.ordenamiento(doble);
        f.generarListaDoble(doble,"C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphdoble.txt");
        f.generarImagen("ListaDoble","C:\\Users\\estua_000\\Documents\\NetBeansProjects\\ArbolAVL\\src\\Diagramas\\graphdoble.txt");
        
       // String aux = f.leer();
       // System.out.println(aux);
       
    }
    
}
