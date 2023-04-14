package exceptionHandling;
public class IncomeTaxException extends Exception {
    IncomeTaxException(String expMessage) {
        super(expMessage);
       
    }
}

 class Tax {
    private int income;
    private String PAN; 

    Tax(int income, String PAN) {
        this.income = income;
        this.PAN = PAN;
    }

    double calcIncomeTax() {
        return 0.3 * income;
    }

    void payTax(double tax) throws IncomeTaxException {
        if (tax < calcIncomeTax())
            throw new IncomeTaxException("income tax is less than expected");
        System.out.println("Successfully paid tax");
    }

    public static void main(String[] args) {
        Tax t = new Tax(1000, "1244");
        try {
            t.payTax(20);
        } catch (IncomeTaxException e) {
             e.printStackTrace();
           
        } finally {
            System.out.println("exits...");
        }

        System.out.println("You should be paying: " + t.calcIncomeTax());
    }
}