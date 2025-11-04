// Define the Car class
public class Car {
    String color;
    int year;

    // Constructor to initialize the object
    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    // Method
    public void displayInfo() {
        System.out.println("This is a " + color + " car from " + year + ".");
    }

    // main method to create and use Car objects
    public static void main(String[] args) {
        // Create an instance (object) of the Car class
        Car myCar = new Car("Red", 2023);
        Car anotherCar = new Car("Blue", 2021);

        // Call the object's method
        myCar.displayInfo();
        anotherCar.displayInfo();
    }
}