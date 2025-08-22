public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int lcm = (a+b) /gcd(a,b);
        System.out.println("LCM is : " + lcm);
    }
    static int gcd(int a, int b ) {
        while(b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}