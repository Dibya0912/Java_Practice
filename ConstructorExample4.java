
class Book {
    String title;
    double price;

    Book(String t, double p) {
        title = t;
        price = p;
    }

    Book(Book b) {
        title = b.title;
        price = b.price;
    }

    void display() {
        System.out.println("Book: " + title + ", Price: " + price);
    }
}

public class ConstructorExample4 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 499.99);
        Book b2 = new Book(b1); // copy constructor

        b1.display();
        b2.display();
    }
}
