import java.util.Scanner; // Import the Scanner class

/**
* Affiche un message de bienvenue au nom renseigné
* 
* @author NawakChevelu
* @version 1.0 
*/
public class hello_perso {
    public static void main(String[] args) {
    	//
    	Scanner input = new Scanner(System.in); // Create a Scanner object
 
        System.out.print("Enter name : ");
        String nom = input.next(); // Read user input
        System.out.println("Hello " + nom); // Output user input
    }
}