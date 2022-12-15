package GUI;

import java.awt.*;
import java.awt.FlowLayout;
import java.lang.reflect.Array;
import java.util.Vector;

import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Search and Replace String");
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(new GridLayout(6,2,10,10));
        JLabel j1 = new JLabel("Enter String");
        f.add(j1);
        JTextField jt1 = new JTextField(10);
        f.add(jt1);
        JLabel j2 = new JLabel("Enter String to be Searched");
        f.add(j2);
        JTextField jt2 = new JTextField(10);
        f.add(jt2);
        JLabel j3 = new JLabel("No of Occurences");
        f.add(j3);
        JTextField jt3 = new JTextField(10);
        f.add(jt3);
        JLabel j4 = new JLabel("Replace String with");
        f.add(j4);
        JTextField jt4 = new JTextField(10);
        f.add(jt4);
        JLabel j5 = new JLabel("New String");
        f.add(j5);
        JTextField jt5 = new JTextField(10);
        f.add(jt5);
        JButton jb1 = new JButton("Search");
        f.add(jb1);
        JButton jb2 = new JButton("Replace");
        f.add(jb2);

        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String str = jt1.getText();
                String str1 = jt2.getText();
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == str1.charAt(0)) {
                        int j = 0;
                        for (j = 0; j < str1.length(); j++) {
                            if (str.charAt(i + j) != str1.charAt(j)) {
                                break;
                            }
                        }
                        if (j == str1.length()) {
                            count++;
                        }
                    }
                }
                jt3.setText(Integer.toString(count));
            }
        });
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String str = jt1.getText();
                String str1 = jt2.getText();
                String str2 = jt4.getText();
                String ans = "";
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == str1.charAt(0)) {
                        int j = 0;
                        for (j = 0; j < str1.length(); j++) {
                            if (str.charAt(i + j) != str1.charAt(j)) {
                                break;
                            }
                        }
                        if (j == str1.length()) {
                            ans += str2;
                            i += j - 1;
                        } else {
                            ans += str.charAt(i);
                        }
                    }
                    jt5.setText(ans);
                }
            }
        }); 
    }
}