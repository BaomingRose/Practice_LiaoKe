package Segment1.Fifth;

import java.util.ArrayList;

public class Student_Table {
    private ArrayList<Student> students = new ArrayList<Student>();

    public ArrayList<Student> get_all_stduents() {
        return students;
    }

    public void add_student(Student student) {
        students.add(student);
    }

    public int get_num() {
        return students.size();
    }
}
