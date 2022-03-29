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
    
    public int buscarUsuario(String login, String pass) {
        int pos = usuarios.indexOf(new Usuario(login, pass));

        if (pos != -1) {
            if (!usuarios.get(pos).getContrasenna().equals(pass)) {
                pos = -1;
            }
        }
        return pos;
    }

}
