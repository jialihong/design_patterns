package com.amity.design.singleton;

import javax.swing.*;

/**
 * Created by Amity on 2021/2/3 12:05
 */
public class Bajie extends JPanel {
    private static Bajie instance = new Bajie();
    private Bajie() {
        JLabel l1 = new JLabel(new ImageIcon("E:/workspace/heheda/shop/design/src/main/resources/Bajie.jpg"));
        this.add(l1);
    }
    public static Bajie getInstance() {
        return instance;
    }
}
