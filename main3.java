import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           System.out.println("Welcome to Terminally Calculated! A simple terminal based calculator made in Java.");
            while (true) {
                double num1;
                double num2;
                char operator;
                double result;
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.print("Enter an operator (+, -, *, /): ");
                operator = scanner.next().charAt(0);
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println(num1 + " / " + num2 + " = " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator.");
                        break;
                }
                System.out.print("Do you want to perform another calculation? (y/n): ");
                String again = scanner.next();
                if (again.equalsIgnoreCase("n") || again.equalsIgnoreCase("no")) {
                    break;
                }
            }
            scanner.close();
    }
}