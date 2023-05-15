package DA1;
import java.util.*;
import java.util.Random;


class Dice
{
    int[]  sumarr = new int[1296];
    int frequencyarr[] = new int[13]; 
   
void   generatevalue()
   {
    
    for(int i=0;i<1296 ;i++)
    {
      int  dice1 =  new Random().nextInt(6)+1;
       int dice2 = new Random().nextInt(6)+1;
      int sum = dice1+dice2;
       sumarr[i]=sum;
    }
    for(int i=0 ;i<sumarr.length ;i++ )
    {
        frequencyarr[sumarr[i]]++;
    }

    System.out.println("printing frequency");
    for(int i=2;i<13;i++)
    {
        System.out.println(String.format("%d-%d", i,frequencyarr[i] ));
    }
}

       public double  chiSquare()
     {
        double ExpextedValue = 1296/11;
        double  result =0;
        for(int i=0 ;i<frequencyarr.length ;i++)
        {
            double ObservedValue =frequencyarr[i];
            result= result+(Math.pow(ObservedValue-ExpextedValue ,2)/ExpextedValue);


        }
        return result;

     }

    

   }
 
   



public class practice {
    public static void main(String[] args) {
        Dice d= new Dice();
        d.generatevalue();
         System.out.println(d.chiSquare());
        
        
    }
}
