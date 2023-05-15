package packages.fan.fanInfo;

public class fanDetails {
    private  int speed;
    private boolean on =false ;
    private double radius=5;
    private String colour ="blue";

    fanDetails()
    {

    }
    public  fanDetails(int speed , boolean on, double radius, String colour)
    {
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.colour=colour;
    }
    void setSpeed(int speed)
    {
        this.speed=speed;
    }
    void setOn( boolean on)
    {
        this.on =on;
    }
    void setRadius( double radius)
    {
        this.radius=radius;
    }
    void setColour( String colour)
    {
        this.colour=colour;
    }
    int getSpeed()
    {
        return speed;

    }
    boolean getOn()
    {
        return on;
    }
    double getRadius()
    {
        return radius;
    }
    String getColour()
     {
        return colour;
     }

   
     public String toString() {
         // TODO Auto-generated method stub
         if(getOn())
         {
            System.out.println(" Fan details..");
           
            return getSpeed()+" "+getColour()+" "+getRadius();
         }
         else{
          
            return getColour()+" "+getRadius() +"fan is off";
         }
        
     }



    
}
