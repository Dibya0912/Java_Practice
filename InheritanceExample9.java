class Vehicle {
    int speed = 50;

    void display() {
        System.out.println("Vehicle is running at speed: " + speed);
    }
}

class Car extends Vehicle {
    int speed = 120;

    void display() {
        System.out.println("Car is running at speed: " + speed);
        System.out.println("Vehicle speed using super: " + super.speed);
    }
}

public class InheritanceExample9 {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
