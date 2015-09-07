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
public class nodo {
    Bus b;
    nodo next;
    nodo ant;
    nodo(Bus b)
    {
        this.b = b;
        this.next=null;
        this.ant=null;
    }
    
}
