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
public class nodohora {
    String hora;
    nodohora next;
    nodohora ant;
    nodohora(String hora)
    {
        this.hora = hora;
        this.next=null;
        this.ant=null;
    }
    
}
