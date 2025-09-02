class Employee {
    int eid;
    String ename;
    static String comp = "TCS";
    Employee(int n, String s) {
        eid = n;
        ename = s;
    }
    void display() {
        System.out.println(+ eid + " " + ename + " " + comp);
    }
    public static void main(String a[]){
        Employee em = new Employee(111, "sks");
        Employee em2 = new Employee(112, "sRs");
        em.display();
        em2.display();
    }
}