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
public class Usuario {
    private String nombre;
    private String apellido;
    private String login;
    private String contrasenna;
    private ArrayList <Libro> librosPrestados;

    public Usuario(String nombre, String apellido, String login, String contrasenna) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.login = login;
        this.contrasenna = contrasenna;
        librosPrestados=new ArrayList<>();
    }

    public Usuario(String login) {
        this.login = login;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void recibir(ArrayList<Libro> libroPrestado) {
        this.librosPrestados.addAll(libroPrestado);
    }

    public void devolver(ArrayList<Libro> libroPrestado){
        this.librosPrestados.removeAll(libroPrestado);
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.login);
        hash = 37 * hash + Objects.hashCode(this.contrasenna);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
    
    
    
    
}
