class Example2 {
    static class Student {
        String name;
        int age;

        Student(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println(name + " is " + age + " years old");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ankit", 20);
        Student s2 = new Student("Riya", 22);
        s1.display();
        s2.display();
    }
}
