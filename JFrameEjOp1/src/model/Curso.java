/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author satan
 */
public class Curso {

    private String denominacion;
    private int numPlazasDisponibles;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Alumno> alumnos;

    public Curso(String denominacion, int numPlazas, ArrayList<Asignatura> asignaturas) {
        this.denominacion = denominacion;
        this.numPlazasDisponibles = numPlazas;
        this.asignaturas = asignaturas;
    }
    
    public String getDenominacion() {
        return denominacion;
    }

    public int getNumPlazas() {
        return numPlazasDisponibles;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    
    
    
}
