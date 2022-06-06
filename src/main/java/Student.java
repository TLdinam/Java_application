import java.util.ArrayList;
import java.util.List;

public class Student {
    private int StudentId;
    private String name;
    private String Lastname;


    public Student(int StudentId, String name, String Lastname) {
        this.StudentId = StudentId;
        this.name = name;
        this.Lastname = Lastname;
    }
}





class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Taras";
        student1.Lastname = "Lytovchenko";
        student1.StudentId = 0;
//        student1.captain = true;
//
//        System.out.println(student1.captain);

    }
}
