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
public class nodoestacion {
    String estacion;
    int tamaño=0;
    nodoestacion next;
    nodoestacion ant;
    listabus lista;
    nodoestacion(String estacion)
    {
        this.estacion = estacion;
        this.lista = new listabus();
        this.next=null;
        this.ant=null;
    } 
}
