class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class PolymorphismExample9 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (int): " + calc.add(10, 20));
        System.out.println("Sum (double): " + calc.add(2.5, 3.5));
        System.out.println("Sum (3 ints): " + calc.add(1, 2, 3));
    }
}
