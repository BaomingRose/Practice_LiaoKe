package Segment1.Twelfth;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Test {
    public static void main(String[] args) {
        /*
        JFrame frame = new JFrame();
        JTextField text = new JTextField();
        frame.setBounds(20, 20, 300, 300);
        frame.setLayout(null);
        text.setBounds(20, 20, 100, 30);
        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("相当于按按钮");
                }
            }
        });
        frame.add(text);
        frame.setVisible(true);
        */

        Mina_Frame mina_frame = new Mina_Frame();

        /*
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setBounds(20, 20, 300, 500);
        Button_Panel button_panel = new Button_Panel("ABC");
        button_panel.setBounds(20, 20, 200, 200);
        frame.add(button_panel);
        button_panel.setFocusable(true);
        frame.setVisible(true);
        button_panel.requestFocus();
        */
    }
}

