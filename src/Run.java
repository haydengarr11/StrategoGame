import org.w3c.dom.events.Event;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

/**********
 * This class is a (main) run class for our Stratego Game
 *
 * @author - Luke Seeterlin, Hayden Garrett, Austin Ackerman
 * @version - 3/29/2021
 **********/
public class Run {

    /**
     * main method to run the Stratego game
     *
     * @param args
     */
    public static void main(String[] args) {

        Board gb = new Board();
        JFrame frame1 = new JFrame("Stratego");
        frame1.add(gb.getGui());
        frame1.setLocationByPlatform(true);
        frame1.setMinimumSize(frame1.getSize());
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
        frame1.setPreferredSize(new Dimension(1400, 600));
        frame1.setMinimumSize(new Dimension(1200, 500));
        frame1.setLocation(50, 50);
        frame1.pack();
        frame1.setVisible(true);

    }


}


























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































