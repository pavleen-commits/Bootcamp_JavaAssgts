//ques 3: Use a singleThreadExecutor to submit multiple threads.
package java_multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Threads implements Runnable {

    private int id;

    public Threads(int id) {
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
public class ThreadExecutor_3 {

    public static void main(String[] args) {
        //3 threads running for 10 processes
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Threads(i));
        }
        executorService.shutdown();
        System.out.println("All tasks submitted.");
        try {
            executorService.awaitTermination(25, TimeUnit.SECONDS);
        } catch (InterruptedException ignored) {
        }
        System.out.println("All tasks completed.");

    }
}


