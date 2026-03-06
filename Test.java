// Experiment 3:
// a)create a abstract class shapes with dim1,dim2 variables and abstract method area() method
// Abstract class
abstract class Shape {
    double dim1, dim2;

    Shape(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();   // abstract method
}

// Rectangle class
class Rectangle extends Shape {

    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

// Triangle class
class Triangle extends Shape {

    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

// Main class
public class Test {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(6, 4);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
    }
}