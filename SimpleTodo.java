import java.util.Scanner;
import java.util.ArrayList;

public class SimpleTodo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> todos = new ArrayList<>();
        
        System.out.println("--- Simple Todo List ---");
        
        while (true) {
            System.out.println("\n1. Add todo");
            System.out.println("2. Show todos");
            System.out.println("3. Delete todo");
            System.out.println("4. Quit");
            System.out.print("Choose: ");
            
            String choice = input.nextLine();
            
            if (choice.equals("1")) {
                System.out.print("Enter todo: ");
                String todo = input.nextLine();
                todos.add(todo);
                System.out.println("Added!");
                
            } else if (choice.equals("2")) {
                if (todos.isEmpty()) {
                    System.out.println("No todos yet!");
                } else {
                    System.out.println("\nYour todos:");
                    for (int i = 0; i < todos.size(); i++) {
                        System.out.println((i + 1) + ". " + todos.get(i));
                    }
                }
                
            } else if (choice.equals("3")) {
                if (todos.isEmpty()) {
                    System.out.println("No todos to delete!");
                } else {
                    System.out.println("\nYour todos:");
                    for (int i = 0; i < todos.size(); i++) {
                        System.out.println((i + 1) + ". " + todos.get(i));
                    }
                    System.out.print("Delete which number? ");
                    try {
                        int num = Integer.parseInt(input.nextLine());
                        if (num > 0 && num <= todos.size()) {
                            String removed = todos.remove(num - 1);
                            System.out.println("Deleted: " + removed);
                        } else {
                            System.out.println("Invalid number!");
                        }
                    } catch (Exception e) {
                        System.out.println("Please enter a number!");
                    }
                }
                
            } else if (choice.equals("4")) {
                System.out.println("Goodbye!");
                break;
                
            } else {
                System.out.println("Invalid choice!");
            }
        }
        
        input.close();
    }
}