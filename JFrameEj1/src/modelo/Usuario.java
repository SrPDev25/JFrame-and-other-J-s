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
public class Usuario {
    String nombre;
    String apellido;
    String login;
    String contrasenna;
    ArrayList <Libro> librosPrestados;

    public Usuario(String nombre, String apellido, String login, String contrasenna) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.login = login;
        this.contrasenna = contrasenna;
        librosPrestados=new ArrayList<>();
    }
    
    
    
    
    
    
}
