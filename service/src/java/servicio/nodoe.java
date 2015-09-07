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
public class nodoe {
    String estacion;
    nodoe next;
    nodoe ant;
    nodoe(String estacion)
    {
        this.estacion = estacion;
        this.next=null;
        this.ant=null;
    }
}
