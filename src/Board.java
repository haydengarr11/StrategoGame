import org.w3c.dom.events.Event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;

/**********
 * This class is a board setup class for our Stratego Game
 *
 * @author - Luke Seeterlin, Hayden Garrett, Austin Ackerman
 * @version - 3/29/2021
 **********/
public class Board extends JPanel implements ActionListener {

    /** Board JPanel initialization */
    private final JPanel board = new JPanel(new BorderLayout(3, 3));

    /** JButton initialization for square spaces in the board */
    private JButton[][] c1squares = new JButton[10][10];

    /** JPanel initialization for board that contains squares */
    private JPanel c1Board;

    /** title JLabel initialization */
    private final JLabel title = new JLabel("Stratego Game");

    /** reset JButton initialization */
    private JButton resetButton = new JButton("Reset Game");

    /** toolbar initialization for GUI */
    JToolBar tool = new JToolBar();

    /** GUI margin initialization */
    Insets Margin = new Insets(0, 0, 0, 0);

    /** Initialization of variable for how many squares there will be on each side of the board */
    int squares = 10;

    /** Initialization of space needed for each square */
    int space = 100;

    /** Initialization of number of bombs for red team */
    int numBombsRed = 6;

    /** Initialization of number of flags for red team */
    int numFlagRed = 1;

    /** Initialization of number of spies for red team */
    int numSpyRed = 1;

    /** Initialization of number of scouts for red team */
    int numScoutsRed = 8;

    /** Initialization of number of miners for red team */
    int numMinersRed = 5;

    /** Initialization of number of sergeants  for red team */
    int numSeargentsRed = 4;

    /** Initialization of number of lieutenants for red team */
    int numLieuRed = 4;

    /** Initialization of number of captains for red team */
    int numCaptainsRed = 4;

    /** Initialization of number of majors for red team */
    int nummajorRed = 3;

    /** Initialization of number of colonels for red team */
    int numColoRed = 2;

    /** Initialization of number of generals for red team */
    int numGeneralRed = 1;

    /** Initialization of number of marshals for red team */
    int numMarshalRed = 1;

    /** Initialization of boolean if it is red teams turn or blue teams turn */
    private boolean redPlayerTurn = true;

    /** Initialization of number of bombs for blue team */
    int numBombsBlue = 6;

    /** Initialization of number of flags for blue team */
    int numFlagBlue = 1;

    /** Initialization of number of spies for blue team */
    int numSpyBlue = 1;

    /** Initialization of number of scouts for blue team */
    int numScoutsBlue = 8;

    /** Initialization of number of miners for blue team */
    int numMinersBlue = 5;

    /** Initialization of number of sergeants for blue team */
    int numSeargentsBlue = 4;

    /** Initialization of number of lieutenants for blue team */
    int numLieuBlue = 4;

    /** Initialization of number of captains for blue team */
    int numCaptainsBlue = 4;

    /** Initialization of number of majors for blue team */
    int numMajorBlue = 3;

    /** Initialization of number of colonels for blue team */
    int numColoBlue = 2;

    /** Initialization of number of generals for blue team */
    int numGeneralBlue = 1;

    /** Initialization of number of marshals for blue team */
    int numMarshalBlue = 1;

    /** Initialization to determine how many pieces are placed for red team */
    int jj = 0;

    /** Initialization to determine how many pieces are placed for blue team */
    int kk = 0;

    /** Initialization for icons for each square on the board */
    ImageIcon icon = new ImageIcon(new BufferedImage(space, space, BufferedImage.TYPE_INT_ARGB));

    /**
     * This method is the default constructor that initializes the board and boots up the GUI
     */
    Board() {
        initializeGui();
    }

    /**
     * get method for GUI to return board
     *
     * @return - returns board as a JComponent
     */
    public final JComponent getGui() {
        return board;
    }

    /**
     * This method sets up the GUI portion of the board
     */
    public final void initializeGui() {

        board.setBorder(new EmptyBorder(5, 5, 5, 5));
        tool.setFloatable(false);
        board.add(tool, BorderLayout.PAGE_START);
        tool.add(title);
        tool.addSeparator();
        tool.add(resetButton);
        c1Board = new JPanel(new GridLayout(0, 10));
        c1Board.setBorder(new LineBorder(Color.BLACK));
        board.add(c1Board);


        for (int i = 0; i < c1squares.length; i++) {
            for (int j = 0; j < c1squares[i].length; j++) {
                JButton b = new JButton();
                b.setFont(new Font("Arial", Font.PLAIN, 24));

                b.setMargin(Margin);
                b.setIcon(icon);


                if (i <= 3) {
                    b.setBackground(Color.RED);
                    b.setOpaque(true);
                } else if (i > 5) {
                    b.setBackground(Color.BLUE);
                    b.setOpaque(true);

                } else {
                    b.setBackground(Color.GRAY);
                    b.setOpaque(true);
                }
                c1squares[j][i] = b;
                c1squares[j][i].addActionListener(this);

            }
        }


        for (int i = 0; i < squares; i++) {
            for (int j = 0; j < squares; j++) {
                c1Board.add(c1squares[j][i]);
            }
        }
    }

