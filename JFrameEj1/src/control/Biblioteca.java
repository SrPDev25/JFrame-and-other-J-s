/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import modelo.Libro;
import modelo.Usuario;

/**
 *
 * @author dam
 */
public class Biblioteca {

    ArrayList<Usuario> usuarios;
    ArrayList<Libro> libros;

    public Biblioteca() {
        usuarios = new ArrayList<>();
        libros = new ArrayList<>();
    }

    public void createAdmin(){
        usuarios.add(new Usuario("admin","admin","",""));
    }
    
    public void cargarLibros(){
        libros.add(new Libro(1567135, "La octava maravilla", "ElPepe", "Pinguino"));
        libros.add(new Libro(1564535, "Que bueno", "Juan", "Pinguino"));
        libros.add(new Libro(1562345, "Buscando a nemo", "Anonimo", "Delfin"));
        libros.add(new Libro(1237135, "Aparentar ser cisne", "Anonimo", "Oso rojo"));
        libros.add(new Libro(1567987, "Demasiada agua salada", "ElPepe", "MJ"));
    }
    
    /**
     * Busca por usuario
     * @param login
     * @param pass
     * @return 
     */
    public int confirmarUsuario(String login, String pass) {
        int pos = usuarios.indexOf(new Usuario(login));

        if (pos != -1) {
            if (!usuarios.get(pos).getContrasenna().equals(pass)) {
                pos = -1;
            }
        }
        return pos;
    }
    
    /**
     * Comprueba si existe un usuario en la base de datos
     * @param login solo comprueba el usuario
     * @return devuelve true si ya existe
     */
    public boolean existeUsuario(String login){
        boolean existe=false;
        if(usuarios.indexOf(new Usuario(login))!=-1){
            existe=true;
        }
        return existe;
    }
    
    public void grabarUsuario(String nombre, String apellido, String login, String contrasenna){
        usuarios.add(new Usuario(nombre, apellido, login, contrasenna));
    }

    public ArrayList<Libro> getLibrosNoPrestados(){
        ArrayList <Libro> librosNoPrestados=new ArrayList<>();
        for(Libro i: libros){
            if(!i.isPrestado()){
                librosNoPrestados.add(i);
            }
        }
        return librosNoPrestados;
    }
}
