//ques 13: Coordinate 2 threads using wait() and notify().
//Object.wait() – to suspend a thread
//Object.notify() – to wake a thread up
package java_multithreading;
class demo {
    boolean part1done = false;
    synchronized void part1()
    {
        System.out.println("Welcome to India");
        part1done = true;
        System.out.println("Thread t1 about to surrender lock");
        // notify the waiting thread, if any
        notify();
    }
    synchronized void part2()
    {
        while (!part1done) {
            try {
                System.out.println("Thread t2 waiting");
                // wait till notify is called
                wait();
                System.out.println("Thread t2 running again");
            }
            catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
        System.out.println("Do visit Taj Mahal");
    }
}

public class Coordinate_13 {

    public static void main(String[] args)
    {
        demo obj = new demo();
        Thread t1 = new Thread(new Runnable() {
            public void run() { obj.part1(); }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() { obj.part2(); }
        });
        t2.start();
        t1.start();
    }
}

