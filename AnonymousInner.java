interface Animal {
    void sound();
}
public class Test {
    public static void main(String a[]) {
        Animal an = new Animal() {
            public void sound() {
                System.out.println("Dog......");
            }
        };
        an.sound();
    }
}