/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasEnlazadas;

/**
 *
 * @author diegocatalan
 */
public class Lista {
    protected Nodo raiz;

    public Lista() {
        raiz = null;
    }

    
    
    
    public void Ultimo(double dato) {
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        //recorrer la lista hasta null
        Nodo reco = raiz;  //copia
        while (reco.enlace != null) {
            reco = reco.enlace;
        }
        reco.enlace = nuevo;
        nuevo.enlace = null;
        

    }
    public void visualizar() {
       Nodo reco = raiz;  //copia
        if (reco == null) {
            System.out.println("No hay elementos en la lista");
            return;
        } else {
            while (reco != null) {
                System.out.print(reco.dato + "-->");
                reco = reco.enlace;
            }

            System.out.print("null");
        }
    }
    
    public Lista insertarCabezaLista(double entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = raiz;
        raiz = nuevo;
        return this;
    }
    
    public void ordenar(){
            int t=1,c=1;
            Nodo act = raiz;/*definimos que el apuntador act esta en el primer nodo*/
            while(act.enlace !=null)//Este while cuenta el total de nodos.
            {
                act = act.enlace;
                c++;
            }
            /* esta varieble solo es para que guarde el valor temporalmente*/
            double tem=0;
            
            //aqui se hace el ordenamiento
            do{
                act = raiz;//aux esta en el primer nodo
                Nodo sig = act.enlace;//esta en el siguiente nodo 
                while(act.enlace != null)
                {
                    if(act.dato < sig.dato)
                    {
                        tem = act.dato;
                        act.dato = sig.dato;
                        sig.dato = tem;
                        
                        act = act.enlace;
                        sig = sig.enlace;
                    }
                    else
                    {
                        //[1] [3] [2]
                        //    act sig 
                        act = act.enlace;
                        sig = sig.enlace;
                       
                    }
                }
                t++;
            }while(t<=c);//act.ap_sig != null);
}


    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.insertarCabezaLista(10.5);
        lista.insertarCabezaLista(71.5);
        lista.insertarCabezaLista(5.25);
        lista.insertarCabezaLista(4.15);
        
        lista.visualizar();
        lista.ordenar();
        System.out.println("");
        lista.visualizar();
    }
    
    
}
