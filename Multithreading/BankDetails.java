package Multithreading;

import exceptionHandling.praacticeException;

class BankAccount
{
    private double balance;
    BankAccount(double balance)
    {
        this.balance= balance;

    }
    public synchronized double deposit (double  amount)
    {
          balance=balance+amount;
          System.out.println(" balance after depositing ="+ getBalance());
          return balance;
    }
    public synchronized double  withdraw(double amount)
    {
        if(amount<balance)
        {

            balance=balance-amount;
            System.out.println(" balance after withdrawing ="+getBalance());
            return balance;
        }
        else
        {
            System.out.println("insufficient balance");
            return balance;
        }
    }
    public double getBalance()
    {
        return balance;
    }
}
class  DepositThread extends Thread
{
     private BankAccount  ba;
     private double amount;
     DepositThread(BankAccount ba ,double amount )
     {
        this.ba=ba;
        this.amount=amount;
     }
     public void run()
     {
        ba.deposit(amount);
     }
}
class WithdrawThread extends Thread
{
    private BankAccount ba;
    private double amount;
    WithdrawThread(BankAccount ba , double amount)
    {
        this.ba=ba;
        this.amount=amount;
    }
    public void run(){
        ba.withdraw(amount);
    }


}
public class BankDetails {
    public static void main(String[] args) 
    {
        BankAccount ba= new BankAccount(12000);
        int n=10;
        Thread[] threads = new Thread[n];
        Thread[] threads1 = new Thread[n];

        for(int i =0;i<n;i++)
        {
            threads[i] =new DepositThread(ba ,100);
            threads[i].start();
            
            threads1[i]= new WithdrawThread(ba, 50);
            threads1[i].start();
            
        }
     try{
        for(int i=0;i<n;i++)
        {
            threads[i].join();
            threads1[i].join();
        }
        System.out.println("final balance="+ ba.getBalance());
    }
    catch(InterruptedException e)

{
    e.printStackTrace();
}
}
}
