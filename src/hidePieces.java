import org.w3c.dom.events.Event;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class hidePieces extends Board {
    ArrayList<String> bluePieces = new ArrayList<>();
    ArrayList<String> redPieces = new ArrayList<>();
    public void hideBluePieces() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                if (redPlayerTurn && c1squares[i][j].getBackground().equals(Color.RED)) {
                    c1squares[i][j].setText(redPieces.remove(0));
                } else if (redPlayerTurn && c1squares[i][j].getBackground().equals(Color.BLUE)) {
                    bluePieces.add(c1squares[i][j].getText());
                    c1squares[i][j].setText("");
                }
            }
        }

    }

    public void hideRedPieces() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                if (!redPlayerTurn && c1squares[i][j].getBackground().equals(Color.BLUE)) {
                    c1squares[i][j].setText(bluePieces.remove(0));
                } else if (!redPlayerTurn && c1squares[i][j].getBackground().equals(Color.RED)) {
                    redPieces.add(c1squares[i][j].getText());
                    c1squares[i][j].setText("");
                }
            }
        }

    }
}

