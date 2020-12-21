package Segment2.Notepad;

import Segment1.Second.Main;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main_Frame {
    JFrame frame;

    public Main_Frame() {
        JFrame frame = new JFrame("记事本");
        frame.setLayout(null);
        frame.setBounds(300, 150, 700, 500);

        //创建菜单栏
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu menu1 = new JMenu("文件");
        JMenu menu2 = new JMenu("编辑");
        JMenu menu3 = new JMenu("格式");
        JMenu menu4 = new JMenu("查看");
        JMenu menu5 = new JMenu("帮助");
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);
        menuBar.add(menu5);

        JMenuItem item1 = new JMenuItem("新建");
        JMenuItem item2 = new JMenuItem("保存");
        JMenuItem item3 = new JMenuItem("另存为");
        JMenuItem item4 = new JMenuItem("退出");

        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(0, 3, 698, 469);
        frame.add(textArea);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });


        item2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String ss = textArea.getText();
                try {
                    File_Tool.write_file("./out/x.txt", ss);
                } catch (Exception ex) {
                    System.out.println("保存失败！");
                }
            }
        });

        frame.setVisible(true);
    }
}
