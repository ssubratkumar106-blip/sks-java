import java.util.Scanner;
public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char c =sc.next().charAt(0);
        int ascii = (int) c;
        System.out.println("Ascii Value of the " + c + " is : " + ascii); 
    }
}