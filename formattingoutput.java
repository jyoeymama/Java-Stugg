import java.util.Scanner;

public class formattingoutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rnd = scanner.nextLine();

        System.out.printf("The input is: %s\n", rnd);
        
        scanner.close();
    }
}