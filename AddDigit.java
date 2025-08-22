public class SumDigits {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        int temp = n;
        while(temp!=0){
            int digit = temp%10;//last digit or reminder
            sum += digit;//add digit to sum
            temp/=10;//Remove last digits from sum
        }
     System.out.println("Sum of digits is : " + sum);
    }
}