
class Customer {
    int amount = 10000;
    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw");
        if(this.amount < amount) {
            System.out.println("less balance, waiting for deposite");
            try{
                wait();
            } catch(Exception e) {
                
            }
        }
        this.amount = amount;
        System.out.println("Withdraw completed");
    }
    synchronized void deposite(int amount) {
        System.out.println("going to deposite");
        this.amount += amount;
        System.out.println("Deposite complete.");
        notify();
    }
}
class Test {
    public static void main(String a[]) {
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposite(10000);
            }
        }.start();
    }
}