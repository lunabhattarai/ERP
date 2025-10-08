import javax.swing.*;
import java.awt.event.*;

public class ClickCounter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Click Counter");
        JButton button = new JButton("Click Me!");
        JLabel label = new JLabel("Click Count: 0");

        button.setBounds(100, 100, 120, 30);
        label.setBounds(100, 50, 150, 30);

        frame.add(button);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final int[] count = {0};
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count[0]++;
                label.setText("Click Count: " + count[0]);
            }
        });
    }
}
