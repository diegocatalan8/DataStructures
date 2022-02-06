/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasCirculares;

/**
 *
 * @author diegocatalan
 */
public class Nodo {
    int dato;
    Nodo enlace;

    public Nodo(int entrada) {
        dato = entrada;
        enlace = this; // se apunta asímismo 
    }
}
