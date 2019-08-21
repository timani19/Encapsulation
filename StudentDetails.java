package encapsulation;

public class StudentDetails {
    private String studentName;        // these 3 variables are properties
    private int studentID;             // these are private. In order to access them from another class we will
    private String studentDOB;         // create getter and setter method

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }
}
