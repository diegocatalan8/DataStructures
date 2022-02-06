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
public class Alumno {
    private int id;
    private String nombre;
    private String direccion;
    private String curso;
    
    // Constructor
    public Alumno(int _id, String _nombre, String _direccion, String _curso){
        this.id = _id;
        this.nombre = _nombre;
        this.direccion = _direccion;
        this.curso = _curso;
    }
    
    // Overrie = Sobreescrutrua de un método
    @Override
    public String toString(){
        return id + " | " + nombre + " | " + direccion + " | " + curso;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
