package com.amity.design.flyweight.example;

import java.awt.*;

/**
 * Created by Amity on 2021/2/19 下午 4:54
 * 抽象享元角色：棋子
 */
public interface ChessPieces {
    /**
     * 下子
     * @param g
     * @param pt
     */
    void DownPieces(Graphics g, Point pt);
}
