import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class Department {
    private final int departmentId;
    private final String departmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Department)) return false;
        Department other = (Department) obj;
        return departmentId == other.departmentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId);
    }
}

class Teacher extends Department {
    private final String teacherName;
    private final String subject;

    public Teacher(String teacherName, String subject) {
        super(-1, "Teacher");
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public void display() {
        System.out.println("Teacher: " + teacherName + ", Subject: " + subject);
    }
}

public class Q10_DepartmentTeacherCollections {
    private final ArrayList<Department> departments = new ArrayList<>();
    private final HashMap<Department, List<Teacher>> teacherMap = new HashMap<>();

    public void addDepartment(Department department) {
        if (!departments.contains(department)) {
            departments.add(department);
            teacherMap.put(department, new ArrayList<>());
        }
    }

    public void addTeacher(Department department, Teacher teacher) {
        if (!teacherMap.containsKey(department)) {
            addDepartment(department);
        }
        teacherMap.get(department).add(teacher);
    }

    public void displayAllTeachers() {
        for (Department department : departments) {
            System.out.println("\\nDepartment: " + department.getDepartmentName());
            List<Teacher> teachers = teacherMap.get(department);
            if (teachers.isEmpty()) {
                System.out.println("No teachers assigned.");
            } else {
                for (Teacher teacher : teachers) {
                    teacher.display();
                }
            }
        }
    }

    public static void main(String[] args) {
        Q10_DepartmentTeacherCollections college = new Q10_DepartmentTeacherCollections();

        Department computer = new Department(1, "Computer Science");
        Department management = new Department(2, "Management");

        college.addDepartment(computer);
        college.addDepartment(management);

        college.addTeacher(computer, new Teacher("Anita Sharma", "Java"));
        college.addTeacher(computer, new Teacher("Rahul Verma", "Python"));
        college.addTeacher(management, new Teacher("Meena Joshi", "Economics"));

        college.displayAllTeachers();
    }
}
