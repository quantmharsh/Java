package DA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String regNumber;
    private String name;
    private LocalDate dateOfBirth;
    private String[] courses;

    public Student(String regNumber, String name, LocalDate dateOfBirth, String[] courses) {
        this.regNumber = regNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.courses = courses;
    }

    public Student(String regNumber, String name, LocalDate dateOfBirth) {
        this(regNumber, name, dateOfBirth, null);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);
        return age.getYears();
    }
}
class main{


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Registration number: ");
            String regNumber = br.readLine();

            System.out.print("Name: ");
            String name = br.readLine();

            System.out.print("Date of birth (yyyy-mm-dd): ");
            LocalDate dob = LocalDate.parse(br.readLine());

            String[] courses = new String[3];
            for (int j = 0; j < courses.length; j++) {
                System.out.print("Enter course " + (j + 1) + " (or leave empty if no more courses): ");
                String course = br.readLine();
                if (course.isEmpty()) {
                    break;
                }
                courses[j] = course;
            }

            students[i] = new Student(regNumber, name, dob, courses);
        }

        System.out.println("\nStudent Details\n");
        System.out.println(String.format("%-20s%-20s%-10s", "Registration No.", "Name", "Age"));
        System.out.println("----------------------------------------------------");
        for (Student student : students) {
            System.out.println(String.format("%-20s%-20s%-10d", student.getRegNumber(), student.getName(), student.getAge()));
        }
    }
}
