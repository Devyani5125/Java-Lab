// Experiment 3:
// perform a program of multiple inhertiance of rollno-sub1,sub2,diaplay  result
import java.util.*;

interface Student {
    int rollno = 0;
    void getRoll();
}

interface Marks {
    void getMarks();
}

class Result implements Student, Marks {
    int roll;
    int sub1, sub2;

    Scanner sc = new Scanner(System.in);

    public void getRoll() {
        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
    }

    public void getMarks() {
        System.out.print("Enter marks of Subject 1: ");
        sub1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        sub2 = sc.nextInt();
    }

    void display() {
        int total = sub1 + sub2;

        System.out.println("\nRoll Number: " + roll);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Total Marks: " + total);
    }
}

public class multipleinheritance
 {
    public static void main(String[] args) {

        Result r = new Result();

        r.getRoll();
        r.getMarks();
        r.display();
    }
}
