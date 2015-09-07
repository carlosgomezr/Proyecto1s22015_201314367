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
public class AVLNodeChofer {
    int id;
    listad lista;
    String nombre;
    String apellido;
    String password;      	 // el dato del nodo
    public AVLNodeChofer izquierdo;            // hijo izquierdo
    public AVLNodeChofer derecho;              // hijo derecho
    public int height;                   // altura

    // Constructors
    public AVLNodeChofer( int id, String nombre, String apellido,String password ){
        this( id,nombre,apellido,password, null, null );
    }

    public AVLNodeChofer( int id, String nombre,String apellido, String password, AVLNodeChofer izq, AVLNodeChofer der ){
        this.id = id;
        this.lista = new listad();
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.izquierdo = izq;
        this.derecho = der;
        height   = 0;               // altura predeterminada
    }
    
}
