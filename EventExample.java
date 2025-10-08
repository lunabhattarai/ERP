import javax.swing.*;
import java.awt.event.*;

public class EventExample {
    public static void main(String[] args) {

        // Create the main window (JFrame)
        JFrame frame = new JFrame("Event Example");
        frame.setSize(400, 250);
        frame.setLayout(null);  // using null layout for manual positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("Click the button below:");
        label.setBounds(120, 60, 200, 30);  // x, y, width, height
        frame.add(label);

        // Create a button
        JButton button = new JButton("Click Me!");
        button.setBounds(130, 100, 120, 30);
        frame.add(button);

        // Add ActionListener to handle button click
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked Successfully!");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
