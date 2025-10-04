
interface Container<T> {
    void add(T item);
    T get();
}

class StringContainer implements Container<String> {
    private String value;

    public void add(String item) {
        this.value = item;
    }

    public String get() {
        return value;
    }
}

public class GenericsExample6 {
    public static void main(String[] args) {
        Container<String> c = new StringContainer();
        c.add("Generic Interface Example");
        System.out.println(c.get());
    }
}
