class Outer {
    private int n = 50;
    class Inner {
        void msg() {
            System.out.println("Value of data is : " + n);
        }
    }
    public static void main(String args[]) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.msg();
    }
}