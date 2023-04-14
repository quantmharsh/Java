package DynamicMemoryDispatch;

public  class Shape {
    public void ShapeWelcome()
    {
        System.out.println("Welcome to shape class which is parent class of triangle");
    }
    public void OnlyShape()
    {
        System.out.println("only shape can access");
    }

  

}
class Square extends Shape{ 
      public void  ShapeWelcome()
      {
        System.out.println("Welcome to shape of  triangle");
      }
      public double area( double side)
      {
           double ar=side*side;
           System.out.println(ar);
           return ar;

      }
    public static void main(String[] args) {

        Shape s= new Square();
        s.ShapeWelcome();
        // s.area(12);   we cant do this
        // square sq= new Shape();   this is also not allowed
    Square sq= new Square();
        sq.area(12);
    
        s=sq;//super class reference recives sub class reference 
        // sq=s;//cmpile time error sub class reference cant take super class object
        sq =(Square)s; 
        s=(Square)sq;
        sq.OnlyShape();
        // Shape a =new Shape();
        // sq=(Square)a;
        
        // a.ShapeWelcome();

        








        
    }
}
