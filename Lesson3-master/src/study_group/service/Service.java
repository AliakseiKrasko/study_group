package study_group.service;

import study_group.student.Student;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Service {
    public void sortByName(List<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
    }

    public void sortByBirthDate(List<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getBirthDate().compareTo(s2.getBirthDate());
            }
        });
    }
}
