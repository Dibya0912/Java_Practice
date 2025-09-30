public class Animal {
    private void secret() {
        System.out.println("This is a private method.");
    }

    public void accessSecret() {
        secret(); // ✅ allowed inside same class
    }

    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.accessSecret();
    }
}
