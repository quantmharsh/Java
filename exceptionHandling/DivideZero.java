package exceptionHandling;

import java.io.Console;

public class DivideZero {
    double divide(){
        Console c = System.console();
        int num1 = Integer.parseInt(c.readLine("Enter num1: "));
        int num2 = Integer.parseInt(c.readLine("Enter num2: "));
        double div = -1;
        try {
            div = num1 / num2;
        } catch(ArithmeticException e){
            System.out.println("Divide by zero not permitted");
        }
        return div;
    }

    public static void main(String[] args) {
        try {
            DivideZero d = new DivideZero();
            d.divide();
        } catch (NumberFormatException e){
            System.out.println("Cannot convert to number");
        }
        System.out.println("exiting....");
    }
}
