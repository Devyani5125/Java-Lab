// Experiment 4:
// 2)a)create an interface shape with an abstract method area
// Interface
// interface Shape {
//     double area();
// }

// // Rectangle class
// class Rectangle implements Shape {
//     double length, width;

//     Rectangle(double l, double w) {
//         length = l;
//         width = w;
//     }

//     public double area() {
//         return length * width;
//     }
// }

// // Circle class
// class Circle implements Shape {
//     double r;

//     Circle(double r) {
//         this.r = r;
//     }

//     public double area() {
//         return 3.14 * r * r;
//     }
// }

// // Test class
// public class TestShape {
//     public static void main(String[] args) {

//         Rectangle r = new Rectangle(5, 4);
//         Circle c = new Circle(3);

//         System.out.println("Area of Rectangle = " + r.area());
//         System.out.println("Area of Circle = " + c.area());
//     }
// }

// b)create two classes rectanglr and triangle that implements shape interface 
// Interface
interface Shape {
    double area();
}

// Rectangle class
class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}

// Triangle class
class Triangle implements Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

// Test class
public class TestShape {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(6, 4);

        System.out.println("Area of Rectangle = " + r.area());
        System.out.println("Area of Triangle = " + t.area());
    }
}