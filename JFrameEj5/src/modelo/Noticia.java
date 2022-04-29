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

    private String titulo; //Unica
    private String noticia;
    private Categoria categoria;
    private Usuario autor;
    private Fecha fecha;

    public Noticia(String titulo, String noticia, Categoria categoria, Usuario autor, Fecha fecha) {
        this.titulo = titulo;
        this.noticia = noticia;
        this.categoria = categoria;
        this.autor = autor;
        this.fecha = fecha;
    }

    public Noticia(String titulo, Categoria categoria, Usuario autor) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.titulo);
        hash = 79 * hash + Objects.hashCode(this.categoria);
        hash = 79 * hash + Objects.hashCode(this.autor);
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
        final Noticia other = (Noticia) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    public String getNoticia() {
        return noticia;
    }

    public String getTitulo() {
        return titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Usuario getAutor() {
        return autor;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
