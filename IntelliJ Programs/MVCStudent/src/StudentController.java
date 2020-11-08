public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String studentName) {
        model.setName(studentName);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(int studentRollNo) {
        model.setRollNo(studentRollNo);
    }

    public int getStudentRollNo() {
        return model.getRollNo();
    }

    public void getStudentDetails() {
        view.studentDetails(getStudentName(), getStudentRollNo());
    }
}
