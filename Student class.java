class Student {
    int id;
    String name;
    
    void display() {
        System.out.println("ID: " + id + " , name : " + name
        );
    
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Subrat";
        s1.display();
    }
}