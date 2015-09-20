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
public class nodobus {
    String bus;
    String ruta;
    nodobus next;
    nodobus ant;
    nodobus(String bus,String ruta)
    {
        this.bus = bus;
        this.ruta = ruta;
        this.next=null;
        this.ant=null;
    }
    
}
