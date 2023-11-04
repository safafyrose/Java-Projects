import java.util.Scanner;

public class Calculator_Public_Method {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double num1, num2, result;
            char operator;

            System.out.print("Enter first number: ");
            num1 = input.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            operator = input.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = input.nextDouble();

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
            } else {
                System.out.println("Error: Invalid operator.");
                return;
            }

            System.out.println("Result: " + result);
        }
    }

