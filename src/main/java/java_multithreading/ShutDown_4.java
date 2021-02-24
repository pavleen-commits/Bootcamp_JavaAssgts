//ques 4: Try shutdown() and shutdownNow() and observe the difference.
package java_multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Process implements Runnable {

    private int id;

    public Process(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Starting: " + id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("Completed: " + id);
    }
}

public class ShutDown_4 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 3; i++) {
            executor.submit(new Process(i));
        }
        //stop accepting new tasks and wait for all the threads to complete whatever they're doing.
        executor.shutdown();

        /* Difference is observed when we execute shutdown() and shutdownNow() */


        //shutdownNow() is a hard signal to destroy the ExecutorService immediately
        // along with stopping the execution of all in-progress and queued tasks.

        //executor.shutdownNow();
        System.out.println("All tasks submitted.");
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException ignored) {
        }


    }
}