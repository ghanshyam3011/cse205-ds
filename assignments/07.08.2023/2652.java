public class solution {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // Your code snippet to measure
        for (int i = 0; i < 1000000; i++) {
            // Some code to execute
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time: " + elapsedTime + " nanoseconds");
    }
}