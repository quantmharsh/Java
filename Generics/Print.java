package Generics;
import java.io.*;
import java.util.*;
class InvalidSubscriptException extends Exception
{
  InvalidSubscriptException(String str)
  {
    super(str);
  }
}
public class Print
{
 public static<T> int  printArray(T[] array  ,int lowSubscript , int highSubscript) throws InvalidSubscriptException
 {
    if(lowSubscript< 0 || highSubscript >array.length ||lowSubscript>highSubscript)
    {
        throw new  InvalidSubscriptException ("interruption occued array out of index...");
    }
    int count =0;
    for(int i=lowSubscript ;i<=highSubscript;i++)
    {
        System.out.println(array[i]);
        count++;
    }
    return count;

 }

 public static void main(String[] args) {
    try{


    Integer[] intArr ={1,2,4,5,6,7,88,5,3,2,26,8,95,46,3};
    int count= printArray(intArr, 2, 5);
    System.out.println("Total count:"+count);
    Double[] doublearr ={2.4,78.6,5.37,7.64,3.96,4.67,3.78};
     count = printArray(doublearr, 5, 6);
     System.out.println("total count of double array"+count);

    Character[] charr ={'a','b','c','d','e','f','g','h'};
    count= printArray(charr, 2, 3);
    System.out.println("Total count of character Array:"+count);
  

}
catch(InvalidSubscriptException e)
{
    e.printStackTrace();
}




 }
}
