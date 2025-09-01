class S2 {
    void m(S2 obj) {
        System.out.println("Method is invoked");
    }
    void p() {
        m(this);
    }
    public static void main(String args[]) {
        S2 s = new S2();
        s.p();
    }
}