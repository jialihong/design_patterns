package com.amity.design.flyweight.example;

import java.awt.*;

/**
 * Created by Amity on 2021/2/19 下午 4:56
 */
public class BlackPieces implements ChessPieces{

    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
