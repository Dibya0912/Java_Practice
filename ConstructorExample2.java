
class Car {
    String brand;
    int year;

    Car(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println("Car: " + brand + ", Year: " + year);
    }
}

public class ConstructorExample2 {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 2023);
        c1.display();
    }
}
