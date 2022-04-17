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
	private String categoria;
	private Usuario autor;
	private Fecha fecha;

    public Noticia(String titulo, String noticia, String categoria, Usuario autor, Fecha fecha) {
        this.titulo = titulo;
        this.noticia = noticia;
        this.categoria = categoria;
        this.autor = autor;
        this.fecha = fecha;
    }


    public Noticia(String titulo) {
        this.titulo = titulo;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public Usuario getAutor() {
        return autor;
    }

    public Fecha getFecha() {
        return fecha;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.titulo);
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
        return true;
    }

    public String getNoticia() {
        return noticia;
    }
        
        
}
