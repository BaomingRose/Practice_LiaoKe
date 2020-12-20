package Segment1.Twelfth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button_Panel extends JPanel {
    private Char_Button[] buttons;
    private int clicked_index = -1;

    Char_Button[] get_buttons() {
        return buttons;
    }

    void set_clicked_index(int n) {
        clicked_index = n;
    }

    int get_clicked_index() {
        return clicked_index;
    }

    public Button_Panel(String s) {
        this.setLayout(new FlowLayout());
        this.setBounds(50, 100, 600, 350);
        buttons = new Char_Button[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            buttons[i] = new Char_Button("", this);
            this.add(buttons[i]);
        }
        for (int i = 0; i < s.length(); ++i) {
            String ss = String.valueOf(s.charAt(i));
            buttons[i].setText(ss);
        }
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //获取被点击的按钮
                System.out.println("点击");
                if (clicked_index != -1) {
                    buttons[clicked_index].setBackground(Color.CYAN);
                }
                clicked_index = -1;
            }
        });

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘事件");
                if (clicked_index == -1) {
                    return;
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    if (clicked_index == 0) {
                        return;
                    }
                    buttons[clicked_index].swap_button(buttons[clicked_index - 1]);
                    buttons[clicked_index].setBackground(Color.CYAN);
                    clicked_index = -1;
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (clicked_index == buttons.length - 1) {
                        return;
                    }
                    buttons[clicked_index].swap_button(buttons[clicked_index + 1]);
                    buttons[clicked_index].setBackground(Color.CYAN);
                    clicked_index = -1;
                }
            }
        });

        this.validate();
        this.setVisible(true);
    }
}

