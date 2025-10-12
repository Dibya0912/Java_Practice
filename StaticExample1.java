class Student {
    int roll;
    static String college = "ABC College"; // shared by all objects

    Student(int r) {
        roll = r;
    }

    void display() {
        System.out.println("Roll: " + roll + ", College: " + college);
    }
}

public class StaticExample1 {
    public static void main(String[] args) {
        Student s1 = new Student(101);
        Student s2 = new Student(102);

        s1.display();
        s2.display();
    }
}
