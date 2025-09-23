class Example6 {
    static class Book {
        String title;

        Book(String t) {
            title = t;
        }

        void show() {
            System.out.println("Book: " + title);
        }
    }

    public static void main(String[] args) {
        Book[] library = new Book[3];
        library[0] = new Book("Java Basics");
        library[1] = new Book("OOP Concepts");
        library[2] = new Book("Data Structures");

        for (Book b : library) {
            b.show();
        }
    }
}
