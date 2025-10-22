// RecordExample.java
public record RecordExample(String name, int age) {
    public String greet() {
        return "Hello, my name is " + name + " and I'm " + age + " years old.";
    }

    public static void main(String[] args) {
        RecordExample r = new RecordExample("Dibya", 22);
        System.out.println(r.greet());
        System.out.println("Name: " + r.name());
        System.out.println("Age: " + r.age());
    }
}
