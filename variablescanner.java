import java.util.Scanner;

public class variablescanner {
    public static void main(String[] args) {
        System.out.println("Calculator App");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}