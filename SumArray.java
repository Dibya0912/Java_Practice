public class SumArray {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        int sum = 0;

        // Loop through the array using an enhanced for-loop
        for (int number : numbers) {
            sum = sum + number; // or sum += number;
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}