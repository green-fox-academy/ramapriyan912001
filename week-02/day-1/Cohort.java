import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cohort {

    private String name;
    private ArrayList<Student> students;
    private ArrayList<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }

    public void info() {
        System.out.println(String.format("The %s cohort has %d students and %d mentors.", name, students.size(), mentors.size());
    }
}
