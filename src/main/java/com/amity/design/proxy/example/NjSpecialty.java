package com.amity.design.proxy.example;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Amity on 2021/2/7 上午 10:22
 * 真实主题：南京特产
 */
public class NjSpecialty extends JFrame implements Specialty{


    private static final long serialVersionUID = 1L;
    public NjSpecialty() {
        super("建邺代理南京特产测试");
        this.setLayout(new GridLayout(1, 1));
        JLabel l1 = new JLabel(new ImageIcon("E:/workspace/heheda/design/src/main/resources/nj.jpg"));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void display() {
        this.setVisible(true);
    }

}
