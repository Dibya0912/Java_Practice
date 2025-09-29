abstract class Shape {
    abstract void draw(); 

    void info() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square");
    }
}

public class AbstractionExample1 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        s1.draw();
        s2.draw();
    }
}
