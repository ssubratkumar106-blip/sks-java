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

        t1.start(); // Daemon thread
        t2.start(); // User thread
    }
}