//ques 10: Use Synchronize method to enable synchronization between multiple
// threads trying to access method at same time.
package java_multithreading;
class Line
{
    //remove 'synchronised' to observe the output without thread synchronisation.
    synchronized public void getLine()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Train extends Thread
{
    // Reference variable of type Line.
    Line line;

    Train(Line line)
    {
        this.line = line;
    }

    @Override
    public void run()
    {
        line.getLine();
    }
}
    public class SynchronizeMethod_10 {
        public static void main(String[] args)
        {
            Line obj = new Line();

            // we are creating two threads which share
            // same Object.
            Train train1 = new Train(obj);
            Train train2 = new Train(obj);
            train1.start();
            train2.start();
        }
    }

