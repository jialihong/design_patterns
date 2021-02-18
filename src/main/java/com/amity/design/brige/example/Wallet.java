package com.amity.design.brige.example;

/**
 * Created by Amity on 2021/2/8 上午 11:59
 */
public class Wallet extends Bag{

    @Override
    public String getName() {
        return color.getColor() + "Wallet";
    }
}
