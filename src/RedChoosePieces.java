import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**********
 * This class is a choose red team piece class for the GUI for our Stratego Game
 *
 * @author - Luke Seeterlin, Hayden Garrett, Austin Ackerman
 * @version - 3/29/2021
 **********/
public class RedChoosePieces implements ActionListener {

    /** initialize red team flag for choosing pieces */
    int flag = 1;

    /** initialize red team bombs for choosing pieces */
    int bomb = 6;

    /** initialize red team spy for choosing pieces */
    int spy = 1;

    /** initialize red team scouts for choosing pieces */
    int scout = 8;

    /** initialize red team miners for choosing pieces */
    int miner = 5;

    /** initialize red team sergeants for choosing pieces */
    int sergeant = 4;

    /** initialize red team lieutenant for choosing pieces */
    int lieutenant = 4;

    /** initialize red team captains for choosing pieces */
    int captain = 4;

    /** initialize red team majors for choosing pieces */
    int major = 3;

    /** initialize red team colonels for choosing pieces */
    int colonel = 2;

    /** initialize red team general for choosing pieces */
    int general = 1;

    /** initialize red team marshal for choosing pieces */
    int marshall = 1;



    /** initialize red team flag JButton for choosing pieces */
    JButton flagB = new JButton("F");

    /** initialize red team bombs JButton for choosing pieces */
    JButton bombB = new JButton("B");

    /** initialize red team spy JButton for choosing pieces */
    JButton spyB = new JButton("1");

    /** initialize red team scouts JButton for choosing pieces */
    JButton scoutB = new JButton("2");

    /** initialize red team miners JButton for choosing pieces */
    JButton minerB = new JButton("3");

    /** initialize red team sergeants JButton for choosing pieces */
    JButton sergeantB = new JButton("4");

    /** initialize red team lieutenants JButton for choosing pieces */
    JButton lieutenantB = new JButton("5");

    /** initialize red team captain JButton for choosing pieces */
    JButton captainB = new JButton("6");

    /** initialize red team majors JButton for choosing pieces */
    JButton majorB = new JButton("7");

    /** initialize red team colonels JButton for choosing pieces */
    JButton colonelB = new JButton("8");

    /** initialize red team generals JButton for choosing pieces */
    JButton generalB = new JButton("9");

    /** initialize red team marshals JButton for choosing pieces */
    JButton marshallB = new JButton("10");



    /** initialize red team flag JLabel for choosing pieces */
    JLabel flagL = new JLabel("X " + flag);

    /** initialize red team bombs JLabel for choosing pieces */
    JLabel bombL = new JLabel("X " + bomb);

    /** initialize red team spy JLabel for choosing pieces */
    JLabel spyL = new JLabel("X " + spy);

    /** initialize red team scout JLabel for choosing pieces */
    JLabel scoutL = new JLabel("X " + scout);

    /** initialize red team miners JLabel for choosing pieces */
    JLabel minerL = new JLabel("X " + miner);

    /** initialize red team sergeants JLabel for choosing pieces */
    JLabel sergeantL = new JLabel("X " + sergeant);

    /** initialize red team lieutenants JLabel for choosing pieces */
    JLabel lieutenantL = new JLabel("X " + lieutenant);

    /** initialize red team captains JLabel for choosing pieces */
    JLabel captainL = new JLabel("X " + captain);

    /** initialize red team majors JLabel for choosing pieces */
    JLabel majorL = new JLabel("X " + major);

    /** initialize red team colonel JLabel for choosing pieces */
    JLabel colonelL = new JLabel("X " + colonel);

    /** initialize red team general JLabel for choosing pieces */
    JLabel generalL = new JLabel("X " + general);

    /** initialize red team marshal JLabel for choosing pieces */
    JLabel marshallL = new JLabel("X " + marshall);


    /**
     * This method is the default constructor that initializes the red team choose pieces Gui
     */
    RedChoosePieces() {
        initializeGui2();
    }

    /**
     * get method for red team choosing pieces board
     *
     * @return - returns the Gui board for choosing pieces as a JComponent
     */
    public final JComponent getGui2() {
        return panel;
    }

    /** initializes the JPanel for red team choosing pieces */
    JPanel panel = new JPanel(new BorderLayout(12, 12));

    /** initializes the layout for the JPanel for red team choosing pieces */
    JPanel layout = new JPanel(new GridBagLayout());

    /** initializes button JPanel for red team choosing pieces */
    JPanel btnPanel = new JPanel(new GridLayout(12, 2, 10, 8));

    /**
     * This method sets up the GUI portion of the red team choosing pieces board
     */
    public final void initializeGui2() {


        btnPanel.add(flagB);
        btnPanel.add(flagL);
        flagB.addActionListener(this);

        btnPanel.add(bombB);
        btnPanel.add(bombL);
        bombB.addActionListener(this);

        btnPanel.add(spyB);
        btnPanel.add(spyL);
        spyB.addActionListener(this);

        btnPanel.add(scoutB);
        btnPanel.add(scoutL);
        scoutB.addActionListener(this);


        btnPanel.add(minerB);
        btnPanel.add(minerL);
        minerB.addActionListener(this);

        btnPanel.add(sergeantB);
        btnPanel.add(sergeantL);
        sergeantB.addActionListener(this);

        btnPanel.add(lieutenantB);
        btnPanel.add(lieutenantL);
        lieutenantB.addActionListener(this);

        btnPanel.add(captainB);
        btnPanel.add(captainL);
        captainB.addActionListener(this);

        btnPanel.add(majorB);
        btnPanel.add(majorL);
        majorB.addActionListener(this);

        btnPanel.add(colonelB);
        btnPanel.add(colonelL);
        colonelB.addActionListener(this);

        btnPanel.add(generalB);
        btnPanel.add(generalL);
        generalB.addActionListener(this);

        btnPanel.add(marshallB);
        btnPanel.add(marshallL);
        marshallB.addActionListener(this);


        layout.add(btnPanel);
        panel.add(layout, BorderLayout.CENTER);


    }

    /**
     * this action performed method is to determine which piece
     * red team would like to place when placing pieces
     *
     * @param e - action event of clicking which pieces red team would like to place
     */
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(flagB)) {
            flagL.setText("X " + (flag - 1));

        }

        else if (e.getSource().equals(bombB)) {
            bombL.setText("X " + (bomb - 1));
        }

        else if (e.getSource().equals(spyB)) {
            spyL.setText("X " + (spy - 1));
        }

        else if (e.getSource().equals(scoutB)) {
            scoutL.setText("X " + (scout - 1));
        }

        else if (e.getSource().equals(minerB)) {
            minerL.setText("X " + (miner - 1));
        }

        else if (e.getSource().equals(sergeantB)) {
            sergeantL.setText("X " + (sergeant - 1));
        }

        else if (e.getSource().equals(lieutenantB)) {
            lieutenantL.setText("X " + (lieutenant - 1));
        }

        else if (e.getSource().equals(captainB)) {
            captainL.setText("X " + (captain - 1));
        }

        else if (e.getSource().equals(majorB)) {
            majorL.setText("X " + (major - 1));
        }

        else if (e.getSource().equals(colonelB)) {
            colonelL.setText("X " + (colonel - 1));
        }

        else if (e.getSource().equals(generalB)) {
            generalL.setText("X " + (general - 1));
        }

        else if (e.getSource().equals(marshallB)) {
            marshallL.setText("X " + (marshall - 1));
        }



    }

}
