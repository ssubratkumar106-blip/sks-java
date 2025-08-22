class Student {
    Student() {
        System.out.println("Student obj created!");
    }
    void display() {
                System.out.println("welcome to java!");

    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}