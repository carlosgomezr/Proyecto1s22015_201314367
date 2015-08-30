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
public class AVLNodeAdmin {
   
    String correo;
    String password;      	 // el dato del nodo
    public AVLNodeAdmin izquierdo;            // hijo izquierdo
    public AVLNodeAdmin derecho;              // hijo derecho
    public int height;                   // altura

    // Constructors
    public AVLNodeAdmin( String correo, String password ){
        this( correo,password, null, null );
    }

    public AVLNodeAdmin( String correo, String password, AVLNodeAdmin izq, AVLNodeAdmin der ){
        this.correo = correo;
        this.password = password;
        this.izquierdo = izq;
        this.derecho = der;
        height   = 0;               // altura predeterminada
    }
}
