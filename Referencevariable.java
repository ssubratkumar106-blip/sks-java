class Student{
    int r;
    double mark;
    String name;
    
    void display(){
        System.out.println("Name : " + name);
        System.out.println("CGPA : " + mark);
        System.out.println("Regd.no : " + r);
    }
}
public class M7 {
    public static void main(String[] a){
        Student s = new Student();
        s.r = 001;
        s.mark = 9.3;
        s.name = "SKS";
        
        s.display();
    }
}