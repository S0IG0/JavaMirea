package Practic_13;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student, Student student1) {
        return student1.getScore() - student.getScore();
    }
}
