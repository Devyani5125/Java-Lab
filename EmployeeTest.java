// experiment No:2
// 1)Create a class called Employee that includes three pieces of information as instance variables: first name, last name, and monthly salary.
// Your class should have a constructor that initializes the three instance variables.
// Provide a setter and getter method for each instance variable. 
// If the monthly salary is not positive, set it to 0.0. 
// Write a test application named EmployeeTest that demonstrates the Employee class's capabilities.
// Create two Employee objects and display each object's yearly salary.
// Then give each Employee a 10% raise and display each Employee's yearly salary again.
// **Getter functions:It is used to access the private variables of the class
// **Setter function are used to modify the values of those variables.
import java.util.*;

class Employee {

    String firstName;
    String lastName;
    double salary;

    Employee(String f, String l, double s) {
        firstName = f;
        lastName = l;

        if (s > 0)
            salary = s;
        else
            salary = 0;
    }
}

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee 1
        System.out.println("Enter Employee 1 Details");
        String f1 = sc.next();
        String l1 = sc.next();
        double s1 = sc.nextDouble();

        // Employee 2
        System.out.println("Enter Employee 2 Details");
        String f2 = sc.next();
        String l2 = sc.next();
        double s2 = sc.nextDouble();

        Employee e1 = new Employee(f1, l1, s1);
        Employee e2 = new Employee(f2, l2, s2);

        // Salary before raise
        System.out.println("\nYearly Salary:");
        System.out.println(e1.firstName + " = " + (e1.salary * 12));
        System.out.println(e2.firstName + " = " + (e2.salary * 12));

        // 10% raise
        e1.salary = e1.salary * 1.10;
        e2.salary = e2.salary * 1.10;

        // Salary after raise
        System.out.println("\nAfter 10% Raise:");
        System.out.println(e1.firstName + " = " + (e1.salary * 12));
        System.out.println(e2.firstName + " = " + (e2.salary * 12));

        sc.close();
    }
}
