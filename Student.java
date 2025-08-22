class Student {
    String name;
    int roll;
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    void display() {
        System.out.println("Name:" + name + " , Roll: " + roll);
    }
}
public class StudentTable {
    public static void main(String[] args) {
        Student s1 = new Student("john", 1);
        Student s2 = new Student("Tommy", 2);
        s1.display();
        s2.display();
    }
}
