import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Q27_SortStudentsComparator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Aman", 82.5));
        students.add(new Student(2, "Riya", 91.0));
        students.add(new Student(3, "Karan", 76.5));

        // Sort by marks in ascending order using Comparator.
        Collections.sort(students, Comparator.comparingDouble(Student::getMarks));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
