package exp;

import java.util.*;

class Date
{
    private  int month;
    private int day;
    private int year;
    Date(int day , int month ,int year)
    {
        this.day= day;
        this.month= month;
        this.year= year;
    }
    public void  setMonth() {
        this.month= month;
    }

    public void setDay() {
         this.day=day;
    }

    public void  setYear() {
        this.year=year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    
}

class Empl 
{
    private String name;
    private String  emp_id;
    private Date birthDate;
    private double salary;

    Empl(String name , String emp_id , Date birthDate ,double salary)
    {
        this.name= name;
        this.emp_id=emp_id;
        this.birthDate= birthDate;
        this.salary =salary;
    }
     void setName(String name)
     {
        this.name= name;

     }
     void setSalary(double salary)
     {
        this.salary=salary;
     }
     void setEmpid(String emp_id)
     {
        this.emp_id= emp_id;
     }
     void setBirthdate(Date  birthDate)
     {
        this.birthDate= birthDate;
     }
      String getName()
     {
        return  name;
     }
     String getEmpid()
     {
        return emp_id;
     }
     Date getBirthdate()
     {
        return birthDate;
     }
     double getSalary()
     {
        return salary;
     }
    
     public void  getPayRoll( )
     {
        Date now =  new Date(1, 4, 2023);


        if(now.getMonth()== birthDate.getMonth() )
        {
            salary =salary+5000;
            System.out.println(salary);
        }
       System.out.println(salary);
     }





    }
public class Payroll {
    public static void main(String[] args) {
     Empl emp = new Empl("harsh", "4566", new Date(18, 4, 2001), 3000);
     emp.getPayRoll();
     Empl[] array  = new Empl[2];
     Scanner  sc = new Scanner(System.in);

     for( int i=0; i<2;i++)
     {
        System.out.println("enter nme");
       String name = sc.next();
       System.out.println("enter emp id");

       String emp_id = sc.next();
       System.out.println(" enter salary");
       double salary= sc.nextDouble();
       System.out.println("enter birth day");
       int day= sc.nextInt();
       System.out.println("enter month");
       int month = sc.nextInt();
       System.out.println("enter year");
       int year = sc.nextInt();
       array[i]= new Empl( name , emp_id ,new Date(day , month ,year), salary);

     }
      for( Empl i : array)
      {
        i.getPayRoll( );
        System.out.println( i.getName());
        
      }


    }
    
}


//
/*
 addWindowListner({ new WindowAdapter()
    public void WindowClosing(WindowEvent e)
    {
        dispose();
    }


 });
 */