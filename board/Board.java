package board;

import pieces.Piece;

public abstract class Board {
    private int height;
    private int width;
    private Piece[][] board;

    public Board() {
        this(8, 8);
    }

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
        this.board = new Piece[height][width];
    }

    public Piece getState(int i, int j) {
        return board[i][j];
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void init() {
    }

    public void update(int i, int j, Piece piece) {
        board[i][j] = piece;
    }

    public void print() {
        System.out.println("   a  b  c  d  e  f  g  h ");
        for(int i = 0; i < height; i++) {
            System.out.print(i + 1 + " ");
            for(int j = 0; j < width; j++) {
                System.out.print("[");
                System.out.print(board[i][j].getSymbol());
                System.out.print("]");
            }
            System.out.println("");
        }
    }

    // private String getPiecetring(Piece piece) {
    //     switch(piece.color) {
    //         case "White":
    //             switch(piece.type) {         
    //                 case KING:
    //                     return "♔";
    //                 case QUEEN:
    //                     return "♕";
    //                 case BISHOP:
    //                     return "♗";
    //                 case KNIGHT:
    //                     return "♘";
    //                 case ROOK:
    //                     return "♖";
    //                 case PAWN:
    //                     return "♙";
    //                 case EMPTY:
    //                 default:
    //                     return " ";
    //             }
    //         case "Black":
    //             switch(piece.type) {         
    //                 case KING:
    //                     return "♚";
    //                 case QUEEN:
    //                     return "♛";
    //                 case BISHOP:
    //                     return "♝";
    //                 case KNIGHT:
    //                     return "♞";
    //                 case ROOK:
    //                     return "♜";
    //                 case PAWN:
    //                     return "♟︎";
    //                 case EMPTY:
    //                 default:
    //                     return " ";
    //             }
    //         default:
    //             return " ";
    //     }
    // }
}