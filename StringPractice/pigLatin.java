package StringPractice;
import java.util.*;
import java.util.Scanner;

import javax.lang.model.type.ArrayType;
import javax.print.attribute.standard.PageRanges;

public class pigLatin {
    private String  sentence;
    pigLatin(String sentence)
    {
        this.sentence=sentence;
    }
      String getSentence()
      {
        return sentence;
      }
      String splitSting()
     {
         String[] words = sentence.split(" ");
          String latinSentence ="";
         for (String  word: words)
         {
            String latinWord = convertToLatin(word);
            latinSentence = latinSentence + latinWord +" ";
         }
        //  System.out.println("Encoded sentence: " + latinSentence.trim());
        return latinSentence;
       
     }
     String  convertToLatin(String word)
     {
         String firstAlphabet = word.substring(0,1);
         String remainingWord =word.substring(1 );
         String  pigLatinWord = remainingWord+firstAlphabet+ "ay";
         return  pigLatinWord;

     }
    

    
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " enter the sentence ");
        //  String sentence= sc.nextLine();
        //  pigLatin pl = new pigLatin(sentence);
         pigLatin[] array = new pigLatin[3];
         for ( int i=0 ;i<array.length ; i++)
         {
            String sentence= sc.nextLine();
            array[i] = new pigLatin(sentence);
         }
           System.out.println("before conversion sentences");
           for(pigLatin i: array)
           {
               System.out.println(i.getSentence());
               System.out.println();
           }

           System.out.println(" after piglatin conversion");
           for ( pigLatin i : array)
           { 
           System.out.println( i.splitSting());

           }
       

        
        
    }
}
