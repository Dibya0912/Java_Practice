class Example3 {
    static class Dog {
        String breed;

        void bark() {
            System.out.println(breed + " is barking");
        }
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.breed = "Labrador";

        Dog d2 = new Dog();
        d2.breed = "Pug";

        d1.bark();
        d2.bark();
    }
}
