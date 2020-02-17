package ro.fasttrackit.curs11;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> students;

    public Classroom(List<StudentGrade> students) {
        this.students = new ArrayList<>(students);
    }

    public List<Integer> getGtades(String discipline) {
        List<Integer> result = new ArrayList<>();
        for (StudentGrade elem : students) {
            if (elem.getDiscipline().equals(discipline)) {
                result.add(elem.getGrade());
            }
        }
        return result;
    }
}
