import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample {
    public static void main(String[] args) {

        JFrame f = new JFrame("Swing Components Example");

        // JLabel
        JLabel l = new JLabel("Enter Text:");

        // JTextField
        JTextField tf = new JTextField(15);

        // JTextArea
        JTextArea ta = new JTextArea(5,20);

        // JScrollPane
        JScrollPane sp = new JScrollPane(ta);

        // JButton
        JButton b = new JButton("Add");

        // JToggleButton
        JToggleButton tb = new JToggleButton("ON/OFF");

        // Layout
        f.setLayout(new FlowLayout());

        f.add(l);
        f.add(tf);
        f.add(b);
        f.add(tb);
        f.add(sp);

        // Button action
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.append(tf.getText() + "\n");
                tf.setText("");
            }
        });

        // Toggle button action
        tb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(tb.isSelected())
                    ta.append("Toggle Button ON\n");
                else
                    ta.append("Toggle Button OFF\n");
            }
        });

        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}