class Box {
    double width, height, depth;
    int Bn;
    Box(double w, double h, double d, int n) {
        width = w;
        height = h;
        depth = d;
        Bn = n;
    }
    Box() {
        width = height = depth = 0;
    }
    Box(int n) {
        this();
        Bn = n;
    }
    public static void main(String arg[]) {
        Box b1 = new Box(1);
        System.out.println(b1.Bn);
    }
}