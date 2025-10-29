import java.io.*;

class Main {
    static void check(int a) throws ArithmeticException, IOException {
        if (a < 18) {
            throw new ArithmeticException("Error");
        } else {
            throw new IOException("Er1");
        }
    }

    public static void main(String[] args) {
        try {
            check(17);
        } catch (ArithmeticException e) {
            System.out.println("Error not found");
        } catch (IOException e) {
            System.out.println("IO Error caught");
        } finally {
            System.out.println("Try programiz.pro");
        }
    }
}