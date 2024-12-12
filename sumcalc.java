import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sumcalc {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Sum Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create text fields
        JTextField num1Field = new JTextField();
        num1Field.setBounds(50, 30, 80, 25);
        frame.add(num1Field);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(150, 30, 80, 25);
        frame.add(num2Field);

        // Create a button
        JButton sumButton = new JButton("Calculate");
        sumButton.setBounds(90, 70, 120, 25);
        frame.add(sumButton);

        // Create a label to display the result
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(90, 110, 120, 25);
        frame.add(resultLabel);

        // Add an ActionListener to the button
        sumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the input numbers
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    // Calculate the sum
                    int sum = num1 + num2;

                    // Display the result
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    resultLabel.setText("Please enter valid numbers");
                }
            }
        });



#WITH LOOPING (Y/N)
package alpad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Addition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(10, 20, 80, 25);
        panel.add(label1);

        JTextField number1 = new JTextField(20);
        number1.setBounds(100, 20, 165, 25);
        panel.add(number1);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(10, 50, 80, 25);
        panel.add(label2);

        JTextField number2 = new JTextField(20);
        number2.setBounds(100, 50, 165, 25);
        panel.add(number2);

        JButton addButton = new JButton("Add");
        addButton.setBounds(10, 80, 80, 25);
        panel.add(addButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(100, 80, 80, 25);
        panel.add(resultLabel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(number1.getText());
                int num2 = Integer.parseInt(number2.getText());
                int sum = num1 + num2;
                resultLabel.setText("Result: " + sum);

                int response = JOptionPane.showConfirmDialog(null, "Do you want to add more numbers?", "Loop", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    number1.setText("");
                    number2.setText("");
                    resultLabel.setText("Result:");
                } else {
                    System.exit(0);
                }
            }
        });
    }
}
        // Set the frame to be visible
        frame.setVisible(true);
    }
}
