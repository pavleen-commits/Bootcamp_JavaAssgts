//ques 12: Use Atomic Classes instead of Synchronize method and blocks.
package java_multithreading;
import java.util.concurrent.atomic.AtomicInteger;
class Counter extends Thread {
   // int count = 0;

    // Atomic variable
    AtomicInteger count;
    Counter()
    {
        count = new AtomicInteger();
    }

    public void run()
    {

        int max = 1_000_00_000;
        for (int i = 0; i < max; i++) {
            //addAndGet(int delta): Atomically adds the given value to the current value
            count.addAndGet(1);
        }
    }
/* SYNCHRONISED Method
    public synchronized void run(){
        int max = 1_000_00_000;
        for (int i = 0; i < max; i++) {
            count++;
        }

    }
    // Normal run method
    public  void run(){
        int max = 1_000_00_000;;
        for (int i = 0; i < max; i++) {
            count++;
        }

    }
    */

}

public class Atomic_12 {
    public static void main(String[] args) throws InterruptedException
    {
        Counter c = new Counter();
        Thread first = new Thread(c, "First");
        Thread second = new Thread(c, "Second");
        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println(c.count);
    }
}

