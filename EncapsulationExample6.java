
class Car {
    private String brand;
    private int speed;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed! Must be between 0-200.");
        }
    }
}

public class EncapsulationExample6 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("Tesla");
        c.setSpeed(150);

        System.out.println("Car Brand: " + c.getBrand());
        System.out.println("Car Speed: " + c.getSpeed());

        c.setSpeed(300); // invalid
    }
}
