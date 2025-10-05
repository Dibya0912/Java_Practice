
class Box<T, U> {
    private T first;
    private U second;

    public Box(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("First: " + first + " (" + first.getClass().getSimpleName() + ")");
        System.out.println("Second: " + second + " (" + second.getClass().getSimpleName() + ")");
    }
}

public class GenericsExample10 {
    public static void main(String[] args) {
        Box<Integer, String> box = new Box<>(101, "Java");
        box.display();
    }
}
