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
public class CompteCourant extends Compte{
    //private String numero;
    //private String intitule;
    //private double solde;
    private double montantDecouvertAutorise;
    static int nbComptesCourants;
    
    public CompteCourant() {
        CompteCourant.nbComptesCourants++;
    }
    
    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
        this();
        this.numero = numero;
        this.intitule = intitule;
        if(solde < 0)
            this.solde = 0;
        else
            this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    public void crediter(double pMontant) {
        if(pMontant > 0)
            this.solde += pMontant;
        else
            System.out.println("Impossibilité de créditer un montant négatif");
    }
    
    public void debiter(double pMontant) {
        if((this.solde - pMontant) <= this.montantDecouvertAutorise) {
            System.out.println("Solde insufisant pour débit");
        } else {
            this.solde -= pMontant;
        }
    }
    
    @Override
    public String toString() {
        
        return "CompteCourant{" +
                "numero : '" + this.numero + '\'' + 
                ", intitule : '" + this.intitule + '\'' + 
                ", solde : '" + this.solde + '\'' + 
                ", montantDecouvertAutorise : '" + this.montantDecouvertAutorise + '\'' +
                '}';  
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    public static int getNbComptesCourants() {
        return nbComptesCourants;
    }

    public static void setNbComptesCourants(int nbComptesCourants) {
        CompteCourant.nbComptesCourants = nbComptesCourants;
    }
    
    
}
