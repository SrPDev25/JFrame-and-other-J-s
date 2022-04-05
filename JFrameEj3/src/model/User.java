/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author dam
 */
public class User {
    private String user;
    private String pass;
    private int permisions;

    /**
     * 
     * @param user
     * @param pass
     * @param permisions 0=admin 1=user
     */
    public User(String user, String pass, int permisions) {
        this.user = user;
        this.pass = pass;
        this.permisions = permisions;
    }

    public User(String user) {
        this.user = user;
    }
    
    

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public int getPermisions() {
        return permisions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.user);
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
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
