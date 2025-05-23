//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
//event handling mechanism with addActionListener( ).
import javax.swing.*;
import java.awt.event.*;

public class CountryButton4b {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Button");
        JButton indiaButton = new JButton("India");
        JButton srilankaButton = new JButton("Srilanka");
        JLabel label = new JLabel("Click a button", JLabel.CENTER);

        indiaButton.setBounds(100, 100, 100, 40);
        srilankaButton.setBounds(220, 100, 100, 40);
        label.setBounds(50, 180, 300, 40);

        frame.setLayout(null);
        frame.add(indiaButton);
        frame.add(srilankaButton);
        frame.add(label);

        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
