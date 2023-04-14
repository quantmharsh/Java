package exp.Main;
import java.util.*;

import exp.package1geo.*;
import exp.package2triangle.*;

import java.lang.Math;

public class main {
    public static void main(String[] args) {
         triangle t= new triangle(12, 3, 10);
        
        System.out.println(" perimeter of triangle :"+t.getPerimeter());
        System.out.println("area of triangle :"+t.getArea());
    }
    
}
