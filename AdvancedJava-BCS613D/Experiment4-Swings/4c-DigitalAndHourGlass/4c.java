//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed.
pressed by implementing the event handling mechanism with addActionListener( ).
import javax.swing.*;
import java.awt.event.*;

public class ImageButton4c {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Buttons");

        // Load images
        ImageIcon clockIcon = new ImageIcon("digital.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        JButton clockButton = new JButton(clockIcon);
        JButton hourglassButton = new JButton(hourglassIcon);
        JLabel label = new JLabel("Click an image", JLabel.CENTER);

        clockButton.setBounds(50, 50, 100, 100);
        hourglassButton.setBounds(180, 50, 100, 100);
        label.setBounds(50, 180, 300, 40);

        frame.setLayout(null);
        frame.add(clockButton);
        frame.add(hourglassButton);
        frame.add(label);

        clockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        hourglassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
