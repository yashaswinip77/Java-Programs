class LibraryBook {
    String title;
    String author;
    double price;

    // Static variable to count books
    static int bookCount = 0;

    // Constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }

    // Static method to display total books
    static void displayCount() {
        System.out.println("Total Books: " + bookCount);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Programming",
                "James Gosling", 450.0);

        LibraryBook b2 = new LibraryBook("Python Basics",
                "Guido van Rossum", 350.0);

        LibraryBook b3 = new LibraryBook("C Programming",
                "Dennis Ritchie", 300.0);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();

        LibraryBook.displayCount();
    }
}

/*
================ OUTPUT ================
Title: Java Programming
Author: James Gosling
Price: Rs. 450.0

Title: Python Basics
Author: Guido van Rossum
Price: Rs. 350.0

Title: C Programming
Author: Dennis Ritchie
Price: Rs. 300.0

Total Books: 3
========================================
*/