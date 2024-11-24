import java.util.Scanner;

public class IT24104388Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the price of 1kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        //Get the number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double numberOfKg = scanner.nextDouble();
        
        // Calculate the total amount
        double totalAmount = pricePerKg * numberOfKg;
        
        // Display the total amount
        System.out.println("\nThe total amount is: " + totalAmount);
        
        scanner.close();
    }
}
