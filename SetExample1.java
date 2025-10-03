import java.util.*;

public class SetExample1 {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Delhi"); // Duplicate ignored

        System.out.println("Cities: " + cities);
    }
}
