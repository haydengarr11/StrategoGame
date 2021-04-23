import org.w3c.dom.events.Event;


import javax.swing.*;
import java.awt.*;

class movePiece extends Board {
    public void movePieceRed(JButton aPiece, JButton dPiece) {
        if (dPiece.getBackground() == Color.RED) {
            JOptionPane.showMessageDialog(null, "Try again, space blocked by Red Piece");
            nextTurn();
        } else if (dPiece.getBackground() == Color.GRAY) {
            dPiece.setBackground(Color.RED);
            dPiece.setText(aPiece.getText());
            aPiece.setBackground(Color.GRAY);
            aPiece.setText("");
        } else if (dPiece.getBackground() == Color.BLUE) {
            switch (dPiece.getText()) {
                case "F":
                    JOptionPane.showMessageDialog(null, "Game over: Red wins");
                    resetGame();
                    break;
                case "B":
                    JOptionPane.showMessageDialog(null, "You hit a bomb");
                    if (aPiece.getText().equals("3")) {
                        JOptionPane.showMessageDialog(null, "Bomb Diffused");
                        dPiece.setBackground(Color.RED);
                        dPiece.setText(aPiece.getText());
                        aPiece.setBackground(Color.GRAY);
                        aPiece.setText("");
                    } else if (aPiece.getText().equals("S") || aPiece.getText().equals("2")
                            || aPiece.getText().equals("4") || aPiece.getText().equals("5")
                            || aPiece.getText().equals("6") || aPiece.getText().equals("7")
                            || aPiece.getText().equals("8") || aPiece.getText().equals("9")
                            || aPiece.getText().equals("10")) {
                        JOptionPane.showMessageDialog(null, "You've lost your piece");
                        aPiece.setBackground(Color.GRAY);
                        aPiece.setText("");

                    }
                    break;
                case "10":
                    switch (aPiece.getText()) {
                        case "S":
                            JOptionPane.showMessageDialog(null, "Marshal Captured");
                            dPiece.setBackground(Color.RED);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "10":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "6":
                        case "7":
                        case "8":
                        case "9":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }

                    break;
                case "9":
                    switch (aPiece.getText()) {
                        case "10":
                            JOptionPane.showMessageDialog(null, "General Captured");
                            dPiece.setBackground(Color.RED);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "9":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "6":
                        case "7":
                        case "8":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "8":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                            JOptionPane.showMessageDialog(null, "Colonel Captured");
                            dPiece.setBackground(Color.RED);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "8":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "6":
                        case "7":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "7":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                            JOptionPane.showMessageDialog(null, "Major Captured");
                            dPiece.setBackground(Color.RED);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "7":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "6":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "6":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                            JOptionPane.showMessageDialog(null, "Captain Captured");
                            dPiece.setBackground(Color.RED);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "6":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "5":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                        case "6":
                            JOptionPane.showMessageDialog(null, "Lieutenant Captured");
                            dPiece.setBackground(Color.RED);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "5":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "4":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                        case "6":
                        case "5":
                            JOptionPane.showMessageDialog(null, "Sergeant Captured");
                            dPiece.setBackground(Color.RED);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "4":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "3":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                        case "6":
                        case "4":
                        case "5":
                            JOptionPane.showMessageDialog(null, "Miner Captured");
                            dPiece.setBackground(Color.RED);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "3":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "2":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                        case "6":
                        case "4":
                        case "5":
                        case "3":
                            JOptionPane.showMessageDialog(null, "Scout Captured");
                            dPiece.setBackground(Color.RED);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "S":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                        case "6":
                        case "4":
                        case "5":
                        case "3":
                        case "2":
                            JOptionPane.showMessageDialog(null, "Spy Captured");
                            dPiece.setBackground(Color.RED);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "S":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
            }
        }

    }

    public void movePieceBlue(JButton aPiece, JButton dPiece) {

        if (dPiece.getBackground() == Color.BLUE) {
            JOptionPane.showMessageDialog(null, "Try again, space blocked by Blue Piece");
            nextTurn();
        } else if (dPiece.getBackground() == Color.GRAY) {
            dPiece.setBackground(Color.BLUE);
            dPiece.setText(aPiece.getText());
            aPiece.setBackground(Color.GRAY);
            aPiece.setText("");
        } else if (dPiece.getBackground() == Color.RED) {
            switch (dPiece.getText()) {
                case "F":
                    JOptionPane.showMessageDialog(null, "Game over: Blue wins");
                    resetGame();
                    break;
                case "B":
                    JOptionPane.showMessageDialog(null, "You hit a bomb");
                    if (aPiece.getText().equals("3")) {
                        JOptionPane.showMessageDialog(null, "Bomb Diffused");
                        dPiece.setBackground(Color.BLUE);
                        dPiece.setText(aPiece.getText());
                        aPiece.setBackground(Color.GRAY);
                        aPiece.setText("");
                    } else if (aPiece.getText().equals("S") || aPiece.getText().equals("2")
                            || aPiece.getText().equals("4") || aPiece.getText().equals("5")
                            || aPiece.getText().equals("6") || aPiece.getText().equals("7")
                            || aPiece.getText().equals("8") || aPiece.getText().equals("9")
                            || aPiece.getText().equals("10")) {
                        JOptionPane.showMessageDialog(null, "You've lost your piece");
                        aPiece.setBackground(Color.GRAY);
                        aPiece.setText("");

                    }
                    break;
                case "10":
                    switch (aPiece.getText()) {
                        case "S":
                            JOptionPane.showMessageDialog(null, "Marshal Captured");
                            dPiece.setBackground(Color.BLUE);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "10":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "6":
                        case "7":
                        case "8":
                        case "9":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }

                    break;
                case "9":
                    switch (aPiece.getText()) {
                        case "10":
                            JOptionPane.showMessageDialog(null, "General Captured");
                            dPiece.setBackground(Color.BLUE);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "9":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "6":
                        case "7":
                        case "8":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "8":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                            JOptionPane.showMessageDialog(null, "Colonel Captured");
                            dPiece.setBackground(Color.BLUE);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "8":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "6":
                        case "7":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "7":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                            JOptionPane.showMessageDialog(null, "Major Captured");
                            dPiece.setBackground(Color.BLUE);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "7":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "6":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "6":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                            JOptionPane.showMessageDialog(null, "Captain Captured");
                            dPiece.setBackground(Color.BLUE);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "6":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "5":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                        case "6":
                            JOptionPane.showMessageDialog(null, "Lieutenant Captured");
                            dPiece.setBackground(Color.BLUE);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "5":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "4":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "4":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                        case "6":
                        case "5":
                            JOptionPane.showMessageDialog(null, "Sergeant Captured");
                            dPiece.setBackground(Color.BLUE);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "4":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "3":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "3":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                        case "6":
                        case "4":
                        case "5":
                            JOptionPane.showMessageDialog(null, "Miner Captured");
                            dPiece.setBackground(Color.BLUE);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "3":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "2":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                        case "6":
                        case "4":
                        case "5":
                        case "3":
                            JOptionPane.showMessageDialog(null, "Scout Captured");
                            dPiece.setBackground(Color.BLUE);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "2":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "S":
                            JOptionPane.showMessageDialog(null, "You've lost your piece");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
                case "S":
                    switch (aPiece.getText()) {
                        case "9":
                        case "10":
                        case "8":
                        case "7":
                        case "6":
                        case "4":
                        case "5":
                        case "3":
                        case "2":
                            JOptionPane.showMessageDialog(null, "Spy Captured");
                            dPiece.setBackground(Color.BLUE);
                            dPiece.setText(aPiece.getText());
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                        case "S":
                            JOptionPane.showMessageDialog(null, "Both pieces lost");
                            dPiece.setBackground(Color.GRAY);
                            dPiece.setText("");
                            aPiece.setBackground(Color.GRAY);
                            aPiece.setText("");
                            break;
                    }
                    break;
            }
        }
    }

}


