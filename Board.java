package tictactoe;

class Board {

	// count variable
    int count = 0;
    String board[] = { " ", " ", " ", " ", " ", " ", " ", " ", " " };
 
    void printBoard() {
 
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("-----------");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("-----------");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
 
    }
 
    boolean updateBoard(int position, String type) {
 
        // if a player selects position n, n-1 index should be updated
        // if the position is not already filled, update the board
        if (board[position - 1] == " ") {
            board[position - 1] = type;
 
            // increase the value of count by 1
            count++;
            return true;
        }
 
        // if the position is already filled, ask user to select another position
        else {
            System.out.println("Position already selected. Select another position.");
            return false;
 
        }
    }
 
    // if all fields are selected and there is no winner, it's draw
    // returning true if it's draw
    boolean checkDraw() {
 
        // check if count == 9
        if (count == 9) {
            return true;
        } 
        else {
            return false;
        }
    }
 
    // if three symbols appears in a row, returning True
    boolean checkWinner(String type) {
        if ((board[0] == type && board[1] == type && board[2] == type)
                || (board[3] == type && board[4] == type && board[5] == type)
                || (board[6] == type && board[7] == type && board[8] == type)
                || (board[0] == type && board[3] == type && board[6] == type)
                || (board[1] == type && board[4] == type && board[7] == type)
                || (board[2] == type && board[5] == type && board[8] == type)
                || (board[0] == type && board[4] == type && board[8] == type)
                || (board[2] == type && board[4] == type && board[6] == type)) {
            return true;
        }
 
        else {
            return false;
        }
 
    }
}
