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
public class EstacionClave {
    int id;
    String nombre;
    String password;
    
    public EstacionClave(int id, String nombre, String password){
        this.id = id;
        this.nombre = nombre;
        this.password = password;
    }
}
