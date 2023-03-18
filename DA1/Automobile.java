package DA1;

import java.time.Period;
import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Automobile { 
    private String  modelNo;
    private String  brandName;
    private LocalDate manufactDate;
    private  String[] accessories;
    
    public Automobile(String modelNo , String brandName ,LocalDate manufLocalDate ,String[] accessories)
    {
        this.modelNo=modelNo;
        this.brandName=brandName;
        this.manufactDate=manufactDate;
        this.accessories=accessories;
    }
    public void  setmodelNo( String modelNo)
    {
      this.modelNo=modelNo;
    }
    public void setBrandName(String brandName)
    {
        this.brandName=brandName;
    }
    public void setManufactDate(LocalDate manufactDate)
    {
        this.manufactDate=manufactDate;
    } 
    public void  setAccessories( String[] accessories)
    {
        this.accessories=accessories;
    }
    public int getOld()
    {
       LocalDate cuDate = LocalDate.now();
       Period old= Period.between(cuDate ,manufactDate);
       return old.getYears();
    }

    public String getModelNo()
    {
        return modelNo;
    }
    public String getBrandName()
    {
        return brandName;
    }
    public LocalDate getManufactDate()
    {
        return manufactDate;
    }


}
class Test
{
    public static void main(String[] args)throws IOException {
        InputStreamReader is= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        //creating array for automobiles
       Automobile[] auto = new Automobile[3];


       for(int i=0 ;i<auto.length ;i++)
       {
        System.out.println("Enter model No:");
        String  modelNo =br.readLine();
        System.out.println("Enter Brand name:");
        String brandName = br.readLine();
        System.out.println("Enter manufacturing date:");
        LocalDate manufactDate = LocalDate.parse(br.readLine());

         System.out.println("Storing list of accessories");
            String[] accessories = new String[3];
           for(int j=0 ;j<accessories.length ;j++ )
           {
              System.out.println("enter accessories" +j+1);
              accessories[j]=br.readLine();
           }
           auto[i]=  new Automobile(modelNo ,brandName ,manufactDate ,accessories);



       }

       System.out.println("Detail Devil");
       System.out.println(String.format("%-10s%-10s%-10s" ,"MODELNO","BRAND NAME" ,"car age"));
       for(Automobile i : auto)
       {
        System.out.println(String.format("%-10s%-10s%-10d", i.getModelNo() ,i.getBrandName(),i.getOld()));
        
       }
    }
}
