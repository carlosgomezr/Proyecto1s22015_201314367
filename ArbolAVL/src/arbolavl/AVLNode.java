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
    int id;
    String nombre;
    String password;      	 // el dato del nodo
    public AVLNode izquierdo;            // hijo izquierdo
    public AVLNode derecho;              // hijo derecho
    public int height;                   // altura

    // Constructors
    public AVLNode( int id, String nombre, String password ){
        this( id,nombre,password, null, null );
    }

    public AVLNode( int id, String nombre, String password, AVLNode izq, AVLNode der ){
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.izquierdo = izq;
        this.derecho = der;
        height   = 0;               // altura predeterminada
    }
}
