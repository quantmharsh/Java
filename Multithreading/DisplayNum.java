package Multithreading;


class  Fibonachi implements Runnable
{
    public  void run()
    {
       int n1 =1 , n2=0 ,n3=50 ,cnt=0;
       for(int i=0;i<50 ;i++)
       {
          n3= n1+n2;
         System.out.println(n3);
         
           n1=n2;
          n2= n3;
          cnt++;
          if(cnt%10==0)
          {
            try{
                    Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();

            }
          }
       }
    }
}
class Factorial implements Runnable
{
    public void run()
    {
        int fact=1;
          for(int i =1;i<=20;i++)
          {
             fact=fact*i;
             System.out.println("factorial of i is"+fact);
          }
    }
}
public class DisplayNum {
    public static void main(String[] args) {
        
    
  Fibonachi bullet1 = new Fibonachi();
  Thread gun1= new Thread(bullet1);
  Factorial bullet2= new Factorial();
  Thread gun2= new Thread(bullet2);
  gun1.start();
  gun2.start();
    }


 
    
}
