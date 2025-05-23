import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOperations {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Original list: " + colors);

        // 1. Search for "Red"
        searchColor(colors, "Red");

        // 2. Remove 2nd element and "Blue"
        removeElements(colors);

        // Reset list for further operations
        resetColors(colors);
        System.out.println("Reset list: " + colors);

        // 3. Sort the list
        sortColors(colors);

        // 4. Extract 1st and 2nd elements using subList()
        subListColors(colors);

        // 5. Remove nth element (e.g., 3rd element)
        removeNthElement(colors, 3);
    }

    static void searchColor(ArrayList<String> list, String color) {
        if (list.contains(color)) {
            System.out.println(color + " is available in the list.");
        } else {
            System.out.println(color + " is NOT available in the list.");
        }
    }

    static void removeElements(ArrayList<String> list) {
        if (list.size() > 1) {
            list.remove(1); // Remove element at index 1 (2nd element)
        }
        list.remove("Blue"); // Remove "Blue" if exists
        System.out.println("After removing 2nd element and 'Blue': " + list);
    }

    static void resetColors(ArrayList<String> list) {
        list.clear();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
    }

    static void sortColors(ArrayList<String> list) {
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }

    static void subListColors(ArrayList<String> list) {
        if (list.size() >= 2) {
            List<String> subList = list.subList(0, 2);
            System.out.println("Sublist (1st and 2nd elements): " + subList);
        } else {
            System.out.println("List too small for subList operation.");
        }
    }

    static void removeNthElement(ArrayList<String> list, int n) {
        if (n > 0 && n <= list.size()) {
            list.remove(n - 1);
            System.out.println("After removing element at position " + n + ": " + list);
        } else {
            System.out.println("Invalid position for removal: " + n);
        }
    }
}
