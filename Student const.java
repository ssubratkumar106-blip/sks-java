class Student {
    int id;
    String name;
    
    Student(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(name + " " + id);
    }
    public static void main(String a[]) {
        Student s = new Student(111, "sks");
        s.display();
    }
}