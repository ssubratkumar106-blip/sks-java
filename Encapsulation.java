class Person {
    private String name;
    private int age;
    public void setName(String n) {
        name = n;
    }
    public void setAge(int a) {
        age = a;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Subrat");
        p.setAge(18);
        System.out.println("Name : " + p.getName());
        System.out.println("Age : " + p.getAge());
        
    }
}