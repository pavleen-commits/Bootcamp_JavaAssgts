//ques6: Return a Future from ExecutorService by using callable and use get(), isDone(),
// isCancelled() with the Future object to know the status of task submitted.
package java_multithreading;
import java.util.Random;
import java.util.concurrent.*;

public class Future_6 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        //anonymous call of Callable
        Future<Integer> future = executor.submit(new Callable<>() {

            @Override
            //return value is Integer
            public Integer call() throws TimeoutException {
                Random random = new Random();
                int duration = random.nextInt(4000);

                System.out.println("Starting ...");
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException ignored) {}
                System.out.println("Finished.");
                return duration;
            }
        });

        executor.shutdown();

        //executor.awaitTermination(1, TimeUnit.DAYS); - not required with get(), because it
        // automatically waits for termination to complete if it is not done.
        //A. get()
        try {
            //get returned value from call()
            System.out.println("Result is: " + future.get());

        } catch (InterruptedException ignored) {
        } catch (ExecutionException e) {
            TimeoutException ex = (TimeoutException) e.getCause();
            System.out.println(ex.getMessage());
        }
        //B. isDone(): tells us if the executor has finished processing the task.
        // If the task is completed, it will return true otherwise, it returns false.
        System.out.println(future.isDone());


        //C. isCancelled() : to check the status, whether the task was cancelled in the middle or not
        System.out.println(future.isCancelled());

    }

}

