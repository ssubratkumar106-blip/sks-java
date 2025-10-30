class MException extends Exception {
    MException(String s) {
        super(s);
    }
}
class Main {
    public void check(double width) throws MException {
        if (width < 100) {
            throw new MException("not valid");
        } else {
            System.out.println("valid");
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        try {
            m.check(90);
        } catch (MException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Hello");
        }
    }
}