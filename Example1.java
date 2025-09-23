class Example1 {
    static class Car {
        String color;
        int speed;

        void drive() {
            System.out.println("The " + color + " car is driving at " + speed + " km/h");
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.speed = 100;
        car1.drive();
    }
}
