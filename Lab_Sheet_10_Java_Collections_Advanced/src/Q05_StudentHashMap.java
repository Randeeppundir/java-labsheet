import java.util.HashMap;
import java.util.Map;

class StudentRecord {
    private final int rollNumber;
    private final String name;

    public StudentRecord(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name);
    }
}

public class Q05_StudentHashMap {
    private final HashMap<Integer, StudentRecord> students = new HashMap<>();

    public void addStudent(int rollNumber, String name) {
        students.put(rollNumber, new StudentRecord(rollNumber, name));
    }

    public void removeStudent(int rollNumber) {
        StudentRecord removed = students.remove(rollNumber);
        if (removed == null) {
            System.out.println("No student found with roll number " + rollNumber);
        }
    }

    public void displayStudents() {
        for (Map.Entry<Integer, StudentRecord> entry : students.entrySet()) {
            entry.getValue().display();
        }
    }

    public static void main(String[] args) {
        Q05_StudentHashMap app = new Q05_StudentHashMap();
        app.addStudent(101, "Aman");
        app.addStudent(102, "Riya");
        app.addStudent(103, "Karan");

        System.out.println("All students:");
        app.displayStudents();

        app.removeStudent(102);
        System.out.println("\\nAfter removing roll number 102:");
        app.displayStudents();
    }
}
