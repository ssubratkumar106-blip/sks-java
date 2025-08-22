class Car {
    String model;
    Car(String modelName) {
        model = modelName;
    }
    void display() {
        System.out.println("Model: " + model );
    }
    public static void main(String[] args) {
        Car c1 = new Car("BMW");
        c1.display();
    }
}