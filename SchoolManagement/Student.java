package tw.collections;

public class Student {
    private int studentRegNo;
    private String studentName;
    private int studentStandard;
    private String studentSection;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentRegNo(int studentRegNo) {
        this.studentRegNo = studentRegNo;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    public void setStudentStandard(int studentStandard) {
        this.studentStandard = studentStandard;
    }

    public int getStudentRegNo() {
        return studentRegNo;
    }

    public int getStudentStandard() {
        return studentStandard;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSection() {
        return studentSection;
    }

    Student(int studentRegNo, String studentName, int studentStandard, String studentSection) {
        setStudentName(studentName);
        setStudentRegNo(studentRegNo);
        setStudentSection(studentSection);
        setStudentStandard(studentStandard);
    }
}

