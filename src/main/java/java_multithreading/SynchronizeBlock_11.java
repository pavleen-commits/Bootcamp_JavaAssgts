///ques 11: Use Synchronize block to enable synchronization between
// multiple threads trying to access method at same time.
package java_multithreading;
import java.util.*;
class Table{

    void printTable(int n){
        //Remove synchronized block and observe the results differently.
        synchronized(this){
            //synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class SynchronizeBlock_11{
    public static void main(String args[]){
        Table obj = new Table();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}