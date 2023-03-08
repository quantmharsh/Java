package labcycle1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

// public class Student {
//     private String regNumber;
//     private String name;
//     private LocalDate dateOfBirth;
//     private String[] courses;

//     public Student(String regNumber, String name, LocalDate dateOfBirth, String[] courses) {
//         this.regNumber = regNumber;
//         this.name = name;
//         this.dateOfBirth = dateOfBirth;
//         this.courses = courses;
//     }

//     // public Student(String regNumber, String name, LocalDate dateOfBirth) {
//     //     this(regNumber, name, dateOfBirth, null);
//     // }

//     public String getRegNumber() {
//         return regNumber;
//     }

//     public void setRegNumber(String regNumber) {
//         this.regNumber = regNumber;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public LocalDate getDateOfBirth() {
//         return dateOfBirth;
//     }

//     public void setDateOfBirth(LocalDate dateOfBirth) {
//         this.dateOfBirth = dateOfBirth;
//     }

//     public String[] getCourses() {
//         return courses;
//     }

//     public void setCourses(String[] courses) {
//         this.courses = courses;
//     }

//     public int getAge() {
//         LocalDate currentDate = LocalDate.now();
//         Period age = Period.between(dateOfBirth, currentDate);
//         return age.getYears();
//     }
// }
// class main{


//     public static void main(String[] args) throws IOException {
//         InputStreamReader is = new InputStreamReader(System.in);
//         // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         BufferedReader br= new BufferedReader(is);

//         Student[] students = new Student[3];

//         for (int i = 0; i < students.length; i++) {
//             System.out.println("Enter details for student " + (i + 1) + ":");
//             System.out.print("Registration number: ");
//             String regNumber = br.readLine();

//             System.out.print("Name: ");
//             String name = br.readLine();

//             System.out.print("Date of birth (yyyy-mm-dd): ");
//             LocalDate dob = LocalDate.parse(br.readLine());

//             String[] courses = new String[3];
//             for (int j = 0; j < courses.length; j++) {
//                 System.out.print("Enter course " + (j + 1) + " (or leave empty if no more courses): ");
//                 String course = br.readLine();
//                 if (course.isEmpty()) {
//                     break;
//                 }
//                 courses[j] = course;
//             }

//             students[i] = new Student(regNumber, name, dob, courses);
//         }

//         System.out.println("\nStudent Details\n");
//         System.out.println(String.format("%-20s%-20s%-10s", "Registration No.", "Name", "Age"));
//         System.out.println("----------------------------------------------------");
//         for (Student student : students) {
//             System.out.println(String.format("%-20s%-20s%-10d", student.getRegNumber(), student.getName(), student.getAge()));
//         }
//     }
// }

public class Student {
 private   String regNo;
 private String name;
 private LocalDate dob;
 private String[] courses;
   
 //creating constructor
 public Student(String regno , String name ,LocalDate dob ,String[] courses)
 {
    this.regNo=regno;
    this.name=name;
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
       System.out.println("enter detail for student"+i+1);
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
               System.out.println("ENTER COURSE :"+j+1);
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
