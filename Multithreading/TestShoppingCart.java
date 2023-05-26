package Multithreading;

import java.util.Scanner;

class Products
{ 
    private String name;
    private int quantity;
    Products( String name , int quantity)
    {
        this.name= name;
        this.quantity=quantity;

    }
    void  getProductDetails()
    {
        System.out.printf("\n NAME: %s  ",name);
        System.out.printf("QUANTITY: %d",quantity );
    }


}
class ShoppingCart{
    Products[] p;
    boolean IsAvaliable;
    ShoppingCart()
    {
        p=new Products[5];
        IsAvaliable =false;

    }
    public   synchronized  void setCart()
    {
       while(IsAvaliable)
       {
        try{
            wait();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
       }
       int i =0;
       Scanner sc= new Scanner(System.in);
       while(i<3)
       {
        System.out.println("enter products details");
         String name = sc.next();
          int  quantity=sc.nextInt();
          Products product = new Products(name, quantity);
          p[i]=product;
          i++;

       }
       IsAvaliable=true;
       notify();


    }
    public synchronized void getCart()
    {
        while(!IsAvaliable)
        {
            try{
                wait();
            }
            catch(InterruptedException e)
            {
              e.printStackTrace();
            }

        }
        int i=0;
        while(i<3)
        {
             p[i].getProductDetails();
             i++;
        }
        IsAvaliable=false;
        notify();

    }


}
class Producer implements Runnable 
{
    ShoppingCart sc= new ShoppingCart();
    Producer( ShoppingCart sc)
    {
        this.sc=sc;
        Thread t= new Thread(this ,"producer");
        t.start();
    }
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            sc.setCart();
        }
    }

}
class Customer implements Runnable
{
    ShoppingCart sc= new ShoppingCart();
    Customer( ShoppingCart sc)
    {
      this.sc=sc;
      Thread t= new Thread(this ,"consumer");
      t.start();

    }
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            sc.getCart();
        }
    }
}


public class TestShoppingCart {
    public static void main(String[] args) {
        
        ShoppingCart sc = new ShoppingCart();
        new  Producer(sc);
        new Customer(sc);

    }
    
}
