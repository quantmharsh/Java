package modelQp;


import exceptionHandling.balanceException;
import labcycle1.A;
import java.util.ArrayList;
import java.util.List;

class Account
{
    private String  name;
    private String   accNo;
    private double  balance;
    Account(String name ,String accNo ,double balance)
    {
        this.name= name;
        this.accNo=accNo;
        this.balance= balance;

    }
    void setName(String name)
    {
        this.name= name;
    }
    void setAccno( String accNo)
    {
        this.accNo =accNo;

    }
    void setBalance(double balance)
    {
        this.balance=balance;

    }
    String  getName()
    {
        return name;
    }
    String getAccno()
    {
        return accNo;
    }
    double getBalance()
    {
        return balance;
    }




}
class savingAccounts extends Account
{
    private  double interest;
    savingAccounts( String name ,String accNo ,double balance ,double interest)
    {
        super(name, accNo, balance);
        this.interest=interest;
    }
     void setInterest( double interest)
     {
        this.interest =interest;
     }
      double getInterest()
     {
        System.out.println(" interest in rs" + interest);
        return interest;
     }
      double addInterest()
      {
        return getBalance()+getInterest();
      }


}
class currentAccounts extends Account
{
    private  double overDraftLimit;
    currentAccounts(String name ,String  accNo, double balance ,double overDraftLimit)
    {
        super(name ,accNo  ,balance);
        this.overDraftLimit =overDraftLimit;
    }
     void setOverDreaftLimit( double overDraftLimit)
     {
          this.overDraftLimit=overDraftLimit;
     }  
     double getOverDreaftLimit()
     {
       return overDraftLimit;
     }

}
class  bankAccount 
 {

    private ArrayList<Account> accList = new ArrayList<>();
    void addAccount(Account acc) {
      accList.add(acc);
        
    }
    void removeAccount(Account acc)

    {
        accList.remove(acc);
    }
    void update()
    {
        for(int i=0 ;i<accList.size() ;i++)
        {
           if(accList.get(i)instanceof savingAccounts)
           {
            ((savingAccounts)accList.get(i)).addInterest();
           }
           else if( accList.get(i)instanceof currentAccounts)
           { 
             if(((currentAccounts)accList.get(i)).getBalance()>((currentAccounts)accList.get(i)).getOverDreaftLimit())
             { 
                System.out.println("send aletter");

             }

           }
        }
    }

     
     

}

public class bankingSystem {
    public static void main(String[] args) {
        
        System.out.println(" welocome to programme/...");
         ArrayList<Account> accList= new ArrayList<>();
        
        savingAccounts sacc1 = new  savingAccounts (" harsh " ,"21415", 123456, 3000);
       accList.add(sacc1);
       savingAccounts sacc2 = new  savingAccounts (" haitrsh " ,"35415", 783456, 5680);
       accList.add(sacc2);
       currentAccounts cacc1 =new   currentAccounts(" deepak " ,"335634", 1884694, 89600);
       accList.add(cacc1);
       currentAccounts cacc2 = new   currentAccounts (" kush " ,"6626", 4647556, 8600);
       accList.add(cacc2);

    }
    
}
