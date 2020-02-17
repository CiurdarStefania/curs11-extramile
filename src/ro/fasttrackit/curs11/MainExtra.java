package ro.fasttrackit.curs11;

import java.util.List;

public class MainExtra {
    public static void main(String[] args) throws Exception {
        StudentReader reader = new StudentReader();
        List<StudentGrade> students = reader.readfFile("grades.txt");
        System.out.println(students);

        Classroom classroom = new Classroom(students);
        System.out.println(classroom.getGtades("Computer Science"));


    }
}
