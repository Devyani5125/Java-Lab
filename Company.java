// Experiment 3:
//2) write  java program that creates a class hierarchy for employees of a company
// createa subclass manager,develpoer,programer 
// each subclass should have properties such as name,address,salary and job title
// implement a method for calculating bonuses,generating performance reportsand managing projects
// Superclass
class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    // Constructor
    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate bonus
    double calculateBonus() {
        return salary * 0.10;  // default 10% bonus
    }

    // Method to generate performance report
    void generateReport() {
        System.out.println(jobTitle + " " + name + " performance is satisfactory.");
    }

    // Method to manage project
    void manageProject() {
        System.out.println(jobTitle + " " + name + " is managing a project.");
    }

    void displayDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}

// Subclass Manager
class Manager extends Employee {

    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    // Overriding bonus
    double calculateBonus() {
        return salary * 0.20;  // 20% bonus
    }
}

// Subclass Developer
class Developer extends Employee {

    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    double calculateBonus() {
        return salary * 0.15;  // 15% bonus
    }
}

// Subclass Programmer
class Programmer extends Employee {

    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    double calculateBonus() {
        return salary * 0.12;  // 12% bonus
    }
}

// Main class
public class Company {
    public static void main(String[] args) {

        Manager m = new Manager("Rahul", "Delhi", 80000);
        Developer d = new Developer("Anita", "Mumbai", 60000);
        Programmer p = new Programmer("Karan", "Chennai", 50000);

        // Manager
        m.displayDetails();
        System.out.println("Bonus: " + m.calculateBonus());
        m.generateReport();
        m.manageProject();

        // Developer
        d.displayDetails();
        System.out.println("Bonus: " + d.calculateBonus());
        d.generateReport();
        d.manageProject();

        // Programmer
        p.displayDetails();
        System.out.println("Bonus: " + p.calculateBonus());
        p.generateReport();
        p.manageProject();
    }
}



