package com.amity.design.brige.design;

/**
 * Created by Amity on 2021/2/8 上午 10:54
 * 抽象化角色
 */
public abstract class Abstraction {

    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void operation();
}
