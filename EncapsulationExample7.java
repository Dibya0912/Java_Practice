class Student {
    private String name;
    private int age;
    
    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0)
            this.age = age;
    }
}

public class EncapsulationExample7 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ankit");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
