package g;
//3a. Develop a java program for performing various string operations with different string handling functions directed as follows: String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
//startsWith() and endsWith()
public class StringOperations3a {
    public static void main(String[] args) {
        String str1 = "  Hello ";
        String str2 = "World";

        // String Creation and Basic Operations
        System.out.println("Original: '" + str1 + "' and '" + str2 + "'");

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Char at index 1: " + str1.charAt(1));

        // String Comparison
        System.out.println("Equals: " + str1.trim().equals(str2));
        System.out.println("EqualsIgnoreCase: " + str1.trim().equalsIgnoreCase("hello"));

        // String Searching
        System.out.println("Contains 'lo': " + str1.contains("lo"));
        System.out.println("Index of 'o': " + str1.indexOf('o'));

        // Substring Operations
        System.out.println("Substring (1, 4): " + str1.substring(1, 4));

        // String Modification
        System.out.println("Replace 'l' with '*': " + str1.replace('l', '*'));

        // Whitespace Handling
        System.out.println("Trimmed: '" + str1.trim() + "'");

        // String Concatenation
        System.out.println("Concatenated: " + str1.trim().concat(" ").concat(str2));

        // String Splitting
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println("Words:");
        for (String w : words) System.out.println(w);

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder: " + sb.toString());

        // String Formatting
        String name = "Alice";
        int age = 22;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // Email validation
        String email = "example@gmail.com";
        System.out.println("Contains '@': " + email.contains("@"));
        System.out.println("Starts with 'example': " + email.startsWith("example"));
        System.out.println("Ends with '.com': " + email.endsWith(".com"));
    }
}
