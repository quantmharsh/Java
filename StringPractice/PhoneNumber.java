package StringPractice;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

 class  numberFormatting {
      private String phoneNumber;
    numberFormatting(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public void  numberFormate()
    
      {
       
        phoneNumber = phoneNumber.replace("(", " ").replace(")", " ").replace("-", " ");
        String[] arrPh = phoneNumber.split(" ");
        String  areaCode= arrPh[1];
        String  firstThree =arrPh[2];
        String  lastFour =arrPh[3]; 
        System.out.println( " areacode:"+areaCode);
        System.out.println("first three"+firstThree);
        System.out.println("last four"+lastFour);
        System.out.println(" complete number:"+areaCode +" "+firstThree  +" "+lastFour);

    }
}

  public  class PhoneNumber
{
   public static void main(String[] args)
{
        Scanner sc= new Scanner(System.in);
        String PhoneNumber = sc.next();
        numberFormatting nf= new numberFormatting(PhoneNumber);
        nf.numberFormate();
        
    }
}
