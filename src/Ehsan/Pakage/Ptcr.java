package Ehsan.Pakage;

import javax.swing.*;
import java.awt.*;

public class Ptcr {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ehsan");
        frame.setVisible(true);
        frame.setSize(500,600);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(13, 128, 60));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPanel p1 = new JPanel();
        frame.add(p1);
        p1.setBounds(0,0,250,300);
        p1.setBackground(Color.cyan);
        JPanel p2 = new JPanel();
        frame.add(p2);
        p2.setBackground(Color.RED);
        p2.setBounds(0,250,250,300);
        JLabel l1 = new JLabel("Ehsan");
        p2.add(l1);
        l1.setBounds(125,150,200,200);
        l1.setForeground(Color.GREEN);
        l1.setBackground(Color.MAGENTA);



    }
}
