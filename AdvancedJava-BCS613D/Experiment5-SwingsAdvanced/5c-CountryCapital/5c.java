//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display the capital of the countries on console whenever the countries are selected on the list.

import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;


public class CountryCapitalList5c {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country and Capital");
        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France", 
                              "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington, D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "No single capital");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        JList<String> countryList = new JList<>(countries);
        JScrollPane scrollPane = new JScrollPane(countryList);
        scrollPane.setBounds(50, 50, 200, 150);

        frame.add(scrollPane);
        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                for (String country : countryList.getSelectedValuesList()) {
                    System.out.println(country + " - Capital: " + capitalMap.get(country));
                }
            }
        });

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
