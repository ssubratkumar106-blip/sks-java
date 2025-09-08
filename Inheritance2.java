
//single inheritance
class Animal {
    void sound() {
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog bark");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Inherited from Animal
        d.bark();  // Defined in Dog
    }
}

//multilevel inheritance
class Animal {
    void sound() {
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog bark");
    }
}
class Cat extends Dog {
    void eat() {
        System.out.println("cat eating");
    }
}

public class A {
    public static void main(String a[]) {
        Cat c = new Cat();
        c.sound();
        c.bark();
        c.eat();
    }
}

//Heirarchical inheritance
class Animal {
    void sound() {
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog bark");
    }
}
class Cat extends Animal {
    void eat() {
        System.out.println("cat eating");
    }
}

public class A {
    public static void main(String a[]) {
        Cat c = new Cat();
        c.sound();
        //c.bark();//compile time error
        c.eat();
    }
}

//normal example

class Employee {
    String name;
    void set(String n) {
        n = name;
    }
    void display() {
        System.out.println(+name);
    }
}
class Soft extends Employee {
    public static void main(String args[]){
        void show() {
            System.out.println("hEllo java");
            Employee emp = new Employee();
            emp.set("sks");
            emp.display();
            emp.show();
        }
    }
}


//Error multiple

public class A {
    public static void main(String a[]) {
        Cat c = new Cat();
        c.sound();
        
    }
}
class Animal {
    void sound() {
        System.out.println("Animal sounds");
    }
}

class Dog  {
    void sound() {
        System.out.println("Dog bark");
    }
}
class Cat extends Animal,Dog{
    void eat() {
        System.out.println("cat eating");
    }
}
