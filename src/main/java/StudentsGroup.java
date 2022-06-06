import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private List<Student> StudentsList;
    private List<String> tasks;
    private Student captain;

    public StudentsGroup(Student captain, List<Student> StudentList, ArrayList<String> tasks) {
        this.captain = captain;
        this.StudentsList = StudentList;
        this.tasks = new ArrayList<>();
    }

    public void changeCaptain(int StudentId,StudentsGroup studentsGroup) {


    }

}