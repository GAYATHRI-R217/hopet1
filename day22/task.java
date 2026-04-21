package day22;
//Employee(name,department,salary,age)(dev,HR,support)
//1.Filter by department("Dev")
//2.Salary greater than 50k
//3.Total salary using sum() method
//4.Average salary average() method
//5.Total count of Employee using count() method
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    double salary;
    int age;

    Employee(String name, String department, double salary, int age) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    public String toString() {
        return name + " " + department + " " + salary + " " + age;
    }
}

public class task {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("A", "Dev", 60000, 25),
            new Employee("B", "HR", 40000, 30),
            new Employee("C", "Dev", 80000, 28),
            new Employee("D", "Support", 30000, 22),
            new Employee("E", "Dev", 50000, 26)
        );

        // Supplier for Stream
        Supplier<Stream<Employee>> streamSupplier = () -> employees.stream();

        // 1. Filter by department ("Dev")
        List<Employee> devEmployees = streamSupplier.get()
                .filter(e -> e.getDepartment().equals("Dev"))
                .collect(Collectors.toList());

        System.out.println("Dev Employees:");
        devEmployees.forEach(System.out::println);

        // 2. Salary > 50k
        List<Employee> highSalary = streamSupplier.get()
                .filter(e -> e.getSalary() > 50000)
                .collect(Collectors.toList());

        System.out.println("\nSalary > 50k:");
        highSalary.forEach(System.out::println);

        // 3. Total salary
        double totalSalary = streamSupplier.get()
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println("\nTotal Salary: " + totalSalary);

        // 4. Average salary
        double avgSalary = streamSupplier.get()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("Average Salary: " + avgSalary);

        // 5. Count
        long count = streamSupplier.get().count();

        System.out.println("Total Employees: " + count);
    }
}
