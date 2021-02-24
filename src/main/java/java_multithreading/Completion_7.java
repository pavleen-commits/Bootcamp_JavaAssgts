//ques 7: Submit List of tasks to ExecutorService and wait for the completion of all the tasks.
package java_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
class Lists implements Runnable {

    private int id;

    public Lists(int id) {
        this.id = id;
    }

    public Lists(int id, String msg){
        System.out.println("Process 2-"+id + " with " +msg);
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
public class Completion_7 {

    public static void main(String[] args) {
        //3 threads running for 10 processes
        String msg = "WELCOME";
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //Process 1
        for (int i = 0; i < 4; i++) {
            executorService.submit(new Lists(i));
        }
        //Process 2
        for (int i = 0; i < 3; i++) {
            executorService.submit(new Lists(i, msg ));
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
