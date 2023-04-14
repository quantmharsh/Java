package exceptionHandling;

import java.io.BufferedReader;

import java.util.Scanner;



import javax.security.auth.login.AccountNotFoundException;
import javax.sound.midi.Soundbank;

public class balanceException extends Exception {
      balanceException( String exp)
      {
        super(exp);
      }
     

    
}
class bank{
    private  String  accountName;
    private  double accountNumber;
    private  double Balance;
  
    bank( String accountName , double accountNumber ,double Balance)
    {
        this.accountName=accountName;
        this.accountNumber=accountNumber;
        this.Balance=Balance;
       

    }
     public void setAccountName( String accountName)
     {     this.accountName=accountName;

     }
     String getAccountName()
     {
        return accountName;
     }
     Double getAccountNumber()
     {
        return accountNumber;
     }
     double getBalance()
     {
        return Balance;
     }
    void   transaction(double withdraw) throws balanceException
    {
         if(Balance<withdraw)
         {
            throw new balanceException(" AUKAT se jyada  withdraw kr rhe ho..");

         }
         else{
            Balance = Balance -withdraw;
            System.out.println(" account debited with :"+withdraw);
            System.out.println("Total Balance:"+Balance);
         }
    }
}
 class Main{
    public static void main(String[] args) {
        bank[] customers = new bank[3];
         Scanner sc  = new Scanner(System.in);
         for( int i=0;i <3;i++)
         {
            System.out.println("enter acoony name");
            String accountName= sc.next();
            System.out.println("ent3er account number");
            double  accountNumber= sc.nextDouble();
            System.out.println("enter balance");
            double Balance= sc.nextDouble();
            customers[i]= new bank( accountName,accountNumber,Balance);

         }
         bank b= new bank("harsh ", 4353636,10000);
         try{
            for( bank customer : customers)
            {
               
              customer.transaction(12000);
          
            }
         }
         catch(balanceException e)
         {
            // e.printStackTrace();g
            System.out.println("  ERRORR 404 ..."+ e.getMessage());
         }
         finally{
            System.out.println(" thanks for using system");
            for( bank  i: customers )
            {
                System.out.println(" HOLDDER: "+i.getAccountName());
                System.out.println(" Account NAME: "+i.getAccountNumber());
                System.out.println(" Balance: "+i.getBalance());

            }
         }
    }
 }
