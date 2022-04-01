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
     * Valida usuario y contraseña
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
    public int existeUsuario(String login){
        int pos=usuarios.indexOf(new Usuario(login));
        return pos;
    }
    
    public void grabarUsuario(String nombre, String apellido, String login, String contrasenna){
        usuarios.add(new Usuario(nombre, apellido, login, contrasenna));
    }
    
    /**
     * Se presta o devuelve un libro
     * @param libro el libro a devolver o prestar
     * @param prestado se indica el nuevo estado true si esta prestado false si no
     */
    public void moverLibro(Libro libro,boolean prestado){
        libros.get(libros.indexOf(libro)).setEstado(prestado);
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
    
    public ArrayList<Libro> getLibrosPrestados(String usuario){
        ArrayList <Libro> librosPrestados=usuarios.get(existeUsuario(usuario)).getLibrosPrestados();
        return librosPrestados;
    }
    
    public void prestarLibro(String usuario,Libro libro){
        usuarios.get(usuarios.indexOf(new Usuario(usuario))).recibir(libro);
        libros.get(libros.indexOf(libro)).prestado();
    }
    
    public void devolverLibro(String usuario, Libro libro){
        usuarios.get(usuarios.indexOf(new Usuario(usuario))).devolver(libro);
        libros.get(libros.indexOf(libro)).devuelto();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    
    
}
