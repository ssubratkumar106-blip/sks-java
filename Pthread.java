class Pthread1 extends Thread {
    public void run() {
        System.out.println("Child1 Thread");
    }
}
class Pthread2 extends Thread {
    public void run() {
        System.out.println("Child2 Thread");
    }
}
class Pthread3 extends Thread {
    public void run() {
        System.out.println("Child3 Thread");
    }
}
class Pthread {
    public static void main(String[] args) {
        Pthread1 p1 = new Pthread1();
        p1.setPriority(1);
        Pthread2 p2 = new Pthread2();
        p2.setPriority(5);
        Pthread3 p3 = new Pthread3();
        p3.setPriority(10);
        p1.start();
        p2.start();
        p3.start();
        System.out.println("Thread 1 is : " + p1.getPriority());
        System.out.println("Thread 2 is : " + p2.getPriority());
        System.out.println("Thread 3 is : " + p3.getPriority());

    }
}