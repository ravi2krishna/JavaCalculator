// hey this a javascript calculator
import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Quit");
            System.out.print("Enter your choice (1-7): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Enter numerator: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter denominator: ");
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 < 0) {
                        System.out.println("Error: Cannot calculate square root of a negative number.");
                    } else {
                        System.out.println("Result: " + Math.sqrt(num1));
                    }
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;
                case 7:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }

        scanner.close();
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}  // printing hello world

import java.util.Scanner;

public class PasswordProgram {
    public static void main(String[] args) {
        // Define the predefined password
        String predefinedPassword = "mySecretPassword";

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a password
        System.out.print("Enter the password: ");
        String userInput = scanner.nextLine();

        // Check if the user input matches the predefined password
        if (userInput.equals(predefinedPassword)) {
            System.out.println("Access granted! You entered the correct password.");
        } else {
            System.out.println("Access denied! Incorrect password.");
        }

        // Close the scanner
        scanner.close();
    }
}

