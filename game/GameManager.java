package game;
import board.Board;
import board.StandardBoard;
import java.util.Scanner;

public class GameManager {
    Board board;
    Scanner scanner = new Scanner(System.in);
    boolean isCheckmate = false;

    public GameManager(GameType type) {
        switch(type) {
            case Standard:
                board = new StandardBoard();
                break;
            default:
                System.out.println("Game Type Not Valid");
                System.exit(1);
        }
    }

    public boolean isCheckmated() {
        //Updates Checkmate Variable to Stop Game
        //TODO: Add Functionality lol
        return true;
    }

    public void init() {
        board.init();
    }

    public void playGame() {
        while(!isCheckmate) {
            //Print Chess Board
            board.print();

            //White Moves
            boolean isValidMove = false;
            while(!isValidMove) {
                System.out.println("White Moves (Select Piece): ");
                String pieceString = scanner.nextLine();
                System.out.println("To: ");
                String locationString = scanner.nextLine();
                //TODO: parse moves
                Move white = new Move(null, null);
                isValidMove = white.isValid();
                isValidMove=true;
            }

            //Black Moves
        }
    }
}
