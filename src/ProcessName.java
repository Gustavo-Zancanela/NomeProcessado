import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Coloque seu nome: ");
       String firstName, lastName; 
       
       
        // your code goes here
        
        firstName = console.next();
        lastName = console.next();
        
        System.out.println("Seu nome é: " + lastName + ", " + firstName.charAt(0) + ".");
    }
}