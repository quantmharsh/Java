package Generics;
import java.util.*;

class MyGeneric<T1>  {
    int val;
    T1 t1;
     public MyGeneric(int val , T1 t1)
    {
       this.val=val;
       this.t1=t1;
    }
    public void setValue(int val)
    {
        this.val=val;
    }
    public int  getValue()
    {
        return val;
    }
    public void setT1(T1 t1)

    {
        this.t1=t1;
    }
    public T1 getT1()
    {
        return t1;
    }

    
}
   public class  main{
    public static void main(String[] args) {

        MyGeneric<String>  mg= new MyGeneric(123, "harsh");
        String str = mg.getT1();
        System.out.println(str);
    }
}
