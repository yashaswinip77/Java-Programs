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

/*
================ OUTPUT ================
Point: (10, 20)
Point: (5, 15)
========================================
*/