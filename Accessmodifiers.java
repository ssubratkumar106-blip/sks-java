
//private access modifier
class A {
    private int data = 40;
    private void msg() {
        System.out.println("Hello");
    }
}
public class B {
    public static void main(String a[]) {
        A obj = new A();
        obj.msg();
        System.out.println("ERR");
    }
}

class A {
    private a() {
        
    }
}
public class B {
    public static void main(String a[]) {
        A obj = new A();
        
    }
}

//default access modifier

package pack;
class A {
    void msg() {
        System.out.println("Hello");
    }
}
package pack1;
package pack.*;
public class B {
    public static void main(String args[]) {
        A obj = new A();
        obj.msg();
    }
}
//protected access modifier

package pack;
class A {
 protected void msg() {
        System.out.println("Hello");
    }
}
package pack1;
package pack.*;
class B extends A {
    public static void main(String args[]) {
        B obj = new B();
        obj.msg();
    }
}

//public access modifier


package pack;
class A {
 public void msg() {
        System.out.println("Hello");
    }
}
package pack1;
package pack.*;
class B {
    public static void main(String args[]) {
        A obj = new A();
        obj.msg();
    }
}