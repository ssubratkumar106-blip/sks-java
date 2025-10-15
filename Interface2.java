
class C {
    public static void main(String a[]) {
        A aw;
        aw = new B();
        aw.m();
    }
}

interface A {
     void m();
}
class B implements A {
   public void m() {
        System.out.println("Hello");
    }
    
}
