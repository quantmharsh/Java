package exp;

import java.util.Scanner;

class Complex {
  private double realpart;
  private double imaginarypart;

  Complex() {
    realpart = 0.0;
    imaginarypart = 0.0;
  }

  Complex(double realpart, double imaginarypart) {
    this.realpart = realpart;
    this.imaginarypart = imaginarypart;
  }

  public Complex add(Complex c) {
    double newrealpart = realpart + c.realpart;
    double newimaginarypart = imaginarypart + c.imaginarypart;

    return new Complex(newrealpart, newimaginarypart);
  }

  public Complex sub(Complex c) {
    double newRealPart = realpart - c.realpart;
    double newImaginaryPart = imaginarypart - c.imaginarypart;
    return new Complex(newRealPart, newImaginaryPart);
  }

  public void print() {
    System.out.printf("%f + (%f)i\n", realpart, imaginarypart);
  }
}

public class test {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" enter real and imaginary part of first number");
    Complex c1 = new Complex(sc.nextDouble(), sc.nextDouble());
    System.out.print(" enter real and imaginary part of second number");
    Complex c2 = new Complex(sc.nextDouble(), sc.nextDouble());

    Complex Sum = c1.add(c2);

    Complex min = c1.sub(c2);
    Sum.print();
    min.print();
  }
}
