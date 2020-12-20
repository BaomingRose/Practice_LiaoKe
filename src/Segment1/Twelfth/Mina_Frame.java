package Segment1.Twelfth;

import javax.swing.*;
import java.awt.event.*;

public class Mina_Frame {
    private JFrame frame = new JFrame();
    private Button_Panel button_panel;
    private String str;

    public Mina_Frame() {
        frame.setBounds(20, 20, 900, 700);
        frame.setLayout(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        JTextField text = new JTextField();
        text.setBounds(30, 30, 300, 30);
        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("按回车");
                    str = text.getText();
                    text.setEditable(false);
                    get_panel();
                }
            }
        });
        frame.add(text);

        JButton button = new JButton("确认");
        button.setBounds(400, 30, 100, 30);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("按确认");
                str = text.getText();
                text.setEditable(false);
                get_panel();
            }
        });
        frame.add(button);

        frame.setVisible(true);
    }

    void get_panel() {
        System.out.println("生成panel");
        if (button_panel != null) {
            frame.remove(button_panel);
        }
        button_panel = new Button_Panel(str);
        button_panel.setVisible(true);
        button_panel.requestFocus();
        frame.add(button_panel);
    }

}
