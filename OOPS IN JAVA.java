class Car {
    String brand;
    int year;
    
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    void displayInfo() {
        System.out.println("Brand: " + brand + " , year: " + year);
    }
}
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2021);
        car1.displayInfo();
    }
}