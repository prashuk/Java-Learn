public class MVCStudentDriver {
    public static void main(String[] args) {
        StudentModel model = fetchStudent();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.getStudentDetails();

        controller.setStudentName("Ajmera");
        controller.getStudentDetails();
    }

    private static StudentModel fetchStudent() {
        StudentModel student = new StudentModel();
        student.setName("Prashuk");
        student.setRollNo(20);
        return student;
    }
}
