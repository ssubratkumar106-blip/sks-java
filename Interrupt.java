class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Working... " + i);
                Thread.sleep(1000);  // Thread goes to sleep
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }
}


public class InterruptExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        try {
            // Thread.sleep(3000);  // Main thread waits 3 sec
        } catch (Exception e) {}

        t.interrupt();  // Interrupting the child thread
        System.out.println("Main thread sent interrupt signal.");
    }
}