package Semester02.Exercise.OOP.GUI.Exercise03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    public static CardLayout card = new CardLayout(10, 10);
    public static Container c;
    JButton[] buttons = new JButton[3];

    private ImageIcon[] icon = {
            new ImageIcon("src/Semester02/60px-Playing_card_club_5.svg.png"),
            new ImageIcon("src/Semester02/60px-Playing_card_club_J.svg.png"),
            new ImageIcon("src/Semester02/60px-Playing_card_diamond_J.svg.png"),
    };

    public GUI() {
        c = getContentPane();
        c.setLayout(card);

        for (int i = 0; i < 3; i++) {
            Image image = icon[i].getImage();
            Image newimg =image.getScaledInstance(270,290,image.SCALE_DEFAULT);
            icon[i] = new ImageIcon(newimg);
        }
        for (int i = 0;i<3  ; i++){
            buttons[i] = new JButton(icon[i]);
            buttons[i].addActionListener(this);
            c.add(buttons[i]);
        }
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setSize(300,350);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        card.next(c);
    }
}