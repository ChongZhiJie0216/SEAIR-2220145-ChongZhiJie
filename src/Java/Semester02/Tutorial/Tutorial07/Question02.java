package Semester02.Tutorial.Tutorial07;

import javax.swing.*;
import java.awt.*;

public class Question02 {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame jFrame = new JFrame("Calculator");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        JButton cls = new JButton("Cls");
        JButton bck = new JButton("Bck");
        JButton blank = new JButton(" ");
        JButton close = new JButton("Close");
        JButton jb7 = new JButton("7");
        JButton jb8 = new JButton("8");
        JButton jb9 = new JButton("9");
        JButton divide = new JButton("/");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton x = new JButton("*");
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton les = new JButton("-");
        JButton zero = new JButton("0");
        JButton dot = new JButton(".");
        JButton tot = new JButton("=");
        JButton add = new JButton("+");

        panel.add(cls);
        panel.add(bck);
        panel.add(blank).setVisible(false);
        panel.add(close);
        panel.add(jb7);
        panel.add(jb8);
        panel.add(jb9);
        panel.add(divide);
        panel.add(jb4);
        panel.add(jb5);
        panel.add(jb6);
        panel.add(x);
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        panel.add(les);
        panel.add(zero);
        panel.add(dot);
        panel.add(tot);
        panel.add(add);

        jFrame.add(panel);
        jFrame.setSize(300,400);
        jFrame.setVisible(true);
    }
}
