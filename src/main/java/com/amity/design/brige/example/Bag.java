package com.amity.design.brige.example;

/**
 * Created by Amity on 2021/2/8 上午 11:57
 * 抽象化角色：包
 */
public abstract class Bag {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String getName();

}
