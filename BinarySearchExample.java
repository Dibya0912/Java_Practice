public class BinarySearchExample {
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;

        int result = binarySearch(numbers, key);

        if (result == -1)
            System.out.println("Element not found in the array.");
        else
            System.out.println("Element found at index: " + result);
    }
}
