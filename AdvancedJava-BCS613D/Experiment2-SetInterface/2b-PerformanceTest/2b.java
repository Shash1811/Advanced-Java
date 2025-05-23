//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
//your answer which one is better.

public class PerformanceTest {
    public static void main(String[] args) {
        int iterations = 10000;

        // StringBuffer test
        StringBuffer buffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            buffer.append("AIET");
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // StringBuilder test
        StringBuilder builder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            builder.append("AIET");
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Output results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Conclusion
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster and better for single-threaded operations.");
        } else {
            System.out.println("StringBuffer is suitable for multithreaded environments but slower.");
        }
    }
}
