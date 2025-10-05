
class Calculator<T extends Number> {
    public double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }
}

public class GenericsExample11 {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        Calculator<Double> doubleCalc = new Calculator<>();

        System.out.println("Square of 5: " + intCalc.square(5));
        System.out.println("Square of 3.2: " + doubleCalc.square(3.2));
    }
}
