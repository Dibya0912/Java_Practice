class MyList {
    private Object[] arr = new Object[5];
    private int size = 0;

    public void add(Object value) {
        arr[size++] = value;
    }

    public Object get(int index) {
        return arr[index];
    }

    public int size() {
        return size;
    }
}

public class CustomArrayListExample {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
