package StringPractice;
import java.io.*;
import java.util.stream.*;

import javax.sound.midi.Soundbank;

import java.util.Scanner;
class PhoneNumber{
    private String telephone;
    PhoneNumber(String telephone)
    {
        this.telephone=telephone;

    }
    void setNumber(String telephone)
    {
        this.telephone=telephone;

    }

    void splitPhoneNumber(){
        String ph[] = telephone.split(")");
        System.out.println(ph);
    }

    void  getNumber()
    {
        telephone=telephone.replace("(", " ").replace(")"," ").replace("-"," ");
        
        // String areacode =telephone.substring(0,3);
        // String firstthree =telephone.substring(3,6);
        // String lastfour =telephone.substring(6);
        // System.out.println(" area code"+areacode);
        // System.out.println(" first three digit"+firstthree);
        // System.out.println(" last four diigit"+lastfour);


        String[] areaCode= telephone.split(" ", 4);
        String  ac= areaCode[1];
        String firstThree = areaCode[2];
        String lastFour = areaCode[3]; 
         System.out.println("Area code"+ac);
         System.out.println("first three"+firstThree);
         System.out.println("last four"+lastFour);
         String concatenateString = firstThree+lastFour;
         System.out.println(" complete phone no"+concatenateString);


        // for(String s : areaCode)
        // {
        //     System.out.println(s);
        // }
        // String[] tokens = telephone.split(" ",3);
        // String areaCode = tokens[0];
        // String firstThreeDigits = tokens[1];
        // String lastFourDigits = tokens[2];
        
        // // Concatenate the seven digits into one string
        // String concatenatedNumber = areaCode + firstThreeDigits + lastFourDigits;
        
        // // Print the area code and phone number
        // System.out.println("Area code: " + areaCode);
        // System.out.println("Fisrst three digit"+firstThreeDigits);
        // System.out.println("last dour digits"+lastFourDigits);
        // System.out.println("Phone number: " + concatenatedNumber);
        

       

    }
}

public class concatenateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter telephone number");
         String telephone= sc.nextLine();
         PhoneNumber pn =new PhoneNumber(telephone);
         pn.getNumber();



    }
    
}
