import java.util.*;
import java.util.stream.*;

public class StreamParallelExample {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(1, 1_000_000).boxed().toList();

        long start = System.currentTimeMillis();
        long count = numbers.stream().filter(n -> n % 2 == 0).count();
        long end = System.currentTimeMillis();
        System.out.println("Sequential Stream Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        long countParallel = numbers.parallelStream().filter(n -> n % 2 == 0).count();
        end = System.currentTimeMillis();
        System.out.println("Parallel Stream Time: " + (end - start) + " ms");
    }
}
