package tictactoe;
import java.util.Scanner;

class Game {

	Board board = new Board();
    Player player1 = new Player("X");
    Player player2 = new Player("O");
 
    Player currentPlayer = player1;
 
    void play() {
        // using an infinite loop to run the game
        // we will later add conditions to terminate the loop
        String message = "enter the position (1 - 9):";
        
        while (true) {
 
            System.out.println(currentPlayer.name + " " + message);
            
            Scanner input = new Scanner(System.in);
            int position = input.nextInt();
 
            // the updateBoard() method return true if
            // the user selected position is not already filled
            if (board.updateBoard(position, currentPlayer.type)) {
 
                board.printBoard();
 
                // checking winner each time after updating the board
                if (board.checkWinner(currentPlayer.type)) {
                    System.out.println(currentPlayer.name + " wins!");
                    break;
                }
 
                // checking draw each time after updating the board
                else if (board.checkDraw()) {
                    System.out.println("Game is a draw!");
                    break;
                }
 
                // changing current player when board is updated
                else {
                    if (currentPlayer == player1) {
                        currentPlayer = player2;
                    }
 
                    else {
                        currentPlayer = player1;
                    }
 
                }
            }
 
        }
 
    }
 
}
