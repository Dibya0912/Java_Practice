
class ThisExample5 {
    ThisExample5 getObject() {
        return this;  
    }

    void display() {
        System.out.println("Returned current object using this");
    }

    public static void main(String[] args) {
        ThisExample5 obj = new ThisExample5();
        obj.getObject().display();
    }
}
