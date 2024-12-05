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

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
