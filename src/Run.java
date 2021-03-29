import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Run {

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
