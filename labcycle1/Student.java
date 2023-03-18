package labcycle1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;


public class Student {
 private   String regNo;
 private String name;
 private LocalDate dob;
 private String[] courses;
   
 //creating constructor
 public Student(String regno, String name){
   this.regNo = regno;
   this.name = name;
 }
 public Student(String regno , String name ,LocalDate dob ,String[] courses)
 {
    this(regno, name);
    this.dob=dob;
    this.courses=courses;
 }

 public void  setRegno(String regNo)
 {
    this.regNo=regNo;
 }
 public void setName(String name)
 {
    this.name=name;
 }
 public void setDob(LocalDate dob)
 {
    this.dob=dob;
 }
 public void setCourses(String[] courses)
 {
    this.courses=courses;
 }
 //creating gets
 public String getRegno()
 {
    return regNo;
 }
 public String getName()
 {
    return name;
 }
 public String[] getCourses()
{
    return courses;
}
public  int  getAge()
{
    //creating object of type
    LocalDate currentDate=LocalDate.now();
    //creating pereiod object
    Period age=Period.between(currentDate, dob);
    return age.getYears();
  
}

}

//main function
class main
{
  public static void main(String[] args) throws IOException {
    
    //creating object of InputStreamer\
    InputStreamReader is = new InputStreamReader(System.in);
    // now creating object of bufferedreader
    BufferedReader  br = new BufferedReader(is);
    //creating array of Student
    Student[] students =new Student[3];
    for( int i=0;i<students.length;i++)
    {
       System.out.println("enter detail for student"+(i+1));
       System.out.println("enter Reg no:");
       String regNo =br.readLine();
       System.out.println("enter Name ");
       String name=br.readLine();
       System.out.println("enter dob(yyyy-mm-dd)");
       LocalDate dob= LocalDate.parse(br.readLine());

       //creating a new array for course
       String[] course =new String[3];
       
       for( int j=0;j<course.length;j++)
       {
         System.out.printf("ENTER COURSE :"+(j+1));
             String courses = br.readLine();
             if(courses.isEmpty())
             {
                break;
             }
             course[j]=courses;
       }

        students[i]=new Student(regNo, name, dob, course);
    }


    //printing this data
    System.out.println(String.format("%-20s%-20s%-10s" , "Registrtion NO" ,"Name","Age"));
    System.out.println("-----------------------------------------------");

    for( Student i : students)
    {
        System.out.println(String.format("%-20s%-20s%-20s",i.getRegno(),i.getName(),i.getAge()));
    }

  }
}
