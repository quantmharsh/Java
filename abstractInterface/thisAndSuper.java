package abstractInterface;

class parent{
    int a;
    parent(int a)
    {
        this.a=a;
    }
      void getSum()

    {
         System.out.println("square of a: "+(a*a));
    }
}
class child extends parent{
   
    //this will give error because cild constructor will call parent class constructor
    //by default it will call default constructor with 0 parameter
    //so to call constructor with one paramenter in parent class we use SUPER(C);
    // child( int b)
    // {
    // }
    child(int b)
    {
        super(b);
        System.out.println("square of b :"+(b*b));
        
    }
}
public class thisAndSuper {
  public static void main(String[] args) {
     parent p =new parent(12);
     p.getSum();
     child c=new child(13);
     
  }
    
}