    /**
     * this method is for the timer in out game
     */
//    private void setTimer(){
//        time.setText("time: " + start);
//        timer = new Timer(1000, this);
//        timer.start();
//        if (start >= 1){
//            start--;
//            time.setText("time: " + start);
//            setTimer();
//        }else {
//            timer.stop();
//        }
//    }

    /**
     * This method implements the reset button and resets the game whenever clicked
     */
    private void resetGame(){
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                c1squares[i][j].setText("");
            }
        }
        redPlayerTurn = true;
        numBombsRed = 6;
        numBombsBlue = 6;
        numFlagRed = 1;
        numFlagBlue = 1;
        numSpyRed = 1;
        numSpyBlue = 1;
        numScoutsRed = 8;
        numScoutsBlue = 8;
        numMinersRed = 5;
        numMinersBlue = 5;
        numSeargentsRed = 4;
        numSeargentsBlue = 4;
        numLieuRed = 4;
        numLieuBlue = 4;
        numCaptainsRed = 4;
        numCaptainsBlue = 4;
        nummajorRed = 3;
        numMajorBlue = 3;
        numColoRed = 2;
        numColoBlue = 2;
        numGeneralRed = 1;
        numGeneralBlue = 1;
        numMarshalRed = 1;
        numMarshalBlue = 1;
        jj = 0;
        kk = 0;
    }

    /**
     * This method is used to determine if it is red teams turn or not
     *
     * @return - true or false depending on which teams turn it is
     */
    private boolean isRedPlayerTurn(){
        if (redPlayerTurn = true) {
            redPlayerTurn = false;
        }else {
            redPlayerTurn = true;
        }
        return redPlayerTurn;
    }

    /**
     * this action performed method is used to set up the game and for each team (red first)
     * to place all of their pieces
     *
     * @param e - action event of clicking a square to place pieces
     */
    public void actionPerformed(ActionEvent e) {
        if (redPlayerTurn) {
            if (jj == 0){
                JOptionPane.showMessageDialog(null,"It is Red's turn to pick");
                jj++;
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < c1squares[i].length; j++) {
                    if (e.getSource().equals(c1squares[j][i])) {
                        JOptionPane.showMessageDialog(null, "You may Place " + numBombsRed + " Bombs, " + numFlagRed
                                + " Flag, " + numSpyRed + " Spy, " + numMinersRed + " Miners, " + numScoutsRed + " scouts, "
                                + numSeargentsRed + " Seargents, " + numLieuRed + " Lieutenants, " + numCaptainsRed + " Captains, "
                                + nummajorRed + " Majors, " + numColoRed + " Colonels, " + numGeneralRed + " Generals "
                                + numMarshalRed + " Marshall");
                        String[] options = {"F", "B", "S", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
                        String switching = (String) JOptionPane.showInputDialog(null, "What piece would you like to pick? ", String.valueOf(options),
                                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        if (numBombsRed + numFlagRed + numSpyRed + numGeneralRed + numColoRed + numLieuRed +
                                numSeargentsRed + nummajorRed + numMinersRed + numMarshalRed + numCaptainsRed + numScoutsRed > 0) {

                            switch (switching) {
                                case "B":
                                    if (numBombsRed > 0) {
                                        c1squares[j][i].setText("B");
                                        numBombsRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Bombs remaining. Try again!");
                                    }

                                    break;
                                case "F":
                                    if (numFlagRed > 0) {
                                        c1squares[j][i].setText("F");
                                        numFlagRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have already placed your flag. Try again!");
                                    }

                                    break;
                                case "S":
                                    if (numSpyRed > 0) {
                                        c1squares[j][i].setText("S");
                                        numSpyRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have already placed your Spy. Try again!");
                                    }

                                    break;
                                case "2":
                                    if (numScoutsRed > 0) {
                                        c1squares[j][i].setText("2");
                                        numScoutsRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no scouts remaining. Try again!");
                                    }

                                    break;
                                case "3":
                                    if (numMinersRed > 0) {
                                        c1squares[j][i].setText("3");
                                        numMinersRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Miners remaining. Try again!");
                                    }

                                    break;
                                case "4":
                                    if (numSeargentsRed > 0) {
                                        c1squares[j][i].setText("4");
                                        numSeargentsRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Seargents remaining. Try again!");
                                    }

                                    break;
                                case "5":
                                    if (numLieuRed > 0) {
                                        c1squares[j][i].setText("5");
                                        numLieuRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Lieutenants remaining. Try again!");
                                    }

                                    break;
                                case "6":
                                    if (numCaptainsRed > 0) {
                                        c1squares[j][i].setText("6");
                                        numCaptainsRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Captains remaining. Try again!");
                                    }

                                    break;
                                case "7":
                                    if (nummajorRed > 0) {
                                        c1squares[j][i].setText("7");
                                        nummajorRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Majors remaining. Try again!");
                                    }

                                    break;
                                case "8":
                                    if (numColoRed > 0) {
                                        c1squares[j][i].setText("8");
                                        numColoRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Colonels remaining. Try again!");
                                    }

                                    break;
                                case "9":
                                    if (numGeneralRed > 0) {
                                        c1squares[j][i].setText("9");
                                        numGeneralRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Generals remaining. Try again!");
                                    }

                                    break;
                                case "10":
                                    if (numMarshalRed > 0) {
                                        c1squares[j][i].setText("10");
                                        numMarshalRed--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Marshals remaining. Try again!");
                                    }

                                    break;
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "It is blue players turn!");
                            redPlayerTurn = false;
                        }
                    }

                }
            }
        }
        else if (!redPlayerTurn){
            if (kk == 0) {
                JOptionPane.showMessageDialog(null, "It is Blue's turn to pick");
                kk++;
            }
            for (int k = 6; k < 10; k++){
                for (int m = 0; m <c1squares[k].length; m++){
                    if (e.getSource().equals(c1squares[m][k])) {
                        JOptionPane.showMessageDialog(null, "You may Place " + numBombsBlue + " Bombs, " + numFlagBlue+ " Flag, " + numSpyBlue + " Spy, " + numMinersBlue + " Miners, " + numScoutsBlue + " scouts, "
                                + numSeargentsBlue + " Seargents, " + numLieuBlue + " Lieutenants, " + numCaptainsBlue + " Captains, "
                                + numMajorBlue + " Majors, " + numColoBlue + " Colonels, " + numGeneralBlue + " Generals "
                                + numMarshalBlue + " Marshall");
                        String[] options = {"F", "B", "S", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
                        String switching = (String) JOptionPane.showInputDialog(null, "What piece would you like to pick? ", String.valueOf(options),
                                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        if (numBombsBlue + numFlagBlue + numSpyBlue + numGeneralBlue + numColoBlue + numLieuBlue +
                                numSeargentsBlue + numMajorBlue + numMinersBlue + numMarshalBlue + numCaptainsBlue + numScoutsBlue > 0) {

                            switch (switching) {
                                case "B":
                                    if (numBombsBlue > 0) {
                                        c1squares[m][k].setText("B");
                                        numBombsBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Bombs remaining. Try again!");
                                    }

                                    break;
                                case "F":
                                    if (numFlagBlue > 0) {
                                        c1squares[m][k].setText("F");
                                        numFlagBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have already placed your flag. Try again!");
                                    }

                                    break;
                                case "S":
                                    if (numSpyBlue > 0) {
                                        c1squares[m][k].setText("S");
                                        numSpyBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have already placed your Spy. Try again!");
                                    }

                                    break;
                                case "2":
                                    if (numScoutsBlue > 0) {
                                        c1squares[m][k].setText("2");
                                        numScoutsBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no scouts remaining. Try again!");
                                    }

                                    break;
                                case "3":
                                    if (numMinersBlue > 0) {
                                        c1squares[m][k].setText("3");
                                        numMinersBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Miners remaining. Try again!");
                                    }

                                    break;
                                case "4":
                                    if (numSeargentsBlue > 0) {
                                        c1squares[m][k].setText("4");
                                        numSeargentsBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Seargents remaining. Try again!");
                                    }

                                    break;
                                case "5":
                                    if (numLieuBlue > 0) {
                                        c1squares[m][k].setText("5");
                                        numLieuBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Lieutenants remaining. Try again!");
                                    }

                                    break;
                                case "6":
                                    if (numCaptainsBlue > 0) {
                                        c1squares[m][k].setText("6");
                                        numCaptainsBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Captains remaining. Try again!");
                                    }

                                    break;
                                case "7":
                                    if (numMajorBlue > 0) {
                                        c1squares[m][k].setText("7");
                                        numMajorBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Majors remaining. Try again!");
                                    }

                                    break;
                                case "8":
                                    if (numColoBlue > 0) {
                                        c1squares[m][k].setText("8");
                                        numColoBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Colonels remaining. Try again!");
                                    }

                                    break;
                                case "9":
                                    if (numGeneralBlue > 0) {
                                        c1squares[m][k].setText("9");
                                        numGeneralBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Generals remaining. Try again!");
                                    }

                                    break;
                                case "10":
                                    if (numMarshalBlue > 0) {
                                        c1squares[m][k].setText("10");
                                        numMarshalBlue--;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "You have no Marshals remaining. Try again!");
                                    }

                                    break;
                            }

                        }
                        else {
                            JOptionPane.showMessageDialog(null, "You have placed all your pieces!");
                        }

                    }
                }
            }
        }
    }

}

