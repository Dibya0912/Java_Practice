class ThisExample4 {
    void m1() {
        System.out.println("m1() method called");
    }

    void m2() {
        helper(this); 
    }

    void helper(ThisExample4 obj) {
        obj.m1();
    }

    public static void main(String[] args) {
        ThisExample4 obj = new ThisExample4();
        obj.m2();
    }
}
