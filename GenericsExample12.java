// GenericsExample12.java
interface Container<T> {
    void add(T item);
    T get();
}

class StringContainer implements Container<String> {
    private String value;

    public void add(String item) {
        value = item;
    }

    public String get() {
        return value;
    }
}

public class GenericsExample12 {
    public static void main(String[] args) {
        StringContainer sc = new StringContainer();
        sc.add("Hello Generics!");
        System.out.println(sc.get());
    }
}
