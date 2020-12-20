package Segment1.Twelfth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//定义显示单个字母的按钮
public class Char_Button extends JButton {
    //经验：如果是组合关系时，两个类需要互相控制对方的成员，只需考虑将大类的指针做成员
    private Button_Panel button_panel;

    public Char_Button(String character, Button_Panel bp) {
        this.button_panel = bp;

        this.setText(character);
        //this.setSize(100, 30);
        this.setBackground(Color.CYAN);
        Font font = new Font("宋体", Font.BOLD, 16);
        this.setFont(font);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Char_Button bt = (Char_Button)e.getSource();
                Char_Button[] bts = button_panel.get_buttons();
                int clicked = button_panel.get_clicked_index();
                if (clicked != -1) {
                    bts[clicked].setBackground(Color.CYAN);
                }
                for (int i = 0; i < bts.length; ++i) {
                    if (bts[i] == bt) {
                        System.out.println("点击按钮" + i);
                        bts[i].setBackground(Color.RED);
                        button_panel.set_clicked_index(i);
                        break;
                    }
                }
            }
        });
        this.validate();
        this.setVisible(true);
    }

    public void swap_button(Char_Button char_button) {
        String s = this.getText();
        String new_s = char_button.getText();
        this.setText(new_s);
        char_button.setText(s);
    }
}
