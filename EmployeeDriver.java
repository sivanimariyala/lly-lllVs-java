import java.util.*;  // Import util package

// Driver class to test the program
public class EmployeeDriver {

    public static void main(String[] args) {

        // Create ArrayList of Employee
        ArrayList<Employee> list = new ArrayList<>();

        // Adding employee objects to list
        list.add(new Employee(103, "Sivani", 50000));
        list.add(new Employee(101, "Naveen", 60000));
        list.add(new Employee(102, "Mini", 45000));

        // -------------------------------
        // Display using Iterable (for-each loop)
        // -------------------------------
        System.out.println("Original List (Using Iterable - for each):");

        // ArrayList implements Iterable interface
        for (Employee e : list) {
            System.out.println(e);
        }

        // -------------------------------
        // Sorting using Comparable (Default - ID)
        // -------------------------------
        Collections.sort(list);  // Uses compareTo()

        System.out.println("\nSorted by ID (Comparable - Default):");

        for (Employee e : list) {
            System.out.println(e);
        }

        // -------------------------------
        // Sorting using Name Comparator
        // -------------------------------
        Collections.sort(list, new NameComparator());

        System.out.println("\nSorted by Name (Comparator):");

        // Using Iterator to display
        Iterator<Employee> itr1 = list.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        // -------------------------------
        // Sorting using Salary Comparator
        // -------------------------------
        Collections.sort(list, new SalaryComparator());

        System.out.println("\nSorted by Salary (Comparator):");

        Iterator<Employee> itr2 = list.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}