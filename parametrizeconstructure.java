class Student {
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;
        // System.out.println("Student obj created!");
    }
    void display() {
                System.out.println("name" + name + "age " + age);

    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Subrat", 18);
        s1.display();
    }
}