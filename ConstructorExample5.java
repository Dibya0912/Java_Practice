
class Laptop {
    String brand;
    int ram;

    Laptop(String brand, int ram) {
        this.brand = brand; 
        this.ram = ram;
    }

    void display() {
        System.out.println("Laptop: " + brand + ", RAM: " + ram + "GB");
    }
}

public class ConstructorExample5 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP", 16);
        l1.display();
    }
}
