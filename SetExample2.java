import java.util.*;

public class SetExample2 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        System.out.println("Unique Numbers: " + numbers);
    }
}
