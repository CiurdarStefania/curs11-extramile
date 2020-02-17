package ro.fasttrackit.curs11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classroom {
    private final List<StudentGrade> stud;


    public Classroom(List<StudentGrade> student, List<StudentGrade> stud) {
        this.stud = stud;

    }
    public StudentGrade getGradesForStudent(String student){
        stud.remove(student);
    }
    public List<Integer> getGradesForDiscipline(String discipline){
        List<Integer> grade = new ArrayList<>();
        return grade;
    }
    public void read() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new FileReader("test.text"));
        String line = fileScanner.nextLine();
        System.out.println(line);
    }
}
