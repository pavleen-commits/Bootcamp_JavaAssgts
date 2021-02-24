//ques 9: Increase concurrency with Thread pools using newCachedThreadPool()
// and newFixedThreadPool().
package java_multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

    class Processor implements Runnable {

        private int id;

        public Processor(int id) {
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

    public class ThreadPool_9 {

        public static void main(String[] args) {

            //uncomment A to observe the working of newFixedThreadPool()
            //newFixedThreadPool(): thread pool is initialized with user supplied number of threads
           /*A
            ExecutorService executor = Executors.newFixedThreadPool(2);
            for (int i = 0; i < 5; i++) { // call the (Processor(i).run) 5 times with 2 threads
                executor.submit(new Processor(i));
            }
            //stop accepting new tasks and wait for all the threads to complete whatever they're doing.
            executor.shutdown();
            System.out.println("All tasks submitted.");
            try {
                executor.awaitTermination(10, TimeUnit.SECONDS);
            } catch (InterruptedException ignored) {
            }
            System.out.println("All tasks completed.");
            */



            //B. newCachedThreadPool(): A cached thread pool is useful when tasks submitted for
            // processing should not wait and needs to be addressed as soon as submitted.

            ExecutorService executorService = Executors.newCachedThreadPool();
            for (int i = 0; i < 5; i++) {
                executorService.submit(new Processor(i));
            }
            executorService.shutdown();
            try {
                executorService.awaitTermination(10, TimeUnit.SECONDS);
            } catch (InterruptedException ignored) {
            }
            System.out.println("All tasks completed.");

        }
    }


