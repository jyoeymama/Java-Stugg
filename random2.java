import java.util.Scanner;

public class random2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess the number between 1 and 10:");
        int numberToGuess = (int) (Math.random() * 10) + 1;
        int numberOfTries = 0;
        int guess;
        boolean win = false;
        while (!win) {
            guess = input.nextInt();
            numberOfTries++;
            if (guess == numberToGuess) {
                win = true;
                System.out.println("Correct! You win!");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        System.out.println("It took you " + numberOfTries + " tries to guess the correct number.");
        input.close();
    }
}