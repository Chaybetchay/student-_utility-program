public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.setDetails("Kyla Dela Cruz", 18, 85.5);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Passed: " + student.isPassed());

        student.displayInfo();
    }
}