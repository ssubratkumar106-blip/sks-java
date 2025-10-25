public class A {
    public static void main(String args[]) {
        int n, n2;
        int[] n3; // Correct array declaration

        try {
            n = 10 / 0; // This will throw ArithmeticException
            System.out.println(n);

            n3 = new int[]{1, 2, 3, 4, 5}; // Correct array initialization
            System.out.println(n3[3]); // Accessing valid index
        } catch (ArithmeticException e) {
            System.out.println("Errorrrrrr");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Err");
        }
    }
}