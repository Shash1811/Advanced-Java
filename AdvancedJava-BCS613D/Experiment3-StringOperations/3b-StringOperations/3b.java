// 3b. String Exercise progams
// Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
// defined function isNullOrEmpty().
// Q2. Write a Java Program for Counting how many times a substring appears in a main string
// using user defined function countOccurrences()
// Q3. Write a Java Program for Reversing the characters in a string using user defined function
// reverseString().
// Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
// and punctuation) using user defined function isPalindrome():
// Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
// function removeWhitespace()
public class StringExercises3b {

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static int countOccurrences(String str, String substr) {
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(substr, idx)) != -1) {
            count++;
            idx += substr.length();
        }
        return count;
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return clean.equals(reverseString(clean));
    }

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        System.out.println("Q1: isNullOrEmpty(\"  \") => " + isNullOrEmpty("  "));
        System.out.println("Q2: countOccurrences(\"banana\", \"an\") => " + countOccurrences("banana", "an"));
        System.out.println("Q3: reverseString(\"Hello\") => " + reverseString("Hello"));
        System.out.println("Q4: isPalindrome(\"A man, a plan, a canal, Panama\") => " + isPalindrome("A man, a plan, a canal, Panama"));
        System.out.println("Q5: removeWhitespace(\" a b c d \") => '" + removeWhitespace(" a b c d ") + "'");
    }
}
