package com.amity.design.prototype;

import javax.swing.*;

/**
 * Created by Amity on 2021/2/3 16:02
 */
public class SunWukong extends JPanel implements Cloneable{

    private static final long serialVersionUID = 5543049531872119328L;

    public SunWukong() {
        JLabel l1 = new JLabel(new ImageIcon("E:/workspace/heheda/shop/design/src/main/resources/Wukong.jpg"));
        this.add(l1);
    }

    public Object clone() {
        SunWukong w = null;
        try {
            w = (SunWukong) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝悟空失败!");
        }
        return w;
    }
}
