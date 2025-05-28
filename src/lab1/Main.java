package lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BasicCalculator calculator = new BasicCalculator();
        String another = "yes";

        System.out.println("Welcome to the Basic Calculator!");

        while (another.equalsIgnoreCase("yes")) {
            System.out.println("Choose an operation:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exit");
            System.out.print("Select (1-5): ");

            int choice = input.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            double result = 0;

            if (choice == 1) {
                result = calculator.add(num1, num2);
            } else if (choice == 2) {
                result = calculator.subtract(num1, num2);
            } else if (choice == 3) {
                result = calculator.multiply(num1, num2);
            } else if (choice == 4) {
                result = calculator.divide(num1, num2);
            } else {
                System.out.println("Invalid choice.");
                continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do another calculation? (yes/no): ");
            another = input.next();
        }

        System.out.println("Thank you for using the Basic Calculator!");
        input.close();
    }
}
