import java.util.Scanner;

public class hello_perso {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

        System.out.print("Enter name : ");
        String nom = input.next();
        System.out.println("Hello " + nom);
    }
}