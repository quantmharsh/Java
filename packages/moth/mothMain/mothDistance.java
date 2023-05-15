package packages.moth.mothMain;
import java.util.*;
import java.math.*;

public class mothDistance {
    private int x;
    private int y;
    private double  distance;
     public mothDistance(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void setX(int x)
    {
        this.x=x;

    }
    void setY(int y )
    {
        this.y=y;
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
     public  void calculateDistance()
      {
      double  distance= Math.sqrt(x*x +y*y);
      System.out.println("distance travelled from origin ="+distance);
      }
       public void  moveTowardsLight(int newx ,int newy)
      {
        x= (x+newx)/2;
        y=(y+newy)/2;
        System.out.println(" new coordinates x,y="+x + " "+y);

      }
      @Override
      public  String toString() {
        return  "("+ x +","+y+")";
      }
    
}
