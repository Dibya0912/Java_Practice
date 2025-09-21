public class StringExample2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Programming";
        String result = s1.concat(" " + s2);
        System.out.println("Concatenated: " + result);
        System.out.println("Substring: " + result.substring(5, 16));
    }
}
