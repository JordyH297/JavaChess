package org.example.chess;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    private GridPane chessboard;

    public void initialize() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle square = new Rectangle(55, 55);  // Slightly larger squares for better visibility
                if ((row + col) % 2 == 0) {
                    square.setFill(Color.valueOf("#f0d9b5"));  // A lighter shade for the white squares
                } else {
                    square.setFill(Color.valueOf("#b58863"));  // A darker shade for the black squares
                }
                chessboard.add(square, col, row);
            }
        }
    }
}
