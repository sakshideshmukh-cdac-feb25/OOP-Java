import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two integers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Perform arithmetic operations
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        double division = (double) num1 / num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
    }
}
