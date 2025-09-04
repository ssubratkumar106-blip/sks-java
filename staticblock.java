class A2 {
    static {
        System.out.println("Good morning sir");
    }

    A2(String s) {
        System.out.println("Hello this is Subrat");
    }

    A2() {
        this("default");
    }

    public static void main(String args[]) {
        A2 a = new A2();
    }
}
