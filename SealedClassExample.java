// SealedClassExample.java
sealed class Vehicle permits Car, Bike {
    void start() { System.out.println("Vehicle starting..."); }
}

final class Car extends Vehicle {
    void start() { System.out.println("Car starting with key ignition."); }
}

final class Bike extends Vehicle {
    void start() { System.out.println("Bike starting with self start."); }
}

public class SealedClassExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();
        bike.start();
    }
}
