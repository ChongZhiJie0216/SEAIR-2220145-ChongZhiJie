package Semester02.Tutorial.Tutorial07;

import javax.swing.*;
import java.awt.*;

public class Question01 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("金坷垃");
        jFrame.setSize(400,300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb1 = new JButton("Red");
        JButton jb2 = new JButton("Green");
        JButton jb3 = new JButton("Yellow");
        JButton jb4 = new JButton("Purple");
        JButton jb5 = new JButton("Blue");
        JButton jb6 = new JButton("Pink");
        JButton jb7 = new JButton("Brown");

        JPanel panel;
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        panel.add(jb4);
        panel.add(jb5);
        panel.add(jb6);
        panel.add(jb7);
        
        jb1.setBackground(Color.RED);
        jb1.setForeground(Color.white);
        jb2.setBackground(Color.GREEN);
        jb3.setBackground(Color.YELLOW);
        jb4.setBackground(new Color(102,0,153)); //Purple
        jb4.setForeground(Color.white);
        jb5.setBackground(Color.BLUE);
        jb5.setForeground(Color.white);
        jb6.setBackground(Color.PINK);
        jb7.setBackground(new Color(102,51,0)); //Brown
        jb7.setForeground(Color.white);

        jFrame.add(panel);
        jFrame.setVisible(true);
    }
}
