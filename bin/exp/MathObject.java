
import java.util.Arrays;
import java.util.*;

public interface MathObject {
    MathObject add(MathObject obj);

    MathObject multiply(MathObject obj);
}

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
        Scaler s = (Scaler) obj;    // int num = (int) "10"   A a; B inhereit B b                A b;
        return new Scaler(value + s.getValue());  
    }

    @Override
    public MathObject multiply(MathObject obj) {
        Scaler s = (Scaler) obj;
        return new Scaler(value * s.getValue());
    }
}

class Vector implements MathObject {
    private double[] items;

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
    public MathObject add(MathObject obj) {
        Vector v = (Vector) obj;
        if (getSize() != v.getSize()) {
            throw new IllegalArgumentException("Vectors should be of same size");
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
            throw new IllegalArgumentException("Vectors should be of same size");
        }

        double result = 0;
        for (int i = 0; i < getSize(); i++) {
            result += items[i] * v.getItem(i);
        }

        return new Scaler(result); // 13
    }
}


class Matrix implements MathObject {
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
            throw new IllegalArgumentException("Row and Column size of matrix must be same");
        }

        double[][] sumMatrix = new double[getNumRows()][getNumColumns()];

        for (int i = 0; i < getNumRows(); i++) {
            for (int j = 0; j < getNumColumns(); j++) {
                sumMatrix[i][i] = items[i][j] + m.getItem(i, j);
            }
        }
        return new Matrix(sumMatrix);
    }

    @Override
    public MathObject multiply(MathObject obj) {
        Matrix m = (Matrix) obj;

        if (getNumColumns() != m.getNumRows()) {
            throw new IllegalArgumentException(
                    "Number of columns in first matrix must be equal to number of rows in second matrix");
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


class Main {
    public static void main(String[] args) {
        double[] arr1 = {1, 2, 3};
        double[] arr2 = {4, 5, 6};

        Vector v1 = new Vector(arr1);
        Vector v2 = new Vector(arr2); 

        Vector v3 = v1.add(v2);

        Scaler s1 = new Scaler(10);
        Scaler s2 = new Scaler(20);
        Scaler sum = s1.add(s2);
        // System.out.println(sum.getValue());

        v3.printVector();
        
        double m1[][] = {{1, 3, 4}, {3, 43, 3}};
        double m2[][] = {{1, 2,3}, {1, 3, 4}, {12,3 ,3}};

        Matrix matrix1 = new Matrix(m1);
        Matrix matrix2 = new Matrix(m2);

        matrix1.add(matrix2);
        matrix1.printMatrix();


        Vector v4 = v1.multiply(v2);
    }
}


// class A {
//     int value;

//     A sum(A obj){
//         A a = (A) obj;
//         return new A(value + a.value);
//     }   

//     public static void main(String[] args) {
//         A a1;
//         A a2;

//         a1.sum(a2);
//     }
// }