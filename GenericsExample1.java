
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericsExample1 {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String Value: " + strBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("Integer Value: " + intBox.get());
    }
}
