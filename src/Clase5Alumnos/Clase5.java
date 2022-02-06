/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase5Alumnos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diegocatalan
 */
public class Clase5 {
    public static void main(String[] args) {
        // TODO code application logic here
        List<Alumno> lista = new ArrayList<Alumno>();
        lista.add(new Alumno(1, "Diego", "Zacapa", "Programación III"));
        lista.add(new Alumno(1, "José Vinicio", "Zacapa", "Programación III"));
        lista.add(new Alumno(1, "José Vinicio", "Zacapa", "Programación III"));
        lista.add(new Alumno(1, "Vinicio", "Zacapa", "Programación III"));
        lista.add(new Alumno(1, "fffff", "Zacapa", "Programación III"));
        
        lista.remove(0);
        lista.stream().forEach(x -> System.out.print(x));
        
    }
}
