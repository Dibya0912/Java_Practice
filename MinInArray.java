// MinInArray.java
public class MinInArray {
    public static void main(String[] args) {
        int[] numbers = {25, 10, 56, 78, 12, 5};

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Minimum value in array: " + min);
    }
}
