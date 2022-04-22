/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import control.Fecha;

/**
 *
 * @author satan
 */
public class Message {

    String matter;
    Fecha date;
    String content;
    String author; //Usar objeto usuario (Cambiar)
    boolean read;

    public Message(String matter, Fecha date, String content, String author) {
        this.matter = matter;
        this.date = date;
        this.content = content;
        this.author = author;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
    
    
    
    public String getMatter() {
        return matter;
    }

    public Fecha getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRead() {
        return read;
    }
    
    
}
