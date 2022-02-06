/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasDoblementeEnlazadas;

/**
 *
 * @author diegocatalan
 */
public class ListaDoble {
    private Nodo raiz;

    public ListaDoble() {
        raiz = null;
    }

    public void Insertar(int dato) {
        Nodo nuevo = new Nodo();
        if (raiz == null) {
            nuevo.dato = dato;
            raiz = nuevo;
        } else {
            Nodo rcopia = raiz;
            Nodo p = raiz.sig;
            while (p != null) {
                rcopia = p;
                p = rcopia.sig;
            }
            if (p == null) {
                nuevo.dato = dato;
                nuevo.ant = rcopia;
                nuevo.sig = null;
                rcopia.sig = nuevo;
            }
        }
    }

    public void mostrarLista() {
        if (raiz == null) {
            System.out.println("No hay elementos en la lista");
        } else {
            Nodo p = raiz;
            while (p != null) {
                System.out.println(p.dato);
                p = p.sig;
            }

        }
    }

    public boolean buscarElemento(int dato) {
        Nodo temp = raiz;
        while (temp != null) {
            if (temp.dato == dato) {
                return true;

            }
            temp = temp.sig;

        }
        return false;
    }
    
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.Insertar(1);
        lista.Insertar(2);
        lista.Insertar(3);
        lista.Insertar(4);
        lista.mostrarLista();

        if (lista.buscarElemento(3)) {
            System.out.println("encontrado");
        } else {
            System.out.println("no encontrado");
        }
    }


}
