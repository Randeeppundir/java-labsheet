import java.util.LinkedList;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private final int employeeId;
    private final String department;

    public Employee(int employeeId, String name, int age, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + employeeId + ", Name: " + name
                + ", Age: " + age + ", Department: " + department);
    }
}

public class Q02_PersonEmployeeLinkedList {
    private final LinkedList<Employee> employees = new LinkedList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            employee.display();
        }
    }

    public void searchByName(String searchName) {
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(searchName)) {
                employee.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not found: " + searchName);
        }
    }

    public static void main(String[] args) {
        Q02_PersonEmployeeLinkedList app = new Q02_PersonEmployeeLinkedList();
        app.addEmployee(new Employee(101, "Aman", 24, "IT"));
        app.addEmployee(new Employee(102, "Riya", 25, "HR"));
        app.addEmployee(new Employee(103, "Karan", 26, "Sales"));

        System.out.println("All employees:");
        app.displayEmployees();
        System.out.println("\\nSearch result for Riya:");
        app.searchByName("Riya");
    }
}
