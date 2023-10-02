package game;

import pieces.Piece;

public class Move {
    Piece piece;
    int[] newLocation;

    public Move(Piece piece, int[] newLocation) {
        this.piece = piece;
        this.newLocation = newLocation;
    }

    public boolean isValid() {
        return piece.isValidMove(newLocation);
    }
}
