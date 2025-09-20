public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {25, 10, 56, 78, 12, 5};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
    
}
