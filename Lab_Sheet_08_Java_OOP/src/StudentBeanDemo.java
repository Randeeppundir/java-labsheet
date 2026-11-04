public class StudentBeanDemo {
    public static void main(String[] args) {
        StudentBean student = new StudentBean();
        student.setId(101);
        student.setName("Aarav");
        student.setGrade(8.7);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());
    }
}
