class Student {
    String name;
    float fee;
    int age;
    
    Student(String name, float fee, int age) {
        this.name = name;
        this.fee = fee;
        this.age = age;
    }
    
    void display() {
        System.out.println(name + " " + fee + " " + age);
    }
    public static void main(String args[]) {
        Student s1 = new Student("sks", 1200f, 18);
        Student s2 = new Student("ms", 2200f, 28);
        s1.display();
        s2.display();
    }
}