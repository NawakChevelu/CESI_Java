/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author NawakChevelu
 */
public abstract class Compte {
    protected String numero;
    protected String intitule;
    protected double solde;
    
    public void débiter(double pMontant) {
        
    }
    
    public void crediter(double pMontant) {
        
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
    public boolean isDebitAutorise() {
        
        
        return true;
    }
}
