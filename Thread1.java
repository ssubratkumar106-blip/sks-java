
class A extends Thread {
    public void run() {
        for(int i =1;i<=5;i++) {
            System.out.println("Thread A : " + i );
        }
    }
}
class B extends Thread {
    public void run() {
        for(int i =1;i<=5;i++) {
            System.out.println("Thread B : " + i );
        }
    }
}
class C extends Thread {
    public void run() {
        for(int i =1;i<=5;i++) {
            System.out.println("Thread C : " + i );
        }
    }
}
class M {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.start();
        b.start();
        c.start();
    }
}