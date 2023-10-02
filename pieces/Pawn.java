package pieces;

public class Pawn implements Piece {
    int[] location;
    String color;

    public Pawn(String color, int[] location) {
        this.color = color;
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public int[] getLocation() {
        return location;
    }

    public boolean isValidMove(int[] newLocation) {
        return false;
    }

    public char getSymbol() {
        switch(color.toLowerCase()) {
            case "white":
                // return '♙';
            case "black":
                // return '♟';
            default:
                return 'P';
        }
    }    

    public void setLocation() {
        return;
    }
}
