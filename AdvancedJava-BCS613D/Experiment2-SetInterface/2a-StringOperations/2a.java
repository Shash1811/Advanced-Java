//2 a. Develop a java program for performing various string operations with different string handling functions directed as follows String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , String Modification, Whitespace Handling, String
//Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
//contains( ) and startsWith() and endsWith()//
public class StringOperations {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("String s1: " + s1);
        System.out.println("String s2: " + s2);

        // 2. Length and Character Access
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 1 in s1: " + s1.charAt(1));

        // 3. String Comparison
        String s3 = "Hello";
        System.out.println("s1 equals s3? " + s1.equals(s3));
        System.out.println("s1 == s3? " + (s1 == s3)); // Reference check

        // 4. String Searching
        System.out.println("Index of 'l' in s1: " + s1.indexOf('l'));
        System.out.println("s2 contains 'or'? " + s2.contains("or"));

        // 5. Substring Operations
        System.out.println("Substring of s1 from index 1 to 4: " + s1.substring(1, 4));

        // 6. String Modification
        System.out.println("Uppercase s1: " + s1.toUpperCase());
        System.out.println("Replace 'l' with 'x' in s1: " + s1.replace('l', 'x'));

        // 7. Whitespace Handling
        String s4 = "   AIET   ";
        System.out.println("Original with whitespace: '" + s4 + "'");
        System.out.println("Trimmed: '" + s4.trim() + "'");

        // 8. String Concatenation
        String full = s1 + " " + s2;
        System.out.println("Concatenated string: " + full);

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] fruitArray = fruits.split(",");
        System.out.println("Splitting fruits:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "John";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email
        String email = "john.doe@example.com";
        System.out.println("Valid email?");
        System.out.println("Contains '@'? " + email.contains("@"));
        System.out.println("Starts with 'john'? " + email.startsWith("john"));
        System.out.println("Ends with '.com'? " + email.endsWith(".com"));
    }
}