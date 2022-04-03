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
    ArrayList<Cliente> clientes;

    static final public int ALQUILAR = 1;
    static final public int DESALQUILAR = 2;

    public Empresa() {
        salas = new ArrayList<>();
        clientes = new ArrayList<>();
        cargarSalas();
    }

    private void cargarSalas() {
        salas.add(new Sala("Padel", 4));
        salas.add(new Sala("Furbol", 24));
        salas.add(new Sala("Fronton", 20));
        salas.add(new Sala("Nerfs", 50));
    }

    public int existeCliente(String cif) {
        int resultado;
        resultado = clientes.indexOf(new Cliente(cif.trim()));
        if (cif.equals("")) {
            resultado = -2;
        }

        return resultado;
    }

    /**
     * Se alquila una sala o se quita el alquiler
     *
     * @param cifCliente
     * @param sala
     * @param alquilar
     */
    public int estadoSala(String cifCliente, Sala sala, int alquilar) {
        int clientePos = existeCliente(cifCliente);
        int resultado = 1;
        if (alquilar == ALQUILAR) {
            clientes.get(clientePos).getSalasAlquiladas().add(sala);
            salas.get(salas.indexOf(sala)).setAlquilada(true);
        } else if (alquilar == DESALQUILAR) {
            clientes.get(clientePos).getSalasAlquiladas().remove(sala);
            salas.get(salas.indexOf(sala)).setAlquilada(true);
        } else {
            resultado = -1;
        }
        return resultado;
    }

    /**
     * Devuelve aquellas salas que no han sido alquiladas
     *
     * @return
     */
    public ArrayList<Sala> getSalasDisponibles() {
        ArrayList<Sala> salasDisponibles = new ArrayList<>();
        for (Sala i : salas) {
            if (!i.isAlquilada()) {
                salasDisponibles.add(i);
            }
        }

        return salasDisponibles;
    }

    /**
     * Devuleve aquellas salas que han sido alquiladas por un cliente especifico
     *
     * @param cif
     * @return
     */
    public ArrayList<Sala> getSalasAlquiladas(String cif) {
        return clientes.get(clientes.indexOf(new Cliente(cif))).getSalasAlquiladas();
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

}
