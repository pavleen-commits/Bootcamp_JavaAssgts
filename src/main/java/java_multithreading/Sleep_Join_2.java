//ques 2: Use sleep and join methods with thread.
package java_multithreading;
import java.lang.*;
class Sleep_1 extends Thread {
    //using sleep: The sleep() method of Thread class is used to sleep
    // a thread for the specified amount of time.
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
            try {
                //vary the value of the time to observe the results.
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Join_2 extends Thread{
    //using join:The join() method waits for a thread to die.
    // In other words, it causes the currently running threads to
    // stop executing until the thread it joins with completes its task.
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
public class Sleep_Join_2 {
        public static void main(String[] args) {
            //sleep
            Sleep_1 s1 = new Sleep_1();
            Sleep_1 s2 = new Sleep_1();
            s1.start();
            s2.start();
            //join
            Join_2 j1 = new Join_2();
            Join_2 j2 = new Join_2();
            Join_2 j3 = new Join_2();
            j1.start();
            try{
                j1.join();
            }catch(Exception e){System.out.println(e);}

            j2.start();
            j3.start();

        }
    }


