package pieces;

public class Empty implements Piece {
    int[] location;

    public Empty(int[] location) {
        this.location = location;
    }

    public String getColor() {
        return "";
    }

    public int[] getLocation() {
        return location;
    }

    public boolean isValidMove(int[] newLocation) {
        return false;
    }

    public char getSymbol() {
        return ' ';  
    }    

    public void setLocation() {
        return;
    }
}
