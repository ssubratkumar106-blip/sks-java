public class Main {
    public static void main(String args[]) {
        Employee emp[] = new Employee[5];
        emp[0] = new Employee(11, "sks", "cse");
        emp[1] = new Employee(12, "sdks", "me");
        emp[2] = new Employee(13, "skgs", "ee");
        emp[3] = new Employee(14, "sksa", "ece");
        emp[4] = new Employee(15, "skes", "ce");
        
        System.out.println("for cse");
        emp[0].display();
        System.out.println("for me");
        emp[1].display();
        System.out.println("for ee");
        emp[2].display();
        System.out.println("for ece");
        emp[3].display();
        System.out.println("for ce");
        emp[4].display();
    }
}
class Employee {
      int id;
      String name;
      String branch;
      
      Employee(int i, String s, String b) {
          id = i;
          name = s;
          branch = b;
      }
      void display() {
          System.out.println("ID IS : " + id + " NAME IS : " + name + " BRANCH IS : " + branch);
      }
}