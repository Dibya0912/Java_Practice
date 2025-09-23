class Example5 {
    static class Box {
        int length, width;

        Box(int l, int w) {
            length = l;
            width = w;
        }

        int area() {
            return length * width;
        }
    }

    static void printArea(Box b) {
        System.out.println("Area = " + b.area());
    }

    public static void main(String[] args) {
        Box box1 = new Box(5, 10);
        printArea(box1);
    }
}
