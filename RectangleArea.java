class Rect{

    double length;
    double bredth;
    
    void insert(double l, double b){
        l = length;
        b = bredth;
    }
    void display(){
    System.out.println("Area is : " + (length*bredth));
    }
}
public class M {
    public static void main(String []a) {
        Rect r = new Rect();
        r.insert(2.0,3.0);
        r.display();
    }
}