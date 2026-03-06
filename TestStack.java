// Experiment 4:
// stack and queue with interface
// create an interface stack with a variable size and abstract methods push and pop display,overflow,underflow. 
// implement a subclass integerstack that implements the stack interface and ccreates a test class to check the working of all
// method in the integerstack class
import java.util.Scanner;

// Interface
interface Stack {
    int size = 5;
    void push(int x);
    void pop();
    void display();
    void overflow();
    void underflow();
}

// Class implementing interface
class IntegerStack implements Stack {
    int stack[] = new int[size];
    int top = -1;

    public void push(int x) {
        if (top == size - 1)
            overflow();
        else
            stack[++top] = x;
    }

    public void pop() {
        if (top == -1)
            underflow();
        else
            System.out.println("Popped element: " + stack[top--]);
    }

    public void display() {
        if (top == -1)
            System.out.println("Stack is empty");
        else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--)
                System.out.println(stack[i]);
        }
    }

    public void overflow() {
        System.out.println("Stack Overflow");
    }

    public void underflow() {
        System.out.println("Stack Underflow");
    }
}

// Test class
public class TestStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IntegerStack s = new IntegerStack();
        int choice, value;

        do {
            System.out.println("\n1.Push  2.Pop  3.Display  4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}