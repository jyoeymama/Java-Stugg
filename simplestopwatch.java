import java.util.Scanner;

public class simplestopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Simple Stopwatch, A simple stopwatch in Java!");
        System.out.println("Press Enter to start the stopwatch...");
        scanner.nextLine(); 

        long startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started. Press Enter again to stop...");
        scanner.nextLine(); 

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}
