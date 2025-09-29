abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Most vehicles use petrol or diesel.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class AbstractionExample3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
        v1.fuelType();
    }
}
