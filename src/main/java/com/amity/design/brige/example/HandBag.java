package com.amity.design.brige.example;

/**
 * Created by Amity on 2021/2/8 上午 11:58
 * 扩展抽象化角色：挎包
 */
public class HandBag extends Bag{

    @Override
    public String getName() {
        return color.getColor() + "HandBag";
    }
}
