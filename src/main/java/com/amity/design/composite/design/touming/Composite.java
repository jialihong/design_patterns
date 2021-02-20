package com.amity.design.composite.design.touming;

import java.util.ArrayList;

/**
 * Created by Amity on 2021/2/20 下午 12:15
 * 树枝构件
 */
public class Composite implements Component{

    private ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}
