public class reverse {
       public static void main(String[] args) {
           int n =1234 , temp = n, rev=0;
           while (temp!=0) {
               int rem = temp%10;
               rev = rev * 10 + rem;
               temp/=10;
           }
           System.out.println("Reverse of the number is : " + rev );
           
       }
}