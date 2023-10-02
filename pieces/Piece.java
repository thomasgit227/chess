package pieces;

public interface Piece {
    String getColor();
    int[] getLocation();
    boolean isValidMove(int[] newLocation);
    char getSymbol();
    void setLocation();
    //Add Movement Methods
}
