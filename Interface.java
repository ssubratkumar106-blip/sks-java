interface Animal {
    void sound();
}
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat sound");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.sound();
        c.sound();
    }
}
