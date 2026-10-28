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

/*
================ OUTPUT ================
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
========================================
*/