package Semester02.Exercise.OOP.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factorial extends Frame implements ActionListener {

    private final Label n;
    private final TextField tfn;
    private final Label fac;
    private final TextField tffac;
    private final Button btnnext;

    int count =0;
    int answer=1;

    Factorial(){
        setLayout(new FlowLayout());

        n =new Label("n");
        tfn =new TextField();
        fac =new Label("Factorial");
        tffac =new TextField();
        btnnext =new Button("Next");

        add(n);
        add(tfn);
        add(fac);
        add(tffac);
        add(btnnext);
        btnnext.addActionListener(this);

        setTitle("Awt Factorial");
        setSize(300,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent evt) {
        ++count;
        tfn.setText(count+" ");
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
    }
}
