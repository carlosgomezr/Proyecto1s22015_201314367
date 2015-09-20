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
public class nodor {
    String ruta;
    listae estacion;
    nodor next;
    nodor ant;
    nodor(String ruta)
    {
        this.estacion=new listae();
        this.ruta = ruta;
        this.next=null;
        this.ant=null;
    }
    
    
}
