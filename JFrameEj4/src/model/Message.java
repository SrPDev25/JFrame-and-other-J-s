package model;

import control.Fecha;

public class Message {

    String matter;
    Fecha date;
    String content;
    User author; 
    boolean read;

    public Message(String matter, Fecha date, String content, User author) {
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

    public User getAuthor() {
        return author;
    }

    public boolean isRead() {
        return read;
    }
    
    
}
