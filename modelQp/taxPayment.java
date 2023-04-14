package modelQp;
import java.util.*;
public class taxPayment extends Exception {

      private double income;
      private String PAN;
      taxPayment(double income , String PAN)
      {
        this.income=income;
        this.PAN=PAN;
      }
      public double TaxToPay()
      {
        double tp= 0.3*income;
        return tp;
      }

      public void checkTax()
      {
             
      }
}
class Main{
    public static void main(String[] args) {

        
    }
}
