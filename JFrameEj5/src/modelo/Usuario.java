/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author satan
 */
public class Usuario {
    private String login;//Unico
	private String pass;
	private String nombre;

    public Usuario(String login, String pass, String nombre) {
        this.login = login;
        this.pass = pass;
        this.nombre = nombre;
    }

    public Usuario(String login) {
        this.login = login;
    }
    
    

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.login);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return true;
    }
        
}
