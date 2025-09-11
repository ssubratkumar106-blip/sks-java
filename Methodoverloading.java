//method overloading argument
class Main {
    public static void main(String[] args) {
      A a = new A();
      a.add(1,2);
      a.add(1,2,3);
    }
}
class A {
    void add(int a, int b) {
        System.out.println(a+b);
        
    }
    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}
//method overloading(dtype)
class Main {
    public static void main(String[] args) {
       A a = new A();
      
       
       System.out.println(a.add(1,2));
       System.out.println(a.add(1.5,3.4));
    }
}
class A {
    int add(int a, int b) {
     return a+b;
        
    }
    double add(double a, double b) {
      return a+b;
    }
}


//operator overloading
class Main {
    public static void main(String args[]) {
        A a=new A();
        a.show(1,2);
        a.show("Hello","Sks");
        
    }
}

class A {
    void show(int a, int b) {
        System.out.println(a+b);
    }
    void show(String s, String s1) {
        System.out.println(s+s1);
    }
}