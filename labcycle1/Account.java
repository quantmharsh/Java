package labcycle1;

public class Account
{

    private String accountNo ;
    private double accountBalance;
    private String name;
    public  Account(String accountNo , double accountBalance ,String name)
    {
        this.accountNo=accountNo;
        this.accountBalance=accountBalance;
        this.name=name;
    }



    public    void  setaccountno(String accountNo)
    {
              this.accountNo =accountNo;
          
    }

    public void  setaccountBalance(double accountBalance)
    {
         this.accountBalance=accountBalance;
    }
    public  void setname(String name)
    {
          this.name=name;
    }
    public String  getaccountNo()
    {
         return accountNo;
    }

    public  double getaccountBalance()
    {
        return  accountBalance;
    }
    public String getname(){
        return name;
    }
    public double deposit( double amount)
    {
        return accountBalance =accountBalance+amount;
    }
    public void withdraw(double amount)
    {
        if(amount > accountBalance)
        { 
               System.out.println("insufficient balance");
              
        }
        
         accountBalance =accountBalance-amount;
        
    }
    public double   ComputeInterest()
    {
           double interest;
           return interest =accountBalance*0.006;


    }
    public void  accountDetails()
    {
        System.out.println("name :" + getname());
        System.out.println("Account no :"+ getaccountNo());
        System.out.println("Balance"+getaccountBalance());
    }


    public static void main (String[] args)
    { 
            Account acc1 =new Account("3493435232",133454,"HARSH");
            acc1.accountDetails();
                  System.out.println( "INTEREST =" +acc1.ComputeInterest());
            acc1.deposit(10000);
            acc1.accountDetails();
            
            
        

    }
} 