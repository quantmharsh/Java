 package labcycle1;

 class Invoice{
  private String partNo;
  private String partDescription ;
  private int quantity;
  private double price;
  public Invoice(String partNo , String partDescription ,int quantity ,double price)
  {
    this.partNo=partNo;
    this.partDescription=partDescription;
    this.quantity=quantity;
    this.price=price;
  }

  public void setpartNo(String partNo)
  {
    this.partNo=partNo;
  }
  public void  setpartDescription(String partDescription)
  {
    this.partDescription=partDescription;
  }

  public void setquantity(int quantity )
  {
    if( quantity <=0)
    {
        this.quantity= 0;
    }
    this.quantity=quantity;
  }
  public void   setprice( double price)
  {
    if(price <=0)
    {
        this.price=0;
        
    }
    this.price=price;
  }
  public String getpartNo()
  {
    return  partNo;
  }
  public String getpartDescription()
  {
    return partDescription;
  }
  public  int getquantity()
  {
    if( quantity <=0)
    {
        return 0;
    }
    return quantity;

  }
  public double getprice()
  {
    if(price <=0)
    {
        return 0;
    }
    return price;
  }
  public    double getInvoiceAmount()
  {
    return quantity*price;
  }



 }
public class InvoiceTest {
    public static void main(String[] args)
    {
            Invoice inv1= new Invoice("1234", "wireless earphone", 2, 4999);
            System.out.println("part no"+inv1.getpartNo());
            System.out.println ("description"+inv1.getpartDescription());
            System.out.println("quantity"+inv1.getquantity());
            System.out.println("price"+inv1.getprice());
            System.out.println("Invoice amount"+inv1.getInvoiceAmount());
            inv1.setpartNo("9999");
            System.out.println("part no"+inv1.getpartNo());

            


    }
}
