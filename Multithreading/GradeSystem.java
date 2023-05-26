package Multithreading;

class  GradeCalculator implements Runnable
{

private int marks1 ;
private int marks2 ;
private int totalMarks;
private int averageMarks;
private String StudentName;
int gpa;
GradeCalculator( String StudentName ,int marks1 , int marks2)
{
    this.StudentName=StudentName;
    this.marks1=marks1;
    this.marks2=marks2;

}
public void run()
{
     totalMarks= marks1+marks2;
     averageMarks =totalMarks/2;
     if(averageMarks >=80)
     {
          gpa=10;
     }
     else if(averageMarks >=60)
     {
        gpa=8;
     }
     else if(averageMarks >=40)
     {
        gpa=6;
     }
}
   int getGPA()
   {
    return gpa;
   }
   String getName()
   {
    return StudentName;
   }

}
class StudentDetails implements Runnable
{
   GradeCalculator gc;

   StudentDetails( GradeCalculator gc)
   {
    this.gc= gc;
   }
   public void run()
   {
    try
    {  
        Thread.sleep(1000);
        System.out.println(" Student name:"+gc.getName());
        System.out.println(" grade Obtained:"+gc.getGPA());

    }
    catch(InterruptedException e)
    {
       e.printStackTrace();
    }
   }
}

public class GradeSystem {
    public static void main(String[] args) {
        
    
      String[]  students={"harsh","aman","amit","adarsh","anusheel"};
     int[] marks1={80,50,70,80,90,};
     int[] marks2={90,50,60,40,80};
    
    for(int i = 0; i < students.length; i++)
    {
        GradeCalculator bullet1= new GradeCalculator(students[i], marks1[i], marks2[i]);
        Thread gun1= new Thread(bullet1);
        StudentDetails bullet2 = new StudentDetails(bullet1);
        Thread gun2 = new Thread(bullet2);
         gun1.start();
         gun2.start();
         try{
            gun1.join();
            gun2.join();

         }
         catch(InterruptedException e)
         {
            e.printStackTrace();
         }
         System.out.println("Main thread ending");

    }

    
}
}
