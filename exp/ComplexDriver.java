package exp;

import java.util.*;
import java.util.Scanner;

//Harsh kumar srivastava
//22MCA0310
class ComplexNumber {
  private double realprt;
  private double imgPrt;

  public ComplexNumber() {
    realprt = 0.0;
    imgPrt = 0.0;
  }

  //constructor of complexnumber
  public ComplexNumber(double realprt, double imgPrt) {
    this.realprt = realprt;
    this.imgPrt = imgPrt;
  }

  //adding two complex numbers
  public ComplexNumber add(ComplexNumber c) {
    double newRealPart = realprt + c.realprt;
    double newImaginaryPart = imgPrt + c.imgPrt;
    return new ComplexNumber(newRealPart, newImaginaryPart);
  }

  //Harsh kumar srivastava
  //22MCA0310

  //subtreacting two complex numbr
  public ComplexNumber subtract(ComplexNumber c) {
    double newRealPart = realprt - c.realprt;
    double newImaginaryPart = imgPrt - c.imgPrt;
    return new ComplexNumber(newRealPart, newImaginaryPart);
  }

  //Harsh kumar srivastava
  //22MCA0310

  //method to print complec no.
  public void print() {
    System.out.printf("%f + (%f)i\n", realprt, imgPrt);
  }
}

public class ComplexDriver {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Harsh kumar srivastava
    //22MCA0310

    System.out.print(" please enter real and imaginary part for first no. ");
    ComplexNumber c1 = new ComplexNumber(sc.nextDouble(), sc.nextDouble());

    System.out.print("please enter real and imaginary part for second no.");
    ComplexNumber c2 = new ComplexNumber(sc.nextDouble(), sc.nextDouble());
    // calls the add method of the c1 object and passes c2 as a parameter
    ComplexNumber sum = c1.add(c2);
    ComplexNumber sub = c1.subtract(c2);
    //printing two complex no which user has inputed
    System.out.println("Entered complex numbers are :->");
    c1.print();
    c2.print();
    //Harsh kumar srivastava
    //22MCA0310

    System.out.print("\n Sum of two complex number :=");
    sum.print();
    System.out.println("\nDifference of two complex number:= ");
    sub.print();
  }
}
