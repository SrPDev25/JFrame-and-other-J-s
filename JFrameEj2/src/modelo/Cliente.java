/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Objects;

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
        salasAlquiladas=new ArrayList<>();
    }

    public Cliente(String cif) {
        this.cif = cif;
    }

    public ArrayList<Sala> getSalasAlquiladas() {
        return salasAlquiladas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.cif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cif, other.cif)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
