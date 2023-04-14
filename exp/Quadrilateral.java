package exp;
import  java.math.*;
import java.util.Random;
import java.util.Scanner;
class point{
    private int x;
    private int y;

    point(int x,int y)
    {
      this.x=x;
      this.y=y;
    }
    public void setx()
    {
        this.x=x;

    }
    public void sety()
    {
        this.y=y;
    }
    public int getx()
    {
         return x;
    }
    public int gety()
    {
        return y;
    }


}
public class Quadrilateral {
    private point point1;
    private point point2;
    private point point3;
    private point point4;
      public Quadrilateral(point point1 ,point point2,point point3,point point4)
     {
         this.point1=point1;
         this.point2=point2;
         this.point3=point3;
         this.point4=point4;
     }
     public void setpoint1( point point1)
     {
        this.point1=point1;
     }
     public void setpoint2( point point2)
     {
        this.point2=point2;
     }
     public void setpoint3(point point3)
     {
        this.point3=point3;
     }
     public void setpoint4(point point4)
     {
        this.point4=point1;
     }

     public point  getpoint1()
     {
        return point1;
     }
     public point  getpoint2()
     {
        return point2;
     }
     public point  getpoint3()
     {
        return point3;
     }
     public point  getpoint4()
     {
        return point4;
     }




}
class  Rectangle extends Quadrilateral
{
    Rectangle(point point1 ,point point2,point point3,point point4)
    {
        super(point1 ,point2 ,point3 ,point4);
    }
    public   int area()
    {
      int length =  Math.abs((getpoint1().getx() + getpoint1().gety()) - (getpoint2().getx() + getpoint2().gety()));
      int breadth = Math.abs(getpoint1().gety()-getpoint4().gety());
      int  ar=length*breadth;
      return ar;
    }
}
class  TestArea{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random  rand = new Random();
        Rectangle[]  rec =  new Rectangle[5];
        for(int i=0;i<rec.length;i++)
        {
         point point1 = new point(rand.nextInt(10) ,rand.nextInt(10));
         point point2= new point(rand.nextInt(10) ,rand.nextInt(10));
         point point3=new point(rand.nextInt(10) ,rand.nextInt(10));
         point point4 = new point(rand.nextInt(10) ,rand.nextInt(10));

          rec[i] = new Rectangle(point1, point2, point3, point4);
        }
         
           System.out.println("Area of rectangles are") ;
            int cnt=1;
           for( Rectangle  it : rec)
           {
             
               System.out.println("Area of rectangle " +cnt);
               System.out.println(it.area());
               cnt++;

           }


    }

}

