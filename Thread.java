class MyThread extends Thread {
    public void run() {
        System.out.print("Thread running :");
        for(int i =0;i<5; i++) {
            System.out.println(i);
            
        }
        
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
} 