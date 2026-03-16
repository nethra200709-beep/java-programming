import javax.swing.*;

public class SwingExample1 {

    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("Swing Components Example");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JLabel
        JLabel label = new JLabel("Enter Name:");
        label.setBounds(30,20,100,30);
        frame.add(label);

        // JTextField
        JTextField textField = new JTextField();
        textField.setBounds(120,20,150,30);
        frame.add(textField);

        // JButton
        JButton button = new JButton("Submit");
        button.setBounds(300,20,100,30);
        frame.add(button);

        // JTextArea
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(30,70,200,100);
        frame.add(scrollPane);

        // JToggleButton
        JToggleButton toggleButton = new JToggleButton("ON/OFF");
        toggleButton.setBounds(250,70,120,30);
        frame.add(toggleButton);

        // JList
        String items[] = {"Java","Python","C++","MySQL"};
        JList list = new JList(items);
        JScrollPane listScroll = new JScrollPane(list);
        listScroll.setBounds(250,120,120,80);
        frame.add(listScroll);

        // Button Action
        button.addActionListener(e -> {
            String name = textField.getText();
            String course = (String) list.getSelectedValue();
            textArea.append("Name: " + name + "\n");
            textArea.append("Selected: " + course + "\n\n");
        });

        frame.setVisible(true);
    }
}