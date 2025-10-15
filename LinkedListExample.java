import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ravi");
        names.add("Amit");
        names.add("Priya");

        System.out.println("Initial List: " + names);

        names.addFirst("John");
        names.addLast("Sneha");

        System.out.println("After adding elements: " + names);

        names.remove(2);
        System.out.println("After removal: " + names);

        System.out.println("First Element: " + names.getFirst());
        System.out.println("Last Element: " + names.getLast());
    }
}
