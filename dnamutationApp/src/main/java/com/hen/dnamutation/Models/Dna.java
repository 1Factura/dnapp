package com.hen.dnamutation.Models;
 
/**
 *
 * @author Henrry Gómez Cabañas
 */
public class Dna {
    
    public String[] Secuence;

    public Dna(String[] Secuence) {
        this.Secuence = Secuence;
    }

    public String[] getSecuence() {
        return Secuence;
    }

    public void setSecuence(String[] Secuence) {
        this.Secuence = Secuence;
    }
    
}
