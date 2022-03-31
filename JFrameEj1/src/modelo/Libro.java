/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dam
 */
public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private boolean prestado;//Inicia el valor falso al no estar prestado

    public Libro(int isbn, String titulo, String autor, String editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public void prestado(){
        prestado=true;
    }
    
    public void devuelto(){
        prestado=false;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.isbn;
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
        final Libro other = (Libro) obj;
        if (this.isbn != other.isbn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return titulo+" de "+autor;
    }
    
    public int getIsbn() {
        return isbn;
    }

    

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEstado(boolean estado) {
        prestado=estado;
    }

    public boolean isPrestado() {
        return prestado;
    }
    
    
    
    
    
    
}
