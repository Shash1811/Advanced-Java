//5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display them on console whenever the countries are selected on the list.

import javax.swing.*;
import java.awt.event.*;

public class CountryList5a {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country List");
        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France", 
                              "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        scrollPane.setBounds(50, 50, 200, 150);
        frame.add(scrollPane);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                for (String country : countryList.getSelectedValuesList()) {
                    System.out.println("Selected Country: " + country);
                }
            }
        });

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
