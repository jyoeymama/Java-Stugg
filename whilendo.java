public class whilendo {
    public static void main(String[] args) {
        // variables
        int sum = 0;
        int number = 1;

        //da loop itself is below
        do {
            sum += number;
            number += 2;
            System.out.println("Sum is: " + sum);
            System.out.println("Num is: " + number);
        } while (number <= 50);

        // prints the final sum
        System.out.println("Final Sum: " + sum);
    }
}