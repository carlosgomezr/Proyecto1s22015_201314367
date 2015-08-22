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
public class Bus {
    int id;
    String nombre;
    int ClaveChofer;
    String horarioIni;
    String horarioFin;
    String fecha;

    public Bus(int id,String nombre, int ClaveChofer, String horarioIni, String horarioFin,String fecha)
    {
        this.id = id;
        this.nombre = nombre;
        this.ClaveChofer = ClaveChofer;
        this.horarioIni = horarioIni;
        this.horarioFin = horarioFin;
        this.fecha = fecha;
    }
    
}
