package model;

import control.Fecha;
import java.util.ArrayList;
import java.util.Objects;


public class User {

    private String login; //Log with user 
    private String pass;
    private int permission;//0==admin 1==user
    private String direction;//Only one
    private ArrayList<Message> mailbox;

    public static final int ADMIN = 0;
    public static final int USER = 1;

    public User(String login, String pass, int permission, String direction) {
        this.login = login;
        this.pass = pass;
        this.permission = permission;
        this.direction = direction;
        mailbox = new ArrayList<>();
    }

    public void newMail(String matter, Fecha date, String content, User author){
        mailbox.add(new Message(matter, date, content, author));
    }
    
    public User(String direction) {//Direction as identification, less at log
        this.direction = direction;
    }
    
    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public int getPermission() {
        return permission;
    }

    public String getDirection() {
        return direction;
    }

    //Crear metodo para añadir nuevos correos (Cambiar)
    
    public ArrayList<Message> getMailbox() {
        return mailbox;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    @Override
    public String toString(){
        return login+" "+direction;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.direction);
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
        final User other = (User) obj;
        if (!Objects.equals(this.direction, other.direction)) {
            return false;
        }
        return true;
    }

    
    
}
