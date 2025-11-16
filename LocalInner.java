class Outer {
    void show() {
        class Inner {
            void msg() {
                System.out.println("Hello");
          }
        }
            Inner i = new Inner();
            i.msg();
        }
    public static void main(String a[]) {
        Outer o = new Outer();
        o.show();
    }
}