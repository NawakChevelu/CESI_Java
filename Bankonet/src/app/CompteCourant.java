package app;

public class CompteCourant {
    private String numero;
    private String intitule;
    private double solde;
    private double montantDecouvertAutorise;
    static private int nbComptesCourants;

    public void setNumero(final String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }

    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(final String intitule) {
        this.intitule = intitule;
    }

    public void setSolde(final double solde) {
        this.solde = solde;
    }
    public double getSolde() {
        return solde;
    }

    public void setMontantDecouvertAutorise(final double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }
    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public static void setNbComptesCourants(final int nbComptesCourants) {
        CompteCourant.nbComptesCourants = nbComptesCourants;
    }
    public static int getNbComptesCourants() {
        return nbComptesCourants;
    }
}