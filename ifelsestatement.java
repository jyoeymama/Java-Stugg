import java.util.Scanner;
public class ifelsestatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n1 = scanner.nextInt(); 
        int n2 = scanner.nextInt(); 
        scanner.nextLine(); 
        String op = scanner.nextLine(); 

        double result = 0;
        if (op.equals("+")) {
            result = n1 + n2;
        } else if (op.equals("-")) {
            result = n1 - n2;
        } else if (op.equals("/")) {
            result = (double)n1 / n2;
        } else if (op.equals("*")) {
            result = n1 * n2;
        }
        
        
        System.out.println(result);
    }
}