package exp;
import  java.util.*;
import java.util.Scanner;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void  setId()
    {
        this.id=id;
    }
    public int getId() {
        return id;
    }

    // @Override
    // public String toString() {
    //     return getClass().getName() + ": " + getName() + " (ID: " + getId() + ")";
    // }

    public abstract double earnings();
}
public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String name, int id,
                       double wage, int pieces) {
        super(name ,id);
        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return pieces * wage;
    }


}
class Main{
    public static void main(String[] args) {
        // PieceWorker pi= new PieceWorker("harsh", 111, 40, 12);
        // System.out.println( pi.earnings());
        Scanner sc= new Scanner(System.in);

        PieceWorker[] pieceworker = new PieceWorker[3];
        //PUSHING VLALUES IN ARRAY
        for( int i=0;i<pieceworker.length ;i++)
        {
           System.out.println("enter name of " +(i+1) +" employee");
           String name = sc.next();
           System.out.println("enter id no");
           int id= sc.nextInt();
           System.out.println("enter  wage amount");
           Double wage= sc.nextDouble();
           System.out.println("enter no of pieces produced");
           int pieces =sc.nextInt();
           pieceworker[i]= new PieceWorker(name, id,wage, pieces);
        }

        System.out.println(" Employesss information");
        for(PieceWorker pi : pieceworker)
        {
            System.out.println("NAME: "+ pi.getName());
            System.out.println("ID: "+ pi.getId());
            System.out.println("WAGES: "+ pi.getWage());
            System.out.println("PIECES: "+ pi.getPieces());
            System.out.println("EARNING: "+ pi.earnings());


        }

    }
}
