import java.util.Comparator;

// Comparator to sort employees by name
public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);  // Alphabetical order
    }
}