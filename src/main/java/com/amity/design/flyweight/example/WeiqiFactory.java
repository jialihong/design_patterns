package com.amity.design.flyweight.example;

import java.util.ArrayList;

/**
 * Created by Amity on 2021/2/19 下午 4:57
 */
public class WeiqiFactory {

    private ArrayList<ChessPieces> qz;

    public WeiqiFactory() {
        qz = new ArrayList<ChessPieces>();
        ChessPieces w = new WhitePieces();
        qz.add(w);
        ChessPieces b = new BlackPieces();
        qz.add(b);
    }

    public ChessPieces getChessPieces(String type) {
        if (type.equalsIgnoreCase("w")) {
            return (ChessPieces) qz.get(0);
        } else if (type.equalsIgnoreCase("b")) {
            return (ChessPieces) qz.get(1);
        } else {
            return null;
        }
    }
}
