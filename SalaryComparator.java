import java.util.Comparator;

// Comparator to sort employees by salary
public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.sal, e2.sal);  // Ascending order by salary
    }
}