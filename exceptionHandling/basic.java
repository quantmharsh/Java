package exceptionHandling;
import java.util.*;
import java.math.*;
 class  Arithmetic 
 {
    private  double x;
     Arithmetic(double x)
     {
        this.x=x;
     }
     public double getCube() throws ArithmeticException 
     {
        double c = Math.pow(x, 3);
        return c;
     }
    
 }
public class basic {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
         try{
          
            System.out.println("enter value to cube");
            double x = sc.nextDouble();
            Arithmetic a= new Arithmetic(x);
            System.out.println("cube of "+x + "is"+a.getCube());
            }
        catch(ArithmeticException e)
        {
            System.out.println("not a number");
            // e.printStackTrace();
        }
        catch(InputMismatchException e)
        {
            System.out.println("not a number and input mismatch enter no");
            //  e.printStackTrace();
        }
        finally{
            System.out.println("i will always execute becuse in final bolck ");
        }
        int[] arr=new int[5];
       
        try{
            for( int i=0;i<5;i++)
            {
                System.out.println("enter  no at index"+i);
                 arr[i]= sc.nextInt();
            }
            for( int i=0 ;i<=5 ;i++)
            {
                System.out.println(" square of no is" +arr[i]*arr[i]);
            }
          }

            
            
        catch( ArrayIndexOutOfBoundsException e)
            {
              System.out.println(" more index to print then its size please correct loop");
            }
        catch(InputMismatchException e)
            {
                System.out.println("only enter integers ");
            }
  
        
        System.out.println("out of every thing");
             }
            


    
}
