
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void show() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class GenericsExample3 {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<String, Double> pair2 = new Pair<>("PI", 3.14);

        pair1.show();
        pair2.show();
    }
}
