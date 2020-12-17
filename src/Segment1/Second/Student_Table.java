package Segment1.Second;

import java.util.Set;
import java.util.TreeSet;

public class Student_Table {
    private Set<Student> s;

    public Student_Table() {
        s = new TreeSet<Student>();
    }

    public void add_student(Student s) {
        this.s.add(s);
    }

    public void query_all() {
        for (Student s : this.s) {
            System.out.println(s);
        }
    }

    public Student query_student(String name) {
        for (Student s : this.s) {
            if (name.equals(s.getSname())) {
                return s;
            }
        }
        return null;
    }
}

class Test {
    public static void main(String[] args) {
        Student_Table s_t = new Student_Table();
        Student s1 = new Student("20170000", "张三", 10.1, 30.1, 50.6);
        Student s2 = new Student("42332000", "刘玄德", 70.8, 90.1, 99.0);

        s_t.add_student(s1);
        s_t.add_student(s2);

        s_t.query_all();
    }
}
