class ThisExample1 {
    int x;

    ThisExample1(int x) {
        this.x = x;  
    }

    void display() {
        System.out.println("Value of x = " + this.x);
    }

    public static void main(String[] args) {
        ThisExample1 obj = new ThisExample1(100);
        obj.display();
    }
}
