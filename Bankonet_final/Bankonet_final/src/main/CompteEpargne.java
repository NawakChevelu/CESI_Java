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
public class CompteEpargne {
    private String numero;
    private String intitule;
    private double solde;
    private double tauxInteret;

    public CompteEpargne() {
    }

    public CompteEpargne(String numero, String intitule, double solde, double tauxInteret) {
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.tauxInteret = tauxInteret;
    }
    
    public void crediter(double pMontant) {
        if(pMontant > 0)
            this.solde += pMontant;
        else
            System.out.println("Impossibilité de créditer un montant négatif");
    }
    
    public void debiter(double pMontant) {
        if((this.solde - pMontant) <= 0) {
            System.out.println("Solde insufisant pour débit");
        } else {
            this.solde -= pMontant;
        }
    }
    
    @Override
    public String toString() {
        
        return "CompteEpargne{" +
                "numero : '" + this.numero + '\'' + 
                ", intitule : '" + this.intitule + '\'' + 
                ", solde : '" + this.solde + '\'' + 
                ", tauxInteret : '" + this.tauxInteret + '\'' +
                '}';  
    }
}
