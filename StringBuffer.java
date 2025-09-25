public class A {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("India");
        System.out.println(sb);
    }
}
public class A {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.reverse();
        System.out.println(sb);
    }
}
public class A {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(1,"java");
        System.out.println(sb);
    }
}
public class A {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1,3);
        System.out.println(sb);
    }
}
public class A {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1,3,"java");
        System.out.println(sb);
    }
}
public class A {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        System.out.println(sb.capacity());
        sb.append("java is best");
        System.out.println(sb.capacity());
        sb.ensureCapacity(33);
        // System.out.println(sb.capacity());
        sb.ensureCapacity(35);
        System.out.println(sb.capacity());
    }
}