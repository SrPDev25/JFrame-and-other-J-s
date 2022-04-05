/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dam
 */
public class Line {
    private String code; //Codigo unico
    private String denomination;
    private ArrayList <Stop> stops; //No se pueden repetir

    public Line(String code, String denomination, ArrayList<Stop> stops) {
        this.code = code;
        this.denomination = denomination;
        this.stops = stops;
    }

    public ArrayList<Stop> getMidStops(){
        ArrayList<Stop> midStops=new ArrayList<>();
        for (int i = 1; i < stops.size()-1; i++) {
            midStops.add(stops.get(i));
        }
        return midStops;
    }
    
    public ArrayList<Stop> getCornerStops(){
        ArrayList<Stop> cornerStops=new ArrayList<>();
        cornerStops.add(stops.get(0));
        cornerStops.add(stops.get(stops.size()-1));
        return cornerStops;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.code);
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
        final Line other = (Line) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }

    public String getCode() {
        return code;
    }

    public String getDenomination() {
        return denomination;
    }

    public ArrayList <Stop> getStops() {
        return stops;
    }
    
    
}
