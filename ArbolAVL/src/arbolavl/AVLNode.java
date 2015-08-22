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
public class AVLNode {
    public EstacionClave dato;      	 // el dato del nodo
    public AVLNode izquierdo;            // hijo izquierdo
    public AVLNode derecho;              // hijo derecho
    public int height;                   // altura

    // Constructors
    public AVLNode( EstacionClave dato ){
        this( dato, null, null );
    }

    public AVLNode( EstacionClave dato, AVLNode izq, AVLNode der ){
        this.dato = dato;
        this.izquierdo = izq;
        this.derecho = der;
        height   = 0;               // altura predeterminada
    }
}
