package Semester02.Exercise.OOP.GUI.Exercise01;

import javax.swing.*;
import java.util.Objects;

public class Exercise01 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("猴子偷桃");
        jFrame.setSize(300,300);
/*
        JFrame.setDefaultLookAndFeelDecorated(true);
*/
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb1 = new JButton("Button01");
        JButton jb2 = new JButton("Button02");
        JButton jb3 = new JButton("Button03");
        JButton jb4 = new JButton("Button04");
        JButton jb5 = new JButton("Button05");

        JPanel panel = new JPanel();
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        panel.add(jb4);
        panel.add(jb5);

        jFrame.add(panel);
        jFrame.setVisible(true);
    }

}
