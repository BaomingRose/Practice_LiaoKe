package Segment1.eleventh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Identity_Frame {
    private JFrame frame = new JFrame();
    private JTextField tf_number = new JTextField();
    private JButton bt_ident = new JButton("身份识别");
    private JPanel panel = new JPanel();
    private JLabel[][] labels = new JLabel[5][2];

    public Identity_Frame() {
        //设置标题
        frame.setTitle("Identity Verification");
        //不使用布局
        frame.setLayout(null);
        frame.setSize(600, 450);
        frame.setLocation(300, 150);

        bt_ident.setBounds(400, 60, 100, 30);
        bt_ident.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == e.BUTTON1) {
                    String id = tf_number.getText();
                    String[] info;
                    //处理字符串 这里获取info
                    try {
                        info = Identity_Func.get_info_from_id(id);
                    } catch (Exception ex) {
                        tf_number.setText("输入不正确");
                        info = new String[5];
                    }
                    get_lable(info);
                }
            }
        });
        frame.add(bt_ident);

        tf_number.setBounds(50, 60, 300, 30);
        frame.add(tf_number);

        panel.setBounds(200, 170, 300, 100);
        panel.setVisible(true);
        //使用网格布局，5行2列的标签
        panel.setLayout(new GridLayout(5, 2));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                labels[i][j] = new JLabel();
                panel.add(labels[i][j]);
            }
        }
        frame.add(panel);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }

    private void get_lable(String[] info) {
        String[][] values = new String[5][2];
        values[0][0] = "省   份：";
        values[1][0] = "年   龄：";
        values[2][0] = "属   相：";
        values[3][0] = "星   座：";
        values[4][0] = "性   别：";
        for (int i = 0; i < info.length; i++) {
            values[i][1] = info[i];
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                labels[i][j].setText(values[i][j]);
            }
        }
    }
}
