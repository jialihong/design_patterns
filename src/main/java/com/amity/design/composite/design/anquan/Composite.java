package com.amity.design.composite.design.anquan;

import java.util.ArrayList;

/**
 * Created by Amity on 2021/2/20 下午 4:00
 */
public class Composite implements Component{

    private ArrayList<Component> children = new ArrayList<>();

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

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
