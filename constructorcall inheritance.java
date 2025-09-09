
class Base {
    Base() {
        System.out.println("hello");
    }
}
class Sub extends Base {
  Sub() {
      System.out.println("hii");
  }
}
public class A {
      public static void main(String args[]) {
        Sub s = new Sub();
    }
}