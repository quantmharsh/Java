package StringPractice;

import java.net.Socket;
import java.util.Scanner;

import javax.sql.rowset.serial.SerialBlob;

class   stringOperations
{
   private String sentence;
   stringOperations(String sentence)
   {
    this.sentence=sentence;
   }
   public  void upperlower()
   {
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
   }
   public void  findindex()
   {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter character to found in  given string");
    String  ch = sc.next();
      System.out.println( sentence.indexOf(ch, 0));

   }
   public void reverseOrder()
   {
   
      String[] arr =sentence.split(" ");
       for( int i= arr.length-1;i>=0 ; i--)
      {
         System.out.println(arr[i]);
      }

   }
   public void  beginwith()
   {
    String[] arr =sentence.split(" ");
    for( int i= arr.length-1;i>=0 ; i--)
   {
    if(arr[i].startsWith("b"))

      System.out.println(arr[i]);
   }
   }
   public void  endwith()
   {
    String[] arr =sentence.split(" ");
    for( int i= arr.length-1;i>=0 ; i--)
   {
    if(arr[i].endsWith("ED"))

      System.out.println(arr[i]);
   }
   }


}
public class stringSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter sentence on which you want to perform operations");
        String sentence= sc.nextLine();
        stringOperations so = new stringOperations(sentence);
        System.out.println("enter  1 for  upperlower");
        System.out.println("enter  2 for  finding index");
        System.out.println("enter  3 for  begin with");
        System.out.println("enter  4 for  end with");
        System.out.println("enter  5 for  reverseorder");
        int  num= sc.nextInt();
        switch(num)
        {
            case 1 : 
            System.out.println(" upper case and loweer case");
            so.upperlower();
            break;
            
            case 2 :
            System.out.println("findind no of repetetion...");
            so.findindex();
            break;

            case 3:
            System.out.println(" begin with");
            so.beginwith();
            break;
            
            case 4:
            System.out.println("end with");
            so.endwith();
            break;

            case 5:
            System.out.println("reverse order");
            so.reverseOrder();
            break;
             default :
             System.out.println(" bad choice..");



        };

       
       
        

    }
    
}
