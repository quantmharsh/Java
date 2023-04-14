package exceptionHandling;
import java.util.*;
import java.lang.Exception;


 public class   badRectangleAreaException extends Exception{
    badRectangleAreaException(String expMessage)
    {
        super(expMessage);
    }

   }
  class badSquareException extends Exception{
      badSquareException( String exp)
      {
        super(exp);
      }

   }

 
  class Area {

    private double sqside;
    private double length;
    private double breadth;

    Area(double length , double breadth ,double sqside)
    {
        this.length=length;
        this.breadth=breadth;
        this.sqside=sqside;
    }
    public  double sqArea()
    {
       
        double sq = sqside*sqside;
        System.out.println("square"+sq);

        return sq;
    }
    public  double rectangleArea()
    {
       
        double re =length*breadth;
        System.out.println("rectangle" +re);
        return re;
    }
    public void checkArea() throws  badRectangleAreaException
    {
         if(rectangleArea()<=sqArea())
         {
             throw new badRectangleAreaException("rectangle area should be greater then square area");
           
         }
         System.out.println(" understanding throw and throws");
        
    }
    public void checkPerimeter() throws badSquareException{

        if(rectangleArea()>sqArea())
        {
            throw new badSquareException(" Bad  square ");
        }

    }
}
  

class Main{
public static void main(String[] args) {

        Area a= new Area(12, 3, 5);
        // a.sqArea();
        // a.rectangleArea();
    try{
        a.checkArea();
        
    }
    catch ( badRectangleAreaException e)
    {
        e.printStackTrace();
       
        System.out.println("inside main catch");
    }
    finally{
        System.out.println("exiting....");
    }

    try{
         a.checkPerimeter();
    }
    catch(badSquareException e)
    {
        e.printStackTrace();
        System.out.println(" IMPROVE YOUR SQUARE");
    }


    
    
}
}
