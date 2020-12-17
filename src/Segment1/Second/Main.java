package Segment1.Second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student_Table s_t = new Student_Table();

        while (true) {
            System.out.println("1、打印所有学生成绩");
            System.out.println("2、添  加  学  生");
            System.out.println("3、查  询  学  生");
            System.out.println("4、退          出");
            System.out.println("请选择：");

            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            int chance = 0;
            try {
                chance = Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("输入有误！！！");
                continue;
            }

            if (chance == 1) {
                s_t.query_all();
            } else if (chance == 2) {
                System.out.println("请输入学生学号：");
                String sno = scanner.nextLine();

                //学号验证……

                System.out.println("请输入学生姓名：");
                String sname = scanner.nextLine();

                double math = 0;
                double chinese = 0;
                double english = 0;
                try {
                    System.out.println("请输入数学成绩：");
                    math = scanner.nextDouble();
                    System.out.println("请输入语文成绩：");
                    chinese = scanner.nextDouble();
                    System.out.println("请输入英语成绩：");
                    english = scanner.nextDouble();
                } catch (Exception e) {
                    System.out.println("插入失败！！！ 填写信息不正确！！！");
                    continue;
                }
                Student s = new Student(sno, sname, math, chinese, english);
                s_t.add_student(s);
                System.out.println("插入成功！");
            } else if (chance == 3) {
                System.out.println("请输入学生姓名：");
                String sname = scanner.nextLine();
                Student s = s_t.query_student(sname);
                if (s != null) {
                    System.out.println(s);
                } else {
                    System.out.println("该学生不存在");
                }
            } else if (chance == 4) {
                break;
            } else {
                System.out.println("输入有误！！！");
                continue;
            }
        }
    }
}
