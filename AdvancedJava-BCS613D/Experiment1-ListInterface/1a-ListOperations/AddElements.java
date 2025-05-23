// 1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
// and a LinkedList to perform the following operations:
// 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 
// 4. Accessing elements, 5. Updating elements, 6. Removing elements, 7. Searching elements, 
// 8. List size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 
// 13. Clearing the list

import java.util.*;

public class AddElements {
    public static void main(String[] args) {
        // Initial Elements
        List<String> initial = Arrays.asList("Apple", "Banana", "Orange");

        // ArrayList
        System.out.println("=== Using ArrayList ===");
        List<String> arrayList = new ArrayList<>(initial);
        performOperations(arrayList);

        // LinkedList
        System.out.println("\n=== Using LinkedList ===");
        List<String> linkedList = new LinkedList<>(initial);
        performOperations(linkedList);
    }

    private static void performOperations(List<String> list) {
        // 1. Adding elements
        list.add("Grapes");
        System.out.println("After adding an element: " + list);

        // 2. Adding element at specific index
        list.add(1, "Mango");
        System.out.println("After adding at index 1: " + list);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Papaya");
        list.addAll(moreFruits);
        System.out.println("After adding multiple elements: " + list);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Updating elements
        list.set(2, "Strawberry");
        System.out.println("After updating index 2: " + list);

        // 6. Removing elements
        list.remove("Mango"); // remove by value
        list.remove(0);       // remove by index
        System.out.println("After removing elements: " + list);

        // 7. Searching elements
        System.out.println("Contains Banana? " + list.contains("Banana"));
        System.out.println("Index of Orange: " + list.indexOf("Orange"));

        // 8. List size
        System.out.println("Size of list: " + list.size());

        // 9. Iterating over list
        System.out.print("For-each loop: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("Using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // 12. Sublist
        if (list.size() >= 3) {
            List<String> sub = list.subList(1, 3);
            System.out.println("Sublist (1 to 3): " + sub);
        } else {
            System.out.println("Not enough elements for sublist.");
        }

        // 13. Clearing the list
        list.clear();
        System.out.println("After clearing: " + list);
        System.out.println("Is empty? " + list.isEmpty());
    }
}
