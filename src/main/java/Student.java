public class Student {
    private int StudentId;
    private String name;
    private String Lastname;

    public Student(int StudentId, String name, String Lastname) {
        this.StudentId = StudentId;
        this.name = name;
        this.Lastname = Lastname;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}
