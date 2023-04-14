package exp.package2triangle;
import java.util.*;
import java.util.Scanner;

import exp.package1geo.*;

import java.math.*;


public class triangle implements geometricObject {
    private double side1;
    private double side2;
    private double side3;
     public triangle( double side1 ,double side2 ,double side3)
     {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;

     }
      public void setsides(double side1 ,double side2 ,double side3)
     {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;

     }
     
     public double getPerimeter()
     {
      double per =side1+side2+side3;
      return per;
     }
     public  double getArea()
     {
        double s= getPerimeter()/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;

     }
    
}
