package Generics;

class GenericSort<T extends  Comparable<T>>
{
    private T[] array;
    GenericSort( T[] array)
    {
        this.array=array;
    }
    public void sort()
    {
        int n = array.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0 ;j<n-i-1; j++)
            {
                if(array[j].compareTo(array[j+1])>0)
                {
                    //Swapping two numbers
                    T temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    
                }
            }
        }
    }
}

public class Generic {

    public static void main(String[] args) {
    Integer arr[]={12,3,67,35,6,1,24};
        GenericSort<Integer> intnum = new GenericSort<>(arr);
        for(int  i=0;i<arr.length;i++)
        {
            System.out.println(" ,"+arr[i]);
        }
        intnum.sort();
        System.out.println("after sorting");
        for(int  i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        //For float data type
    Float floatarr[]={1.432f,6.6f,2.1f,1.1f,86.3f,42.1f};
        GenericSort<Float> floatnum = new GenericSort<>(floatarr);
        for(int i=0;i<floatarr.length;i++)
        {
            System.out.println(floatarr[i]);
        }
        System.out.println("After sorting floating numbers");
        floatnum.sort();
        for(int i=0;i<floatarr.length;i++)
        {
            System.out.println(floatarr[i]);
        }


    }
    
}
