package packages.moth.mothDriver;

import packages.moth.mothMain.mothDistance;
import java.util.Scanner;
import java.util.*;



public class driver {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
  System.out.println(" enter coordinate of x");
  int x= sc.nextInt();
  System.out.println("enter coordinate of y");
  int y= sc.nextInt();
   mothDistance md= new mothDistance(x,y);
   md.calculateDistance();
   System.out.println("enter  light coordinate x ,y");
   int newx= sc.nextInt();
   System.out.println("y coordinate");
   int newy=sc.nextInt();
   md.moveTowardsLight(newx, newy);
   md.calculateDistance();
   System.out.println( md.toString());



    }



    
}
