// Import required packages
import java.util.*;

// Employee class implements Comparable for default sorting
public class Employee implements Comparable<Employee> {

    // Instance variables
    int id;
    String name;
    double sal;

    // Constructor to initialize employee data
    public Employee(int id, String name, double sal) {
        this.id = id;       // Assign id
        this.name = name;   // Assign name
        this.sal = sal;     // Assign salary
    }

    // toString() method to print employee details
    public String toString() {
        return id + " " + name + " " + sal;
    }

    // Default comparison using Comparable
    // Here we sort employees based on id
    @Override
    public int compareTo(Employee e) {
        return this.id - e.id;   // Ascending order by id
    }
}