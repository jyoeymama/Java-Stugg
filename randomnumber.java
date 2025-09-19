import java.util.Scanner;

public class randomnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to my random number generator!");
        int randomNum = (int)(Math.random() * 100) + 1; 
        System.out.println("Your Random Number Is: " + randomNum);
        scanner.close();
    }
}
