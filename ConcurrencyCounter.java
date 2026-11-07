
public class ConcurrencyCounter {

    // Count from 0 to 20.
    public static void countUp() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Counting up: " + i);
        }
    }

    // Count from 20 to 0.
    public static void countDown() {
        for (int i = 20; i >= 0; i--) {
            System.out.println("Counting down: " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting the counter program.");

        // Start the first thread.
        Thread firstThread = new Thread(ConcurrencyCounter::countUp);
        firstThread.start();

        try {
            // Wait for the first thread to finish.
            firstThread.join();

            // Start the second thread.
            Thread secondThread = new Thread(ConcurrencyCounter::countDown);
            secondThread.start();

            // Wait for the second thread to finish.
            secondThread.join();

            System.out.println("Counter program completed.");

        } catch (InterruptedException e) {
            // Restore the interrupted status.
            Thread.currentThread().interrupt();
            System.err.println("Counter program interrupted.");
        }
    }
}
