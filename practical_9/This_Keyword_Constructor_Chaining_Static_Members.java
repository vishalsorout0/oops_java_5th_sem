
class Employee {
    String name;
    double salary;
    static int count = 0;

    // Parameterized constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    // No-argument constructor
    Employee() {
        this("Unknown", 0.0);
    }

    // Display employee details
    void display() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    // Static method
    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Amit", 30000);
        Employee e3 = new Employee("Rahul", 40000);

        System.out.println("Employee 1:");
        e1.display();

        System.out.println("\nEmployee 2:");
        e2.display();

        System.out.println("\nEmployee 3:");
        e3.display();

        System.out.println();
        Employee.displayCount();
    }
}
