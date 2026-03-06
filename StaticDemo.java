// Experiment 2:
// 3)Write a Java program to demonstrate the use of static variables, static methods, and static blocks.
class StaticDemo {

    // Static variable
    static int count;

    // Static block
    static {
        System.out.println("Static block executed.");
        count = 10;   // initializing static variable
    }

    // Static method
    static void display() {
        System.out.println("Static method called.");
        System.out.println("Value of count: " + count);
    }

    public static void main(String[] args) {

        System.out.println("Main method started.");

        // Calling static method
        display();

        // Changing static variable
        count = 20; 

        System.out.println("Updated value of count: " + count);
    }
}


