package Semester02.Exercise.OOP.GUI.Exercise02;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class RUN {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("猴子");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        Button[] button;
        button = new Button[5];

        for (int i = 0; i < 5; i++) {
            button[i] = new Button("Button " + (i+1));
            panel.add(button[i]);
        }
        BoxLayout box = new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(box);

/*
        panel.setBorder(new EmptyBorder(new Insets(150,200,150,200)));
*/
        jFrame.add(panel);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
    }
}
