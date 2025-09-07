import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        boolean isXTurn = true;

        System.out.println("Welcome To Tic Tac Toe!");
        System.out.println("Player 1 is X, Player 2 is O");

        for (int moves = 0; moves < 9; moves++) {
            printBoard(board);
            char currentPlayer = isXTurn ? 'X' : 'O';
            System.out.println("Player " + currentPlayer + ", choose a cell (1-9):");
            int cell = scanner.nextInt() - 1;
            if (cell < 0 || cell > 8) {
                System.out.println("Invalid cell! Try again.");
                moves--;
                continue;
            }
            if (board[cell] == ' ') {
                board[cell] = currentPlayer;
                isXTurn = !isXTurn;
            } else {
                System.out.println("Cell already taken! Try again.");
                moves--;
            }
        }
        System.out.println("Final board:");
        printBoard(board);
        scanner.close();
    }

    private static void printBoard(char[] board) {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        if (board[0] != ' ' && board[0] == board[1] && board[1] == board[2]) {
            System.out.println("Player " + board[0] + " wins!");
            System.exit(0);
        }
    }
}
