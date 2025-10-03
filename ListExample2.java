import java.util.*;

public class ListExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        System.out.println("Numbers in List:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
