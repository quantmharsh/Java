package Generics;

import java.util.*;
public class ArrayListEx {
    public static void main(String[] args) {
        
    

    ArrayList<Integer> al = new ArrayList<>();
    al.add(12);
    al.add(13);
    al.add(14);
    al.add(15);
     int num = al.get(2);
     System.out.println(" value at index 2:" +num);

     Iterator  itr= al.iterator();

     while(itr.hasNext())
     {
        System.out.println(itr.next());
     }
    
    ArrayList<String> als = new ArrayList<>();
    als.add("Harsh");
    als.add("aman");
    als.add("amit");

    Iterator  itrs = als.iterator();
    while(itrs.hasNext())
    {
        System.out.println(itrs.next());
    }
}
    
}
