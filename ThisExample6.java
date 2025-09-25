class ThisExample6 {
    String name;

    ThisExample6(String name) {
        this.name = name; 
    }

    void display() {
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {
        ThisExample6 obj = new ThisExample6("Ankit");
        obj.display();
    }
}