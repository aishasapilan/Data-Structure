package finalM;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main3 {
    public static void main(String[] args) {
        new JFrame("Sum of Two Numbers") {{
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            JTextField num1Field = new JTextField();
            num1Field.setBounds(100, 50, 100, 30);
            JTextField num2Field = new JTextField();
            num2Field.setBounds(200, 50, 100, 30);
           
            
            JLabel resultLabel = new JLabel("Result:");
            resultLabel.setBounds(150, 130, 250, 30);

            JButton addButton = new JButton("Add");
            addButton.setBounds(150, 100, 100, 30);

            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    resultLabel.setText("Result: " + (Integer.parseInt(num1Field.getText()) + Integer.parseInt(num2Field.getText())));
                }
            });

            add(num1Field);
            add(num2Field);
            
            add(resultLabel);
            add(addButton);

            setVisible(true);
        }};
    }
}

