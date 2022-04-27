/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import control.Fecha;
import java.util.Objects;

/**
 *
 * @author satan
 */
public class Noticia {

    private String noticia;
    private String categoria;
    private String autor;
    private Fecha fecha;

    public Noticia( String noticia, String categoria, String autor, Fecha fecha) {
        this.noticia = noticia;
        this.categoria = categoria;
        this.autor = autor;
        this.fecha = fecha;
    }


    public String getCategoria() {
        return categoria;
    }

    public String getAutor() {
        return autor;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public String getNoticia() {
        return noticia;
    }

}
