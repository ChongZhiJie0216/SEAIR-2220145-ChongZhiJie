package Semester02.Exercise.OOP.GUI;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse extends Frame implements MouseListener {
        Label l1, l2;
        TextArea text;

    Mouse() {
        l1 = new Label();
        l1.setBounds(20, 50, 200, 20);
        text = new TextArea();
        text.setBounds(20, 80, 300, 300);
        text.addMouseListener(this);
        add(l1);
        add(text);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            new Mouse();
        }

        public void mouseClicked(MouseEvent e) {
            //String en = "x="+e.getX()+"Y="+e.getY();
            //text.setText(en);
        }

        public void mousePressed(MouseEvent e) {

        }

        public void mouseReleased(MouseEvent e) {
            String en = "x=" + e.getX() + "Y=" + e.getY();
            String n = "released mouse";
            l1.setText(n);
            text.setText(en);
        }

        public void mouseEntered(MouseEvent e) {
            //String en = "Mouse has entered the window area";
            //   text.setText(en);
            String en = "" + e.getX() + e.getY();
            String n = "move mouse";
            l1.setText(n);
            text.setText(en);
        }

        public void mouseExited(MouseEvent e) {
            //String en = "Mouse has exit the window area";
            //text.setText(en);
        }
    }