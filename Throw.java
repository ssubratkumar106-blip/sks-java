public class A {
    void ct(int age, int width) {
        if (age < 18 && width < 50) {
            throw new ArithmeticException("Error");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.ct(17, 49); // This matches the method name
    }
}