package exp;
import java.util.Scanner;
class clearNumber{
    private String PhoneNumber;
    clearNumber( String PhoneNumber)
    {
        this.PhoneNumber=PhoneNumber;
    }
     public  void  cleanNumber()
     {
           String number = PhoneNumber.replace("(", " ").replace(")", " ").replace("-" ," ");
           String[] numparts = number.split(" ",4);
           String areacode =numparts[1];
           String  firstThree = numparts[2];
           String lastFour =numparts[3];
           System.out.println(" areacode "+areacode);
           System.out.println(" firstthree digit "+firstThree);
           System.out.println(" last four digit "+lastFour);

           


    
    
     }
}
public class test1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        clearNumber[] contactList = new clearNumber[5];
        for(int i=0;i<contactList.length ;i++)
        {
             String num = sc.nextLine();
             contactList[i]= new clearNumber(num);
        }
        System.out.println(" cleaning the numbers");
        for( clearNumber i : contactList)
        {
            i.cleanNumber();
        }
    }
     
}
