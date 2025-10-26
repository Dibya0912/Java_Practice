import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitioningExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Partition the list of numbers into two groups: Even and Odd
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNumbers = partitionedNumbers.get(true);
        List<Integer> oddNumbers = partitionedNumbers.get(false);

        System.out.println("All Numbers: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
        
        // Output:
        // All Numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // Even Numbers: [2, 4, 6, 8, 10]
        // Odd Numbers: [1, 3, 5, 7, 9]
    }
}