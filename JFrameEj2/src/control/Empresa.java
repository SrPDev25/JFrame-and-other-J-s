/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Sala;

/**
 *
 * @author dam
 */
public class Empresa {

    ArrayList<Sala> salas;
    ArrayList<Cliente> clietes;

    public Empresa() {
        salas=new ArrayList<>();
        clietes=new ArrayList<>();
    }
    

    private void cargarSalas() {
        salas.add(new Sala("Tenis", 4));
        salas.add(new Sala("Padel", 4));
        salas.add(new Sala("Furbol", 24));
        salas.add(new Sala("Fronton", 20));
        salas.add(new Sala("Nerfs", 50));
    }

    public int existeCliente(String cif) {
        int resultado;
        resultado=clietes.indexOf(new Cliente(cif.trim()));
        if(cif.equals("")){
            resultado=-2;
        }else if(){
            
        }
        
    }

    public void grabarCliente() {
    }

    public ArrayList<Sala> getSalasDisponibles() {
    }

    public void estadoSala(String cifUsuario, Sala sala, int estado) {
    }

    public void getSalasAlquiladas(String cif) {
    }

}
