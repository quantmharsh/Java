package FileHandling;

import java.io.*;
import java.util.Random;
import java.util.random.*;

import javax.sound.sampled.Line;

import java.lang.Exception;

public class TotalScores {
    public static void main(String[] args) {

        TotalScores ts = new TotalScores();
        String fileName = "C:/Users/virat/OneDrive/java/files/totalScores.txt";
        try {
            
            FileWriter fw= new FileWriter(fileName);
            PrintWriter pw= new PrintWriter(fw);

            for (int i = 0; i < 10; i++) {
                int num = getNum();
                String line = num + " ";
              
                pw.println(line);
            }
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading from file
        int total=0;
             double average=0;
             int cnt=0;
        
        try
        {
            String line;
            BufferedReader br= new BufferedReader(new FileReader(fileName));
            while((line=br.readLine())!=null)
            {
            String[] scores= line.split(" ");
            
            for(String i: scores)
            {
                int score= Integer.parseInt(i);
                total =total+score;
                cnt++;
                


            }
        }
            System.out.println("total scoe: "+ total);
            average =(double)total/cnt;
            System.out.println("average "+ average);


        }
        
        catch(IOException e)
        {
            e.printStackTrace();

        }
    }

    public static int getNum() {
        Random rand = new Random();
        int num = rand.nextInt(0, 100);
        return num;
    }

}
