class Vehicle {
    int speed = 50;

    void display() {
        System.out.println("Vehicle speed: " + speed);
    }
}

class Car extends Vehicle {
    int speed = 100;

    void display() {
        System.out.println("Car speed: " + speed);
        System.out.println("Vehicle speed from super: " + super.speed);
    }
}

public class InheritanceExample4 {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
