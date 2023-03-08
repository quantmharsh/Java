 package abstractInterface;
public class Test {
  public void ready() {
    System.out.println("welcome");
  }
}

abstract class shape {
  abstract void intro();

  abstract void area(int n1, int n2);

}

class square extends shape {
  public void intro() {
    System.out.println("this is square");
  }

  public void area(int n1, int n2) {
    System.out.println("Area of square=" + (n1 * n2));
  }

}

class rectangle extends square {
  public void area(int l, int b) {
    System.out.println("Area of rectangle=" + (l * b));
  }
}

class rectangle1 extends shape {
  public void intro() {
    System.out.println("this is rectangle 1");
  }

  public void area(int l, int b) {
    System.out.println("Area of rectangle=" + (l * b));
  }
}

class areaCheck {
  public static void main(String[] args) {
    Test t = new Test();
    t.ready();
    square s = new square();
    s.area(4, 4);
    rectangle r = new rectangle();
    r.area(5, 3);
    rectangle1 r1 = new rectangle1();
    r1.intro();
    r1.area(6, 5);

  }

}
