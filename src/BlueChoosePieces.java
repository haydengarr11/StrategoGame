import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BlueChoosePieces implements ActionListener {

    int flag = 1;
    int bomb = 6;
    int spy = 1;
    int scout = 8;
    int miner = 5;
    int sergeant = 4;
    int lieutenant = 4;
    int captain = 4;
    int major = 3;
    int colonel = 2;
    int general = 1;
    int marshall = 1;

    JButton flagB = new JButton("F");
    JButton bombB = new JButton("B");
    JButton spyB = new JButton("1");
    JButton scoutB = new JButton("2");
    JButton minerB = new JButton("3");
    JButton sergeantB = new JButton("4");
    JButton lieutenantB = new JButton("5");
    JButton captainB = new JButton("6");
    JButton majorB = new JButton("7");
    JButton colonelB = new JButton("8");
    JButton generalB = new JButton("9");
    JButton marshallB = new JButton("10");

    JLabel flagL = new JLabel("X " + flag);
    JLabel bombL = new JLabel("X " + bomb);
    JLabel spyL = new JLabel("X " + spy);
    JLabel scoutL = new JLabel("X " + scout);
    JLabel minerL = new JLabel("X " + miner);
    JLabel sergeantL = new JLabel("X " + sergeant);
    JLabel lieutenantL = new JLabel("X " + lieutenant);
    JLabel captainL = new JLabel("X " + captain);
    JLabel majorL = new JLabel("X " + major);
    JLabel colonelL = new JLabel("X " + colonel);
    JLabel generalL = new JLabel("X " + general);
    JLabel marshallL = new JLabel("X " + marshall);



    BlueChoosePieces() {
        initializeGui2();
    }

    public final JComponent getGui2() {
        return panel;
    }

    JPanel panel = new JPanel(new BorderLayout(12, 12));

    JPanel layout = new JPanel(new GridBagLayout());

    JPanel btnPanel = new JPanel(new GridLayout(12, 2, 10, 8));

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
