package FileHandling;

import java.io.*;
import java.util.Random;
import java.util.random.*;
import java.lang.Exception;

public class PracticeFile {
    public static void main(String[] args) {
        PracticeFile pf = new PracticeFile();
        String fileName ="C:/Users/virat/OneDrive/java/files/PracticeWork.txt";
        int numLines=100;

        try
        {
        FileWriter fw =new FileWriter(fileName);
        PrintWriter pw= new PrintWriter(fw);
        for(int i=0;i<=100;i++)
        {
            String firstName = getFirstName();
            String lastName = getLastName();
            String rank =getRank();
            int  salary = getSalary(rank);
            String line= firstName+" ,"+lastName+","+rank+","+salary;
            pw.println(line);
        }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        //READING IN CONSOLE USING bufferedreader
        try
        {
            BufferedReader br= new BufferedReader(new FileReader(fileName));
            String line;
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }
    public  static  String getFirstName()
    {
        String[] fname ={"Harsh" ,"Aman","Nihal","Tanya","Shreya","Gaurav"};
        Random rand= new Random();
        int index= rand.nextInt(fname.length);
        return fname[index];


    }
    public  static  String getLastName()
    {
        String[] Lname={"Srivastava","Rawat","singh","tiwari"};
        Random rand= new Random();
        int index= rand.nextInt(Lname.length);
        return Lname[index];
    }
    public  static String getRank()
    {
        String[] rank={"assistant","associate","full"};
        Random rand= new Random();
        int index= rand.nextInt(rank.length);
        return rank[index];
    }
    public  static  int getSalary( String rank)
    {
        Random rand= new Random();
        int salary=0;
        switch(rank)
        {
            case "assistant":
                   salary = rand.nextInt(50000 ,80001);
                  break;
            case "associate":
                  salary= rand.nextInt(60000,110001);
                 break;
            case "full":
                  salary=rand.nextInt(75000,130001);
                  break;
            default :
                 salary=0;
                 
        }
        return salary;
    }
    
}
