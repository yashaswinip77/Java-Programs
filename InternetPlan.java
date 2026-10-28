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

/*
================ OUTPUT ================
Plan Name: Basic
Data Limit: 10 GB
Price: Rs. 199.0

Plan Name: Standard
Data Limit: 50 GB
Price: Rs. 299.0

Plan Name: Premium
Data Limit: 100 GB
Price: Rs. 599.0
========================================
*/