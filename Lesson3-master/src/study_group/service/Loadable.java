package study_group.service;

import study_group.student.Student;
import java.util.List;

public interface Loadable {
    List<Student> load();
}
