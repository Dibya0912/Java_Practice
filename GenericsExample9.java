
public class GenericsExample9 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Python", "C++"};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("\nString Array:");
        printArray(strArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
