/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author satan
 */
public class Usuario {

    private String pass;
    private String nombre;

    public Usuario( String pass, String nombre) {
        this.pass = pass;
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }
}
