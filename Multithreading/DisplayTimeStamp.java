package Multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
class TimeStampPrint implements Runnable
{
    public SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            Date now= new Date();
           String timeStamp = simpleDate.format(now);
           System.out.println(timeStamp);
           try{
        Thread.sleep(1000);
           }
           catch(InterruptedException e)
           {
            e.printStackTrace();
           }
        }
    }
}
public class DisplayTimeStamp {
    public static void main(String[] args) {
        TimeStampPrint  bullet1= new TimeStampPrint();
        Thread  gun1= new Thread(bullet1);
        gun1.start();
        try{
            gun1.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("exiting....");

    }
    
}
