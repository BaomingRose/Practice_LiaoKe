package Segment1.Fifth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Add_Frame {
    private JFrame frame;

    private Student_Table student_table;

    public Add_Frame(Student_Table students) {
        this.student_table = students;

        this.frame = new JFrame();
        frame.setSize(300,400);
        frame.setLocation(300, 150);
        frame.setLayout(null);

        //设定标签和输入框的大小和位置
        JLabel label_no = new JLabel("学 号");
        label_no.setSize(60, 30);
        label_no.setLocation(30, 30);
        frame.add(label_no);
        JTextField text_no = new JTextField();
        text_no.setSize(120, 30);
        text_no.setLocation(100, 30);
        frame.add(text_no);
        JLabel label_name = new JLabel("姓 名");
        label_name.setSize(60, 30);
        label_name.setLocation(30, 80);
        frame.add(label_name);
        JTextField text_name = new JTextField();
        text_name.setSize(120, 30);
        text_name.setLocation(100, 80);
        frame.add(text_name);
        JLabel label_gender = new JLabel("性 别");
        label_gender.setSize(60, 30);
        label_gender.setLocation(30, 130);
        frame.add(label_gender);
        JComboBox text_gender = new JComboBox();
        text_gender.setSize(120, 30);
        text_gender.setLocation(100, 130);
        text_gender.addItem("男");
        text_gender.addItem("女");
        frame.add(text_gender);
        JLabel label_major = new JLabel("专 业");
        label_major.setSize(60, 30);
        label_major.setLocation(30, 180);
        frame.add(label_major);
        JComboBox text_major = new JComboBox();
        text_major.setLocation(100, 180);
        text_major.setSize(120, 30);
        text_major.addItem("软件工程");
        text_major.addItem("网络工程");
        text_major.addItem("物联网");
        frame.add(text_major);
        JLabel label_grade = new JLabel("成绩");
        label_grade.setSize(60, 30);
        label_grade.setLocation(30, 230);
        frame.add(label_grade);
        JTextField text_grade = new JTextField();
        text_grade.setLocation(100, 230);
        text_grade.setSize(120, 30);
        frame.add(text_grade);

        //设置增加按钮
        JButton button = new JButton("增加");
        button.setBounds(100, 300, 100, 30);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    int no = Integer.parseInt(text_no.getText());
                    String name = text_name.getText();
                    String gender = text_gender.getSelectedItem().toString().trim();
                    String major = text_major.getSelectedItem().toString().trim();
                    int grade = Integer.parseInt(text_grade.getText());
                    if (grade < 0 || grade > 100) {
                        throw new Exception("成绩不正确");
                    }
                    Student s = new Student(no, name, gender, major, grade);
                    student_table.add_student(s);

                    //添加成功弹窗
                    JDialog dialog = new JDialog(frame, true);
                    dialog.setBounds(400, 300, 200, 170);
                    dialog.setLayout(null);
                    JLabel label = new JLabel("添加成功");
                    label.setBounds(20, 20, 100, 30);
                    dialog.add(label);
                    JButton button = new JButton("确认");
                    button.setBounds(30, 60, 100, 30);
                    button.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            dialog.dispose();
                            frame.dispose();
                        }
                    });
                    dialog.add(button);
                    dialog.setVisible(true);
                } catch (Exception ex) {
                    //输入有误弹窗
                    JDialog dialog = new JDialog(frame, true);
                    dialog.setBounds(400, 300, 200, 170);
                    dialog.setLayout(null);
                    JLabel label = new JLabel("输入有误");
                    label.setBounds(20, 20, 100, 30);
                    dialog.add(label);
                    JButton button = new JButton("确认");
                    button.setBounds(30, 60, 100, 30);
                    button.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            dialog.dispose();
                        }
                    });
                    dialog.add(button);
                    dialog.setVisible(true);
                }
            }
        });
        frame.add(button);

        frame.setVisible(true);
    }
}
