package Semester02.Exercise.OOP.GUI.Exercise03;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Picture {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFileChooser Example");

        JButton btn = new JButton("Open a Text File");
        btn.setBounds(180,20,150,30);

        JTextArea txt = new JTextArea("");
        txt.setBounds(10,60,480,400);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setAcceptAllFileFilterUsed(false);
                FileNameExtensionFilter filter =new FileNameExtensionFilter ("Text File","txt");
                chooser.addChoosableFileFilter(filter);

                int checkInput = chooser.showOpenDialog(null);

                if(checkInput==chooser.APPROVE_OPTION){
                    File open = chooser.getSelectedFile();

                    try{
                        FileReader read = new FileReader(open);
                        BufferedReader rd = new BufferedReader(read);

                        String str = " ";
                        StringBuilder str2 = new StringBuilder();
                        while((str=rd.readLine())!=null) {
                            str2.append(str).append("\n");
                        }
                        txt.setText(str2.toString());
                        rd.close();
                        }catch(IOException fileNotFoundException){
                            fileNotFoundException.printStackTrace();
                        }
                    }
                }
        });
        txt.setEditable(false);
        frame.add(btn);
        frame.add(txt);

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}