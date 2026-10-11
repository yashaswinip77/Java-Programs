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

## 3. BankAccount Program (`BankAccount.java`)
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



