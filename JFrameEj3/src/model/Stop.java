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
public class Stop {
    private String code; //codigo unico
    private String denomination;

    public Stop(String code, String denomination) {
        this.code = code;
        this.denomination = denomination;
    }
        
    @Override
    public String toString(){
        return code+" "+denomination;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.code);
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
        final Stop other = (Stop) obj;
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
    
    
    
}
