import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class SortByName {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 70000));
        employees.add(new Employee("Bob", 25, 50000));
        employees.add(new Employee("Charlie", 35, 60000));
        employees.add(new Employee("David", 28, 80000));

        // Sort by name
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        
        System.out.println("Sorted by name:");
        employees.forEach(System.out::println);
    }
}
