public class Td extends Thread {
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread");
        } else {
            System.out.println("User Thread work");
        }
    }
    public static void main(String a[]){
        Td t1 = new Td();
        Td t2 = new Td();
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}