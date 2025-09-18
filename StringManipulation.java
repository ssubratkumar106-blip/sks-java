class Str {
    public static void main(String args[]) {
        String s = "Hello india";
        String s1 = new String("HII");
        System.out.println(s+s1);
    }
}

class A {
    public static void main(String args[]) {
        char c[] = {'a','b', 'c'};
        String s = new String(c);
        System.out.println(s);
    }
}

class A {
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "India";
        char c[] = {'s','k','s'};
        String s = new String(c);
        System.out.println(s);
        System.out.println(s1+s2+s);
        System.out.println(s1.concat(s2));
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.charAt(3));
        System.out.println(s.length());
    }
}






