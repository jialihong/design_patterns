package com.amity.design.proxy.design;

/**
 * Created by Amity on 2021/2/5 12:04
 * 真实主题
 */
public class RealSubject implements Subject{

    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
