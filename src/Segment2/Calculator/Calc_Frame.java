package Segment2.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calc_Frame extends JFrame {
    //文本框
    private JTextField txt;
    //"MC","MR","MS","M+",
    // "<-","CE","C","+/-","
    // 7","8","9","/",
    // "4","5","6","*",
    // "1","2","3","-"
    private JPanel panel1;           //五行四列
    //"M-","√","%","1/x"
    private JPanel panel2;           //四行一列
    //"0"
    private JButton bts3;            //  0
    //"." "+"
    private JPanel panel4;           //一行两列
    //"="
    private JPanel panel5;           //一行一列

    public Calc_Frame() {
        setSize(600,700);
        setTitle("计算器");
        setLayout(null);

        //文本框
        txt = new JTextField();
        txt.setSize(540,50);
        txt.setLocation(20,20);
        txt.setEditable(false);
        this.add(txt);

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setSize(400,400);
        panel1.setLocation(50,90);
        panel1.setLayout(new GridLayout(5,4));
        String[] s1 = {"MC","MR","MS","M+","<-","CE","C","+/-","7","8","9","/","4","5","6","*","1","2","3","-"};
        JButton[] bts1 = new JButton[20];
        for(int i = 0; i < bts1.length; i++) {
            bts1[i] = new JButton(s1[i]);
            panel1.add(bts1[i]);
        }
        this.add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setSize(100,320);
        panel2.setLocation(450,90);
        panel2.setLayout(new GridLayout(4,1));
        String[] s2 = {"M-", "√", "%", "1/x"};
        JButton[] bts2 = new JButton[4];
        for(int i = 0;i < bts2.length; i++) {
            bts2[i] = new JButton(s2[i]);
            panel2.add(bts2[i]);
        }
        this.add(panel2);

        bts3 = new JButton("0");
        bts3.setSize(200, 80);
        bts3.setLocation(50, 490);
        this.add(bts3);

        panel4 = new JPanel();
        panel4.setSize(200,80);
        panel4.setLocation(250,490);
        panel4.setLayout(new GridLayout(1,2));
        String[] s4 = {".", "+"};
        JButton[] bst4 = new JButton[2];
        for(int i = 0; i < bst4.length; i++) {
            bst4[i] = new JButton(s4[i]);
            panel4.add(bst4[i]);
        }
        this.add(panel4);

        panel5 = new JPanel();
        panel5.setSize(100, 160);
        panel5.setLocation(450,410);
        panel5.setLayout(new GridLayout(1,1));
        JButton bst5 = new JButton("=");
        panel5.add(bst5);
        this.add(panel5);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
}
