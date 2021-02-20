package com.amity.design.composite.design.touming;

/**
 * Created by Amity on 2021/2/20 下午 12:13
 * 抽象构件
 */
public interface Component {

     void add(Component c);

     void remove(Component c);

     Component getChild(int i);

     void operation();
}
