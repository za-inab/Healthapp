package sample;

import java.util.ArrayList;
/*
part of connect 4 class named column
 */
public class Column {
    private ArrayList<GamePiece> pieceArray = new ArrayList<GamePiece> ();
    private double rightBorder;
    private double centerX;
    private int columnNumber;
    private int placedPieces = 0;

    //When numbering Columns start at 1, not 0
    public Column(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    //All previous columns must be of equal size for centerX to correct
    public void setBorder(double borderValue) {
        rightBorder = borderValue;
    }

    public void setCenter(double centerValue) {
        centerX = centerValue;
    }

    public void addGamePiece(GamePiece piece) {
        pieceArray.add(piece);
    }

    public void addPiece() {
        placedPieces++;
    }

    public ArrayList<GamePiece> getPieceArray() {
        return pieceArray;
    }

    public double getBorder() {
        return rightBorder;
    }

    public double getCenter() {
        return centerX;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public int getPieces() {
        return placedPieces;
    }

    public void resetPieces() {
        placedPieces = 0;
    }

}