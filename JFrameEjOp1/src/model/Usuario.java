/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author satan
 */
public class Usuario {

    private String contrasenna;
    private int nivelAcceso;//0=admin 1=profesor

    public Usuario(String contrasenna, int nivelAcceso) {
        this.contrasenna = contrasenna;
        this.nivelAcceso = nivelAcceso;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public boolean comprobarPass(String pass){
        return contrasenna.equals(pass);
    }
}
