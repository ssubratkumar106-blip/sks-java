abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {return name; }
    public abstract void sound();
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void sound() {
        System.out.println(getName() + " Says : Woof Woof!");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void sound() {
        System.out.println(getName() + "Says : Meow!");
    }
}
public class OOPDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno");
        Cat cat = new Cat("Whiskers");

        Animal a1 = dog;
        Animal a2 = cat;

        a1.sound();
        a2.sound();
    }
}

    