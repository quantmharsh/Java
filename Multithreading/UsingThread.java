package Multithreading;
import java.util.Random;
import java.util.random.*;

class MyThread1 implements Runnable
{
       public void run()
       { 
          for(int i=0;i<100;i++)
          {
            System.out.println("Hello World");

          }
       }
}
class Mythread2 implements Runnable
{
    public void run()
    {
      Random rand = new Random();
      for(int i=0;i<100 ;i++)
      {
     int num = rand.nextInt(110, 251);
     System.out.println(" Generated value:"+num);
      }

    }
}

public class UsingThread
{
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread1());
        Thread t2 = new Thread(new Mythread2());
        t1.start();
        t2.start();

        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("exited....");
    }
}