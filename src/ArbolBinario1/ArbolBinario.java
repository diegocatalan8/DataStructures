/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinario1;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author diegocatalan
 */
public class ArbolBinario {
    
    
    // Función especial para recorrer pre-orden
    private static void preOrden(Nodo raiz){
        if(raiz != null){
            System.out.print(raiz.getDato() + " -> ");
            preOrden(raiz.getIzquierda());
            preOrden(raiz.getDerecha());
        }
    }
    
     public static int preOrdenSuma(Nodo raiz){
      if(raiz != null){
            int tem = raiz.getDato();
            int izq = preOrdenSuma(raiz.getIzquierda());
            int der = preOrdenSuma(raiz.getDerecha());
            return izq + tem + der;
       
    }
        return 0;
     }
    
    
    
    private static void PostOrden(Nodo raiz){
        if(raiz != null){
            PostOrden(raiz.getIzquierda());
            PostOrden(raiz.getDerecha());
            System.out.print(raiz.getDato() + " -> ");
        }
    }
    
    private static boolean busquedaAmplitud(Nodo raiz, int dato){
        // Vamos a basarnos con el manejo de cola
        Queue<Nodo> cola = new LinkedList<Nodo>();
        cola.add(raiz);
        
        while(cola.size() != 0){
        	Nodo temp = null;
            temp = cola.poll() != null ? cola.poll() : null; // Elimamos el valor pero lo retornamos a una variable
            System.out.print(temp.getDato()); // Imprimir el valor
            
            // Buscar este error
            if(temp == null) {
            	return false;
            }
            
            if(temp.getDato() == dato){
                return true; // LO ENCONTRÓ
            }
            
            cola.add(temp.getIzquierda());
            cola.add(temp.getDerecha());
            
             
            
        }
        
        return false;
    }

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Nodos padres
        Nodo raiz = new Nodo(190);
        Nodo B = new Nodo(57);
        Nodo C = new Nodo(89);
        
        // Nodos hijos
        Nodo D = new Nodo(90);
        Nodo E = new Nodo(121);
        Nodo F = new Nodo(170);
        Nodo G = new Nodo(45);
        
        // Relacionamos
        raiz.setIzquierda(B);
        raiz.setDerecha(C);
        
        B.setIzquierda(D);
        B.setIzquierda(E);
        
        C.setIzquierda(F);
        C.setDerecha(G);
        
        System.out.println("Proceso de recorrido PreOrde");
        preOrden(raiz);
        System.out.println("");
        System.out.println("La suma es:"+preOrdenSuma(raiz));
  
}
    
}
