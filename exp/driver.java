package exp;
import java.util.Scanner;
 interface mathObject 
 {
    mathObject add( mathObject obj);
    mathObject mul (mathObject obj);

 }
 class vector implements mathObject
 {
    private double[]  items;
    private double value;
    vector( double value)
    {
        this.value =value;
    }
    public double getvalue()
    {
        return value;
    }
    vector(double  items[])
    {
        this.items=items;
    }
    public double getitems( int index)
    {
        return items[index];
    }
    int  getSize()
    {
        return items.length;
    }
    
    public  mathObject add( mathObject obj)
    {
         vector v= (vector) obj;
         if(getSize() != v.getSize())
         {
            throw new  IllegalArgumentException(" not possible to add two vectorss");
         }
         double[] result = new  double[getSize()];
        
      
           for(int i=0;i<getSize();i++)
           {
            result[i]= items[i]+v.getitems(i);
           }
           return  new vector(result);
         

    }
    public mathObject mul(mathObject obj)
    {
        vector v=(vector)obj;
        if(getSize()!=v.getSize()) 
        {
            throw new  IllegalArgumentException(" size should be same ");
        }
        double result=0;
        for( int i=0;i<getSize();i++)
        {
            result=result+ items[i]*getitems(i);
        }
       return  new vector(result);


 }
}
class matrix implements mathObject
{
    private double items[][];
    matrix( double items[][])
    {
        this.items=items;
    }
    public int getRow()
    {
        return items.length;
    
    }
    public int getCol()
    {
        return items[0].length;
    }
    public double  getItem(int row , int col)
    {
        return items[row][col];
    }

    public mathObject add( mathObject obj)
    {
        matrix m= (matrix)obj;
        if(getRow()!=m.getRow() || getCol() !=m.getCol())
        {
            throw new IllegalArgumentException(" row s and col should be same");
        }

          double[][] result = new double[getRow()][getCol()];
          for( int i=0;i<getRow();i++)
          {
            for(int j=0;j<getCol();j++)
            {
                result[i][j]=result[i][j]+items[i][j]+m.getItem(i, j);
            }
          }
          return new matrix(result);

    }
    public mathObject mul(mathObject obj)
    {
        matrix m =(matrix)obj;
        double result[][] = new double[getRow()][getCol()];
        double sum =0;;
        for(int i=0 ;i<getRow();i++)
        {
            for(int j=0;j<getCol();j++)
            {
                for(int k=0;k<getCol();k++)
                {
                  sum=sum+getItem(i, j)+m.getItem(j, k);
                }
                result[i][j]=sum;
            }
        }
        return new matrix(result);
    }

}
public class  driver
{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter size of vector");
    int  size= sc.nextInt();
    double  arr1[] = new double[size];
      double  arr2[]= new double [size];

System.out.println(" enter element of first vector");
    for(int i=0;i<size;i++)
    {
         arr1[i]= sc.nextInt();
    }
    System.out.println(" enter element of second vector");
    for(int i=0;i<size;i++)
    {
         arr2[i]= sc.nextInt();
    }
     vector v1= new vector (arr1);
     vector v2= new vector(arr2);
      vector v3 =  (vector)v1.add(v2);
      System.out.println(" sum of vector");
      for (int i=0;i<v3.getSize();i++)
      {
        System.out.println(v3.getitems(i) + " ");
      }
      System.out.println();

      vector mul = (vector)v1.mul(v2);
   System.out.println(" product of two vector :"+mul.getvalue());



    
    System.out.println(" enter  number of rows and columns");
    int rows= sc.nextInt();
    int cols= sc.nextInt();
    double m1[][] = new double[rows][cols];
    double m2[][] = new double[rows][cols];

    System.out.println(" enter value for first matrix");
    for(int i=0;i< rows;i++)
    {
         for(int j=0;j<cols ;j++)
         {
            m1[i][j]= sc.nextInt();
         }
    }

    System.out.println(" enter value for second matrix");
    for(int i=0;i< rows;i++)
    {
         for(int j=0;j<cols ;j++)
         {
            m2[i][j]= sc.nextInt();
         }
    }

   matrix matrix1 = new matrix(m1);
   matrix matrix2= new matrix(m2);

    matrix matrix3 =  (matrix)(matrix1.add(matrix2));

     System.out.println("sum of two matrix");
     for( int i=0;i<matrix3.getRow() ;i++)
     {
        for(int j=0;j<matrix3.getCol();j++)
        {
            System.out.print(matrix3.getItem(i, j) +" ");
        }
        System.out.println();
     }

     matrix m3 =( matrix)matrix1.mul(matrix2);
     System.out.println(" multiplication of twomatrix");
     for (int i=0;i<m3.getRow();i++)
     {
        for(int j=0;j<m3.getCol();j++)
        {
            System.out.print(m3.getItem(i, j) +" ");
        }
        System.out.println();
     }
    


      

    }
}