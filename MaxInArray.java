public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {25, 10, 56, 78, 12, 5};

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum value in array: " + max);
    }
}
