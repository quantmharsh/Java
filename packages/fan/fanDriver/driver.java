package packages.fan.fanDriver;
import packages.fan.fanInfo.*;
import java.util.*;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean on;
        System.out.println("enter fan is on or off(1 OR 0) ");
          int n = sc.nextInt();
          if(n==1)
          {
            on = true;
          }
          else{
            on = false;
        }

        System.out.println("enter fan speed");
        int speed= sc.nextInt();
        System.out.println("enter fan colour");
        String colour= sc.next();
        System.out.println("enter radius of fan");
        double radius =sc.nextDouble();
        fanDetails fd = new  fanDetails( speed , on,  radius, colour);
           System.out.println(  fd.toString());

          }
    }
    

