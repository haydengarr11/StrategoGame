import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;

/**********
 * This class is a choose piece class for the GUI for our Stratego Game
 *
 * @author - Luke Seeterlin, Hayden Garrett, Austin Ackerman
 * @version - 3/29/2021
 **********/
public class ChoosePieces {

    /** initialization of the GUI board */
    private final JPanel board = new JPanel(new BorderLayout(3, 3));

    /** initialization of the pieces buttons on every square on the board */
    private JButton[][] pieceButtons = new JButton[10][10];

    /** initialization of pieces panel for selecting pieces */
    private JPanel piecesPanel;

    /** initialization of Gui JButton margins */
    Insets Margin = new Insets(0, 0, 0, 0);

    /** Initialization of variable for how many squares there will be on each side of the board */
    int squares = 10;

    /** Initialization of space needed for each square */
    int space = 100;

    /** Initialization for icons for each square on the board */
    ImageIcon icon = new ImageIcon(new BufferedImage(space, space, BufferedImage.TYPE_INT_ARGB));

    /**
     * This method is the default constructor that initializes the choose pieces Gui
     */
    ChoosePieces() {
        initializeGui();
    }

    /**
     * get method for choosing pieces board
     *
     * @return - returns the Gui board for choosing pieces as a JComponent
     */
    public final JComponent getGui() {
        return board;
    }

    /**
     * This method sets up the GUI portion of the choosing pieces board
     */
    public final void initializeGui() {

        board.setBorder(new EmptyBorder(5, 5, 5, 5));

        piecesPanel = new JPanel(new GridLayout(0, 4));
        piecesPanel.setBorder(new LineBorder(Color.BLUE));
        board.add(piecesPanel);

        for (int i = 0; i < pieceButtons.length; i++) {
            for (int j = 0; j < pieceButtons[i].length; j++) {
                JButton b = new JButton();
                b.setMargin(Margin);
                b.setIcon(icon);


                pieceButtons[j][i] = b;

            }
        }

        for (int i = 0; i < squares; i++) {
            for (int j = 0; j < squares; j++) {
                piecesPanel.add(pieceButtons[j][i]);
            }
        }




    }
}


