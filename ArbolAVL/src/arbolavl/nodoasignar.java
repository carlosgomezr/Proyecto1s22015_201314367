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
public class nodoasignar {
    String idbus;
    String ruta;
    int clavechofer;
    String horaini;
    String horafin;
    String fecha;
    
    nodoasignar next;
    nodoasignar ant;
    nodoasignar(String idbus,String ruta,int clavechofer,String horaini,String horafin,String fecha)
    {
        this.idbus = idbus;
        this.ruta = ruta;
        this.clavechofer = clavechofer;
        this.horaini = horaini;
        this.horafin = horafin;
        this.fecha = fecha;
        this.next=null;
        this.ant=null;
    }
}
