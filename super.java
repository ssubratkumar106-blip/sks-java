//by an refference vriable;

class A {
    String color = "red";
}

class B extends A {
    String color = "blue";

    void printColors() {
        System.out.println(color);         // prints "blue"
        System.out.println(super.color);   // prints "red"
    }
}
public class C {
    public static void main(String[] args) {
        B obj = new B();
        obj.printColors();
    }
}
//by an method;
class A {
    String name = "sks";
    void display() {
        System.out.println(name);
    }
}
class B extends A {
    void show() {
        super.display();
    }
}
public class C {
    public static void main(String args[]) {
        B b = new B();
        b.show();
    }
}

//by constructor call
class A {
    A() {
        System.out.println("hii");
    }
    A(int n) {
        System.out.println(n);
    }
}
class B extends A {
    B() {
        super();
        System.out.println("Hello");
    }
    B(int n) {
        super(n);
        System.out.println("Namaskar");
    }
}
public class C {
    public static void main(String args[]) {
        B b = new B();
        B b1 = new B(5);
    }
}