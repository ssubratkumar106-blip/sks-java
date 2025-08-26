public class Person {
    private String name; 
    private int age;     

    public String getName() {
        return name;
    }

     
    public void setName(String name) {
        this.name = name;
    }

         public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        if (age > 0) { 
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}





class Person {
//     private String name;
//     private int age;

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setName(String newName) {
//         name = newName;
//     }

//     public void setAge(int newAge) {
//         age = newAge;
//     }
// }

// class M4 {
//     public static void main(String[] args) {
//         Person p = new Person();
//         p.setName("sks");
//         p.setAge(20);

//         System.out.println("Name : " + p.getName());
//         System.out.println("Age : " + p.getAge());
//     }
// }
