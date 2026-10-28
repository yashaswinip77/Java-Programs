# Java Programming Assignments

## 1. Student Program (`Student.java`)
```java

class Student {
    String name;
    int age;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ram";
        s1.age = 20;
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "Seetha";
        s2.age = 20;
        s2.marks = 90;

        s1.display();
        s2.display();
    }
}


### Output:
```text

Name: Ram
Age: 20
Marks: 85

Name: Seetha
Age: 20
Marks: 90



## 2. Rectangle Program (`Rectangle.java`)
```java

class Rectangle {
    int length;
    int breadth;

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 5;

        r.calculateArea();
    }
}


### Output:
```text

Area of Rectangle = 50



## 3. Circle Program (`Circle.java`)
```java

class Circle {
    double radius;

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle = " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle();

        c.radius = 5;

        c.calculateCircumference();
    }
}


### Output:
```text

Circumference of Circle = 31.41592653589793



## 4. BankAccount Program (`BankAccount.java`)
```java

class BankAccount {
    String account_holder_name;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.account_holder_name = "Ram";
        account.balance = 1000;

        System.out.println("Account Holder: " + account.account_holder_name);

        account.checkBalance();
        account.deposit(500);
        account.withdraw(300);
        account.checkBalance();
    }
}


### Output:
```text

Account Holder: Ram
Current Balance: 1000.0
Deposited: 500.0
Withdrawn: 300.0
Current Balance: 1200.0



## 5. Time Program (`Time.java`)
```java

class Time {
    int seconds;

    // Default constructor
    Time() {
        seconds = 60;
    }

    // Constructor with one parameter
    Time(int s) {
        seconds = s;
    }

    // Constructor with two parameters
    Time(int minutes, int sec) {
        seconds = minutes * 60 + sec;
    }

    // Constructor with three parameters
    Time(int hours, int minutes, int sec) {
        seconds = hours * 3600 + minutes * 60 + sec;
    }

    void display() {
        System.out.println("Time in seconds: " + seconds);
        System.out.println("Time in minutes: " + (seconds / 60.0));
        System.out.println("Time in hours: " + (seconds / 3600.0));
        System.out.println();
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(120);
        Time t3 = new Time(2, 30);
        Time t4 = new Time(1, 30, 45);

        t1.display();
        t2.display();
        t3.display();
        t4.display();
    }
}


### Output:
```text

Time in seconds: 60
Time in minutes: 1.0
Time in hours: 0.016666666666666666

Time in seconds: 120
Time in minutes: 2.0
Time in hours: 0.03333333333333333

Time in seconds: 150
Time in minutes: 2.5
Time in hours: 0.041666666666666664

Time in seconds: 5445
Time in minutes: 90.75
Time in hours: 1.5125



## 6. Point Program (`Point.java`)
```java

class Point {
    int x, y;

    // Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display the point
    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(5, 15);

        p1.display();
        p2.display();
    }
}


### Output:
```text

Point: (10, 20)
Point: (5, 15)



## 7. InternetPlan Program (`InternetPlan.java`)
```java

class InternetPlan {
    String planName;
    int dataLimit;
    double price;

    // Default constructor
    InternetPlan() {
        this("Basic", 10, 199.0);
    }

    // Constructor with two parameters
    InternetPlan(String planName, int dataLimit) {
        this(planName, dataLimit, 299.0);
    }

    // Constructor with three parameters
    InternetPlan(String planName, int dataLimit, double price) {
        this.planName = planName;
        this.dataLimit = dataLimit;
        this.price = price;
    }

    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Data Limit: " + dataLimit + " GB");
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Standard", 50);
        InternetPlan p3 = new InternetPlan("Premium", 100, 599.0);

        p1.display();
        p2.display();
        p3.display();
    }
}


### Output:
```text

Plan Name: Basic
Data Limit: 10 GB
Price: Rs. 199.0

Plan Name: Standard
Data Limit: 50 GB
Price: Rs. 299.0

Plan Name: Premium
Data Limit: 100 GB
Price: Rs. 599.0



## 8. LibraryBook Program (`LibraryBook.java`)
```java

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


### Output:
```text

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