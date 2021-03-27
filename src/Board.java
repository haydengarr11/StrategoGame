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
    int numScoutsRed = 6;
    int numMinersRed = 5;
    int numSeargentsRed = 5;
    int numLieuRed = 4;
    int numCaptainsRed = 4;
    int nummajorRed = 3;
    int numColoRed = 2;
    int numGeneralRed = 1;
    int numMarshallRed = 1;

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
                b.setFont(new Font("Arial", Font.PLAIN, 16));

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


    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < c1squares.length; i++) {
            for (int j = 0; j < c1squares[i].length; j++) {
                if (e.getSource().equals(c1squares[j][i])) {
                    JOptionPane.showMessageDialog(null, "You may Place " + numBombsRed + " Bombs, " + numFlagRed
                            + " Flag, " + numScoutsRed + " Scouts, " + numMinersRed + " Miners, " + numSpyRed + " Spy, "
                            + numSeargentsRed + " Seargents, " + numLieuRed + " Lieutenants, " + numCaptainsRed + " Captains, "
                            + nummajorRed + " Majors, " + numColoRed + " Colonels, " + numGeneralRed + " Generals "
                            + numMarshallRed + " Marshall");
                    String[] options = {"F", "B", "S", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
                    String switching = (String) JOptionPane.showInputDialog(null, "What piece would you like to switch? ", String.valueOf(options),
                            JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                    switch(switching) {
                        case "B":
                            c1squares[j][i].setText("B");
                            numBombsRed--;

                            break;
                        case "F":
                            c1squares[j][i].setText("F");
                            numFlagRed--;

                            break;
                        case "S":
                            c1squares[j][i].setText("S");
                            numSpyRed--;

                            break;
                        case "2":
                            c1squares[j][i].setText("2");
                            numScoutsRed--;

                            break;
                        case "3":
                            c1squares[j][i].setText("3");
                            numMinersRed--;

                            break;
                        case "4":
                            c1squares[j][i].setText("4");
                            numSeargentsRed--;

                            break;
                        case "5":
                            c1squares[j][i].setText("5");
                            numLieuRed--;

                            break;
                        case "6":
                            c1squares[j][i].setText("6");
                            numCaptainsRed--;

                            break;
                        case "7":
                            c1squares[j][i].setText("7");
                            nummajorRed--;

                            break;
                        case "8":
                            c1squares[j][i].setText("8");
                            numColoRed--;

                            break;
                        case "9":
                            c1squares[j][i].setText("9");
                            numGeneralRed--;

                            break;
                        case "10":
                            c1squares[j][i].setText("10");
                            numMarshallRed--;

                            break;
                    }

                    }
                }
            }
        }


    public static void main(String[] args) {

        Board gb = new Board();
        JFrame frame1 = new JFrame("Stratego");
        frame1.add(gb.getGui());
        frame1.setLocationByPlatform(true);
        frame1.setMinimumSize(frame1.getSize());
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
        frame1.setPreferredSize(new Dimension(1000, 600));
        frame1.setMinimumSize(new Dimension(1000, 500));
        frame1.setLocation(50, 50);
        frame1.pack();
        frame1.setVisible(true);

    }
}

