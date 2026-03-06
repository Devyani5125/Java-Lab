// Experiment 2:
// Write a Java program to implement a stack and a queue.

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class StackQueue{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- STACK --------
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements for Stack: ");
        int n = sc.nextInt();

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Stack elements: " + stack);
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);


        // -------- QUEUE --------
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("\nEnter number of elements for Queue: ");
        int m = sc.nextInt();

        System.out.println("Enter " + m + " elements:");
        for (int i = 0; i < m; i++) {
            queue.add(sc.nextInt());
        }

        System.out.println("Queue elements: " + queue);
        System.out.println("Queue remove: " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        sc.close();
    }
}
