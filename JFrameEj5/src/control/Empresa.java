/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.HashMap;
import modelo.Noticia;
import modelo.Usuario;

/**
 *
 * @author satan
 */
public class Empresa {

    private HashMap<String,Usuario> autores;
    private HashMap<String,Noticia> noticias;
    private ArrayList<String> categoria;

    public Empresa() {
        autores=new HashMap<>();
        noticias= new HashMap<>();
        categoria= new ArrayList<>();
    }

    
    
    public void cargarDatos() {
        autores.put("0",new Usuario( "0", "Admin"));
        autores.put("usuario",new Usuario( "123", "Primer usuario"));
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
    public int usuarioExiste(String user,String pass) {
        if (autores.containsKey(user)) {
            if (autores.get(user).getPass().equals(pass)) {
                return 0;
            }else
                return -1;
        }else{
            return -2;
        }
    }
    
    public Usuario getusuario(String user){
        if (autores.containsKey(user)) {
            return autores.get(user);
        }else{
            return null;
        }
    }

    /**
     * Busca el titulo en la base de datos
     * @param titulo
     * @return Devuelve la posicion, -1 si no existe o -2 si no se introdujo nada
     */
    public int tituloExiste(String titulo) {
        if (noticias.containsKey(titulo)) {
            return 0;
        }else{
            return -1;
        }
    }

    public void nuevaNoticia(String titulo, String noticia, String categoria, String autor, Fecha fecha){
        noticias.put(titulo,new Noticia( noticia, categoria, autor, fecha));
    }

    public ArrayList<String> getCategoria() {
        return categoria;
    }

    public HashMap<String,Noticia> getNoticias() {
        return noticias;
    }
    
    

}
