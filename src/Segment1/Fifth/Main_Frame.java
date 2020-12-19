package Segment1.Fifth;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Main_Frame {
    private JFrame frame = new JFrame();
    private JScrollPane scrollPane;

    private Student_Table students;

    public Main_Frame(Student_Table stu) {
        this.students = stu;

        frame.setTitle("学生信息");
        frame.setLocation(50, 50);
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        JButton button_add = new JButton("添加");
        button_add.setBounds(30, 30, 100, 30);
        button_add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //启动增加界面
                Add_Frame add_frame = new Add_Frame(students);
            }
        });
        frame.add(button_add);

        JButton button_flush = new JButton("刷新");
        button_flush.setBounds(200, 30, 100, 30);
        button_flush.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //刷新表格数据
                update_table();
            }
        });
        frame.add(button_flush);

        update_table();
        frame.setVisible(true);
    }

    private void update_table() {
        if (students == null || students.get_num() == 0) {
            return;
        }
        if (scrollPane != null) {
            frame.remove(scrollPane);
        }
        String[] columns = { "学号", "姓名", "性别", "专业", "成绩" };
        String[][] values = new String[students.get_num()][5];
        ArrayList<Student> student_list = students.get_all_stduents();

        for (int i = 0; i < student_list.size(); ++i) {
            Student s = student_list.get(i);
            values[i][0] = String.valueOf(s.getNo());
            values[i][1] = s.getName();
            values[i][2] = s.getGender();
            values[i][3] = s.getMajor();
            values[i][4] = String.valueOf(s.getGrade());
        }

        JTable table = new JTable(values, columns);
        table.setEnabled(false);
        scrollPane = new JScrollPane(table);
        scrollPane.setSize(750, 450);
        scrollPane.setLocation(20, 100);
        frame.add(scrollPane);
    }
}
