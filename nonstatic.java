class Student {
    int count = 0;
    Student() {
        count++;
        System.out.println(count);
    }
    public static void main(String a[]) {
        Student s1 = new Student();
        Student s2 = new Student();
    }
}