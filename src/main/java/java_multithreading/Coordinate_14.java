//Coordinate mulitple threads using wait() and notifyAll()
package java_multithreading;
// is used to put the thread in waiting state while the
// notifyAll() method wake up all the waiting thread of a particular object.
class dem {
    boolean part1done = false;
    synchronized void part1()
    {
        System.out.println("Welcome to India");
        part1done = true;
        System.out.println("Thread t1 about to surrender lock");
        //notify();
        notifyAll();
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
    synchronized void part3()
    {
        while (!part1done) {
            try {
                System.out.println("Thread t3 waiting");
                // wait till notify is called
                wait();
                System.out.println("Thread t3 running again");
            }
            catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
        System.out.println("Do visit pink city");
    }
}

public class Coordinate_14 {

    public static void main(String[] args)
    {
        dem obj = new dem();
        Thread t1 = new Thread(new Runnable() {
            public void run() { obj.part1(); }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() { obj.part2(); }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() { obj.part3(); }
        });
        t2.start();
        t3.start();
        t1.start();

    }
}
