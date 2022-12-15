package GUI;

import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.*;

public class Q5 {
    private static Integer initial = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame("Counter");
        f.setVisible(true);
        f.setSize(500,100);
        f.setLayout(new FlowLayout());
        JLabel j1 = new JLabel("Counter");
        f.add(j1);
        JTextField jt1 = new JTextField(10);
        jt1.setText("0");
        f.add(jt1);
        JButton jb1 = new JButton("Count up");
        f.add(jb1);
        JButton jb2 = new JButton("Count down");
        f.add(jb2);
        JButton jb3 = new JButton("Count down");
        f.add(jb3);
        jb1.addActionListener(new java.awt.event.ActionListener () {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initial += 1;
                jt1.setText(initial.toString());
            }
        });
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initial -= 1;
                jt1.setText(initial.toString());
            }
        });
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initial = 0;
                jt1.setText(initial.toString());
            }
        });     
    }
}