/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Cliente {

    ArrayList<Sala> salasAlquiladas;
    String cif;
    String nombre;
    String dirección;
    String Poblacion;

    public Cliente(String cif, String nombre, String dirección, String Poblacion) {
        this.cif = cif;
        this.nombre = nombre;
        this.dirección = dirección;
        this.Poblacion = Poblacion;
    }

    public Cliente(String cif) {
        this.cif = cif;
    }

    public ArrayList<Sala> getSalasAlquiladas() {
        return salasAlquiladas;
    }
    
    
}
