import java.util.Scanner;

public class IT24104388Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
        // Extract and display each digit
        int digit1 = number / 10000;        // first digit
        int digit2 = (number / 1000) % 10;  // second digit
        int digit3 = (number / 100) % 10;   // third digit
        int digit4 = (number / 10) % 10;    // fourth digit
        int digit5 = number % 10;           // fifth digit
        
        // Print the digits separated by spaces
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
        
        scanner.close();
    }
}
