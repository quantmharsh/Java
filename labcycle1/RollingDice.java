package labcycle1;

import java.util.Random;
import java.io.*;


//Harsh Kumar Srivastava
//22MCA0310
public class  RollingDice
{
   int dice1;
   int dice2;
   int[] sumarr;
   int[] frequency;

   public RollingDice()
   {
      sumarr =new int[1296];
      frequency=new int[11];

       
    }
    int getSum()
    {
        int d1 = new Random().nextInt(6)+1;
        int d2= new Random().nextInt(6)+1;
        int sum=d1+d2;
        return sum;
    }
    public  double  chiSquare()
    {
         double ExpextedValue =1296/11;
         double chiSqr=0;
         for( int i=0;i<11;i++)
         {
            double ObservedValue=frequency[i];
            
            chiSqr=chiSqr+ (Math.pow((ExpextedValue-ObservedValue),2)/ExpextedValue);
         }
         return chiSqr;
         
         
    }

}
class Dice
{
    public static void main(String[] args) {
        RollingDice rd =new RollingDice();
        for( int i=0 ;i<1296 ;i++)
        {
            rd.sumarr[i]=rd.getSum();
            rd.frequency[rd.sumarr[i]-2]++;
        }
         System.out.println(String.format("%-10s%-10s", "Dicesum" ,"frequency"));
         for( int i=0;i<11;i++)
         {
            System.out.println(String.format("%-10d%-10d",i+2 ,rd.frequency[i]));
         }

         System.out.println("Chi sqare value ="+rd.chiSquare());

         if(rd.chiSquare()>18.307)
         {
            System.out.println("Biased dice");
         }
         else{
            System.out.println("Unbiased");
         }


    }
}