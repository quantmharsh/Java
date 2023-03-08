package labcycle1;

public class Employee {
    private  String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName , String lastName ,double monthlySalary)
    {
       this.firstName=firstName;
       this.lastName=lastName;
       this.monthlySalary=monthlySalary;
    }

    public void setfirstName( String firstName)
    {
        this.firstName=firstName;
    }
    public void setlastName(String lastName)
    {
        this.lastName=lastName;
    }
    public void setSalary(double monthlySalary)
    {
        this.monthlySalary=monthlySalary;
    }
    public String getfirstName()
    {
       return  firstName;
    }
    public String getlastName()
    {
        return lastName;
    }
    public double getsalary()
    {
        return monthlySalary;
    }
    public double getraise()
    {
        System.out.println("Employee Salary after raise");
       return monthlySalary+monthlySalary*0.10;
    }

    


    
}
class EmployeeTest{
    public static void main( String[] args)
    {
        Employee emp1 =new Employee("Harsh","Srivastava" , 80000);
        Employee emp2=new Employee("aman","mashqoor", 79000);
        System.out.println("employee 1 details ");
        System.out.println("First Name: "+emp1.getfirstName());
        System.out.println("Last Name: "+emp1.getlastName());
        System.out.println("Salary: "+emp1.getsalary());
        System.out.println("employee 2 details");
        System.out.println("First Name: "+emp2.getfirstName());
        System.out.println("Last Name: "+emp2.getlastName());
        System.out.println("Salary: "+emp2.getsalary());
    emp1.getraise();
    emp2.getraise();

    }

    }

