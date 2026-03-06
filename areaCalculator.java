// Experiment 2:
// 2)Implement a Java program to print the area of a rectangle by creating a class named
// 'Area' that has two methods. The first method, named 'setDim', takes the length and breadth of the rectangle as parameters.
//  The second method, named 'getArea', returns the area of the rectangle. The length and breadth of the rectangle are entered through the keyboard.
 import java.util.*;

class Area {

    double length;
    double breadth;

    // Method to set dimensions
    void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    double getArea() {
        return length * breadth;
    }
}

public class areaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Area rect = new Area();

        // Taking input from keyboard
        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        // Setting dimensions
        rect.setDim(l, b);

        // Printing area
        System.out.println("Area of Rectangle = " + rect.getArea());

        sc.close();
    }
}

