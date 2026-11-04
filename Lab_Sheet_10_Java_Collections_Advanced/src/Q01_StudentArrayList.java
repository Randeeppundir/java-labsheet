import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student: " + name);
    }
}

public class Q01_StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Aman"));
        students.add(new Student("Riya"));
        students.add(new Student("Karan"));

        System.out.println("Original student list:");
        for (Student student : students) {
            student.display();
        }

        students.remove(1);
        System.out.println("\\nAfter removing the second student:");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            iterator.next().display();
        }
    }
}
