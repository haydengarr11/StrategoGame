import org.w3c.dom.events.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Game extends Board {
    public void runGame() {
        hidePieces hideP = new hidePieces();
        redPlayerTurn = true;
        hideP.hideBluePieces();

        JOptionPane.showMessageDialog(null, "It is red players move");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (c1squares[i][j].getBackground() == Color.RED) {
                    c1squares[i][j].addActionListener(this);
                }
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        movePiece move = new movePiece();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (c1squares[i][j].getBackground() == Color.RED && e.getSource() == c1squares[i][j] && redPlayerTurn) {
                    if (!c1squares[i][j].getText().equals("F") || !c1squares[i][j].getText().equals("B")) {
                        String[] options = {"Up", "Right", "Down", "Left"};
                        String switching = (String) JOptionPane.showInputDialog(null, "Which Direction?", String.valueOf(options),
                                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                        switch (switching) {
                            case "Up":
                                move.movePieceRed(c1squares[i][j], c1squares[i - 1][j]);
                                break;

                            case "Right":
                                move.movePieceRed(c1squares[i][j], c1squares[i][j + 1]);
                                break;

                            case "Down":
                                move.movePieceRed(c1squares[i][j], c1squares[i + 1][j]);
                                break;

                            case "Left":
                                move.movePieceRed(c1squares[i][j], c1squares[i][j - 1]);
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't move this piece");
                    }
                } else if (c1squares[i][j].getBackground() == Color.BLUE && e.getSource() == c1squares[i][j] && !redPlayerTurn) {
                    if (!c1squares[i][j].getText().equals("F") || !c1squares[i][j].getText().equals("B")) {
                        String[] options = {"Up", "Right", "Down", "Left"};
                        String switching = (String) JOptionPane.showInputDialog(null, "Which Direction?", String.valueOf(options),
                                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                        switch (switching) {
                            case "Up":
                                move.movePieceBlue(c1squares[i][j], c1squares[i - 1][j]);
                                break;

                            case "Right":
                                move.movePieceBlue(c1squares[i][j], c1squares[i][j + 1]);
                                break;

                            case "Down":
                                move.movePieceBlue(c1squares[i][j], c1squares[i + 1][j]);
                                break;

                            case "Left":
                                move.movePieceBlue(c1squares[i][j], c1squares[i][j - 1]);
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "You can't move this piece");
                    }
                }
            }
        }
    }
}

