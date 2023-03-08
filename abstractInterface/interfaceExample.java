package abstractInterface;
 
 interface bicycle {
    void speedup(int increment);
    void applyBreak(int decrement);
 }
 class avonCycle implements bicycle{
    int speed=30;
   void blowHorn()
   {
    System.out.println("pee  pee ");
   }
   public  void speedup(int increment)
   {
    
    System.out.println("Accelarating speed to"+(speed+increment));

   }
   public void applyBreak(int decrement)
   {
     System.out.println("Reducing speed to "+(speed-decrement));
   }

 }
public class interfaceExample  {
  



    
}  
class  Master{
public static void main(String[] args)
{
    //creating object of avonCycle
    avonCycle ac =new  avonCycle();
    ac.blowHorn();
    ac.speedup(40);
    ac.applyBreak(20);

}
}
