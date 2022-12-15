package GUI;

import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.*;

public class Q7 {
    private static Integer intial = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Arithmetics");
        f.setVisible(true);
        f.setSize(500, 400);
        f.setLayout(new GridLayout(6, 2, 20, 20));
        JLabel j1 = new JLabel("FirstNo");
        f.add(j1);
        JTextField jt1 = new JTextField(10);
        f.add(jt1);
        JLabel j2 = new JLabel("SecondNo");
        f.add(j2);
        JTextField jt2 = new JTextField(10);
        f.add(jt2);
        JLabel j3 = new JLabel("Result");
        f.add(j3);
        JTextField jt3 = new JTextField(10);
        f.add(jt3);

        JButton jb1 = new JButton("+");
        f.add(jb1);
        JButton jb2 = new JButton("-");
        f.add(jb2);
        JButton jb3 = new JButton("*");
        f.add(jb3);
        JButton jb4 = new JButton("/");
        f.add(jb4);
        JButton jb5 = new JButton("%");
        f.add(jb5);
        JButton jb6 = new JButton("CLEAR");
        f.add(jb6);
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Integer ans = Integer.parseInt(jt1.getText()) + Integer.parseInt(jt2.getText());
                jt3.setText(ans.toString());
            }
        });
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Integer ans = Integer.parseInt(jt1.getText()) - Integer.parseInt(jt2.getText());
                jt3.setText(ans.toString());
            }
        });
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Integer ans = Integer.parseInt(jt1.getText()) * Integer.parseInt(jt2.getText());
                jt3.setText(ans.toString());
            }
        });
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Integer ans = Integer.parseInt(jt1.getText()) / Integer.parseInt(jt2.getText());
                jt3.setText(ans.toString());
            }
        });
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Integer ans = Integer.parseInt(jt1.getText()) % Integer.parseInt(jt2.getText());
                jt3.setText(ans.toString());
            }
        });
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
            }
        });
    }
}
