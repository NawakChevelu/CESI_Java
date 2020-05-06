package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        CompteCourant compteCourant = new CompteCourant();
        CompteCourant compteCourant2 = new CompteCourant();
        int nbComptesCourants = CompteCourant.getNbComptesCourants();
        System.out.println("nbComptesCourants : " + nbComptesCourants);
    }
}