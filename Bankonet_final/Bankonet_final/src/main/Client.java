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
public class Client {
    private String indentifiant;
    private String nom;
    private String prenom;
    private CompteCourant compteCourant;
    private CompteEpargne compteEpargne;

    public Client(String indentifiant, String nom, String prenom, CompteCourant compteCourant, CompteEpargne compteEpargne) {
        this.indentifiant = indentifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.compteCourant = compteCourant;
        this.compteEpargne = compteEpargne;
    }

    @Override
    public String toString() {
        return "Client{" + "indentifiant=" + indentifiant + ", nom=" + nom + ", prenom=" + prenom + ", compteCourant=" + compteCourant + ", compteEpargne=" + compteEpargne + '}';
    }
    
    public double calculerAvoirGlobal() {
        double total = compteCourant.getSolde() + compteEpargne.getSolde();
        
        return total;
    }
}
