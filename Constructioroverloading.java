class Student {
    int id;
    String name;
    int mark;
    
    Student(int i, String n) {
        id = i;
        name = n;
    }
    Student(int i, String n, int m) {
        id = i;
        name = n;
        mark = m;
    }
    
    void display() {
        System.out.println(name + " " + id + " " + mark);
    }
    public static void main(String a[]) {
        Student s = new Student(111, "sks");
        Student s1 = new Student(111, "sks", 18);
        s.display();
        s1.display();
    }
}