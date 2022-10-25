package simpleGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SimpleGUI extends JFrame {
    private JButton button = new JButton("PRESS");

    private JTextField nameInput = new JTextField("", 5);

    private JLabel nameLabel = new JLabel(" Enter name:");

    private JTextField ageInput = new JTextField("", 5);

    private JLabel ageLabel = new JLabel(" Enter age:");
    private JRadioButton radio1 = new JRadioButton("Female");
    private JRadioButton radio2 = new JRadioButton("Male");
    private JCheckBox check = new JCheckBox("VERIFY", false);

    public SimpleGUI () {
        super("Identify Example");
        this.setBounds(100,100,290,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4,2,2,2));
        container.add(nameLabel);
        container.add(nameInput);
        container.add(ageLabel);
        container.add(ageInput);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        //radio1.setSelected(true);
        container.add(radio1);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "The name is: " + nameInput.getText() + "\n";
            message += "The age is: " + ageInput.getText() + "\n";
            message += (radio1.isSelected() ? "Female" : "Male") + " gender!\n";
            message += "Verification is " + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);


        }
    }
}
