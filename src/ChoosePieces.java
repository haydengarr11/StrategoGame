import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;


public class ChoosePieces {

    private final JPanel board = new JPanel(new BorderLayout(3, 3));
    private JButton[][] pieceButtons = new JButton[10][10];
    private JPanel piecesPanel;
    Insets Margin = new Insets(0, 0, 0, 0);
    int squares = 10;
    int space = 100;
    ImageIcon icon = new ImageIcon(new BufferedImage(space, space, BufferedImage.TYPE_INT_ARGB));

    ChoosePieces() {
        initializeGui();
    }

    public final JComponent getGui() {
        return board;
    }

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

