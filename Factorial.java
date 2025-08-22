public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long fact = 1;
        for(int  i =1; i<=n; i++) {
            fact*=i;
        }
        System.out.println(" Factorial of " + n + " is " + fact);
    }
    
}
// import java.util.Scanner;

// public class Factorial {
//     static int factorial(int n) {
//         if(n==1) return 1;
//         return n * factorial(n-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         System.out.println("Factorial of " + n + " is " + factorial(n));
//     }
// }