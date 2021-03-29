import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;

public class Board extends JPanel implements ActionListener {

    private final JPanel board = new JPanel(new BorderLayout(3, 3));
    private JButton[][] c1squares = new JButton[10][10];
    private JPanel c1Board;
    private final JLabel title = new JLabel("Stratego Game");
    JToolBar tool = new JToolBar();
    Insets Margin = new Insets(0, 0, 0, 0);
    int squares = 10;
    int space = 100;
    int numBombsRed = 6;
    int numFlagRed = 1;
    int numSpyRed = 1;
    int numScoutsRed = 8;
    int numMinersRed = 5;
    int numSeargentsRed = 4;
    int numLieuRed = 4;
    int numCaptainsRed = 4;
    int nummajorRed = 3;
    int numColoRed = 2;
    int numGeneralRed = 1;
    int numMarshalRed = 1;
    private boolean redPlayerTurn = true;
    int numBombsBlue = 6;
    int numFlagBlue = 1;
    int numSpyBlue = 1;
    int numScoutsBlue = 8;
    int numMinersBlue = 5;
    int numSeargentsBlue = 4;
    int numLieuBlue = 4;
    int numCaptainsBlue = 3;
    int numMajorBlue = 3;
    int numColoBlue = 2;
    int numGeneralBlue = 1;
    int numMarshalBlue = 1;
    int jj = 0;
    int kk = 0;


    ImageIcon icon = new ImageIcon(new BufferedImage(space, space, BufferedImage.TYPE_INT_ARGB));

    Board() {
        initializeGui();
    }


    public final JComponent getGui() {
        return board;
    }

    public final void initializeGui() {

        board.setBorder(new EmptyBorder(5, 5, 5, 5));
        tool.setFloatable(false);
        board.add(tool, BorderLayout.PAGE_START);
        tool.add(title);
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
    private boolean isRedPlayerTurn(){
        if (redPlayerTurn = true) {
            redPlayerTurn = false;
        }else {
            redPlayerTurn = true;
        }
        return redPlayerTurn;
    }


    public void actionPerformed(ActionEvent e) {
        if (redPlayerTurn == true) {
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
            } else if (redPlayerTurn == false){
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

                        } else {
                            JOptionPane.showMessageDialog(null, "You have placed all your pieces!");
                        }

                    }
                }
            }
        }
        }

    }


