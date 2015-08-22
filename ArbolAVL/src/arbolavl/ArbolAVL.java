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
        String aux = f.leer();
        System.out.println(aux);
    }
    
}
