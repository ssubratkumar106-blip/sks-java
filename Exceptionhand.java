class A {
    public static void main(String a[]) {
    try {
        int n = 10/0;
        System.out.println(n);
    }    
    catch(ArithmeticException e){
        System.out.println("Zero division error");
    }
    
    }
    }