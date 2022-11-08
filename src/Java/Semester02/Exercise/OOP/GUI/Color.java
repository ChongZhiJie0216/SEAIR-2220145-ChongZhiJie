package Semester02.Exercise.OOP.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Color {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("猴子换色");
        jFrame.setSize(300, 300);
/*
        JFrame.setDefaultLookAndFeelDecorated(true);
*/
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb1 = new JButton("Red");
        JButton jb2 = new JButton("Green");
        JButton jb3 = new JButton("Blue");


        JPanel panel = new JPanel();
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);

        ActionListener ac = null;
        jb1.addActionListener(ac);
        jb2.addActionListener(ac);
        jb3.addActionListener(ac);

        Object e = null;
        ac = e1 -> {
            String ans = e1.getActionCommand();
            if (ans.equals("Red")) {
                jFrame.getContentPane().setBackground(java.awt.Color.RED);
            }
            if (ans.equals("Green")) {
                jFrame.getContentPane().setBackground(java.awt.Color.GREEN);
            }
            if (ans.equals("Blue")) {
                jFrame.getContentPane().setBackground(java.awt.Color.BLUE);
            } else {
                jFrame.getContentPane().setBackground(java.awt.Color.gray);
            }
        };


        jFrame.add(panel);
        jFrame.setVisible(true);

    }
}
