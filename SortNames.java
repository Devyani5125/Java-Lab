// Experiment 2:
// write a java program to sort 10 names in alphabetical order. Take the names as input from the user.
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];

        System.out.println("Enter 10 names:");

        // Taking input
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        // Sorting names (Alphabetical order)
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // Display sorted names
        System.out.println("\nNames in Alphabetical Order:");
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}