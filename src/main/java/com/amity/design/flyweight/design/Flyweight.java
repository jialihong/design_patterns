package com.amity.design.flyweight.design;

/**
 * Created by Amity on 2021/2/19 下午 4:27
 * 抽象享元角色
 */
public interface Flyweight {

    void operation(UnsharedConcreteFlyweight state);

}
