package Segment1.Fifth;

public class Test {
    public static void main(String[] args) {
        Student_Table student_table = new Student_Table();
        Student s = new Student(1, "刘备", "男", "软件工程", 90);
        Student s2 = new Student(2, "关羽", "男", "网络工程", 99);
        Student s3 = new Student(3, "张飞", "男", "物联网", 90);
        student_table.add_student(s);
        student_table.add_student(s2);
        student_table.add_student(s3);

        Main_Frame main_frame = new Main_Frame(student_table);

    }
}
