public class BitwiseOperations {
    public static void main(String[] args) {
        int x = 5, y = 3; // binary: 101, 011
        System.out.println("x & y: " + (x & y));   // 1
        System.out.println("x | y: " + (x | y));   // 7
        System.out.println("x ^ y: " + (x ^ y));   // 6
        System.out.println("x << 1: " + (x << 1)); // 10
        System.out.println("x >> 1: " + (x >> 1)); // 2
    }
}
