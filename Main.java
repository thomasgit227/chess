import game.GameManager;
import game.GameType;

class Main {
    public static void main(String[] args) {
        GameManager game = new GameManager(GameType.Standard);
        game.init();
        game.playGame();

        // System.out.println("Print my darn unicode symbols >:(");
        // System.out.println("White King: ♕");
        // System.out.println("Black Pawn: \u265F\uFE0E");
    }
}