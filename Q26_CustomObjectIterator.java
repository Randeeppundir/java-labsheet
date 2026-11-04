import java.util.ArrayList;
import java.util.Iterator;

public class Q26_CustomObjectIterator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Aman", 82.5));
        students.add(new Student(2, "Riya", 91.0));
        students.add(new Student(3, "Karan", 76.5));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
