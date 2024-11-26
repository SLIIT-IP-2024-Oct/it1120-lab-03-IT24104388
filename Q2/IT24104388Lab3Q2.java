import java.util.Scanner;

public class IT24104388Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        
        // Get the number of OT hours
        System.out.print("Enter the number of OT hours: ");
        int otHours = scanner.nextInt();
        
        // Get the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();
        
        // Calculate the OT amount
        double otAmount = otHours * otHourlyRate;
        
        // Calculate the total salary
        double totalSalary = monthlySalary + otAmount;
        
        // Display the total salary
        System.out.println("\nThe total salary including OT is: " + totalSalary);
        
        scanner.close();
    }
}
