import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOperations {

    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<>();

        // Adding some elements first
        l_list.add("Apple");
        l_list.add("Banana");
        l_list.add("Orange");
        l_list.add("Grapes");
        System.out.println("Original LinkedList: " + l_list);

        // 1. Iterate starting at 2nd position (index 1)
        iterateFromPosition(l_list, 1);

        // 2. Iterate in reverse order
        iterateReverse(l_list);

        // 3. Insert specified element at end
        insertAtEnd(l_list, "Pink");
        System.out.println("After adding 'Pink' at end: " + l_list);

        // 4. Display elements and their positions
        displayElementsAndPositions(l_list);

        // 5. Swap first and third elements
        swapElements(l_list, 0, 2);
        System.out.println("After swapping first and third elements: " + l_list);
    }

    // 1. Iterate from specified position using ListIterator
    static void iterateFromPosition(LinkedList<String> list, int startIndex) {
        System.out.println("Iterating from position " + (startIndex + 1) + ":");
        ListIterator<String> iterator = list.listIterator(startIndex);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // 2. Iterate in reverse order using descendingIterator()
    static void iterateReverse(LinkedList<String> list) {
        System.out.println("Iterating in reverse order:");
        Iterator<String> descIter = list.descendingIterator();
        while (descIter.hasNext()) {
            System.out.println(descIter.next());
        }
    }

    // 3. Insert specified element at end using offerLast()
    static void insertAtEnd(LinkedList<String> list, String element) {
        list.offerLast(element);
    }

    // 4. Display elements and their positions using get()
    static void displayElementsAndPositions(LinkedList<String> list) {
        System.out.println("Elements with their positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + (i + 1) + ": " + list.get(i));
        }
    }

    // 5. Swap two elements using Collections.swap()
    static void swapElements(LinkedList<String> list, int index1, int index2) {
        if (index1 >= 0 && index1 < list.size() && index2 >= 0 && index2 < list.size()) {
            Collections.swap(list, index1, index2);
        } else {
            System.out.println("Invalid indices for swapping.");
        }
    }
}
