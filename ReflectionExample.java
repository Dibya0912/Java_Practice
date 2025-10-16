class Car {
    private String model = "Tesla";
    public void drive() { System.out.println("Driving " + model); }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("Car");
        Object obj = c.getDeclaredConstructor().newInstance();
        var field = c.getDeclaredField("model");
        field.setAccessible(true);
        field.set(obj, "BMW");
        c.getMethod("drive").invoke(obj);
    }
}
