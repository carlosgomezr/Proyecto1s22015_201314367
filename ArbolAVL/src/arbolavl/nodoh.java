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
public class nodoh {
    String hora;
    nodoh next;
    nodoh ant;
    nodoh(String hora)
    {
        this.hora = hora;
        this.next=null;
        this.ant=null;
    }
}
