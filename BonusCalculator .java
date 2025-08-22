

public class BonusCalculator {
    public static void main(String[] args) {
        String sex = "Female";
        double balance = 50000;
        double bonus;
        if(sex.equalsIgnoreCase("Female")) {
            if(balance>50000) {
                bonus = 0.05 * balance;
            } else {
                bonus = 0.02 * balance;
            }
        } else {
            bonus = 0.02 * balance;
        }
        balance += bonus;
        System.out.println("final balance: " + balance);
    }
}