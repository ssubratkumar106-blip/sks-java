public class Palindrome {
    public static void main(String[] args) {
        int n= 121,rev = 0,temp = n;
        while(temp!=0) {
            int rem = temp%10;//reminder
            rev = rev*10 + rem;//reverse
            temp/=10;
        }
        if(n==rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
                if (str.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}