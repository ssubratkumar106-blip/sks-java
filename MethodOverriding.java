//nethod Overriding (upcasting)

class Main {
    public static void main(String[] args) {
          Vehicle v = new Bike();//upcasting
          Vehicle v1 = new Car();
          v.run();
          v1.run();

    }
}
class Vehicle {
    void run() {
        System.out.println("Runn");
    }
}
class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike running....");
    }
}
class Car extends Vehicle {
      @Override
    void run() {
        System.out.println("Car is running......");
    }
}
 
 
// Bank statement 
public class Main {
    public static void main(String args[]) {
        Bank b;
        b=new SBI();
        b.intr();
        b=new HDFC();
        b.intr();
        b=new ICICI();
        b.intr();
    }
}
class Bank {
    void intr() {
        System.out.println(" intrest is :  " + 0.0);
    }
}
class SBI extends Bank {
    void intr() {
        System.out.println(" SBI interest is : " + 8.5);
    }
}
class HDFC extends Bank {
    void intr() {
        System.out.println("HDFC Intrest is : " + 11.5);
    }
}
class ICICI extends Bank {
    void intr() {
        System.out.println("ICICI intrest is : " + 8.9);
    }
}
//draw shapes
public class Main {
    public static void main(String args[]) {
        Shape s;
        s=new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Tringle();
        s.draw();
    }
    
}
class Shape{
    void draw() {
        System.out.println("Random");
    }
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
class Tringle extends Shape {
    void draw() {
        System.out.println("Tringle");
    }
}



