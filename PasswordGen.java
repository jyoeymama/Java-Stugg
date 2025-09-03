import java.util.Scanner;

public class PasswordGen {
    public static void main(String[] args) {
        System.out.println("Welcome to CryptKey, A simple password generator made in Java by Jyomama28 on GitHub! (Version 1.0.0)");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired length of your password: ");
        int length = input.nextInt();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:',.<>?/";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * chars.length());
            password.append(chars.charAt(index));
        }
        System.out.println("Generated Password: " + password.toString());
        System.out.println("Thank you for using CryptKey! Have a nice day!");
        input.close();
    }
}