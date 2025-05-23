// 3c. String Exercise progams
// Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
// capitalizeWords()
// Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
// defined function truncate()
// Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
// function isNumeric()

// Q9. Write a Java Program for Creating a random string of a specified length using user defined
// function generateRandomString()
// Q10. Write a Java Program for Counting the number of words in a string using user defined function
// countWords()
import java.util.*;

public class StringExercises3c {

    public static String capitalizeWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0)
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println("Q6: capitalizeWords(\"hello world\") => " + capitalizeWords("hello world"));
        System.out.println("Q7: truncate(\"Hello World Java\", 10) => " + truncate("Hello World Java", 10));
        System.out.println("Q8: isNumeric(\"12345\") => " + isNumeric("12345"));
        System.out.println("Q9: generateRandomString(8) => " + generateRandomString(8));
        System.out.println("Q10: countWords(\"This is a test string\") => " + countWords("This is a test string"));
    }
}
