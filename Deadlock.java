class DemoDaemon extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running...");
        } else {
            System.out.println("User thread is running...");
        }
    }

    public static void main(String[] args) {
        DemoDaemon t1 = new DemoDaemon();
        DemoDaemon t2 = new DemoDaemon();

        t1.setDaemon(true); // Must be set before start()

        t1.start(); // public class Testd {
    public static void main(String a[]) {
        final String r1 = "abc";
        final String r2 = "xyz";
        Thread t = new Thread() {
            public void run() {
                synchronized(r1){
                    System.out.println("T1: r1 locked");
                    try {
                        Thread.sleep(100);
                    } catch(Exception e) {
                        
                    }
                    synchronized(r2) {
                        System.out.println("T1 : r2 locked");
                    }
                }
            }
        };
        Thread t1 = new Thread() {
            public void run() {
                synchronized(r2){
                    System.out.println("T2: r2 locked");
                    try {
                        Thread.sleep(100);
                    } catch(Exception e) {
                        
                    }
                    synchronized(r1) {
                        System.out.println("T2 : r1 locked");
                    }
                }
            }
        };
        t.start();
        t1.start();
    }
}Daemon thread
        t2.start(); // User thread
    }
}