import  javax.swing.*;
import java.awt.event.*;
public class panelexample{
public static void main(String[] args){
  JFrame frame=new JFrame("PANEL EXAMPLE");
  JPanel panel=new JPanel();
  panel.add(new JButton("CLICK ME"));
  panel.add(new JLabel("HELLO"));
  frame.add(panel);
  frame.setSize(300,200);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);}}