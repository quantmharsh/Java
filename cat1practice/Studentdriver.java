package cat1practice;
import java.util.*;
import java.util.Scanner;
class CreditOutOfRange extends Exception
{
          CreditOutOfRange(String str)
          {
            super(str);
          }

}
class NameCaseException extends Exception
{
      NameCaseException( String str)
      {
        super(str);
      }
}
class RegistrationNo extends Exception{
     RegistrationNo(String str)
     {
        super(str);
     }
}
class InvalidPnr extends Exception
{
      InvalidPnr(String str)
      {
        super(str);
      }
}
class Student 
{
    private String regNo;
    private  String name;
    private  double totalCredits;
    Student()
    {

    }
    void setRegno(String regno)
    {
        this.regNo=regno;
    }
    void setName(String name)
    {
        this.name=name;
    }
    void setCredit(Double totalCredits)
    {
        this.totalCredits=totalCredits;
    }
    String getRegno()
    {
        return regNo;
    }
    String getName()
    {
        return name;
    }
    double getCredit()
    {
        return totalCredits;
    }
    void creditCheck()  throws CreditOutOfRange
    {
        try{
            if(totalCredits <16 || totalCredits >24 )
            {
              throw new CreditOutOfRange(" credit is out of range  .. update credits");

            }

        }
        catch(CreditOutOfRange e)
        {
            e.printStackTrace();
        }
        finally{
            System.out.println(  "Current credits :" +getCredit());
        }
    }
    void CheckName() 
    //throws NameCaseException
    {  
        try{
           if( name !=name.toUpperCase())
           {
             throw  new NameCaseException(" name should be in upper case");

           }}
           catch(NameCaseException e)
           {
            e.printStackTrace();
           }
           finally
           {
             System.out.println(" user Name :" +name);
           }
    }
    void checkRegistrationNo()  throws RegistrationNo
    {   
        try{
         if( !regNo.startsWith("22MCA") || regNo.length()<9) 
         {
             throw new RegistrationNo(" registration number invalid");
         }
        }
        catch(RegistrationNo e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println(" registration number :" +regNo);
        }
    }
    void checkPnrno(String pnrNo)
    {
        char  ch =pnrNo.charAt(4);
       
        try{
             if(ch!= '-')
             {
                  throw new InvalidPnr(" invalid pnr no enter another pnr");
             }
        }
        catch( InvalidPnr e)
        {
            e.printStackTrace();
        }
    }

}

public class Studentdriver {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         Student stu = new Student();

        System.out.println(" enter name");
         String name= sc.next();
         stu.setName(name);
         System.out.println("enter regno");
        
         String regNo= sc.next();
         stu.setRegno(regNo);
         System.out.println(" enter  total credits registered");
         double   totalCredits= sc.nextDouble();
         stu.setCredit(totalCredits);
         System.out.println(" enter your pnr no");
         String pnrno= sc.next();
           stu.checkPnrno(pnrno);
          
         System.out.println("checking details....");
         // try{
           stu.CheckName();
         // }
         // catch(NameCaseException e){
         //   e.printStackTrace();
         // }
          try
           {
            stu.checkRegistrationNo();
           }
           catch(RegistrationNo e)
           {
            e.printStackTrace();
           }
           try
           {
            stu.creditCheck();
           }
           catch( CreditOutOfRange e)
           {
            e.printStackTrace();
           }
          
           
           
           


      
      
        }
    
}
