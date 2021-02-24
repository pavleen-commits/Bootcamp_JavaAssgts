//ques 1: Create and Run a Thread using Runnable Interface and Thread class.
package java_multithreading;
//Extending Thread Class
class Thread_1A extends Thread {
    public void run() {
        System.out.println("Thread is running by extending Thread Class!");
    }
}
//Implementing Runnable Interface
class Thread_1B implements Runnable {
    public void run(){
        System.out.println("Thread is running by implementing Runnable Interface!");
    }
}
public class Thread_1{

    public static void main(String[] args){
        //Extending Thread Class
        Thread_1A t1=new Thread_1A();
        t1.start();
        //Implementing Runnable Interface
        Thread_1B t2=new Thread_1B();
        //while implementing runnable interface, we need to explicitly
        // create the Thread class object. Otherwise class will not be
        // treated as Thread Class Object.
        Thread t3 = new Thread(t2);
        t3.start();
    }
}
