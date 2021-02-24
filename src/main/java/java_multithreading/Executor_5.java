//ques5: Use isShutDown() and isTerminated() with ExecutorService.
//boolean isShutdown()	    :This method returns whether the given executor is shut down or not.
//boolean isTerminated()	:This method returns true if all tasks have executed after shutdown.
package java_multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Pro implements Runnable {

    private int id;

    public Pro(int id) {
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
public class Executor_5 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 3; i++) {
            executorService.submit(new Pro(i));
        }

        //executorService.shutdownNow();
        executorService.shutdown();
        System.out.println("All tasks submitted.");
        try {
            executorService.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException ignored) {
        }
        System.out.println("All tasks completed.");
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
    }

}