import java.util.*;

public class LambdaStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Rahul", "Priya", "Sneha", "Arjun");

        System.out.println("Names starting with 'A':");
        names.stream()
             .filter(n -> n.startsWith("A"))
             .forEach(System.out::println);
    }
}
