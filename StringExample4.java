public class StringExample4 {
    public static void main(String[] args) {
        String str = "   Java Rocks!   ";
        System.out.println("Before trim: '" + str + "'");
        System.out.println("After trim: '" + str.trim() + "'");
        System.out.println("Replace: " + str.replace("Java", "Kotlin"));
    }
}
