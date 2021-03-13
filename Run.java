import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Run {

    public static void main(String[] args) {

        Board gb = new Board();
        JFrame frame = new JFrame("Stratego");
        frame.add(gb.getGui());
        frame.setLocationByPlatform(true);
        frame.setMinimumSize(frame.getSize());
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,500));
        frame.setMinimumSize(new Dimension(500,500));
        frame.setLocation(50,50);
        frame.pack();
        frame.setVisible(true);

    }

}
