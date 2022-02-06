
package ListasEnlazadas;


public class Nodo {
    
    double dato;
    Nodo enlace;

    public Nodo(double x) {
        dato = x;
        enlace = null;
    }

    public Nodo(double x, Nodo n) {
        dato = x;
        enlace = n;
    }
    
    public Nodo(){
        //do nothing
    }

    public double getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
