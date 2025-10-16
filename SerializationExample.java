import java.io.*;

class Student implements Serializable {
    int id; String name;
    Student(int id, String name) { this.id = id; this.name = name; }
}

public class SerializationExample {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(101, "Dibya");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
        oos.writeObject(s1);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
        Student s2 = (Student) ois.readObject();
        System.out.println("Deserialized: " + s2.name);
    }
}
