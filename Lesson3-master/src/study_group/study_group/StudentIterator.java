package study_group.study_group;

import study_group.student.Student;
import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {
    private int index;
    private List<Student> students;

    public StudentIterator(List<Student> students) {
        this.students = students;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more students.");
        }
        return students.get(index++);
    }
}
