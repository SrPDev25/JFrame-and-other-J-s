/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import modelo.Noticia;
import modelo.Usuario;

/**
 *
 * @author satan
 */
public class Empresa {

    ArrayList<Usuario> autores;
    ArrayList<Noticia> noticias;
    ArrayList<String> categoria;

    public Empresa() {
        autores= new ArrayList<>();
        noticias= new ArrayList<>();
        categoria= new ArrayList<>();
    }

    
    
    public void cargarDatos() {
        autores.add(new Usuario("0", "0", "Admin"));
        autores.add(new Usuario("usuario", "123", "Primer usuario"));
        categoria.add("Comedia");
        categoria.add("Ciencia");
        categoria.add("Politica");
        categoria.add("Moda");
        categoria.add("Cine");
    }

    /**
     * Busca al usuario en la base de datos
     * @param user
     * @return Devuelve la posicion, -1 si no existe o -2 si no se introdujo nada
     */
    public int usuarioExiste(String user) {
        int pos= autores.indexOf(new Usuario(user));
        
        if(user.equals("")){
            pos=-2;
        }
        
        return pos;
    }

    /**
     * Busca el titulo en la base de datos
     * @param titulo
     * @return Devuelve la posicion, -1 si no existe o -2 si no se introdujo nada
     */
    public int tituloExiste(String titulo) {
        int pos=-2;
        
        if(!titulo.equals("")){
            pos= noticias.indexOf(new Noticia(titulo));
        }
        
        return pos;
    }

    public void nuevaNoticia(String titulo, String noticia, String categoria, Usuario autor, Fecha fecha){
        noticias.add(new Noticia(titulo, noticia, categoria, autor, fecha));
    }
    
    public ArrayList<Usuario> getAutores() {
        return autores;
    }

    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }

    public ArrayList<String> getCategoria() {
        return categoria;
    }
    
    

}
