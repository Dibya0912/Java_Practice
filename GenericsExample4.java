
class Calculator<T extends Number> {
    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

public class GenericsExample4 {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println("Sum (Integer): " + intCalc.add(10, 20));

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println("Sum (Double): " + doubleCalc.add(5.5, 2.3));
    }
}
