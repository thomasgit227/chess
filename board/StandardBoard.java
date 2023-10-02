package board;

import pieces.*;

public class StandardBoard extends Board {
    final int blackRow = 0;
    final int whiteRow = 7;

    final int leftRook = 0;
    final int leftKnight = 1;
    final int leftBishop = 2;
    final int queen = 3;
    final int king = 4;
    final int rightBishop = 5;
    final int rightKnight = 6;
    final int rightRook = 7;

    //Traditional Chess Layout (8x8)
    public StandardBoard() {
        super();
        //Clear Board
        for(int i = 0; i < getHeight(); i++) {
            for(int j = 0; j < getWidth(); j++) {
                update(i, j, new Empty(new int[]{i,j}));
            }
        }

        //Pawns
        for(int j = 0; j < getWidth(); j++) {
            update(blackRow + 1, j, new Pawn("black", new int[]{blackRow + 1, j}));
        }
        for(int j = 0; j < getWidth(); j++) {
            update(whiteRow - 1, j, new Pawn("white", new int[]{whiteRow - 1, j}));
        }

        //Rooks
        update(blackRow, leftRook, new Rook("black", new int[]{blackRow, leftRook}));
        update(blackRow, rightRook, new Rook("black", new int[]{blackRow, rightRook}));
        update(whiteRow, leftRook, new Rook("white", new int[]{whiteRow, leftRook}));
        update(whiteRow, rightRook, new Rook("white", new int[]{whiteRow, leftRook}));

        //Knights
        update(blackRow, leftKnight, new Knight("black", new int[]{blackRow, leftKnight}));
        update(blackRow, rightKnight, new Knight("black", new int[]{blackRow, rightKnight}));
        update(whiteRow, leftKnight, new Knight("white", new int[]{whiteRow, leftKnight}));
        update(whiteRow, rightKnight, new Knight("white", new int[]{whiteRow, rightKnight}));

        //Bishops
        update(blackRow, leftBishop, new Bishop("black", new int[]{blackRow, leftBishop}));
        update(blackRow, rightBishop, new Bishop("black", new int[]{blackRow, rightBishop}));
        update(whiteRow, leftBishop, new Bishop("white", new int[]{whiteRow, leftBishop}));
        update(whiteRow, rightBishop, new Bishop("white", new int[]{whiteRow, rightBishop}));

        //Kings & Queens
        update(blackRow, king, new King("black", new int[]{blackRow, king}));
        update(blackRow, queen, new Queen("black", new int[]{blackRow, queen}));
        update(whiteRow, king, new King("white", new int[]{whiteRow, king}));
        update(whiteRow, queen, new Queen("white", new int[]{whiteRow, queen}));    
    }
}
