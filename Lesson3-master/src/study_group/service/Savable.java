package study_group.service;

import study_group.student.Student;
import java.util.List;

public interface Savable {
    void save(List<Student> students);
}
