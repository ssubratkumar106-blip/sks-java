class Nest {
    int m,n;
    Nest(int x, int y) {
        m = x;
        n = y;
    }
    int largest() {
        if(m>=n) {
            return(m);
        } else{
            return(n);
        }
    }
    void display() {
        int large = largest();
        System.out.println("Largest value = " + large);
    }
    public static void main(String a[]) {
        Nest n = new Nest(50, 40);
        n.display();
    }
}