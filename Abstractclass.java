

public class Main {
    public static void main(String args[]) {
        Bank b;
        b=new SBI();
        b.intr();
        b=new PNB();
        b.intr();
       
    }
}
abstract class Bank {
  abstract void intr();
     
}
class SBI extends Bank {
    void intr() {
        System.out.println(" SBI interest is : " + 8.5+"%");
    }
}
class PNB extends Bank {
    void intr() {
        System.out.println("HDFC Intrest is : " + 11.5+"%");
    }
}

public class Main {
    public static void main(String args[]) {
        Shape s;
        s=new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
       
    }
    
}
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Rectangle");
}
}
class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}


