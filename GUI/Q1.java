//


package GUI;

import java.awt.*;
import java.awt.FlowLayout;
import java.lang.reflect.Array;
import java.util.Vector;

import javax.swing.*;

public class Q1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Register");
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new GridLayout(5,1,10,10));
        JLabel j1 = new JLabel("Empty");
        f.add(j1);
        JButton jb1 = new JButton("Hello");
        f.add(jb1);
        JButton jb2 = new JButton("World");
        f.add(jb2);
        JButton jb3 = new JButton("Click");
        f.add(jb3);
        JButton jb4 = new JButton("Me");
        f.add(jb4);
        
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1.setText(jb1.getText());
            }
        });
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1.setText(jb2.getText());
            }
        });
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1.setText(jb3.getText());
            }
        });
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1.setText(jb4.getText());
            }
        });
    }
}