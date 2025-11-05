class Tx implements Runnable {
    public void run() {
        for(int i =1; i<=5; i++) {
            System.out.println("The Tx is  " + i);
            System.out.println("Tx is End");
        }
    }
}
class T {
    public static void main(String args[]) {
        Tx t = new Tx();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("end of thread");
    }
}