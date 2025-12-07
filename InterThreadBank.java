public class BankInterThreadDemo {
    public static void main(String[] args) {

        Bank bank = new Bank();

        // Thread for Withdraw
        Thread withdrawThread = new Thread(() -> {
            bank.withdraw(1000);
        });

        // Thread for Deposit
        Thread depositThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // delay to simulate real banking
            } catch (InterruptedException e) {}
            bank.deposit(2000);
        });

        withdrawThread.start();
        depositThread.start();
    }
}
class Bank {
    private int balance = 0;

    // Withdraw method
    public synchronized void withdraw(int amount) {
        System.out.println("Trying to withdraw: " + amount);

        while (balance < amount) { // not enough balance → wait
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait(); // wait until deposit happens
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Current Balance: " + balance);
    }

    // Deposit method
    public synchronized void deposit(int amount) {
        System.out.println("Depositing: " + amount);
        balance += amount;
        System.out.println("Deposit successful | Current Balance: " + balance);

        notify(); // notify waiting withdraw thread
    }
}

