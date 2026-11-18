
import java.util.Scanner;

class Student {
    String USN, Name, Branch;
    long Phone;

    void getDetails(Scanner sc) {
        System.out.print("Enter USN: ");
        USN = sc.next();

        System.out.print("Enter Name: ");
        Name = sc.next();

        System.out.print("Enter Branch: ");
        Branch = sc.next();

        System.out.print("Enter Phone: ");
        Phone = sc.nextLong();
    }

    void display() {
        System.out.println(USN + "\t" + Name + "\t" +
                           Branch + "\t" + Phone);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student s[] = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.println("\nEnter details of Student " + (i + 1));
            s[i].getDetails(sc);
        }

        System.out.println("\nUSN\tName\tBranch\tPhone");
        System.out.println("--------------------------------------");

        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        sc.close();
    }
}


/*
================ OUTPUT ================
Enter number of students: 2

Enter details of Student 1
Enter USN: 101
Enter Name: Rahul
Enter Branch: CSE
Enter Phone: 9876543210

Enter details of Student 2
Enter USN: 102
Enter Name: Priya
Enter Branch: ECE
Enter Phone: 9876543211

USN    Name    Branch    Phone
--------------------------------------
101    Rahul   CSE       9876543210
102    Priya   ECE       9876543211
========================================
*/
