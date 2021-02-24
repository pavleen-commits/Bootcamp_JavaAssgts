//ques 8: Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()
package java_multithreading;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
    public class TestingTimer_8 {
        public static void main(String[] args) {
            ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
            System.out.println("Scheduling thread.");
            Runnable task = new Runnable() {
                public void run() {
                    System.out.println("Hi!");
                }
            };
            int delay = 5;
            //A
            executorService.schedule(task, delay, TimeUnit.SECONDS);
            executorService.shutdown();

            //B scheduleAtFixedRate(): . It is used to schedule the given task again and again
            //in fixed rate of execution. It will begin after the specified delay.

            //executorService.scheduleAtFixedRate(task,2,5, TimeUnit.SECONDS);

            //C - Doubt
            // executorService.scheduleWithFixedDelay(task, 2,5,TimeUnit.SECONDS);
        }

    }



        /*
            executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    System.out.println(new Date() + " Display thread");
                }
            }, 2, 5, TimeUnit.SECONDS);
        }

        */
