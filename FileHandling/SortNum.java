package FileHandling;

import java.awt.List;
import java.io.*;
import java.lang.Exception;
import java.nio.channels.IllegalBlockingModeException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.random.*;

public class SortNum {
    public static void main(String[] args) {
        SortNum sn = new SortNum();
        String fileName="C:/Users/virat/OneDrive/java/files/sort.txt";
        int n=100;
        try
        {
            FileWriter fw =new FileWriter(fileName);
            PrintWriter pw= new PrintWriter(fw);
            Random rand= new  Random();
            pw.println("HELLO WORLD");
            for(int i=0;i<n;i++)
            {
             
              int num = rand.nextInt(0,101);
              String line= (num+",");
              pw.println(line);
            }
        }
        catch(IOException e)
        {
           e.printStackTrace();
        }

        //reading from file using buffered reader
        try{
            BufferedReader reader= new BufferedReader(new FileReader(fileName));
           ArrayList <Integer> nums =  new ArrayList< Integer>();
              String line;
              while((line=reader.readLine())!=null)
              {
                String[] tokens=line.split(",");
                for(String token: tokens)
                {
                    int num=Integer.parseInt(token);
                    nums.add(num);


                }
              }
              Collections.sort(nums);
              for( int i : nums)
              {
                System.out.println(i+",");
              }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
