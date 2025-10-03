import java.util.*;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "C++");

        System.out.println("Programming Languages: " + languages);
    }
}
