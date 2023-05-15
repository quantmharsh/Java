


package modelQp;
import java.util.Scanner;
import java.util.*;
class Alphabets
{
    private String str;
    Alphabets(String str)
    {
        this.str=str;
    }
    void count()
    {
          int[] letterIndex =new int[26];
          for(int i=0;i<str.length();i++)
          
          {
              char ch =Character.toLowerCase(str.charAt(i));
              if(ch >='a'  && ch <='z')
              {
                letterIndex[ch-'a']++;
              }

          }
          System.out.println("printing list");
          System.out.println(String.format("%-20s%-20s", "LETTER ","count"));
          for(int i=0;i<letterIndex.length;i++)
          { 
               if(letterIndex[i]>0)
               {
                System.out.println(String.format("%-20c%-20d",  'a'+i ,letterIndex[i]));
               }
          }
    }
}

public class countAlphabets {
    // public static void main(String[] args)
    // {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter String in single line");
    //     String str =sc.nextLine();
    //     //creating array to store index of alphabet
    //     int[] letterIndex = new  int[26];
    //     // storing  it in array at write position
    //     for(int i=0; i<str.length();i++)
    //     {
    //         char ch= Character.toLowerCase(str.charAt(i));
    //         //checking  whether character is alphabet or not
    //         if(ch >='a'&& ch<='z')
    //         {
    //             letterIndex[ch-'a']++;

    //         }
    //     }
    //     // printing 
    //     System.out.println(String.format(  "%-20s%-20s","Letter","count"));
    //     for( int i=0;i<letterIndex.length;i++)
    //     {
    //         if(letterIndex[i]>=1)
    //         {
    //             System.out.println(String.format( "%-20c%-20d", 'a'+i, +letterIndex[i]));
    //         }
    //     }

    // }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter sentence");
        String str= sc.nextLine();
         Alphabets a= new Alphabets(str);
         a.count();
    }

           
   }
