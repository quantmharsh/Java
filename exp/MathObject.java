package exp;
import java.util.*;

import java.util.Arrays;

public interface MathObject {
    MathObject add(MathObject obj);

    MathObject multiply(MathObject obj);
}
 //HARSH KUMAR SRIVASTAVA 
 //22MCA0310
class Scaler implements MathObject {  // [1, 2, 3] * [1, 2, 3] =
    private double value;

    Scaler(double value) {
        this.value = value;
    }

    double getValue() {
        return value;
    }

    @Override
    public MathObject add(MathObject obj) {
        // Scaler s = (Scaler) obj;    // int num = (int) "10"   A a; B inhereit B b                A b;
        // //vector k liye return type chaiye ki mathobject type return kre
        
        // return new Scaler(value + s.getValue());  
        return null;
    }

    @Override
    public MathObject multiply(MathObject obj) {
        // Scaler s = (Scaler) obj;
        // return new Scaler(value * s.getValue());
        return null;
    }
}

class Vector implements MathObject {
    private double[] items;     //array of scaler values

    Vector(double[] items) {
        this.items = items;
    }

    int getSize() {
        return items.length;
    }

    double getItem(int index) throws IndexOutOfBoundsException {
        return items[index];
    }

    void printVector(){
        System.out.println(Arrays.toString(items));
    }

    @Override
     //HARSH KUMAR SRIVASTAVA 
 //22MCA0310
    public MathObject add(MathObject obj) {
        Vector v = (Vector) obj;
        if (getSize() != v.getSize()) {
            throw new IllegalArgumentException("Vectors should have same size before performing arithmetic operation");
        }

        double[] sumVector = new double[getSize()];

        for (int i = 0; i < getSize(); i++) {
            sumVector[i] = items[i] + v.getItem(i);
        }

        return new Vector(sumVector);
    }

    @Override 
    public MathObject multiply(MathObject obj) {
        Vector v = (Vector) obj;
        if (getSize() != v.getSize()) {
            throw new IllegalArgumentException("Vectors should have same size before performing arithmetic operation");
        }

        double result = 0;
        for (int i = 0; i < getSize(); i++) 
        {
            result += items[i] * v.getItem(i);
        }
        System.out.println(" multiplication ==="+result);
        return new Scaler(result); // 13
    }
}


class Matrix implements MathObject {
     //HARSH KUMAR SRIVASTAVA 
 //22MCA0310
    private double[][] items;

    Matrix(double[][] items) {
        this.items = items;
    }

    int getNumRows() {
        return items.length;
    }

    int getNumColumns() {
        return items[0].length;
    }

    double getItem(int row, int col) {
        return items[row][col];
    }

    void printMatrix(){
        System.out.println(Arrays.toString(items));
    }

    @Override
    public MathObject add(MathObject obj) {
        Matrix m = (Matrix) obj;
        if (getNumRows() != m.getNumRows() && getNumColumns() != m.getNumColumns()) {
            throw new IllegalArgumentException("Exception: row size should be equal to column size");
        }

        double[][] sumMatrix = new double[getNumRows()][getNumColumns()];

        for (int i = 0; i < getNumRows(); i++) {
            for (int j = 0; j < getNumColumns(); j++) {
                sumMatrix[i][j] = items[i][j] + m.getItem(i, j);
            }
        }
        return new Matrix(sumMatrix);
    }

    @Override
    public MathObject multiply(MathObject obj) {
        Matrix m = (Matrix) obj;

        if (getNumColumns() != m.getNumRows()) {
            throw new IllegalArgumentException(
                    " Exception: no of columns and no. of rows in first and second matrix should be same");
        }

        double[][] result = new double[getNumRows()][m.getNumColumns()];
        for (int i = 0; i < getNumRows(); i++) {
            for (int j = 0; j < m.getNumColumns(); j++) {
                double sum = 0;
                for (int k = 0; k < getNumColumns(); k++) {
                    sum += getItem(i, j) * m.getItem(k, j);
                }
                result[i][j] = sum;
            }
        }
        return new Matrix(result);
    }
}


 class MathDriver  {
    public static void main(String[] args) {
         //HARSH KUMAR SRIVASTAVA 
 //22MCA0310
        Scanner sc= new Scanner(System.in);
        System.out.print(" define the size of vector ");
        int size = sc.nextInt();
        double arr1[] = new double[size];
        double arr2[] = new double[size];
        System.out.println(" insert elements in first vector");
        for(int i = 0; i < arr1.length; i++){
        arr1[i] = sc.nextDouble();
        }
        System.out.println("insert elements in second vector");
        for(int i = 0; i < arr1.length; i++){
        arr2[i] = sc.nextDouble();
        }

        Vector v1 = new Vector(arr1);
        Vector v2 = new Vector(arr2); 

        Vector v3 = (Vector) v1.add(v2);
        System.out.println("SUM of vectors");
        for (int i = 0; i < v3.getSize(); i++) {
            System.out.print(v3.getItem(i) + " ");
            }
            


         System.out.println();
        Scaler product = (Scaler) v1.multiply(v2);
        System.out.println("MULTIPLICATION of two vector=" +product.getValue());
        // System.out.println(sum.getValue());

        // v3.printVector();
        
        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        double m1[][] = new double[rows][columns];
        double m2[][] = new double[rows][columns];
        System.out.println("Enter items for first matrix");
        for(int i = 0; i < m1.length; i++){
        for(int j = 0; j < m1[i].length; j++){
        m1[i][j] = sc.nextDouble();
        }
        }
        System.out.println("Enter items for second matrix");
        for(int i = 0; i < m2.length; i++){
        for(int j = 0; j < m2[i].length; j++){
        m2[i][j] = sc.nextDouble();
        }
        }
        Matrix matrix1 = (Matrix) new Matrix(m1);
        Matrix matrix2 = (Matrix) new Matrix(m2);

         Matrix Sum =(Matrix) matrix1.add(matrix2);
      
        System.out.println("sum of matrix");
        for(int i=0;i<Sum.getNumRows();i++)
        {
            for(int j=0;j<Sum.getNumColumns();j++)
            {
               System.out.print(Sum.getItem(i,j)+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of two matrix");
         Matrix mul =(Matrix)matrix1.multiply(matrix2);
         for(int i=0;i<mul.getNumRows();i++)
         {
             for(int j=0;j<mul.getNumColumns();j++)
             {
                System.out.print(mul.getItem(i,j)+" ");
             }
             System.out.println();
         }

       
        
    }
}


