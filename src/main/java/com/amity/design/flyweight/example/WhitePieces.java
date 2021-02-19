package com.amity.design.flyweight.example;

import java.awt.*;

/**
 * Created by Amity on 2021/2/19 下午 4:55
 * 具体享元角色：白子
 */
public class WhitePieces implements ChessPieces{

    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
